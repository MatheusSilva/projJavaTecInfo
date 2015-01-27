package persistencia;

import util.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe PerAutomovel da camada de persistencia
 * 
 * @version 2.3 beta
 * @author Matheus Souza da Silva
 * @since 02/05/2011
 */
public class PerAutomovel 
{
    /*
    * Armazena o codigo do automovel
    */
    private int idautomovel;
    
    /*
    * Armazena a marca do automovel
    */
    private String marca;
    
    /*
    * Armazena o modelo do automovel
    */
    private String modelo;
    
    /*
    * Armazena o ano do automovel
    */
    private int ano;
    
    /*
    * Armazena a placa do automovel
    */
    private String placa;
    
    /*
    * Armazena a infração cometida
    */
    private String infracao;
    
    /* Objeto multa do tipo PerMulta
    Através deste método conseguiremos passar
    o idmulta através do nome que o usuário
    escolher na JComboBox */
    private PerMulta multa;
    
    /**
    *
    * Método acessor get que retorna a infração
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a infração
    */
    public String getInfracao() 
    {
        return infracao;
    }//public String getInfracao()

    /**
    *
    * Método acessor set que armazena a infração
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param infracao Armazena a infração
    */
    public void setInfracao(String infracao) 
    {
        this.infracao = infracao;
    }//public void setInfracao(String infracao)

    /**
    *
    * Método acessor get que retorna o objeto 
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o objeto 
    */
    public PerMulta getMulta() 
    {
        return multa;
    }//public PerMulta getMulta()

    /**
    *
    * Método acessor set que armazena o objeto
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param multa Armazena o objeto
    */
    public void setMulta(PerMulta multa) 
    {
        this.multa = multa;
    }//public void setMulta(PerMulta multa)

    /**
    *
    * Método acessor get que retorna o ano
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return Int Retorna o ano
    */
    public int getAno() 
    {
        return ano;
    }//public int getAno()
    
    /**
    *
    * Método acessor set que armazena o ano
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param ano Armazena o ano
    */
    public void setAno(int ano) 
    {
        this.ano = ano;
    }//public void setAno(int ano)

    /**
    *
    * Método acessor get que retorna o codigo do automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return Int Retorna o codigo do automovel
    */
    public int getIdautomovel() 
    {
        return idautomovel;
    }//public int getIdautomovel()

    /**
    *
    * Método acessor set que armazena o codigo do automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param idautomovel Armazena o codigo do automovel
    */
    public void setIdautomovel(int idautomovel) 
    {
        this.idautomovel = idautomovel;
    }//public void setIdautomovel(int idautomovel) 

    /**
    *
    * Método acessor get que retorna a marca
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a marca do automovel
    */
    public String getMarca() 
    {
        return marca;
    }//public String getMarca()

    /**
    *
    * Método acessor set que armazena a marca do automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param marca Armazena a marca do automovel
    */
    public void setMarca(String marca) 
    {
        this.marca = marca;
    }//public void setMarca(String marca)

    /**
    *
    * Método acessor get que retorna o modelo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a modelo do automovel
    */
    public String getModelo() 
    {
        return modelo;
    }//public String getModelo()

