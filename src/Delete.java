import java.sql.*;
public class Delete {
    public static void main(String[] args) {
        try {
            String location = "C:/Medium/UCanAccess/project1/MyDB.accdb";
            // Insert your DB's location here
            String databaseURL = "jdbc:ucanaccess://" + location;
            Connection connection = DriverManager.getConnection(databaseURL);
            System.out.println("Connection done Successfully");
            Statement st = connection.createStatement();
            String query = "DELETE FROM TABLENAME WHERE CONDITION" ;//YOUR DELETE QUERY
            st.executeUpdate(query);
            System.out.println("EXCECUTED");
       } catch (Exception e) {
            System.out.println(e);
       }  
    }
}