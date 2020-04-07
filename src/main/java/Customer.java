import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer extends Person {
    private int c_id;
    //private int p_id;
    private float price;
    //private static int currentCId;

    public Customer() {
        super();
    }



    public Customer(int c_Id,float price, String name, Date DOB, String adress, String email, String NIC, String TP) {
        super(name,DOB, adress,email,NIC,TP);
        c_id = c_Id;
       // p_id = p_Id;
        this.price = price;
    }

    public Customer(float price, String name, Date DOB, String adress, String email, String NIC, String TP) {
        super(name,DOB, adress,email,NIC,TP);
        this.price = price;
    }



    public void setC_Id(int c_Id) {
        c_id = c_Id;
    }

    public String setPrice(float price,int c_id){
        this.c_id=c_id;
        this.price=price;
        return "UPDATE Customer set" +
                " price ="+price+
                " WHERE C_Id="+c_id+";";
    }

    @Override
    public String setName(String name, int id) {
        super.name=name;
        this.c_id=id;
        return "UPDATE Customer set" +
                " C_Name ="+"\""+name+"\""+
                " WHERE C_Id="+id+";";
    }

    @Override
    public String setDOB(Date DOB, int id) {
        super.DOB=DOB;
        this.c_id=id;
        return "UPDATE Customer set" +
                " C_DOB ="+DOB+
                " WHERE C_Id="+id+";";
    }

    @Override
    public String setAdress(String adress, int id) {
        super.adress=adress;
        this.c_id=id;
        return "UPDATE Customer set" +
                " C_Adress ="+"\""+adress+"\""+
                " WHERE C_Id="+id+";";
    }

    @Override
    public String setEmail(String email, int id) {
        super.email=email;
        this.c_id=id;
        return "UPDATE Customer set" +
                " C_Email ="+"\""+email+"\""+
                " WHERE C_Id="+id+";";
    }

    @Override
    public String setNIC(String NIC, int id) {
        super.NIC=NIC;
        this.c_id=id;
        return "UPDATE Customer set" +
                " C_NIC ="+"\""+NIC+"\""+
                " WHERE C_Id="+id+";";
    }

    @Override
    public String setTP(String TP, int id) {
        super.TP=TP;
        this.c_id=id;
        return "UPDATE Customer set" +
                " C_TP ="+"\""+TP+"\""+
                " WHERE C_Id="+id+";";
    }





    public int getC_Id() {
        return c_id;
    }



    public float getPrice() {
        return price;
    }

    public String addPerson() {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
        //return sql query
        return "INSERT INTO Customer(C_Name, C_DOB, C_Adress, C_TP, C_Email, C_NIC) VALUES ("+
                   "\""+ name+"\""+","+"\""+dateFormat.format(DOB)+"\""+","+"\""+adress+"\""+", "+"\""+TP+"\""+","+"\""+email+"\""+", "+"\""+NIC +"\""+");";

    }

  /*  public  static int getCurrentId() {
        ConnectionDB newConnection = new ConnectionDB();
        ResultSet rs = newConnection.selectQuery("SELECT MAX(C_Id) AS MaxID FROM Customer;");

        try {
            while (rs.next()) {
                currentCId = rs.getInt("MaxID");
            }
            //rs.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return currentCId;
    }*/

    public String readPerson(){
        //return sql query
        return "SELECT * FROM Customer;";
    }

    //edits




}

