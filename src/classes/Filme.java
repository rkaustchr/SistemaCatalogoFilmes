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
public class Filme {
    private int codigo;
    private String nome;
    private String dataLancamento;
    private String dataDvd;
    private String url;
    private ArrayList<Categoria> categorias;
    
    public Filme( int codigo, String nome, String dataLancamento, String dataDvd, String url, ArrayList<Categoria> categorias ) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.dataDvd = dataDvd;
        this.url = url;
        this.categorias = categorias;
    }
    
}
