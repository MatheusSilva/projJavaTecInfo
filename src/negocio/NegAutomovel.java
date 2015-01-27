package negocio;

import util.Erro;
import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.PerAutomovel;

/**
 * Classe NegAutomovel da camada de negocio
 * 
 * @version 2.3 beta
 * @author Matheus Souza da Silva
 * @since 02/05/2011
 */
public class NegAutomovel 
{
    /*
    * Armazena uma flag que indica a situação do retorno
    */
    private boolean retorno;
    
    /*
    * Armazena todos os erros
    */
    public String erros;
    
    /**
    *
    * metodo com finalidade de casdastrar o automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param a Armazena o objeto passado por parametro
    */
    public void cadastrarAutomovel(PerAutomovel a) throws SQLException
    {
        PerAutomovel ab = new PerAutomovel();
        ab.cadastrarAutomovel(a);
    }//public void cadastrarAutomovel(PerAutomovel a) throws SQLException

    /**
    *
    * metodo com finalidade de deletar o automovel pela placa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param a Armazena o objeto passado por parametro
    */
    public void deletarAutomovelPlaca(PerAutomovel a) throws SQLException
    {
        PerAutomovel ab = new PerAutomovel();
        ab.deletarAutomovelPlaca(a);
    }//public void deletarAutomovelPlaca(PerAutomovel a) throws SQLException

    /**
    *
    * metodo com finalidade de validar o automovel na hora da exclusão
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param a Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    private boolean validaExclusaoAutomovel(PerAutomovel a) throws SQLException
    {
        this.retorno     = true;
        PerAutomovel ab  = new PerAutomovel();
        Erro  er         = new Erro();
        
        if (ab.buscaRestricaoPkAutomovel(a) == true) {
            er.SetErro("Tem um condutor vinculado ao automovel que você esta tentando excluir!");
            this.retorno = false;
        }//if (ab.buscaRestricaoPkAutomovel(a) == true) {
        
        this.erros = er.GetErro();
        return this.retorno;
    }//private boolean validaExclusaoAutomovel(PerAutomovel a) throws SQLException
    
    /**
    *
    * metodo com finalidade de deletar o automovel pelo codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param a Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    public boolean deletarAutomovelCodigo(PerAutomovel a) throws SQLException
    {
        if (this.validaExclusaoAutomovel(a) == true) {
            PerAutomovel ab = new PerAutomovel();
            ab.deletarAutomovelCodigo(a);
        }//if (this.validaExclusaoAutomovel(a) == true) {
        
        return this.retorno;
    }//public boolean deletarAutomovelCodigo(PerAutomovel a) throws SQLException

    /**
    *
    * Método que mostra todos automoveis cadastrados
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @return ArrayList Retorna todos os automoveis
    */
    public ArrayList<PerAutomovel> buscarTodosAutomoveis() throws SQLException
    {
        PerAutomovel ab = new PerAutomovel();
        return ab.buscarTodosAutomoveis();
    }//public ArrayList<PerAutomovel> buscarTodosAutomoveis() throws SQLException
    
    /**
    *
    * Método que verifica se o automovel buscado pela placa existe
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param a Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag que indica se o automovel existe
    */
    public boolean buscarAutomovelPlaca(PerAutomovel a) throws SQLException
    {
        PerAutomovel ab = new PerAutomovel();
        return ab.buscarAutomovelPlaca(a);
    }//public boolean buscarAutomovelPlaca(PerAutomovel a) throws SQLException

    /**
    * Método que verifica se o automovel buscado pela placa existe pelo codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param a Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag que indica se o automovel existe
    */
    public boolean buscarAutomovelCodigo(PerAutomovel a) throws SQLException
    {
        PerAutomovel ab = new PerAutomovel();
        return ab.buscarAutomovelCodigo(a);
    }//public boolean buscarAutomovelCodigo(PerAutomovel a) throws SQLException

    /**
    * Método que atualisa a tabela do automovel
    *
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param a Armazena o objeto passado por parametro
    */
    public void atualizarAutomovelCodigo(PerAutomovel a) throws SQLException
    {
        PerAutomovel ab = new PerAutomovel();
        ab.atualizarAutomovelCodigo(a);
    }//public void atualizarAutomovelCodigo(PerAutomovel a) throws SQLException

}//public class NegAutomovel 
