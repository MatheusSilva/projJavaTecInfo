package persistencia;

import util.ConexaoBanco;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe PerUsuario da camada de persistencia
 * 
 * @version 2.3 beta
 * @author Matheus Souza
 * @since 02/05/2011
 */
public class PerUsuario 
{
    /*
    * Armazena o login do usuario
    */
    private String login;
    
    /*
    * Armazena a senha do usuario
    */
    private String senha;
    
    /*
    * Armazena o tipo do usuario
    */
    private String tipo;

    /**
    *
    * Método acessor get que retorna a login
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a login
    */
    public String getLogin() 
    {
        return login;
    }//public String getLogin() 
    
    /**
    *
    * Método acessor set que armazena a login
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param login Armazena a login
    */
    public void setLogin(String login) 
    {
        this.login = login;
    }//public void setLogin(String login)
    
    /**
    *
    * Método acessor get que retorna a senha
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a senha
    */
    public String getSenha() 
    {
        return senha;
    }//public String getSenha() 
    
    /**
    *
    * Método acessor set que armazena a senha
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param senha Armazena a senha
    */
    public void setSenha(String senha) 
    {
        this.senha = senha;
    }//public void setSenha(String senha) 

    /**
    *
    * Método acessor get que retorna o tipo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o tipo
    */
    public String getTipo() 
    {
        return tipo;
    }//public String getTipo() 

    /**
    *
    * Método acessor set que armazena o tipo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param tipo Armazena o tipo
    */
    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }//public void setTipo(String tipo) 

     // metodo que cadastra um novo usuario
    
    /**
    *
    * Método que Faz o Cadastro do usuario
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param u Armazena o objeto da multa
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    * @throws UnsupportedEncodingException Lança uma excessão caso algum erro venha ocorrer
    */
    public void cadastrarUsuario(PerUsuario u) throws SQLException, UnsupportedEncodingException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "INSERT INTO usuario(idusuario"
                + "\n ,login"
                + "\n ,senha"
                + "\n ,tipo) "
                + "VALUES(?, ?, ?, ?)"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setString(1, null);
        pstmt.setString(2, u.getLogin());
        pstmt.setString(3, u.getSenha());
        pstmt.setString(4, u.getTipo());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void cadastrarUsuario(PerUsuario u) throws SQLException, UnsupportedEncodingException

    /**
    *
    * Método que faz a validacao de login,senha e tipo de usuario
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param u Armazena o objeto da multa
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    * @return Int Retorna uma flag indicando se esta ok ou nao
    */
    public int validarSenha(PerUsuario u) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT tipo"
                    +"\n FROM usuario"
                    +"\n WHERE login = ?"
                    +"\n AND senha   = ?"
                    +"\n AND tipo    = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setString(1, u.getLogin());
        pstmt.setString(2, u.getSenha());
        pstmt.setString(3, u.getTipo());
        
        ResultSet rs = pstmt.executeQuery();
        int retorno = -1;
        
        while (rs.next()) {
            if (rs.getString(1).equals("administrador")) {
                retorno = 1;
            } else if (rs.getString(1).equals("Usuario Comum")) {
                retorno = 2;
            }//if (rs.getString(1).equals("administrador")) {
        }//while (rs.next()) {
        
        pstmt.close();
        return retorno;
    }//public int validarSenha(PerUsuario u) throws SQLException  
}//public class PerUsuario
