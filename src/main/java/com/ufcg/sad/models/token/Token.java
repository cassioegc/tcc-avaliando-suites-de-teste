package com.ufcg.sad.models.token;

import com.ufcg.sad.models.matricula.Matricula;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * Entidade de que representa o token de autenticação de um questionário
 *
 * Created by sampaio on 16/11/17.
 */
@Entity
@Table
public class Token {

    @Id
    @Column
    private String id;

    @OneToOne
    private Matricula matricula;

    public Token(Matricula matricula) {
        this.id = UUID.randomUUID().toString();
        this.matricula = matricula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Token token = (Token) o;

        if (id != null ? !id.equals(token.id) : token.id != null) return false;
        return matricula != null ? matricula.equals(token.matricula) : token.matricula == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (matricula != null ? matricula.hashCode() : 0);
        return result;
    }
}
