/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.rafael.Objeto;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author rafael.152317
 */
public class Aluno extends Professor {
    
    private int matricula;
    private int dataMatricula;
    private ArrayList <Disciplinas> Disciplinas;

    public Aluno(ArrayList<com.br.rafael.Objeto.Disciplinas> Disciplinas, int cargaHoraria, float valorHora, float salario, String nome, String rg, String cpf, String datanascimento, String idade) {
        super(Disciplinas, cargaHoraria, valorHora, salario, nome, rg, cpf, datanascimento, idade);
    }

    public int getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(int dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", Disciplinas=" + Disciplinas + '}';
    }

    public ArrayList<Disciplinas> getDisciplinas() {
        return Disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplinas> Disciplinas) {
        this.Disciplinas = Disciplinas;
    }
       public static int calculaIdade(java.util.Date dataNasc) {

    Calendar dataNascimento = Calendar.getInstance();  
    dataNascimento.setTime(dataNasc); 
    Calendar hoje = Calendar.getInstance();  

    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
      idade--;  
    } 
    else 
    { 
        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
            idade--; 
        }
    }   
        return idade;
}
}