package util;

import java.util.ArrayList;

/**
 * Classe Erro que armazena todos erros da aplicação que seram utilizados em algum JOptionPane
 * 
 * @version 2.3 beta
 * @author Matheus Souza da Silva
 * @since 02/05/2011
 */
public class Erro 
{
    /*
    * Armazena uma todos erros que foram passados
    */
    public String strErro = "";
    
    /*
    * Armazena uma todos erros que foram passados
    */
    private ArrayList<String> erros = new ArrayList<>();

    /**
    *
    * metodo com finalidade de adicionar os erros no ArrayList de erros
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param strErro Armazena o erro a ser adicionado no ArrayList de erros
    */
    public void SetErro(String strErro)
    {
        if (strErro.isEmpty() == false) {
            this.erros.add(strErro);
        }//if (strErro.isEmpty() == false) {
    }//public void SetErro(String strErro)
    
    /**
    *
    * metodo com finalidade de retornar todos os erros
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna todos os erros
    */
    public String GetErro()
    { 
        for (Object erro : erros) {
            this.strErro += erro.toString() + "\n";
        }//for (Object erro : erros) {
         
        return this.strErro;
    }//public String GetErro()
 
}//public class Erro
