/**
 * 
 */
package com.unifacisa.tcc.domain.abstractions;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Wesley Gonzaga
 */
@MappedSuperclass
public abstract class Pessoa {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Size(min = 3)
    @Column(name = "primeiro_nome", nullable = false)
    private String primeiroNome;

    @NotNull
    @Size(min = 3)
    @Column(name = "segundo_nome", nullable = false)
    private String segundoNome;

    @NotNull
    @Column(name = "matricula", nullable = false)
    private Long matricula;

    @NotNull
    @Size(min = 3)
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull
    @Column(name = "numero_contato", nullable = false)
    private Long numeroContato;
    
 // jhipster-needle-entity-add-field - Jhipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public Pessoa primeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
        return this;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public Pessoa segundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
        return this;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public Pessoa matricula(Long matricula) {
        this.matricula = matricula;
        return this;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public Pessoa email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getNumeroContato() {
        return numeroContato;
    }

    public Pessoa numeroContato(Long numeroContato) {
        this.numeroContato = numeroContato;
        return this;
    }

    public void setNumeroContato(Long numeroContato) {
        this.numeroContato = numeroContato;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((numeroContato == null) ? 0 : numeroContato.hashCode());
		result = prime * result + ((primeiroNome == null) ? 0 : primeiroNome.hashCode());
		result = prime * result + ((segundoNome == null) ? 0 : segundoNome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (numeroContato == null) {
			if (other.numeroContato != null)
				return false;
		} else if (!numeroContato.equals(other.numeroContato))
			return false;
		if (primeiroNome == null) {
			if (other.primeiroNome != null)
				return false;
		} else if (!primeiroNome.equals(other.primeiroNome))
			return false;
		if (segundoNome == null) {
			if (other.segundoNome != null)
				return false;
		} else if (!segundoNome.equals(other.segundoNome))
			return false;
		return true;
	}    
}
