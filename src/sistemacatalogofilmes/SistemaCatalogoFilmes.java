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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        usuarios = new ArrayList<Usuario>();
        filmes = new ArrayList<Filme>();
        categorias = new ArrayList<Categoria>();
        
        // Carregando os dados do "banco"
        
        
        
        // 
        
        
        // TODO code application logic here
        JFrame principal = new Principal();
        principal.setVisible(true);
    }
    
}
