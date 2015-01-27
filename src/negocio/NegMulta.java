/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.PerMulta;
import util.Erro;

/**
 * Classe NegMulta da camada de negocio
 * 
 * @version 2.3 beta
 * @author Matheus Souza
 * @since 02/05/2011
 */
public class NegMulta 
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
    * Método que valida a exclusão da multa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param m Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    private boolean validaExclusaoMulta(PerMulta m) throws SQLException
    {
        this.retorno = true;
        PerMulta ab  = new PerMulta();
        Erro  er     = new Erro();
        
        if (ab.buscaRestricaoPkMulta(m) == true) {
            er.SetErro("Tem um automovel vinculado a multa que você esta tentando excluir!");
            this.retorno = false;
        }//if (ab.buscaRestricaoPkMulta(m) == true) {
        
        this.erros   = er.GetErro();
        return this.retorno;
    }//private boolean validaExclusaoMulta(PerMulta m) throws SQLException
    
    /**
    *
    * Método que cadastra a multa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param m Armazena o objeto passado por parametro
    */
    public void cadastrarMulta(PerMulta m) throws SQLException
    {
        PerMulta mb = new PerMulta();
        mb.cadastrarMulta(m);
    }//public void cadastrarMulta(PerMulta m) throws SQLException
    
    /**
    *
    * Método que deleta uma multa pelo codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param m Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    public boolean deletarMultaCodigo(PerMulta m) throws SQLException
    {
        if (this.validaExclusaoMulta(m) == true) {
            PerMulta mb = new PerMulta();
            mb.deletarMultaCodigo(m);
        }//if (this.validaExclusaoMulta(m) == true) {
       
       return this.retorno;
    }//public boolean deletarMultaCodigo(PerMulta m) throws SQLException
    
    /**
    *
    * Método que Busca todas as multas
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @return ArrayList Retorna todas as multas
    */
    public ArrayList<PerMulta> buscarTodasMultas() throws SQLException
    {
        PerMulta ab = new PerMulta();
        return ab.buscarTodasMultas();
    }//public ArrayList<PerMulta> buscarTodasMultas() throws SQLException

    /**
    *
    * Método que Busca Multas pelo Codigo.
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param m Armazena o objeto passado por parametro
    * @return Boolean Retorna uma flag indicando se tudo ocorreu bem ou não
    */
    public boolean buscarMultaCodigo(PerMulta m) throws SQLException
    {
        PerMulta mb = new PerMulta();
        return mb.buscarMultaCodigo(m);
    }//public boolean buscarMultaCodigo(PerMulta m) throws SQLException

    /**
    *
    * Método que atualiza as informações da multa pelo codigo.
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception SQLException lança um excessão caso algum erro de sql venha ocorrer
    * @param m Armazena o objeto passado por parametro
    */
    public void atualizarMultaCodigo(PerMulta m) throws SQLException
    {
        PerMulta mb = new PerMulta();
        mb.atualizarMultaCodigo(m);
    }//public void atualizarMultaCodigo(PerMulta m) throws SQLException
}//public class NegMulta 
