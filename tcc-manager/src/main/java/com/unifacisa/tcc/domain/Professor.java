package com.unifacisa.tcc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifacisa.tcc.domain.abstractions.Pessoa;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Professor.
 */
@Entity
@Table(name = "professor")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Professor extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "diponibilidade")
    private Boolean diponibilidade;

    @OneToMany(mappedBy = "professor")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Aluno> alunos = new HashSet<>();
    // jhipster-needle-entity-add-getters-setters - Jhipster will add getters and setters here, do not remove

    public Boolean isDiponibilidade() {
        return diponibilidade;
    }

    public Professor diponibilidade(Boolean diponibilidade) {
        this.diponibilidade = diponibilidade;
        return this;
    }

    public void setDiponibilidade(Boolean diponibilidade) {
        this.diponibilidade = diponibilidade;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public Professor alunos(Set<Aluno> alunos) {
        this.alunos = alunos;
        return this;
    }

    public Professor addAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.setProfessor(this);
        return this;
    }

    public Professor removeAluno(Aluno aluno) {
        this.alunos.remove(aluno);
        aluno.setProfessor(null);
        return this;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Professor{" +
            "id=" + getId() +
            ", primeiroNome='" + getPrimeiroNome() + "'" +
            ", segundoNome='" + getSegundoNome() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", email='" + getEmail() + "'" +
            ", numeroContato='" + getNumeroContato() + "'" +
            ", diponibilidade='" + isDiponibilidade() + "'" +
            "}";
    }
}
