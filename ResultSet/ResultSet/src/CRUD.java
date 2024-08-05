import java.sql.*;
import java.util.Scanner;
public class CRUD {
    private static Connection connection=null;
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        CRUD crud=new CRUD();
        try {
            
            String dbUrl="jdbc:mysql://localhost:3306/news-portal";
            String user="root";
            String password="";
            connection=DriverManager.getConnection(dbUrl,user,password);
            System.out.println("Enter value");
            System.out.println("1. Insert Value");
            int choice=Integer.parseInt(scanner.nextLine());
            switch(choice) {
                case 1 -> crud.insertValue();
                default -> {
                }
            }
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    private void insertValue(){
        System.out.println("inside insert value");
    }
}
