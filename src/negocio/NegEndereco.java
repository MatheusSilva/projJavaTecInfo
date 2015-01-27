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
    * @param pe Armazena o objeto passado por parametro
    */
    public void cadastrarEndereco(PerEndereco pe) throws SQLException
    {
        PerEndereco peAux = new  PerEndereco();
        peAux.cadastrarEndereco(pe);
    }//public void cadastrarEndereco(PerEndereco e) throws SQLException

    /**
    *
    * Método que Deleta o Endereço pelo Numero
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param pe Armazena o objeto passado por parametro
    */
    public void deletarEnderecoNumero(PerEndereco pe) throws SQLException
    {
        PerEndereco peAux = new PerEndereco();
        peAux.deletarEnderecoNumero(pe);
    }//public void deletarEnderecoNumero(PerEndereco e) throws SQLException

    /**
    *
    * Método que Deleta o Endereço pelo Codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param pe Armazena o objeto passado por parametro
    */
    public void deletarEnderecoCodigo(PerEndereco pe) throws SQLException
    {
        PerEndereco peAux = new PerEndereco();
        peAux.deletarEnderecoCodigo(pe);
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
        PerEndereco peAux = new PerEndereco();
        return peAux.buscarTodosEnderecos();
    }//public ArrayList<PerEndereco> buscarTodosEnderecos() throws SQLException

    /**
    *
    * Método que verifica se o endereço existe pelo numero
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param pe Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se o endereçõ existe ou não
    */
    public boolean buscarEnderecoNumero(PerEndereco pe) throws SQLException
    {
        PerEndereco peAux = new PerEndereco();
        return peAux.buscarEnderecoNumero(pe);
    }//public boolean buscarEnderecoNumero(PerEndereco e) throws SQLException

    /**
    *
    * Método que verifica se o endereço existe pelo Codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param pe Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se o endereçõ existe ou não
    */
    public boolean buscarEnderecoCodigo(PerEndereco pe) throws SQLException
    {
        PerEndereco peAux = new PerEndereco();
        return peAux.buscarEnderecoCodigo(pe);
    }//public boolean buscarEnderecoCodigo(PerEndereco e) throws SQLException
}//public class NegEndereco 
