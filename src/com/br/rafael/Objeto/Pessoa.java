/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.rafael.Objeto;

/**
 *
 * @author rafael.152317
 */
public abstract class Pessoa {
    
    private String nome,rg,cpf,datanascimento,idade;
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", datanascimento=" + datanascimento + ", idade=" + idade + '}';
    }

    public Pessoa(String nome, String rg, String cpf, String datanascimento, String idade) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    
}
