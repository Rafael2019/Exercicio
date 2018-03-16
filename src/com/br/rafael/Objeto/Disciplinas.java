/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.rafael.Objeto;

import com.br.rafael.Objeto.Aluno;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author wellyton.154317
 */
public class Disciplinas {
    private String nome;
    private String departamento ;
    private char status;

    public Disciplinas(int cargaHoraria, float valorHora, float salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", departamento=" + departamento + ", status=" + status + '}';
    }

    public Disciplinas(String nome, String departamento, char status) {
        this.nome = nome;
        this.departamento = departamento;
        this.status = status;
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
     
}