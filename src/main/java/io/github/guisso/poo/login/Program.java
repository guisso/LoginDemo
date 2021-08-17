/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package io.github.guisso.poo.login;

import io.github.guisso.poo.login.dao.UsuarioDao;
import io.github.guisso.poo.login.entity.Usuario;

/**
 * Classe utilitária para inicialização de dados no banco de dados,
 * bem como outros testes.
 * 
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.0.1, 09/08/2021
 */
public class Program {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        //
        // Inclusão de novo usuário
        //
        Usuario usuarioA = new Usuario(null, "Guisso", "guisso@mail.com", "123456", true);
        new UsuarioDao().salvar(usuarioA);
        System.out.println(">> Novo usuário ADMIN inserido no banco de dados");
        
        Usuario usuarioB = new Usuario(null, "Comum", "comum@mail.com", "123456", false);
        new UsuarioDao().salvar(usuarioB);
        System.out.println(">> Novo usuário COMUM inserido no banco de dados");
        
        //
        // Autenticação de usuário
        //
        Usuario usuarioC = new Usuario();
        usuarioC.setEmail("guisso@mail.com");
        usuarioC.setSenha("123456");
        
        Usuario usuarioAutenticado = new UsuarioDao().autenticar(usuarioC);
        if(usuarioAutenticado != null) {
            System.out.println(">> Autenticado: " + usuarioAutenticado);
        } else {
            System.out.println(">> Não autenticado.");
        }
        
    }
}
