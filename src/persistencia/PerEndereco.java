package persistencia;
import util.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe PerEndereco da camada de persistencia
 * 
 * @version 2.3 beta
 * @author Matheus Souza da Silva
 * @since 02/05/2011
 */
public class PerEndereco 
{
    /*
    * Armazena o codigo do endereco
    */
    private int idendereco;
    
    /*
    * Armazena o endereco
    */
    private String endereco;
    
    /*
    * Armazena o logradouro
    */
    private String logradouro;
    
    /*
    * Armazena o numero da casa/apartamento
    */
    private int numero;
    
    /*
    * Armazena o complemento
    */
    private String complemento;
    
    /*
    * Armazena o bairro
    */
    private String bairro;
    
    /*
    * Armazena o estado
    */
    private String estado;
    
    /*
    * Armazena o cidade
    */
    private String cidade;
    
    /*
    * Armazena o cep
    */
    private int cep;
 
    /* Objeto condutor do tipo PerCondutor
    Através deste método conseguiremos passar
    o idCondutor através do nome que o usuário
    escolher na JComboBox */
    private PerCondutor condutor;

    /**
    *
    * Método acessor get que retorna o objeto 
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return PerCondutor Retorna o objeto 
    */
    public PerCondutor getCondutor() 
    {
        return condutor;
    }//public PerCondutor getCondutor() 

    /**
    *
    * Método acessor set que armazena o objeto
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param condutor Armazena o objeto
    */
    public void setCondutor(PerCondutor condutor) 
    {
        this.condutor = condutor;
    }//public void setCondutor(PerCondutor condutor)

    /**
    *
    * Método acessor get que retorna o bairro
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o bairro
    */
    public String getBairro() 
    {
        return bairro;
    }//public String getBairro() 

    /**
    *
    * Método acessor set que armazena o bairro
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param bairro Armazena o bairro
    */
    public void setBairro(String bairro) 
    {
        this.bairro = bairro;
    }//public void setBairro(String bairro) 

    /**
    *
    * Método acessor get que retorna o cep
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o cep
    */
    public int getCep() 
    {
        return cep;
    }//public int getCep()

    /**
    *
    * Método acessor set que armazena o cep
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param cep Armazena o cep
    */
    public void setCep(int cep) 
    {
        this.cep = cep;
    }//public void setCep(int cep) 

    /**
    *
    * Método acessor get que retorna a cidade
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a cidade
    */
    public String getCidade() 
    {
        return cidade;
    }//public String getCidade()

