
package dao;

import java.util.ArrayList;
import telas.Cadastro;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author attie
 */
public class cadastroDAO implements DAOInterfaces<Cadastro> {
    
    private conexaoBD conexao;
    
    public cadastroDAO()
    {
        this.conexao = new conexaoBD();
    }
   
    @Override
    public void inserir(Cadastro cadastro)
    {
        String sql = "INSERT INTO CADATRO (EMAIL,SENHA) VALUES (?,?)";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentence = this.conexao.getConnection().prepareStatement(sql);
                
                sentence.setString(1,cadastro.getEmail);
                sentence.setString(2,cadastro.getSenha);
                
                sentence.execute();
                sentence.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
        throw new RuntimeException(ex);
        }
    }

    @Override
    public ArrayList<Cadastro> consultar(){
    
        ArrayList<Cadastro> listaCadastros = new ArrayList<Cadastro>();
        String sql = "SELECT * FROM CADASTRO ORDER BY IDCADASTRO";
        
        try
        {
            if(this.conexao.conectar())
            {
            PreparedStatement sentence = this.conexao.getConnection().prepareStatement(sql);
            
            ResultSet resultadoSentence = sentence.executeQuery();
            
            while (resultadoSentence.next()){
                Cadastro cadastro = new Cadastro();
                cadastro.setIdCadastro(resultadoSentence.getInt("IDCADASTRO"));
                cadastro.setEmail(resultadoSentence.getString("EMAIL"));
                cadastro.setSenha(resultadoSentence.getString("SENHA"));
                
                listaCadastros.add(cadastro);
            }
            
            
                sentence.close();
                this.conexao.getConnection().close();
            }
            
                return listaCadastros;
        }
        catch(SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }
    

}
