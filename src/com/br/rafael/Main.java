/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.rafael;

import com.br.rafael.Objeto.Disciplinas;
import com.br.rafael.Objeto.Professor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael.152317
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Disciplinas> materias = new ArrayList<>();
        do{
            String nome;
            String departamento;
            char status;
            
            nome = JOptionPane.showInputDialog("Informe o nome da diciplina:");
            departamento = JOptionPane.showInputDialog("Qual o departamento:");
            status = JOptionPane.showInputDialog("Status [A] Ativo [I] Inativo:").charAt(0);
            materias.add(new Disciplinas(nome, departamento, status));
        } while ((JOptionPane.showConfirmDialog(null,"Deseja Continuar?")) ==0);  
        String disciplinasDisponiveis = "";
        for (Disciplinas materia : materias){
            disciplinasDisponiveis +="\n"+ materias.lastIndexOf(materia) + " " + materia.getNome();
        }
        
        JOptionPane.showMessageDialog(null, disciplinasDisponiveis);
    }
   
       List<Professor> Professores = new ArrayList<>();
     do{
    
       ArrayList <Disciplinas> Disciplinas;
       int cargaHoraria;
       float valorHora;
       String nome,rg, cpf,dataNascimento;
       
       Date datanascimento = new Date();
       nome = 
       cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Qual a carga horaria: "));
       valorHora = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da hora: "));
           
       
    } while ((JOptionPane.showConfirmDialog(null,"Deseja cadastrar ?")) ==0);
}