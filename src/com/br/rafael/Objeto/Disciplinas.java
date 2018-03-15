/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.rafael.Objeto;

import java.util.ArrayList;

/**
 *
 * @author rafael.152317
 */
public class Disciplinas extends Aluno {

    private String nome;
    private String departamento;
    private char status;

    public Disciplinas(ArrayList<Disciplinas> Disciplinas, int cargaHoraria, float valorHora, float salario, String nome, String rg, String cpf, String datanascimento, String idade) {
        super(Disciplinas, cargaHoraria, valorHora, salario, nome, rg, cpf, datanascimento, idade);
    }

    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Disciplinas{" + "nome=" + nome + ", departamento=" + departamento + ", status=" + status + '}';
    }

}
