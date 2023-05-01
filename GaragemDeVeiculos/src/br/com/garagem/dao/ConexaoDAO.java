package br.com.garagem.dao;

import java.sql.*;

/**
 * Classe responsável por fazer a conexão com o Banco de Dados.
 */
public class ConexaoDAO {
    public static Connection con = null; // Atributo do tipo connection.
    
    /**
     * Método construtor da classe.
     */
    public ConexaoDAO() {    
    }
    
    /**
     * Método que abre a conexão com o banco de dados.
     */
    public static void ConectDB() {
        try {
            // Dados que serão usados para se conectar com o Banco.
            String dsn = "garagem"; // Nome do banco que será acessado.
            String user = "postgres"; // Usuário que acessa o banco.
            String senha = "postgres"; // Senha de acesso ao banco.
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5432/" + dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            con.setAutoCommit(false);
            
            if (con == null) {
                System.out.println("Erro ao se conectar com o Banco!");
            }// Fecha if.
        } // Fecha o try.
        // Tratamento de erro ao se conectar ao Banco de Dados.
        catch (Exception e) {
            System.out.println("Problemas ao se conectar ao Banco de Dados\n" + 
                                e.getMessage());
        }// Fecha o catch.
    }// Fecha o método ConectDB().
    
    /**
     * Método que encerra a conexão com o Banco de Dados.
     */
    public static void CloseDB() {
        try {
            con.close();
        } // Fecha o try.
        // Tratamento de erro ao fechar o Banco de Dados.
        catch (Exception e) {
            System.out.println("Problemas ao fechar o Banco de Dados\n" + 
                                e.getMessage());
        }// Fecha o catch.
    }// Fecha o método CloseDB().
}// Fecha a classe ConexaoDAO().
