package com.unifacisa.tcc.web.rest;

import com.unifacisa.tcc.TccmanagerApp;

import com.unifacisa.tcc.domain.Aluno;
import com.unifacisa.tcc.repository.AlunoRepository;
import com.unifacisa.tcc.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the AlunoResource REST controller.
 *
 * @see AlunoResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TccmanagerApp.class)
public class AlunoResourceIntTest {

    private static final String DEFAULT_PRIMEIRO_NOME = "AAAAAAAAAA";
    private static final String UPDATED_PRIMEIRO_NOME = "BBBBBBBBBB";

    private static final String DEFAULT_SEGUNDO_NOME = "AAAAAAAAAA";
    private static final String UPDATED_SEGUNDO_NOME = "BBBBBBBBBB";

    private static final Long DEFAULT_MATRICULA = 1L;
    private static final Long UPDATED_MATRICULA = 2L;

    private static final String DEFAULT_EMAIL = "AAAAAAAAAA";
    private static final String UPDATED_EMAIL = "BBBBBBBBBB";

    private static final Long DEFAULT_NUMERO_CONTATO = 1L;
    private static final Long UPDATED_NUMERO_CONTATO = 2L;

    private static final Boolean DEFAULT_HABILITADO_TCC = false;
    private static final Boolean UPDATED_HABILITADO_TCC = true;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restAlunoMockMvc;

