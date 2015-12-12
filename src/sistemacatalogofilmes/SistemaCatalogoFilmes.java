/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacatalogofilmes;

import classes.Categoria;
import classes.Filme;
import classes.Usuario;
import janelas.Principal;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class SistemaCatalogoFilmes {
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<Filme> filmes;
    public static ArrayList<Categoria> categorias;
    
    public static Usuario usuarioLogado;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        usuarios = new ArrayList<Usuario>();
        filmes = new ArrayList<Filme>();
        categorias = new ArrayList<Categoria>();
        
        usuarioLogado = null;
        
        // Carregando os dados do "banco"
        
        // Carregando Categorias
        categorias.add(new Categoria(1, "Ação"));
        categorias.add(new Categoria(2, "Suspense"));
        categorias.add(new Categoria(3, "Aventura"));
        categorias.add(new Categoria(4, "Comédia"));
        categorias.add(new Categoria(5, "Romance"));
        categorias.add(new Categoria(6, "Drama"));
        categorias.add(new Categoria(7, "Ficção Científica"));
        categorias.add(new Categoria(8, "Pornô"));
        
        
        // TODO code application logic here
        JFrame principal = new Principal();
        principal.setVisible(true);
    }
    
}
