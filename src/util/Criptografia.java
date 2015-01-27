package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Classe Criptografia que realiza a criptografia das informações
 * 
 * @version 2.3 beta
 * @author Matheus Souza da Silva
 * @since 02/05/2011
 */
public class Criptografia 
{
    /**
    *
    * metodo com finalidade de criptografar a informação desejada
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception RuntimeException lança um excessão caso algum erro venha ocorrer
    * @param dados Armazena a informação que sera criptografada
    * @return String Retorna a informação ja criptografada
    */
    public static String criptografa (String dados) 
    {     
        try 
        {
            MessageDigest sh = MessageDigest.getInstance("SHA-256");
            sh.update(dados.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : sh.digest()) sb.append(Integer.toHexString(0xff & b));
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }//try      
    }//public static String criptografa (String dados)    
}//public class Criptografia