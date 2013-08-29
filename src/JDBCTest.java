import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTest {
	
	// http://jdbc.postgresql.org/documentation/head/connect.html
		public static void main(String[] args) throws SQLException,
				FileNotFoundException, IOException {
			Properties props = new Properties();
			props.load(new FileInputStream("programa.properties"));
			String url = props.getProperty("url");
			System.out.println(url);

			Connection db = DriverManager.getConnection(url, props);
			System.out.println("Conectado!");

			String nome = "gustavo";
			String cmd = "select * from pessoas where nome = ?";
			PreparedStatement st = db.prepareStatement(cmd);
			st.setString(1, nome);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
			    
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}		

			rs.close();
			st.close();
		}

}
