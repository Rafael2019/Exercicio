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
public class Professor extends Pessoa {
    
     private ArrayList <Disciplinas> Disciplinas;
     private int cargaHoraria;
     private float valorHora;
     private float salario;
     

    public ArrayList<Disciplinas> getDisciplinas() {
        return Disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplinas> Disciplinas) {
        this.Disciplinas = Disciplinas;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "Disciplinas=" + Disciplinas + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + '}';
    }

    public Professor(ArrayList<Disciplinas> Disciplinas, int cargaHoraria, float valorHora, float salario, String nome, String rg, String cpf, String datanascimento, String idade) {
        super(nome, rg, cpf, datanascimento, idade);
        this.Disciplinas = Disciplinas;
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = salario;
    }

   
     public float calcularSalario(float valorHora, float qtdeHora){
         
        return valorHora * qtdeHora;
     }  
    
}
