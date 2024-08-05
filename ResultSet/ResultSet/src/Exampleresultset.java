import java.sql.*;
public class Exampleresultset {
    // Class.for("com.jdbc.mysql.jc");
    public static void main(String[] args) {
        
        Connection connection=null;
        ResultSet resultset=null;
        Statement statement=null;

        String url=("jdbc:mysql://localhost:3306/news-portal");
        String user="root";
        String password="";
        try {
            
            connection=DriverManager.getConnection(url,user,password);
            statement=connection.createStatement();
            String sql="SELECT author_id,author_name FROM author";
            resultset=statement.executeQuery(sql);

            while(resultset.next()){
                int id=resultset.getInt("author_id");
                String name=resultset.getString("author_name");
                System.out.println(id);
                System.out.println(name);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        finally{
            if(resultset!=null)
            {try {
                resultset.close();
                
            } catch (SQLException e) {
                System.out.println(e);
            }
            }
            if(statement!=null)
            {try {
                statement.close();
                
            } catch (SQLException e) {
                System.out.println(e);
            }
            }
            if(connection!=null)
            {try {
                connection.close();
                
            } catch (SQLException e) {
                System.out.println(e);
            }
            }
        }
    }


}
