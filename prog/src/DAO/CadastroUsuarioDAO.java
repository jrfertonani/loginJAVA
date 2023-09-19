
package DAO;

import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class CadastroUsuarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    
    public void cadastrarUsuario(UsuarioDTO objusuariodto){
        
        String sql = "insert into usuario(nome, login, senha, email) values (?,?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try{
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,objusuariodto.getNome());
            pstm.setString(2,objusuariodto.getLogin());
            pstm.setString(3,objusuariodto.getSenha());
            pstm.setString(4,objusuariodto.getEmail());
            
            pstm.execute();
            pstm.close();
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"CadastroUsuarioDAO" + e);
        }
        
        
    }
    
}
