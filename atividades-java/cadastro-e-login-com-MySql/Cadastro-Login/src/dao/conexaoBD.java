
package dao;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

/**
 *
 * @author attie
 */
public class conexaoBD {
    
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;
    
    public conexaoBD()
    {
        this.servidor = "localhost";
        this.banco = "cadastro-login";
        this.usuario = "root";
        this.senha = "attie";
    }
    
    public boolean conectar(){
        try
        {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return true;
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    
    public Connection getConnection(){
        return conexao; 
    }
    
    
    }