    /**
    *
    * Método acessor set que armazena o modelo do automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param modelo Armazena a marca do automovel
    */
    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }//public void setModelo(String modelo) 

    /**
    *
    * Método acessor get que retorna a placa do automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a placa do automovel
    */
    public String getPlaca() 
    {
        return placa;
    }//public String getPlaca()

    /**
    *
    * Método acessor set que armazena a placa do automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param placa Armazena a marca do automovel
    */
    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }//public void setPlaca(String placa)

    /* Método toString(), utilizado para
       informar para o Java o que aparecerá
       na JComboBox */

    @Override
    public String toString()
    {
        return this.getMarca();
    }//public String toString()

    /**
    *
    * Método que Faz o Cadastro do automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param pa Armazena o objeto do automovel
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void cadastrarAutomovel(PerAutomovel pa) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "INSERT INTO automovel(idautomovel"
                    +"\n ,marca"
                    +"\n ,modelo"
                    +"\n ,ano"
                    +"\n ,placa"
                    +"\n ,idmulta) "
                    +"\n VALUES(?, ?, ?, ?, ?, ?)"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setString(1, null);
        pstmt.setString(2, pa.getMarca());
        pstmt.setString(3, pa.getModelo());
        pstmt.setInt(4, pa.getAno());
        pstmt.setString(5, pa.getPlaca());
        pstmt.setInt(6, pa.getMulta().getIdmulta());
        
        pstmt.executeUpdate();
        pstmt.close();
    }//public void cadastrarAutomovel(PerAutomovel a) throws SQLException

    /**
    *
    * Metodo que Deleta o automovel pela placa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param a Armazena o objeto do automovel
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void deletarAutomovelPlaca(PerAutomovel a) throws SQLException 
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "DELETE FROM automovel "
                    + "WHERE placa = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setString(1, a.getPlaca());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void deletarAutomovelPlaca(PerAutomovel a) throws SQLException 
    
    /**
    *
    * Metodo que Deleta o automovel pelo Codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param a Armazena o objeto do automovel
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void deletarAutomovelCodigo(PerAutomovel a) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "DELETE FROM automovel "
                    + "WHERE idautomovel = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, a.getIdautomovel());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void deletarAutomovelCodigo(PerAutomovel a) throws SQLException

    /**
    *
    * Metodo que atualiza os dados do automovel pelo codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param t Armazena o objeto do automovel pelo codigo
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void atualizarAutomovelCodigo(PerAutomovel t) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "UPDATE automovel"
                    +"\n SET idautomovel   = ?"
                    +"\n ,marca            = ?"
                    +"\n ,modelo           = ?"
                    +"\n ,ano              = ?"
                    +"\n ,placa            = ?"
                    +"\n WHERE idautomovel = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, t.getIdautomovel());
        pstmt.setString(2, t.getMarca());
        pstmt.setString(3, t.getModelo());
        pstmt.setInt(4, t.getAno());
        pstmt.setString(5, t.getPlaca());
        pstmt.setInt(6, t.getIdautomovel());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void atualizarAutomovelCodigo(PerAutomovel t) throws SQLException

    /**
    *
    * Metodo que busca todos os automoveis
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return ArrayList Retorna todos os automoveis
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public ArrayList<PerAutomovel> buscarTodosAutomoveis() throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        Statement stat = conexao.createStatement();
        
        String sql  = "SELECT aut.idautomovel"
                    +"\n ,aut.marca"
                    +"\n ,aut.modelo"
                    +"\n ,aut.ano"
                    +"\n ,aut.placa"
                    +"\n ,mul.infracao"
                    +"\n FROM automovel AS aut, multa AS mul"
                    +"\n WHERE mul.idmulta = aut.idmulta";

        ResultSet resultado = stat.executeQuery(sql);
        ArrayList<PerAutomovel> aAux = new ArrayList<>();

        while (resultado.next()) {
            PerAutomovel a = new PerAutomovel();
            a.setIdautomovel(resultado.getInt("aut.idautomovel"));
            a.setInfracao(resultado.getString("mul.infracao"));
            a.setMarca(resultado.getString("aut.marca"));
            a.setModelo(resultado.getString("aut.modelo"));
            a.setAno(resultado.getInt("aut.ano"));
            a.setPlaca(resultado.getString("aut.placa"));
            
            PerMulta m = new PerMulta();
            m.setInfracao(resultado.getString("mul.infracao"));

            a.setMulta(m);
            aAux.add(a);
        }//while (resultado.next()) {

        stat.close();
        return aAux;
    }//public ArrayList<PerAutomovel> buscarTodosAutomoveis() throws SQLException
    
    /**
    *
    * Metodo que verifica se existe algum automovel vinculado a placa informada
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param a Armazena o objeto
    * @return Boolean Retorna uma flag indicando se achou ou não
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public boolean buscarAutomovelPlaca(PerAutomovel a) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT 1 AS resultado"
                    +"\n FROM automovel"
                    +"\n WHERE placa = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setString(1, a.getPlaca());

        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            pstmt.close();
            return true;
        } else {
            pstmt.close();
            return false;
        }//if (resultado.next()) {
    }//public boolean buscarAutomovelPlaca(PerAutomovel a) throws SQLException

    /**
    *
    * Metodo que verifica se existe alguma restrição de fk
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param a Armazena o objeto
    * @return Boolean Retorna uma flag indicando se achou ou não
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public boolean buscaRestricaoPkAutomovel(PerAutomovel a) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT 1 AS resultado"
                    +"\n FROM condutor"
                    +"\n WHERE idautomovel = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);

        pstmt.setInt(1, a.getIdautomovel());

        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            pstmt.close();
            return true;
        } else {
            pstmt.close();
            return false;
        }//if (resultado.next()) {
    }//public boolean buscaRestricaoPkAutomovel(PerAutomovel a) throws SQLException
    
    /**
    *
    * Metodo que busca por Codigo o automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param a Armazena o objeto
    * @return Boolean Retorna uma flag indicando se achou ou não
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public boolean buscarAutomovelCodigo(PerAutomovel a) throws SQLException 
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT 1 AS resultado"
                    +"\n FROM automovel"
                    +"\n WHERE idautomovel = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, a.getIdautomovel());

        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            pstmt.close();
            return true;
        } else {
            pstmt.close();
            return false;
        }//if (resultado.next()) {
    }//public boolean buscarAutomovelCodigo(PerAutomovel a) throws SQLException
}//public class PerAutomovel 
