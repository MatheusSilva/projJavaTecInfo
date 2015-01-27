package negocio;

import java.sql.SQLException;
import java.util.ArrayList;

import persistencia.PerEndereco;

/**
 * Classe NegEndereco da camada de negocio
 * 
 * @version 2.3 beta
 * @author Matheus Souza
 * @since 02/05/2011
 */
public class NegEndereco 
{
    
    /**
    *
    * Método que cadastra o endereco
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param e Armazena o objeto passado por parametro
    */
    public void cadastrarEndereco(PerEndereco e) throws SQLException
    {
        PerEndereco eb = new  PerEndereco();
        eb.cadastrarEndereco(e);
    }//public void cadastrarEndereco(PerEndereco e) throws SQLException

    /**
    *
    * Método que Deleta o Endereço pelo Numero
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param e Armazena o objeto passado por parametro
    */
    public void deletarEnderecoNumero(PerEndereco e) throws SQLException
    {
        PerEndereco eb = new PerEndereco();
        eb.deletarEnderecoNumero(e);
    }//public void deletarEnderecoNumero(PerEndereco e) throws SQLException

    /**
    *
    * Método que Deleta o Endereço pelo Codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param e Armazena o objeto passado por parametro
    */
    public void deletarEnderecoCodigo(PerEndereco e) throws SQLException
    {
        PerEndereco eb = new PerEndereco();
        eb.deletarEnderecoCodigo(e);
    }//public void deletarEnderecoCodigo(PerEndereco e) throws SQLException

    /**
    *
    * Método que Busca todos os Endereços
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @return ArrayList Retorna todos os Endereços
    */
    public ArrayList<PerEndereco> buscarTodosEnderecos() throws SQLException
    {
        PerEndereco eb = new PerEndereco();
        return eb.buscarTodosEnderecos();
    }//public ArrayList<PerEndereco> buscarTodosEnderecos() throws SQLException

    /**
    *
    * Método que verifica se o endereço existe pelo numero
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param e Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se o endereçõ existe ou não
    */
    public boolean buscarEnderecoNumero(PerEndereco e) throws SQLException
    {
        PerEndereco eb = new PerEndereco();
        return eb.buscarEnderecoNumero(e);
    }//public boolean buscarEnderecoNumero(PerEndereco e) throws SQLException

    /**
    *
    * Método que verifica se o endereço existe pelo Codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param e Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se o endereçõ existe ou não
    */
    public boolean buscarEnderecoCodigo(PerEndereco e) throws SQLException
    {
        PerEndereco eb = new PerEndereco();
        return eb.buscarEnderecoCodigo(e);
    }//public boolean buscarEnderecoCodigo(PerEndereco e) throws SQLException
}//public class NegEndereco 
