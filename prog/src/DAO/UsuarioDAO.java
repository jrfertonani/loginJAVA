package DAO;

import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from usuario where login = ? and senha = ? ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getLogin());
            pstm.setString(2, objusuariodto.getSenha());
            
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
            
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + e);
            return null;
        }

    }

}
