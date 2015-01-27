package negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.PerCondutor;
import util.Erro;

/**
 * Classe NegCondutor da camada de negocio
 * 
 * @version 2.3 beta
 * @author Matheus Souza
 * @since 02/05/2011
 */
public class NegCondutor 
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
    * metodo com finalidade de validar na hora da exclusão do condutor
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param c Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    private boolean validaExclusaoCondutor(PerCondutor c) throws SQLException
    {
        this.retorno = true;
        
        PerCondutor ab = new PerCondutor();
        Erro        er = new Erro();
        
        if (ab.buscaRestricaoPkCondutor(c) == true) {
            er.SetErro("Tem um endereco vinculado ao condutor que você esta tentando excluir!");
            this.retorno = false;
        }//if (ab.buscaRestricaoPkCondutor(c) == true) {
        
        this.erros = er.GetErro();
        return this.retorno;
    }//private boolean validaExclusaoCondutor(PerCondutor c) throws SQLException
    
    /**
    *
    * Método que tem finalidade de cadastrar o condutor
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param c Armazena o objeto passado por parametro
    */
    public void cadastrarCondutor(PerCondutor c) throws SQLException
    {
        PerCondutor cb = new PerCondutor();
        cb.cadastrarCondutor(c);
    }//public void cadastrarCondutor(PerCondutor c) throws SQLException
    
    /**
    *
    * Método que Deleta o condutor do banco de dados pelo Cnh
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param c Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    public boolean deletarCondutorCnh(PerCondutor c) throws SQLException
    {
        if (this.validaExclusaoCondutor(c) == true) {
            PerCondutor cb = new PerCondutor();
            cb.deletarCondutorCnh(c);
        }//if (this.validaExclusaoCondutor(c) == true) {
        
        return this.retorno;
    }//public boolean deletarCondutorCnh(PerCondutor c) throws SQLException

    /**
    *
    * Método que deleta o condutor pelo codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param c Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    public boolean deletarCondutorCodigo(PerCondutor c) throws SQLException
    {
        if (this.validaExclusaoCondutor(c) == true) {
            PerCondutor cb = new PerCondutor();
            cb.deletarCondutorCodigo(c);
        }//if (this.validaExclusaoCondutor(c) == true) {
        
        return this.retorno;
    }//public boolean deletarCondutorCodigo(PerCondutor c) throws SQLException

    /**
    *
    * Método que Busca todos os Condutores
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @return ArrayList Retorna todos os Condutores
    */
    public ArrayList<PerCondutor> buscarTodosCondutores() throws SQLException
    {
        PerCondutor cb = new PerCondutor();
        return cb.buscarTodosCondutores();
    }

    /**
    *
    * Método que verifica se existe o registro do condutor pelo Cnh.
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param c Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se achou ou não o registro
    */
    public boolean buscarCondutorCnh(PerCondutor c) throws SQLException
    {
        PerCondutor cb = new PerCondutor();
        return cb.buscarCondutorCnh(c);
    }//public boolean buscarCondutorCnh(PerCondutor c) throws SQLException
  
    /**
    *
    * Método que verifica se o codutor existe por codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param c Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se achou ou não o registro
    */
    public boolean buscarCondutorCodigo(PerCondutor c) throws SQLException
    {
        PerCondutor cb = new PerCondutor();
        return cb.buscarCondutorCodigo(c);
    }//public boolean buscarCondutorCodigo(PerCondutor c) throws SQLException
}//public class NegCondutor 
