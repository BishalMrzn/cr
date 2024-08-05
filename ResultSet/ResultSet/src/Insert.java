
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
    private static Connection connection=null;
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Insert insert=new Insert();
        String url=("jdbc:mysql://localhost:3306/news-portal");
        String user="root";
        String password="";
        try {
            connection=DriverManager.getConnection(url,user,password);
            System.out.println("Enter the value");
            System.out.println("1.Insert");
            int cause=Integer.parseInt(scanner.nextLine());
            switch (cause) {
                case 1->insert.insertValue();
                case 2->insert.anotherValue();
                default->{

                }
            }


            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    private void insertValue(){
        System.out.println("Value inserted");
    }
    private void anotherValue(){
        System.out.println("Value is not added");
    }
    
}
