
package br.com.garagem.ctr;

/**
 * Importando classes e extensões necessárias.
 */
import java.sql.ResultSet;
import br.com.garagem.dto.ProdutoDTO;
import br.com.garagem.dao.ConexaoDAO;
import br.com.garagem.dao.ProdutoDAO;

/**
 * Classe responsável pelo controle de informações.
 *
 */
public class ProdutoCTR {
    /**
     * Método construtor da classe.
     */
    public ProdutoCTR() {
    }// Fecha o método construtor.
    
    ProdutoDAO produtoDAO = new ProdutoDAO(); // Instanciando objeto do tipo ProdutoDAO.
    
    /**
     * Método responsável por retrasmitir informações para a classe ProdutoDAO.
     * 
     * @param produtoDTO, vindo da classe ProdutoDTO.
     * @return uma String.
     */
    public String inserirProduto(ProdutoDTO produtoDTO) {
        try {
            // Chamando o método que está na classe DAO aguardando resposta.
            if (produtoDAO.inserirProduto(produtoDTO)) {
                return "Produto cadastrado com sucesso!"; // String retornada.
            } else {
                return "Produto não cadastrado!"; // String retornada.
            }
        }// Fecha try. 
        // Tratamento de erro para o código acima.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não cadastrado!"; // String retornada.
        }// Fecha catch.
    }// Fecha o método inserirProduto(ProdutoDTO produtoDTO).
    
    /**
     * Método responsável por retransmitir informações para a classe ProdutoDAO.
     * 
     * @param produtoDTO, vindo da classe ProdutoDTO.
     * @return uma String.
     */
    public String alterarProduto(ProdutoDTO produtoDTO) {
        try {
            // Chamando o método que está na classe DAO aguardando resposta.
            if (produtoDAO.alterarProduto(produtoDTO)) {
                return "Produto alterado com sucesso!"; // String retornada.
            } else {
                return "Produto não alterado!"; // String retornada.
            }
        }// Fecha try. 
        // Tratamento de erro para o código acima.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não alterado!"; // String retornada.
        }// Fecha catch.
    }// Fecha o método alterarProduto(ProdutoDTO produtoDTO).
    
    /**
    * Método responsável por retransmitir informações para a classe ProdutoDAO.
    * 
    * @param produtoDTO, vindo da classe ProdutoDTO.
    * @return uma String.
    */
    public String excluirProduto(ProdutoDTO produtoDTO) {
        try {
            // Chamando o método que está na classe DAO aguardando resposta.
            if (produtoDAO.excluirProduto(produtoDTO)) {
                return "Produto excluido com sucesso!"; // String retornada.
            } else {
                return "Produto não excluido!"; // String retornada.
            }
        }// Fecha try. 
        // Tratamento de erro para o código acima.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não excluido!"; // String retornada.
        }// Fecha catch.
    }// Fecha o método excluirProduto(ProdutoDTO produtoDTO).
    
    /**
    * Método responsável por retransmitir informações para a classe ProdutoDAO.
    * 
    * @param produtoDTO, vindo da classe ProdutoDTO.
    * @param opcao, vindo da classe ProdutoDAO.
    * @return uma variável do tipo ResultSet.
    */
    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao) {
        ResultSet rs = null; // Criando um atributo do tipo ResultSet.
        
        // Chamando o método consultarProduto que está na classe ProdutoDAO. 
        rs = produtoDAO.consultarProduto(produtoDTO, opcao);
        
        return rs; // Retornando a variável com o valor atualizado.
    }// Fecha o método consultarProduto(ProdutoDTO produtoDTO, int opcao).
    
    /**
     * Método responsável por fechar o Banco de Dados.
     */
    public void CloseDB() {
        // Chamando o método CloseDB que está na classe ConexaoDAO.
        ConexaoDAO.CloseDB();
    }// Fecha o método CloseDB().
}// Fecha a classe ProdutoCTR.
