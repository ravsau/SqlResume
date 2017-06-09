import java.sql.*;

public class SqlJava {


	
	
public void sqlMethod(String a, String b, String c, String d, String ee, String f){
	Connection con = null;
	PreparedStatement pstmt = null;
	PreparedStatement pstmt1=null;
	ResultSet rs = null;
	String sql = "INSERT INTO UserInfo(FirstName,LastName,Email,Education,WorkExperience,Skill)values(?,?,?,?,?,?)";
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/Resume?"
				+ "user=root&password=password");
		pstmt = con.prepareStatement(sql);
		// rs = stmt.executeQuery(sql);
		pstmt.setString(1, a);
		pstmt.setString(2, b);
		pstmt.setString(3, c);
		pstmt.setString(4, d);
		//System.out.println("--------------------------------------");
		pstmt.setString(5,ee);
		pstmt.setString(6,f );
		int i= pstmt.executeUpdate();
		System.out.println("********"+i);



	

	}catch (SQLException e) {
		e.printStackTrace();
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	} finally {
		try {

			pstmt.close();
			
			con.close();
		
		}catch(SQLException e){
			e.printStackTrace();
		}
	}


}}
