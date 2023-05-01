
package br.com.garagem.ctr;

import java.sql.ResultSet;
import br.com.garagem.dto.FuncionarioDTO;
import br.com.garagem.dao.ConexaoDAO;
import br.com.garagem.dao.FuncionarioDAO;
import br.com.garagem.dao.ProdutoDAO;
import br.com.garagem.dto.ProdutoDTO;

/**
 * Classe responsável por controle das informações.
 *
 */
public class FuncionarioCTR {
    /**
     * Método construtor da classe.
     */
    public FuncionarioCTR() {
    }// Fecha o método construtor.
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    /**
     * Método responsável por retransmitir informações para a classe ProdutoDAO.
     * 
     * @param funcionarioDTO, vindo da classe FuncionarioDTO.
     * @return uma String.
     */
    public String inserirFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            if (funcionarioDAO.inserirFuncionario(funcionarioDTO)) {
                return "Funcionário cadastrado com sucesso!";
            } else {
                return "Funcionário não cadastrado";
            }
        }// Fecha try. 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionário não cadastrado!";
        }// Fecha catch.
    }// Fecha o método inserirFuncionario(FuncionarioDTO funcionarioDTO).
    
    /**
    * Método responsável por retransmitir informações para a classe ProdutoDAO.
    * 
    * @param funcionarioDTO, vindo da classe ProdutoDTO.
    * @param opcao, vindo da classe ProdutoDAO.
    * @return uma variável do tipo ResultSet.
    */
    public ResultSet consultarFuncionarios(FuncionarioDTO funcionarioDTO, int opcao) {
        ResultSet rs = null; // Criando um atributo do tipo ResultSet.
        
        // Chamando o método consultarProduto que está na classe ProdutoDAO. 
        rs = funcionarioDAO.consultarFuncionarios(funcionarioDTO, opcao);
        
        return rs; // Retornando a variável com o valor atualizado.
    }// Fecha o método consultarProduto(ProdutoDTO produtoDTO, int opcao).
    
    /**
    * Método responsável por retransmitir informações para a classe ProdutoDAO.
    * 
    * @param funcionarioDTO, vindo da classe ProdutoDTO.
    * @param opcao, vindo da classe ProdutoDAO.
    * @return uma variável do tipo ResultSet.
    */
    public ResultSet consultarProduto(FuncionarioDTO funcionarioDTO, int opcao) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        ResultSet rs = null; // Criando um atributo do tipo ResultSet.
        
        // Chamando o método consultarProduto que está na classe ProdutoDAO. 
        rs = funcionarioDAO.consultarFuncionarios(funcionarioDTO, opcao);
        
        return rs; // Retornando a variável com o valor atualizado.
    }// Fecha o método consultarProduto(ProdutoDTO produtoDTO, int opcao).
    
    /**
     * Método responsável por retransmitir informações para a classe ProdutoDAO.
     * 
     * @param funcionarioDTO, vindo da classe ProdutoDTO.
     * @return uma String.
     */
    public String alterarFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            // Chamando o método que está na classe DAO aguardando resposta.
            if (funcionarioDAO.alterarFuncionario(funcionarioDTO)) {
                return "Funcionario alterado com sucesso!"; // String retornada.
            } else {
                return "Funcionario não alterado!"; // String retornada.
            }
        }// Fecha try. 
        // Tratamento de erro para o código acima.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionario não alterado!"; // String retornada.
        }// Fecha catch.
    }// Fecha o método alterarProduto(ProdutoDTO produtoDTO).
    
    /**
    * Método responsável por retransmitir informações para a classe ProdutoDAO.
    * 
    * @param funcionarioDTO, vindo da classe ProdutoDTO.
    * @return uma String.
    */
    public String excluirFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            // Chamando o método que está na classe DAO aguardando resposta.
            if (funcionarioDAO.excluirFuncionario(funcionarioDTO)) {
                return "Funcionario excluido com sucesso!"; // String retornada.
            } else {
                return "Funcionario não excluido!"; // String retornada.
            }
        }// Fecha try. 
        // Tratamento de erro para o código acima.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionario não excluido!"; // String retornada.
        }// Fecha catch.
    }// Fecha o método excluirProduto(ProdutoDTO produtoDTO).

    /**
     * Método responsável por fechar o Banco de Dados.
     */
    public void CloseDB() {
        // Chamando o método CloseDB que está na classe ConexaoDAO.
        ConexaoDAO.CloseDB();
    }// Fecha o método CloseDB().
}// Fecha classe FuncionarioCTR.
