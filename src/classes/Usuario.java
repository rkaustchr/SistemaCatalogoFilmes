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
        
        notas = new ArrayList<>();
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
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public String getGenero() {
        return this.genero;
    }
    
    public String getOcupacao() {
        return this.ocupacao;
    }
    
    public String getCep() {
        return this.cep;
    }
    
    public Nota jaAssistiu( Filme filme ) {
        int i;
        for ( i=0; i < notas.size(); i++ ) {
            if ( notas.get(i).getFilme().equals( filme ) ) {
                return notas.get(i);
            }
        }
        
        return null;
    }
    
    public void avaliarFilme( Filme filme, int nota ) {
        Nota avaliacao;
        
        avaliacao = jaAssistiu(filme);
        if ( avaliacao == null ) {
            notas.add( new Nota(filme, nota) );
        } else {
            avaliacao.alterarNota(nota);
        }
    }
    
    public int getTotalDeAvaliacoes() {
        return notas.size();
    }
    
    public ArrayList<Nota> getNotas() {
        return this.notas;
    }
    
}
