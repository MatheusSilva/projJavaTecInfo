package persistencia;
import util.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe PerCondutor da camada de persistencia
 * 
 * @version 2.3 beta
 * @author Matheus Souza da Silva
 * @since 02/05/2011
 */
public class PerCondutor 
{
    /*
    * Armazena o codigo do condutor
    */
    private int  idcondutor;
    
    /*
    * Armazena o sexo do condutor
    */
    private String sexo;
    
    /*
    * Armazena o nome do condutor
    */
    private String nome;
    
    /*
    * Armazena o sobrenome do condutor
    */
    private String sobrenome;
    
    /*
    * Armazena o rg do condutor
    */
    private int rg;
    
    /*
    * Armazena o cfp do condutor
    */
    private int cfp;
    
    /*
    * Armazena o data de nascimento do condutor
    */
    private String datanascimento;
    
    /*
    * Armazena o cnh do condutor
    */
    private int cnh;
    
    /*
    * Armazena a placa do condutor
    */
    private String placa;
    
    /* Objeto automovel do tipo PerAutomovel
       Através deste método conseguiremos passar
       o idAutomovelatravés do nome que o usuário
       escolher na JComboBox */
    private PerAutomovel automovel;
    
    /**
    *
    * Método acessor get que retorna a placa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a placa
    */
    public String getPlaca() 
    {
        return placa;
    }//public String getPlaca()

