package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {

	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/bd_cadastro_pessoa", "root", "");
		} catch (SQLException e) {
			
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return null;	
	}
}
