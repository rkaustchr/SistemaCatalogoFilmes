/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Admin
 */
public class Usuario {
    private int codigo;
    private String nome;
    private int idade;
    private String genero;
    private String ocupacao;
    private String cep;
    
    public Usuario(int codigo, String nome, int idade, String genero, String ocupacao, String cep ) {
        this.codigo = codigo;
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
    
}