    private Aluno aluno;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final AlunoResource alunoResource = new AlunoResource(alunoRepository);
        this.restAlunoMockMvc = MockMvcBuilders.standaloneSetup(alunoResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Aluno createEntity(EntityManager em) {
        Aluno aluno = ((Aluno) new Aluno()
            .primeiroNome(DEFAULT_PRIMEIRO_NOME)
            .segundoNome(DEFAULT_SEGUNDO_NOME)
            .matricula(DEFAULT_MATRICULA)
            .email(DEFAULT_EMAIL)
            .numeroContato(DEFAULT_NUMERO_CONTATO))
            .habilitadoTcc(DEFAULT_HABILITADO_TCC);
        return aluno;
    }

    @Before
    public void initTest() {
        aluno = createEntity(em);
    }

    @Test
    @Transactional
    public void createAluno() throws Exception {
        int databaseSizeBeforeCreate = alunoRepository.findAll().size();

        // Create the Aluno
        restAlunoMockMvc.perform(post("/api/alunos")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(aluno)))
            .andExpect(status().isCreated());

        // Validate the Aluno in the database
        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeCreate + 1);
        Aluno testAluno = alunoList.get(alunoList.size() - 1);
        assertThat(testAluno.getPrimeiroNome()).isEqualTo(DEFAULT_PRIMEIRO_NOME);
        assertThat(testAluno.getSegundoNome()).isEqualTo(DEFAULT_SEGUNDO_NOME);
        assertThat(testAluno.getMatricula()).isEqualTo(DEFAULT_MATRICULA);
        assertThat(testAluno.getEmail()).isEqualTo(DEFAULT_EMAIL);
        assertThat(testAluno.getNumeroContato()).isEqualTo(DEFAULT_NUMERO_CONTATO);
        assertThat(testAluno.isHabilitadoTcc()).isEqualTo(DEFAULT_HABILITADO_TCC);
    }

    @Test
    @Transactional
    public void createAlunoWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = alunoRepository.findAll().size();

        // Create the Aluno with an existing ID
        aluno.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restAlunoMockMvc.perform(post("/api/alunos")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(aluno)))
            .andExpect(status().isBadRequest());

        // Validate the Aluno in the database
        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void checkPrimeiroNomeIsRequired() throws Exception {
        int databaseSizeBeforeTest = alunoRepository.findAll().size();
        // set the field null
        aluno.setPrimeiroNome(null);

        // Create the Aluno, which fails.

        restAlunoMockMvc.perform(post("/api/alunos")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(aluno)))
            .andExpect(status().isBadRequest());

        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkSegundoNomeIsRequired() throws Exception {
        int databaseSizeBeforeTest = alunoRepository.findAll().size();
        // set the field null
        aluno.setSegundoNome(null);

        // Create the Aluno, which fails.

        restAlunoMockMvc.perform(post("/api/alunos")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(aluno)))
            .andExpect(status().isBadRequest());

        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkMatriculaIsRequired() throws Exception {
        int databaseSizeBeforeTest = alunoRepository.findAll().size();
        // set the field null
        aluno.setMatricula(null);

        // Create the Aluno, which fails.

        restAlunoMockMvc.perform(post("/api/alunos")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(aluno)))
            .andExpect(status().isBadRequest());

        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkEmailIsRequired() throws Exception {
        int databaseSizeBeforeTest = alunoRepository.findAll().size();
        // set the field null
        aluno.setEmail(null);

        // Create the Aluno, which fails.

        restAlunoMockMvc.perform(post("/api/alunos")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(aluno)))
            .andExpect(status().isBadRequest());

        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkNumeroContatoIsRequired() throws Exception {
        int databaseSizeBeforeTest = alunoRepository.findAll().size();
        // set the field null
        aluno.setNumeroContato(null);

        // Create the Aluno, which fails.

        restAlunoMockMvc.perform(post("/api/alunos")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(aluno)))
            .andExpect(status().isBadRequest());

        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkHabilitadoTccIsRequired() throws Exception {
        int databaseSizeBeforeTest = alunoRepository.findAll().size();
        // set the field null
        aluno.setHabilitadoTcc(null);

        // Create the Aluno, which fails.

        restAlunoMockMvc.perform(post("/api/alunos")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(aluno)))
            .andExpect(status().isBadRequest());

        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void getAllAlunos() throws Exception {
        // Initialize the database
        alunoRepository.saveAndFlush(aluno);

        // Get all the alunoList
        restAlunoMockMvc.perform(get("/api/alunos?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(aluno.getId().intValue())))
            .andExpect(jsonPath("$.[*].primeiroNome").value(hasItem(DEFAULT_PRIMEIRO_NOME.toString())))
            .andExpect(jsonPath("$.[*].segundoNome").value(hasItem(DEFAULT_SEGUNDO_NOME.toString())))
            .andExpect(jsonPath("$.[*].matricula").value(hasItem(DEFAULT_MATRICULA.intValue())))
            .andExpect(jsonPath("$.[*].email").value(hasItem(DEFAULT_EMAIL.toString())))
            .andExpect(jsonPath("$.[*].numeroContato").value(hasItem(DEFAULT_NUMERO_CONTATO.intValue())))
            .andExpect(jsonPath("$.[*].habilitadoTcc").value(hasItem(DEFAULT_HABILITADO_TCC.booleanValue())));
    }

    @Test
    @Transactional
    public void getAluno() throws Exception {
        // Initialize the database
        alunoRepository.saveAndFlush(aluno);

        // Get the aluno
        restAlunoMockMvc.perform(get("/api/alunos/{id}", aluno.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(aluno.getId().intValue()))
            .andExpect(jsonPath("$.primeiroNome").value(DEFAULT_PRIMEIRO_NOME.toString()))
            .andExpect(jsonPath("$.segundoNome").value(DEFAULT_SEGUNDO_NOME.toString()))
            .andExpect(jsonPath("$.matricula").value(DEFAULT_MATRICULA.intValue()))
            .andExpect(jsonPath("$.email").value(DEFAULT_EMAIL.toString()))
            .andExpect(jsonPath("$.numeroContato").value(DEFAULT_NUMERO_CONTATO.intValue()))
            .andExpect(jsonPath("$.habilitadoTcc").value(DEFAULT_HABILITADO_TCC.booleanValue()));
    }

    @Test
    @Transactional
    public void getNonExistingAluno() throws Exception {
        // Get the aluno
        restAlunoMockMvc.perform(get("/api/alunos/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateAluno() throws Exception {
        // Initialize the database
        alunoRepository.saveAndFlush(aluno);
        int databaseSizeBeforeUpdate = alunoRepository.findAll().size();

        // Update the aluno
        Aluno updatedAluno = alunoRepository.findOne(aluno.getId());
        ((Aluno) updatedAluno
            .primeiroNome(UPDATED_PRIMEIRO_NOME)
            .segundoNome(UPDATED_SEGUNDO_NOME)
            .matricula(UPDATED_MATRICULA)
            .email(UPDATED_EMAIL)
            .numeroContato(UPDATED_NUMERO_CONTATO))
            .habilitadoTcc(UPDATED_HABILITADO_TCC);

        restAlunoMockMvc.perform(put("/api/alunos")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(updatedAluno)))
            .andExpect(status().isOk());

        // Validate the Aluno in the database
        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeUpdate);
        Aluno testAluno = alunoList.get(alunoList.size() - 1);
        assertThat(testAluno.getPrimeiroNome()).isEqualTo(UPDATED_PRIMEIRO_NOME);
        assertThat(testAluno.getSegundoNome()).isEqualTo(UPDATED_SEGUNDO_NOME);
        assertThat(testAluno.getMatricula()).isEqualTo(UPDATED_MATRICULA);
        assertThat(testAluno.getEmail()).isEqualTo(UPDATED_EMAIL);
        assertThat(testAluno.getNumeroContato()).isEqualTo(UPDATED_NUMERO_CONTATO);
        assertThat(testAluno.isHabilitadoTcc()).isEqualTo(UPDATED_HABILITADO_TCC);
    }

    @Test
    @Transactional
    public void updateNonExistingAluno() throws Exception {
        int databaseSizeBeforeUpdate = alunoRepository.findAll().size();

        // Create the Aluno

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restAlunoMockMvc.perform(put("/api/alunos")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(aluno)))
            .andExpect(status().isCreated());

        // Validate the Aluno in the database
        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeUpdate + 1);
    }

    @Test
    @Transactional
    public void deleteAluno() throws Exception {
        // Initialize the database
        alunoRepository.saveAndFlush(aluno);
        int databaseSizeBeforeDelete = alunoRepository.findAll().size();

        // Get the aluno
        restAlunoMockMvc.perform(delete("/api/alunos/{id}", aluno.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Aluno> alunoList = alunoRepository.findAll();
        assertThat(alunoList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Aluno.class);
        Aluno aluno1 = new Aluno();
        aluno1.setId(1L);
        Aluno aluno2 = new Aluno();
        aluno2.setId(aluno1.getId());
        assertThat(aluno1).isEqualTo(aluno2);
        aluno2.setId(2L);
        assertThat(aluno1).isNotEqualTo(aluno2);
        aluno1.setId(null);
        assertThat(aluno1).isNotEqualTo(aluno2);
    }
}
