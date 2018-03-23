/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.rafael.Objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rafael.152317
 */
public class Professor {
    
     private ArrayList <Disciplinas> Disciplinas;
     private int cargaHoraria;
     private float valorHora;
     private float salario;

    public Professor(int cargaHoraria, float valorHora, float salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Professor(int cargaHoraria, float valorHora, float salario, String nome, String rg, String cpf, int idade, Date dataNascimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     

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

    public Professor(ArrayList<Disciplinas> Disciplinas, int cargaHoraria, float valorHora, float salario) {
        this.Disciplinas = Disciplinas;
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = salario;
    }

    

   
     public float calcularSalario(float valorHora, float qtdeHora){
         
        return valorHora * qtdeHora;
     }  
    
}
