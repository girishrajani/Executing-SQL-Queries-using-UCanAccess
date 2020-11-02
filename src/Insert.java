import java.sql.*;
public class Insert {
    public static void main(String[] args) {
        try {
            String location = "C:/Medium/UCanAccess/project1/MyDB.accdb";
            // Insert your DB's location here
            String databaseURL = "jdbc:ucanaccess://" + location;
            Connection connection = DriverManager.getConnection(databaseURL);
            System.out.println("Connection done Successfully");
            Statement st = connection.createStatement();
            String query = "INSERT INTO TABLENAME(ROW1, ROW2)   VALUES(VALUE1, VALUE2)" ;//YOUR INSERT QUERY
            st.executeUpdate(query);
            System.out.println("EXCECUTED");
       } catch (Exception e) {
            System.out.println(e);
       }       
    }
}