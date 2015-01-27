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
    * @param pc Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    private boolean validaExclusaoCondutor(PerCondutor pc) throws SQLException
    {
        this.retorno = true;
        
        PerCondutor pcAux = new PerCondutor();
        Erro        er = new Erro();
        
        if (pcAux.buscaRestricaoPkCondutor(pc) == true) {
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
    * @param pc Armazena o objeto passado por parametro
    */
    public void cadastrarCondutor(PerCondutor pc) throws SQLException
    {
        PerCondutor pcAux = new PerCondutor();
        pcAux.cadastrarCondutor(pc);
    }//public void cadastrarCondutor(PerCondutor c) throws SQLException
    
    /**
    *
    * Método que Deleta o condutor do banco de dados pelo Cnh
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param pc Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    public boolean deletarCondutorCnh(PerCondutor pc) throws SQLException
    {
        if (this.validaExclusaoCondutor(pc) == true) {
            PerCondutor pcAux = new PerCondutor();
            pcAux.deletarCondutorCnh(pc);
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
    * @param pc Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    public boolean deletarCondutorCodigo(PerCondutor pc) throws SQLException
    {
        if (this.validaExclusaoCondutor(pc) == true) {
            PerCondutor pcAux = new PerCondutor();
            pcAux.deletarCondutorCodigo(pc);
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
        PerCondutor pc = new PerCondutor();
        return pc.buscarTodosCondutores();
    }//public ArrayList<PerCondutor> buscarTodosCondutores() throws SQLException

    /**
    *
    * Método que verifica se existe o registro do condutor pelo Cnh.
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param pc Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se achou ou não o registro
    */
    public boolean buscarCondutorCnh(PerCondutor pc) throws SQLException
    {
        PerCondutor pcAux = new PerCondutor();
        return pcAux.buscarCondutorCnh(pc);
    }//public boolean buscarCondutorCnh(PerCondutor c) throws SQLException
  
    /**
    *
    * Método que verifica se o codutor existe por codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param pc Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se achou ou não o registro
    */
    public boolean buscarCondutorCodigo(PerCondutor pc) throws SQLException
    {
        PerCondutor pcAux = new PerCondutor();
        return pcAux.buscarCondutorCodigo(pc);
    }//public boolean buscarCondutorCodigo(PerCondutor c) throws SQLException
}//public class NegCondutor 
