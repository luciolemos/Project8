/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gpima.domain;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_militar")
public class Militar implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String phone;
    private String nomeguerra;
    private String nomepai;
    private String nomemae;
    private String funcaomilitar; 
    @Temporal(TemporalType.DATE)
    private Calendar datanascimento= Calendar.getInstance();
    @Temporal(TemporalType.DATE)
    private Calendar datapraca = Calendar.getInstance();   
    @Column(unique = true)
    private String cpf;       
    @ManyToOne //classe interna to classe de fora
    private Sexo sexo;  
    @ManyToOne //classe interna to classe de fora
    private Posto posto;    
    @ManyToOne //classe interna to classe de fora
    private Arma arma;    
    @ManyToOne //classe interna to classe de fora
    private Subunidade subunidade;
    @ManyToOne //classe interna to classe de fora
    private Funcao funcao;
    
    public Militar() {
    } 

    public Militar(int id, String nome, String phone, String nomeguerra, String nomepai, String nomemae, String funcaomilitar, String cpf, Sexo sexo, Posto posto, Arma arma, Subunidade subunidade, Funcao funcao) {
        this.id = id;
        this.nome = nome;
        this.phone = phone;
        this.nomeguerra = nomeguerra;
        this.nomepai = nomepai;
        this.nomemae = nomemae;
        this.funcaomilitar = funcaomilitar;
        this.cpf = cpf;
        this.sexo = sexo;
        this.posto = posto;
        this.arma = arma;
        this.subunidade = subunidade;
        this.funcao = funcao;
    }

    public Militar(String nome, String phone, String nomeguerra, String nomepai, String nomemae, String funcaomilitar, String cpf, Sexo sexo, Posto posto, Arma arma, Subunidade subunidade) {
        this.nome = nome;
        this.phone = phone;
        this.nomeguerra = nomeguerra;
        this.nomepai = nomepai;
        this.nomemae = nomemae;
        this.funcaomilitar = funcaomilitar;
        this.cpf = cpf;
        this.sexo = sexo;
        this.posto = posto;
        this.arma = arma;
        this.subunidade = subunidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNomeguerra() {
        return nomeguerra;
    }

    public void setNomeguerra(String nomeguerra) {
        this.nomeguerra = nomeguerra;
    }

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public String getFuncaomilitar() {
        return funcaomilitar;
    }

    public void setFuncaomilitar(String funcaomilitar) {
        this.funcaomilitar = funcaomilitar;
    }

    public Calendar getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Calendar datanascimento) {
        this.datanascimento = datanascimento;
    }

    public Calendar getDatapraca() {
        return datapraca;
    }

    public void setDatapraca(Calendar datapraca) {
        this.datapraca = datapraca;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Posto getPosto() {
        return posto;
    }

    public void setPosto(Posto posto) {
        this.posto = posto;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Subunidade getSubunidade() {
        return subunidade;
    }

    public void setSubunidade(Subunidade subunidade) {
        this.subunidade = subunidade;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Militar other = (Militar) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Militar{" + "id=" + id + ", nome=" + nome + ", phone=" + phone + ", nomeguerra=" + nomeguerra + ", nomepai=" + nomepai + ", nomemae=" + nomemae + ", funcaomilitar=" + funcaomilitar + ", datanascimento=" + datanascimento + ", datapraca=" + datapraca + ", cpf=" + cpf + ", sexo=" + sexo + ", posto=" + posto + ", arma=" + arma + ", subunidade=" + subunidade + ", funcao=" + funcao + '}';
    }
    
    

   
}