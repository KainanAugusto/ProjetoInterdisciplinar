
package br.com.garagem.dao;

import java.sql.*;
import br.com.garagem.dto.ClienteDTO;

public class ClienteDAO {

    // atritubo do tipo resulset utlizado para realizar consultas   
    private ResultSet rs = null;

    // manipular o banco de dados
    private Statement stmt = null;

    public boolean inserirCliente(ClienteDTO clienteDTO) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();
            //comando SQL que sera executado no banco de dados
            String comando = "Insert into cliente (nome, telefone, cpf) values ("
                    + "'" + clienteDTO.getNome() + "' ,"
                    + clienteDTO.getTelefone() + " ,"
                    + "'" + clienteDTO.getCpf() + "' )";

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Problema na inserção dos dados no banco de dados" + e.getMessage());
            return false;
        } // independente de dar ero ou nao ele ira fechar o banco de dados
        finally {

            // chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }
    
     public boolean alterarCliente(ClienteDTO clienteDTO) {
        try {
            // chama o metodo que esta na classe conexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            // criar um stetament que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //comando SQL que sera executada no banco de dados
            String comando = "Update cliente set "
                    + "nome = '" + clienteDTO.getNome() + "' ,"
                    + "cpf = '" + clienteDTO.getCpf() + "' ,"
                    + "where id_cliente = " + clienteDTO.getId_cliente();

            stmt.execute(comando.toUpperCase());
            //de um commit no banco de dados
            ConexaoDAO.con.commit();
            //fecha o statement
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            //chama o metodo da classe conexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }

    }
     
     
     public boolean excluirCliente(ClienteDTO clienteDTO) {
        try {
            //chama o metodo que esta na calsse conexaoDAO para abrir o banco de daods
            ConexaoDAO.ConectDB();
            // intancia o statement que responsavel por executar alguma coisa no bacno de dados
            stmt = ConexaoDAO.con.createStatement();
            //comando SQL que sera executado no banco de dados
            String comando = "Delete from cliente where id_cliente = " + clienteDTO.getId_cliente();

            //executa o comando SQL no banco de dados
            stmt.execute(comando);

            // da um commit no banco de dados
            ConexaoDAO.con.commit();
            //fecha o statement
            stmt.close();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } // independente de dar erro ou não ele vai fechar o banco de dados 
        finally {
            // chama o metodo da classe conexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }
     
     public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {
        try {
            // Chama o metodo que esta na calsse ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            // Cria o Statement que responsavel por executar laguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            // Comando SQL que sera executado no banco de dados
            String comando = "";
            switch (opcao) {
                case 1:
                    comando = "Select c.*"
                            + "from cliente c "
                            + "where nome like '" + clienteDTO.getNome() + "%' "
                            + "order by c.nome";
                    break;
                case 2:
                    comando = "Select c.* "
                            + "from cliente c "
                            + "where c.id_cliente = " + clienteDTO.getId_cliente();
                    break;
                case 3:
                    comando = "Select c.id_cliente, c.nome "
                            + "from cliente c ";

            }
            // Executa o comando SQL no banco de dados
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } // caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontencdo
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
     
}
