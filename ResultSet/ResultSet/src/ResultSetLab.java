
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ResultSetLab {

    
    public static void main(String[] args) throws SQLException{
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        
        String dbURL="jdbc:mysql://localhost:3306/news-portal";
        String user="root";
        String password="";
        try {
            
            
            connection=DriverManager.getConnection(dbURL,user,password);
            statement=connection.createStatement();
            String sql="SELECT author_id,author_name,author_password FROM author";
            resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                int id=resultSet.getInt("author_id");
                String name=resultSet.getString("author_name");
                String passwordd=resultSet.getString("author_password");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Password: " + passwordd);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
           if (resultSet!=null) {
            try {
                resultSet.close();
                
            } catch (SQLException e) {
                System.out.println(e);
            }
               
           }
           if(statement!=null){
            try {
                statement.close();
                
            } catch (SQLException e) {
                System.out.println(e);
            }
           }
           if(connection!=null){
            try {
                connection.close();
                
            } catch (SQLException e) {
                System.out.println(e);
            }
           }
        }
    }
    
}
