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
public class Nota {
    private Filme filme;
    private int nota;
    
    public Nota(Filme filme, int nota) {
        this.filme = filme;
        this.nota = nota;
    }
    
    public void alterarNota(int novaNota) {
        this.nota = novaNota;
    }
    
    public Filme getFilme() {
        return this.filme;
    }
    
    public int getNota() {
        return this.nota;
    }
    
}
