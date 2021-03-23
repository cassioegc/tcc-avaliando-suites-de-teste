package com.unifacisa.tcc.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.unifacisa.tcc.domain.abstractions.Pessoa;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Aluno.
 */
@Entity
@Table(name = "aluno")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Aluno extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Column(name = "habilitado_tcc", nullable = false)
    private Boolean habilitadoTcc;
    // jhipster-needle-entity-add-getters-setters - Jhipster will add getters and setters here, do not remove

    @ManyToOne
    private Professor professor;

    public Boolean isHabilitadoTcc() {
        return habilitadoTcc;
    }

    public Aluno habilitadoTcc(Boolean habilitadoTcc) {
        this.habilitadoTcc = habilitadoTcc;
        return this;
    }

    public void setHabilitadoTcc(Boolean habilitadoTcc) {
        this.habilitadoTcc = habilitadoTcc;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Aluno professor(Professor professor) {
        this.professor = professor;
        return this;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Aluno{" +
            "id=" + getId() +
            ", primeiroNome='" + getPrimeiroNome() + "'" +
            ", segundoNome='" + getSegundoNome() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", email='" + getEmail() + "'" +
            ", numeroContato='" + getNumeroContato() + "'" +
            ", habilitadoTcc='" + isHabilitadoTcc() + "'" +
            "}";
    }
}