    /**
    *
    * Método acessor set que armazena a placa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param placa Armazena a placa
    */
    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }//public void setPlaca(String placa)

    /**
    *
    * Método acessor get que retorna o objeto 
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return PerAutomovel Retorna o objeto 
    */
    public PerAutomovel getAutomovel() 
    {
        return automovel;
    }//public PerAutomovel getAutomovel()

    /**
    *
    * Método acessor set que armazena o objeto
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param automovel Armazena o objeto
    */
    public void setAutomovel(PerAutomovel automovel) 
    {
        this.automovel = automovel;
    }//public void setAutomovel(PerAutomovel automovel)
   
    /**
    *
    * Método acessor get que retorna o sexo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o sexo
    */
    public String getSexo() 
    {
        return sexo;
    }//public String getSexo() 

    /**
    *
    * Método acessor set que armazena o sexo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param sexo Armazena o sexo
    */
    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }//public void setSexo(String sexo) 

    /**
    *
    * Método acessor get que retorna o cfp
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return int Retorna o cfp
    */
    public int getCfp() 
    {
        return cfp;
    }//public int getCfp()
    
    /**
    *
    * Método acessor set que armazena o cfp
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param cfp Armazena o sexo
    */
    public void setCfp(int cfp) 
    {
        this.cfp = cfp;
    }//public void setCfp(int cfp) 
    
    /**
    *
    * Método acessor get que retorna o cnh
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return int Retorna o cnh
    */
    public int getCnh() 
    {
        return cnh;
    }//public int getCnh() 
    
    /**
    *
    * Método acessor set que armazena o cnh
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param cnh Armazena o cnh
    */
    public void setCnh(int cnh) 
    {
        this.cnh = cnh;
    }//public void setCnh(int cnh) 
    
    /**
    *
    * Método acessor get que retorna a data de nascimento
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna a data de nascimento
    */
    public String getDatanascimento() 
    {
        return datanascimento;
    }//public String getDatanascimento() 
    
    /**
    *
    * Método acessor set que armazena a data de nascimento
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param datanascimento Armazena a data de nascimento
    */
    public void setDatanascimento(String datanascimento) 
    {
        this.datanascimento = datanascimento;
    }//public void setDatanascimento(String datanascimento) 
    
    /**
    *
    * Método acessor get que retorna o código do condutor
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return Int Retorna o código do condutor
    */
    public int getIdcondutor() 
    {
        return idcondutor;
    }//public int getIdcondutor() 
    
    /**
    *
    * Método acessor set que armazena o codigo do condutor
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param idcondutor Armazena o codigo do condutor
    */
    public void setIdcondutor(int idcondutor) 
    {
        this.idcondutor = idcondutor;
    }//public void setIdcondutor(int idcondutor)
    
    /**
    *
    * Método acessor get que retorna o nome
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o nome do condutor
    */
    public String getNome() 
    {
        return nome;
    }//public String getNome() 
    
    /**
    *
    * Método acessor set que armazena o nome
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param nome Armazena o nome
    */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }//public void setNome(String nome) 
    
    /**
    *
    * Método acessor get que retorna o rg
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return Int Retorna o rg
    */
    public int getRg() 
    {
        return rg;
    }//public int getRg() 
    
    /**
    *
    * Método acessor set que armazena o rg
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param rg Armazena o rg
    */
    public void setRg(int rg) 
    {
        this.rg = rg;
    }//public void setRg(int rg) 
    
    /**
    *
    * Método acessor get que retorna o sobrenome
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return String Retorna o sobrenome
    */
    public String getSobrenome() 
    {
        return sobrenome;
    }//public String getSobrenome() 
    
    /**
    *
    * Método acessor set que armazena o sobrenome
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param sobrenome Armazena o sobrenome
    */
    public void setSobrenome(String sobrenome) 
    {
        this.sobrenome = sobrenome;
    }//public void setSobrenome(String sobrenome) 

    @Override
    public String toString()
    {
        return this.getNome();
    }//public String toString()

    /**
    *
    * Metodo que Cadastra o Condutor
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param c Armazena o objeto do condutor
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void cadastrarCondutor(PerCondutor c) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "INSERT INTO condutor(idcondutor"
                    +"\n ,sexo"
                    +"\n ,nome"
                    +"\n ,sobrenome"
                    +"\n ,rg"
                    +"\n ,cpf"
                    +"\n ,datanascimento"
                    +"\n ,cnh"
                    +"\n ,idautomovel)"
                    +"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setString(1, null);
        pstmt.setString(2, c.getSexo());
        pstmt.setString(3, c.getNome());
        pstmt.setString(4, c.getSobrenome());
        pstmt.setInt(5, c.getRg());
        pstmt.setInt(6, c.getCfp());
        pstmt.setString(7, c.getDatanascimento());
        pstmt.setInt(8, c.getCnh());
        pstmt.setInt(9, c.getAutomovel().getIdautomovel());
        
        pstmt.executeUpdate();
        pstmt.close();
    }//public void cadastrarCondutor(PerCondutor c) throws SQLException

    /**
    *
    * Metodo que deleta o condutor pelo Cnh
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param c Armazena o objeto do condutor
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void deletarCondutorCnh(PerCondutor c) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "DELETE FROM condutor"
                    +"\n WHERE cnh = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, c.getCnh());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void deletarCondutorCnh(PerCondutor c) throws SQLException

    /**
    *
    * Metodo que deleta o condutor pelo Codigo
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param c Armazena o objeto do condutor
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public void deletarCondutorCodigo(PerCondutor c) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "DELETE FROM condutor "
                    +"\n WHERE idcondutor = ?";
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, c.getIdcondutor());

        pstmt.executeUpdate();
        pstmt.close();
    }//public void deletarCondutorCodigo(PerCondutor c) throws SQLException

    /**
    *
    * Metodo que Busca todos Condutores
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @return ArrayList Retorna todos os condutores
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public ArrayList<PerCondutor> buscarTodosCondutores() throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        Statement stat = conexao.createStatement();
        
        String sql = "SELECT idcondutor"
                    +"\n ,sexo"
                    +"\n ,nome"
                    +"\n ,sobrenome"
                    +"\n ,rg"
                    +"\n ,cpf"
                    +"\n ,datanascimento"
                    +"\n ,cnh"
                    +"\n ,automovel.placa"
                    +"\n FROM condutor"
                    +"\n ,automovel"
                    +"\n WHERE automovel.idautomovel = condutor.idautomovel";

        ResultSet resultado = stat.executeQuery(sql);
        ArrayList<PerCondutor> aAux = new ArrayList<>();

        while (resultado.next()) {
            PerCondutor c = new PerCondutor();
            c.setIdcondutor(resultado.getInt("idcondutor"));
            c.setSexo(resultado.getString("sexo"));
            c.setNome(resultado.getString("nome"));
            c.setSobrenome(resultado.getString("sobrenome"));
            c.setRg(resultado.getInt("rg"));
            c.setCfp(resultado.getInt("cpf"));
            c.setDatanascimento(resultado.getString("datanascimento"));
            c.setCnh(resultado.getInt("cnh"));

            PerAutomovel a = new PerAutomovel();
            a.setPlaca(resultado.getString("placa"));
            
            c.setAutomovel(a);
            aAux.add(c);
        }//while (resultado.next()) {

        stat.close();
        return aAux;
    }//public ArrayList<PerCondutor> buscarTodosCondutores() throws SQLException

    /**
    *
    * Metodo que verifica se existe algum condutor vinculado ao cnh informado
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param a Armazena o objeto
    * @return Boolean Retorna uma flag indicando se achou ou não
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public boolean buscarCondutorCnh(PerCondutor a) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT 1 AS resultado"
                    +"\n FROM condutor WHERE cnh = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, a.getCnh());
        
        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            a.setIdcondutor(resultado.getInt("idcondutor"));
            pstmt.close();
            return true;
        } else {
            pstmt.close();
            return false;
        }//if (resultado.next()) {
    }//public boolean buscarCondutorCnh(PerCondutor a) throws SQLException

    /**
    *
    * Metodo que verifica se existe algum condutor vinculado ao codigo informado
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param a Armazena o objeto
    * @return Boolean Retorna uma flag indicando se achou ou não
    * @throws SQLException Lança uma excessão caso algum erro no banco de dados venha ocorrer
    */
    public boolean buscarCondutorCodigo(PerCondutor a) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT 1 AS resultado"
                    +"\n FROM condutor"
                    +"\n WHERE idcondutor = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);
        
        pstmt.setInt(1, a.getIdcondutor());

        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            pstmt.close();
            return true;
        } else {
            pstmt.close();
            return false;
        }//if (resultado.next()) {
    }//public boolean buscarCondutorCodigo(PerCondutor a) throws SQLException
    
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
    public boolean buscaRestricaoPkCondutor(PerCondutor a) throws SQLException
    {
        Connection conexao = ConexaoBanco.getConexao();
        
        String updt = "SELECT 1 AS resultado"
                    +"\n FROM endereco"
                    +"\n WHERE idcondutor = ?"; 
        
        PreparedStatement pstmt = conexao.prepareStatement(updt);

        pstmt.setInt(1, a.getIdcondutor());

        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            pstmt.close();
            return true;
        } else {
            pstmt.close();
            return false;
        }//if (resultado.next()) {
    }//public boolean buscaRestricaoPkCondutor(PerCondutor a) throws SQLException
    
}//public class PerCondutor
