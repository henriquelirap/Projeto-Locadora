package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    private final String database = "locadora";
    private final String user = "root";
    private final String password = "";

    public Connection getConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/" + database + "?userSSL=false", user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível se conectar ao banco de dados!", "Atenção", JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException(ex);
        }
    }
}