    /**
    *
    * Método acessor set que armazena a cidade
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param cidade Armazena o cidade
    */
    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }//public void setCidade(String cidade)

    /**
    *
    * Método acessor get que retorna a complemento
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a complemento
    */
    public String getComplemento() 
    {
        return complemento;
    }//public String getComplemento() 

    /**
    *
    * Método acessor set que armazena o complemento
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param complemento Armazena o complemento
    */
    public void setComplemento(String complemento) 
    {
        this.complemento = complemento;
    }//public void setComplemento(String complemento) 

    /**
    *
    * Método acessor get que retorna o endereco
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o endereco
    */
    public String getEndereco() 
    {
        return endereco;
    }//public String getEndereco()

    /**
    *
    * Método acessor set que armazena o endereco
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param endereco Armazena o endereco
    */
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }//public void setEndereco(String endereco)

    /**
    *
    * Método acessor get que retorna o estado
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o estado
    */
    public String getEstado() 
    {
        return estado;
    }//public String getEstado()

    /**
    *
    * Método acessor set que armazena o estado
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param estado Armazena o estado
    */
    public void setEstado(String estado) 
    {
        this.estado = estado;
    }//public void setEstado(String estado)

    /**
    *
    * Método acessor get que retorna o idendereco
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return int Retorna o idendereco
    */
    public int getIdendereco() 
    {
        return idendereco;
    }//public int getIdendereco() 

    /**
    *
    * Método acessor set que armazena o codigo do endereco
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param idendereco Armazena o codigo do endereco
    */
    public void setIdendereco(int idendereco) 
    {
        this.idendereco = idendereco;
    }//public void setIdendereco(int idendereco)

    /**
    *
    * Método acessor get que retorna o logradouro
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o logradouro
    */
    public String getLogradouro() 
    {
        return logradouro;
    }//public String getLogradouro()

    /**
    *
    * Método acessor set que armazena o logradouro
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param logradouro Armazena o logradouro
    */
    public void setLogradouro(String logradouro) 
    {
        this.logradouro = logradouro;
    }//public void setLogradouro(String logradouro)

    /**
    *
    * Método acessor get que retorna o numero
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return int Retorna o numero
    */
    public int getNumero() 
    {
        return numero;
    }//public int getNumero()

    /**
    *
    * Método acessor set que armazena o numero
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param numero Armazena o numero
    */
    public void setNumero(int numero) 
    {
        this.numero = numero;
    }//public void setNumero(int numero)

    /* Método toString(), utilizado para
    informar para o Java o que aparecerá
    na JComboBox */
    @Override
    public String toString()
    {
        return this.getCondutor().getNome();
    }//public String toString()
 
    /**
    *
    * Metodo que Cadastra o endereco
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param c Armazena o objeto do endereco
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void cadastrarEndereco(PerEndereco c) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "INSERT INTO endereco(idendereco"
                    +"\n ,endereco"
                    +"\n ,logradouro"
                    +"\n ,numero"
                    +"\n ,complemento"
                    +"\n ,bairro"
                    +"\n ,estado"
                    +"\n ,cidade"
                    +"\n ,cep"
                    +"\n ,idcondutor)"
                    +"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setString(1, null);
        pstmt.setString(2, c.getEndereco());
        pstmt.setString(3, c.getLogradouro());
        pstmt.setInt(4, c.getNumero());
        pstmt.setString(5, c.getComplemento());
        pstmt.setString(6, c.getBairro());
        pstmt.setString(7, c.getEstado());
        pstmt.setString(8, c.getCidade());
        pstmt.setInt(9, c.getCep());
        pstmt.setInt(10, c.getCondutor().getIdcondutor());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void cadastrarEndereco(PerEndereco c) throws SQLException

    /**
    *
    * Metodo que deleta o endereco pelo numero
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param c Armazena o objeto do endereco
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void deletarEnderecoNumero(PerEndereco c) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "DELETE FROM endereco"
                    +"\n WHERE numero = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, c.getNumero());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void deletarEnderecoNumero(PerEndereco c) throws SQLException

    /**
    *
    * Metodo que deleta o endereco pelo codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param c Armazena o objeto do endereco
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void deletarEnderecoCodigo(PerEndereco c) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "DELETE FROM endereco"
                    +"\n WHERE idendereco = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, c.getIdendereco());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void deletarEnderecoCodigo(PerEndereco c) throws SQLException

     //Metodo que Busca todos Enderecos do banco De Dados
    /**
    *
    * Metodo que busca todos os enderecos
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return ArrayList Retorna todos os enderecos
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public ArrayList<PerEndereco> buscarTodosEnderecos() throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        Statement stat = conexao.createStatement();

        String sql = "SELECT idendereco"
                    +"\n ,endereco"
                    +"\n ,logradouro"
                    +"\n ,numero"
                    +"\n ,complemento"
                    +"\n ,bairro"
                    +"\n ,estado"
                    +"\n ,cidade"
                    +"\n ,cep"
                    +"\n ,condutor.nome"
                    +"\n ,condutor.idcondutor"
                    +"\n FROM endereco, condutor"
                    +"\n WHERE condutor.idcondutor = endereco.idcondutor";

        ResultSet resultado = stat.executeQuery(sql);
        ArrayList<PerEndereco> aAux = new ArrayList<PerEndereco>();

        while (resultado.next()) {
            PerEndereco e = new PerEndereco();
            e.setIdendereco(resultado.getInt("idendereco"));
            e.setEndereco(resultado.getString("endereco"));
            e.setLogradouro(resultado.getString("logradouro"));
            e.setNumero(resultado.getInt("numero"));
            e.setComplemento(resultado.getString("complemento"));
            e.setBairro(resultado.getString("bairro"));
            e.setEstado(resultado.getString("estado"));
            e.setCidade(resultado.getString("cidade"));
            e.setCep(resultado.getInt("cep"));
            e.setIdendereco(resultado.getInt("idcondutor"));

            PerCondutor c = new PerCondutor();
            c.setNome(resultado.getString("nome"));
            e.setCondutor(c);
            aAux.add(e);
        }//while (resultado.next()) {

        stat.close();
        return aAux;
    }//public ArrayList<PerEndereco> buscarTodosEnderecos() throws SQLException

    /**
    *
    * Metodo que verifica se existe algum endereco
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param c Armazena o objeto
    * @return Boolean Retorna uma flag indicando se achou ou não
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public boolean buscarEnderecoNumero(PerEndereco c) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT 1 AS resultado"
                    +"\n FROM endereco"
                    +"\n WHERE numero = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, c.getNumero());

        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            pstmt.close();
            return true;
        } else {
            pstmt.close();
            return false;
        }//if (resultado.next()) {
    }//public boolean buscarEnderecoNumero(PerEndereco c) throws SQLException

    /**
    *
    * Metodo que verifica se existe algum endereco por codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param a Armazena o objeto
    * @return Boolean Retorna uma flag indicando se achou ou não
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public boolean buscarEnderecoCodigo(PerEndereco a) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT 1 AS resultado"
                +"\n FROM endereco"
                +"\n WHERE idendereco = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, a.getIdendereco());

        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            pstmt.close();
            return true;
        } else {
            pstmt.close();
            return false;
        }//if (resultado.next()) {
    }//public boolean buscarEnderecoCodigo(PerEndereco a) throws SQLException
    
}//public class PerEndereco
