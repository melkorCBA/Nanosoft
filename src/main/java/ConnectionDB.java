import java.sql.*;
import java.lang.ClassNotFoundException;

public class ConnectionDB {
    String dbULR="jdbc:mysql://127.0.0.1:3306/nanosoft?autoReconnect=true&useSSL=false&allowMultiQueries=true";
    String username="root";
    String password="Messi@1996";
    Connection myConnection;
    Statement st;

    private  void setConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            myConnection=DriverManager.getConnection(dbULR,username,password);
            st=myConnection.createStatement();


        } catch (SQLException e) {
            e.printStackTrace();}
        catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

    }

    public ResultSet selectQuery(String query){
        //for selections - return Resultset
        this.setConnection();
        try {
            ResultSet rst=st.executeQuery(query);
           // myConnection.close();;
           // st.close();;
            return rst;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean updateQuery(String query){
        //for updating - returns  true if updating is successful

        this.setConnection();
        try {
            return st.executeUpdate(query)!=0?true:false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int insertQuery(String query){

        //returns the auto generated key
        int currentId=0;
        this.setConnection();
        try {
            currentId=st.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=st.getGeneratedKeys();
            try {
                while (rs.next()) {
                    currentId= rs.getInt(1);
                }
                //rs.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }




        } catch (SQLException e) {
            e.printStackTrace();

        }
        return currentId;
    }





}
