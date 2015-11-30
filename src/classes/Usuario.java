/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Usuario {
    private String nome;
    private int idade;
    private String genero;
    private String ocupacao;
    private String cep;
    
    private ArrayList<Nota> notas;
    
    public Usuario(String nome, int idade, String genero, String ocupacao, String cep ) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.ocupacao = ocupacao;
        this.cep = cep;
    }
    
    public void alterarOcupacao( String novaOcupacao ) {
        this.ocupacao = novaOcupacao;
    }
    
    public void alterarCep( String novoCep ) {
        this.cep = novoCep;
    }
    
    public void alterarIdade( int novaIdade ) {
        this.idade = novaIdade;
    }
    
}
