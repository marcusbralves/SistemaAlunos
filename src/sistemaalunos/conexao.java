package sistemaalunos;

public class conexao {
	package Chrome;

	import java.sql.*;

	import javax.swing.JOptionPane;

	public class Conexao {
		static String status="";
		static Connection conn=null;
		
		static String address = "localhost"; 
		static String database = "sistemaonus"; 
		static String user = "root"; 
		static String password = ""; 
		
		public static Connection getConnection(){
			
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				String url = "jdbc:mysql://"+address+"/"+database+"?user="+user+"&password="+password;
				
				conn = DriverManager.getConnection(url);
				status = ("Iniciando Sistema: \nConnexao Autorizada...");
				JOptionPane.showMessageDialog(null, status);
				
			} catch (SQLException e) {
				status = "1 " + e.getMessage();
			}catch (ClassNotFoundException e) {
				status = "2 " + e.getMessage();
			}catch (Exception e) {
				status = "3 " + e.getMessage();
			}
			

}
