/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package io.github.guisso.poo.login.dao;

import java.util.List;

/**
 * Interface genérica com métodos mínimos requeridos para classes concretas.
 * 
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.0.1, 29/11/2020
 * 
 * @param <T> Tipo da entidade a ser processada
 */
public interface IDao<T> {

    /**
     * Executa o procedimento de salvamento (inserção ou atualização) do objeto
     * mapeado no banco de dados.
     * 
     * @param o Objeto a ser salvo no banco de dados.
     * @return Valor da chave primária gerada pela inclusão de um novo registro
     * ou mesmo valor da chave primária do objeto original presistido anteriormente.
     */
    public Long salvar(T o);

    /**
     * Exclui o registro do objeto no banco de dados.
     * 
     * @param o Objeto a ser excluído.<br>
     * <i>OBS.: o único valor útil é a identidade do objeto mapeado.</i>
     * @return Condição de sucesso ou falha na exclusão.
     */
    public Boolean excluir(T o);

    /**
     * Recupera um dado objeto mapeado para o banco de dados por meio de sua
     * chave de identidade.
     * 
     * @param id Identidade do objeto.
     * @return Objeto segundo registro persistido.
     */
    public T localizarPorId(Long id);

    /**
     * Recupera todos os objetos mapeados para o banco de dados do tipo específico.
     * @return Lista (geralmente um <code>ArrayList&lt;T&gt;</code>) de objetos persistidos.
     */
    public List<T> localizarTodos();
}
