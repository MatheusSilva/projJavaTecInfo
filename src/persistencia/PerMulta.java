package persistencia;

import util.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe PerMulta da camada de persistencia
 * 
 * @version 2.3 beta
 * @author Matheus Souza
 * @since 02/05/2011
 */
public class PerMulta 
{
    /*
    * Armazena o codigo da multa
    */
    private int idmulta;
    
    /*
    * Armazena a infração
    */
    private String infracao;
    
    /*
    * Armazena os pontos
    */
    private int pontos;
    
    /*
    * Armazena a penalidade
    */
    private String penalidade;
    
    /*
    * Armazena o valor
    */
    private Double  valor;

    /**
    *
    * Método acessor get que retorna o codigo da multa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o codigo da multa
    */
    public int getIdmulta() 
    {
        return idmulta;
    }//public int getIdmulta()
    
    /**
    *
    * Método acessor set que armazena o codigo da multa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param idmulta Armazena  o codigo da multa
    */
    public void setIdmulta(int idmulta) 
    {
        this.idmulta = idmulta;
    }//public void setIdmulta(int idmulta)
    
    /**
    *
    * Método acessor get que retorna a infrasao
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a infrasao
    */
    public String getInfracao() 
    {
        return infracao;
    }//public String getInfracao() 
    
    /**
    *
    * Método acessor set que armazena a infrasao
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param infracao Armazena  a infrasao
    */
    public void setInfracao(String infracao) 
    {
        this.infracao = infracao;
    }//public void setInfracao(String infracao) 
    
    /**
    *
    * Método acessor get que retorna a penalidade
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a penalidade
    */
    public String getPenalidade() 
    {
        return penalidade;
    }//public String getPenalidade()
    
    /**
    *
    * Método acessor set que armazena a penalidade
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param penalidade Armazena  a penalidade
    */
    public void setPenalidade(String penalidade) 
    {
        this.penalidade = penalidade;
    }//public void setPenalidade(String penalidade) 
    
    /**
    *
    * Método acessor get que retorna os pontos
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna os pontos
    */
    public int getPontos() 
    {
        return pontos;
    }//public int getPontos() 
    
    /**
    *
    * Método acessor set que armazena os pontos
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param pontos Armazena  os pontos
    */
    public void setPontos(int pontos) 
    {
        this.pontos = pontos;
    }//public void setPontos(int pontos)
    
    /**
    *
    * Método acessor get que retorna o valor
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o valor
    */
    public double getValor() 
    {
        return valor;
    }//public double getValor() 
    
    /**
    *
    * Método acessor set que armazena o valor
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param valor Armazena  o valor
    */
    public void setValor(double   valor) 
    {
        this.valor = valor;
    }//public void setValor(double   valor)

    /* Método toString(), utilizado para
    informar para o Java o que aparecerá
    na JComboBox */
    @Override
    public String toString() 
    {
        return this.getInfracao();
    }
    
    /**
    *
    * Método que Faz o Cadastro da multa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param m Armazena o objeto da multa
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void cadastrarMulta(PerMulta m) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "INSERT INTO multa(idmulta"
                    +"\n ,infracao"
                    +"\n ,pontos"
                    +"\n ,penalidade"
                    +"\n ,valor)"
                    +"\n VALUES(?, ?, ?, ?, ?)"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setString(1, null);
        pstmt.setString(2, m.getInfracao());
        pstmt.setInt(3, m.getPontos());
        pstmt.setString(4, m.getPenalidade());
        pstmt.setDouble(5, m.getValor());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void cadastrarMulta(PerMulta m) throws SQLException

    /**
    *
    * Método que deleta a multa pelo Codigo.
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param m Armazena o objeto da multa
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void deletarMultaCodigo(PerMulta m) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "DELETE FROM multa"
                    +"\n WHERE idmulta = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, m.getIdmulta());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void deletarMultaCodigo(PerMulta m) throws SQLException
    
    /**
    *
    * Método que atualiza a multa pelo Codigo.
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param t Armazena o objeto da multa
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void atualizarMultaCodigo(PerMulta t) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "UPDATE multa"
                    +"\n SET idmulta   = ?"
                    +"\n ,infracao     = ?"
                    +"\n ,pontos       = ?"
                    +"\n ,penalidade   = ?"
                    +"\n ,valor        = ?"
                    +"\n WHERE idmulta = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, t.getIdmulta());
        pstmt.setString(2, t.getInfracao());
        pstmt.setInt(3, t.getPontos());
        pstmt.setString(4, t.getPenalidade());
        pstmt.setDouble(5, t.getValor());
        pstmt.setInt(6, t.getIdmulta());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void atualizarMultaCodigo(PerMulta t) throws SQLException

    /**
    *
    * Método que busca todas Multas
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    * @return ArrayList Retorna todas as multas
    */
    public ArrayList<PerMulta> buscarTodasMultas() throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        Statement stat = conexao.createStatement();

        String sql = "SELECT idmulta"
                    +"\n ,infracao"
                    +"\n ,pontos"
                    +"\n ,penalidade"
                    +"\n ,valor"
                    +"\n FROM multa";

        ResultSet resultado      = stat.executeQuery(sql);
        ArrayList<PerMulta> aAux = new ArrayList<>();

        while (resultado.next()) {
            PerMulta m = new PerMulta();
            m.setIdmulta(resultado.getInt("idmulta"));
            m.setInfracao(resultado.getString("infracao"));
            m.setPontos(resultado.getInt("pontos"));
            m.setPenalidade(resultado.getString("penalidade"));
            m.setValor(resultado.getDouble("valor"));
            aAux.add(m);
        }//while (resultado.next()) {

        stat.close();
        return aAux;
    }//public ArrayList<PerMulta> buscarTodasMultas() throws SQLException
    
    /**
    *
    * Metodo que verifica se existe a multa informada
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param m Armazena o objeto
    * @return Boolean Retorna uma flag indicando se achou ou não
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public boolean buscarMultaCodigo(PerMulta m) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT 1 AS resultado"
                    +"\n FROM multa"
                    +"\n WHERE idmulta = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, m.getIdmulta());

        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            pstmt.close();
            return true;
        } else {
            pstmt.close();
            return false;
        }//if (resultado.next()) {
        
    }//public boolean buscarMultaCodigo(PerMulta m) throws SQLException
    
    //Metodo que busca por placa os automoveis do Banco De Dados 
    
    /**
    *
    * Metodo que verifica se existe alguma restricao de fk
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param m Armazena o objeto
    * @return Boolean Retorna uma flag indicando se achou ou não
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public boolean buscaRestricaoPkMulta(PerMulta m) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT 1 AS resultado"
                    +"\n FROM automovel"
                    +"\n WHERE idmulta = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);

        pstmt.setInt(1, m.getIdmulta());

        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            pstmt.close();
            return true;
        } else {
            pstmt.close();
            return false;
        }//if (resultado.next()) {
    }//public boolean buscaRestricaoPkMulta(PerMulta m) throws SQLException
    
}//public class PerMulta
