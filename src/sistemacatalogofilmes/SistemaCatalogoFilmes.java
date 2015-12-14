/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacatalogofilmes;

import classes.Categoria;
import classes.Filme;
import classes.Nota;
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
    public static ArrayList<Nota> bancoNotas;
    
    public static Usuario usuarioLogado;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        usuarios = new ArrayList<>();
        filmes = new ArrayList<>();
        categorias = new ArrayList<>();
        bancoNotas = new ArrayList<>();
        
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
        
        usuarios.add( new Usuario("Paulo", 15, "M", "VASP", "123456"));
        usuarios.add( new Usuario("Michel", 15, "M", "NADA", "123456"));
        usuarios.add( new Usuario("Rafael", 15, "M", "OPTIMIZE", "123456"));
        
        ArrayList<Categoria> cat = new ArrayList<>();
        cat.add( categorias.get(0) );
        cat.add( categorias.get(2) );
        filmes.add( new Filme(1, "Jurassic Park", "", "", "", cat ));
        filmes.add( new Filme(2, "Juno", "", "", "", cat ));
        filmes.add( new Filme(3, "X-Men", "", "", "", cat ));
        filmes.add( new Filme(4, "Duro de Matar", "", "", "", cat ));
        
        
        // TODO code application logic here
        JFrame principal = new Principal();
        principal.setVisible(true);
    }
    
}
