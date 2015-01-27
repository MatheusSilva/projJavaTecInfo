package negocio;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import persistencia.PerUsuario;

/**
 * Classe NegUsuario da camada de negocio
 * 
 * @version 2.3 beta
 * @author Matheus Souza
 * @since 02/05/2011
 */
public class NegUsuario 
{
    /**
    *
    * Método que cadastra o usuario
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @exception UnsupportedEncodingException lança um excessão caso algum erro venha ocorrer
    * @param u Armazena o objeto passado por parametro
    */
    public void cadastrarUsuario(PerUsuario u) throws SQLException, UnsupportedEncodingException
    {
        PerUsuario ub = new PerUsuario();
        ub.cadastrarUsuario(u);
    }//public void cadastrarUsuario(PerUsuario u) throws SQLException, UnsupportedEncodingException

    /**
    *
    * Método que valida a inclusão do usuario
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param u Armazena o objeto passado por parametro
    * @return Int Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    public int validarSenha(PerUsuario u) throws SQLException
    {
        PerUsuario user = new PerUsuario();
        return user.validarSenha(u);
    }//public int validarSenha(PerUsuario u) throws SQLException
}
