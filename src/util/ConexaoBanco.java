package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe ConexaoBanco que realiza a conexão com o banco de dados
 * 
 * @version 2.3 beta
 * @author Matheus Souza da Silva
 * @since 02/05/2011
 */
public class ConexaoBanco 
{
    /*
    * Armazena a url de conexão
    */
    private static final String url = "jdbc:mysql://localhost:3306/detran";
    
    /*
    * Armazena o usuario do banco de dados
    */
    private static final String usuario = "root";
    
    /*
    * Armazena a senha do banco de dados
    */
    private static final String senha = "root";
    
    /**
    *
    * Método Estático que gera a conexão com o banco
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @return  Connection Retorna a conexao do banco de dados
    */
    public static Connection getConexao() throws SQLException
    {
        return DriverManager.getConnection(url, usuario, senha);
    }//public static Connection getConexao() throws SQLException
}//public class ConexaoBanco 
