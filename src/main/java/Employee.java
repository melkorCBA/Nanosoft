import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public   class  Employee extends  Person {
    protected int e_id;
    protected String skills;
    protected boolean type;
    protected int P_Id;
   // protected static int currentEmpId=0;

   /* public  static int getCurrentId(){
        ConnectionDB newConnection=new ConnectionDB();
        ResultSet rs=newConnection.selectQuery("SELECT MAX(E_Id) AS MaxID FROM Employee;");

            try {
                while (rs.next()) {
                    currentEmpId= rs.getInt("MaxID");
                }
                //rs.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }


        return currentEmpId;
        }
*/


    public Employee() {
        super();
    }

    public Employee(int e_Id, String skills, boolean type, int P_Id, String name, Date DOB, String adress, String email, String NIC, String TP) {
        super(name,DOB, adress,email,NIC,TP);
        this.P_Id=P_Id;
        this.e_id = e_Id;
        this.skills = skills;
        this.type=type;
    }

    public Employee(String skills,boolean type,int P_Id, String name, Date DOB, String adress, String email, String NIC,String TP) {
        super(name,DOB, adress,email,NIC,TP);
        this.P_Id=P_Id;
        this.skills = skills;
        this.type=type;
    }

    public void setE_Id(int e_Id) {
        e_id = e_Id;
    }

    public String setSkills(String skills,int e_id) {
        this.e_id=e_id;
        this.skills=skills;

        return "UPDATE Employee set" +
                " E_Skills ="+"\""+skills+"\""+
                " WHERE E_Id="+e_id+";";
    }
    //need to switch table also
    public String setType(boolean type,int e_id) {
        this.type = type;
        this.e_id=e_id;
        return "UPDATE Employee set" +
                " E_Type ="+skills+
                " WHERE E_Id="+e_id+";";
    }

    public String setP_Id(int p_Id,int e_id) {
        this.P_Id = p_Id;
        this.e_id=e_id;
        return "UPDATE Employee set" +
                " P_Id ="+p_Id+
                " WHERE E_Id="+e_id+";";
    }


    @Override
    public String setName(String name, int id) {
        super.name=name;
        this.e_id=id;
        return "UPDATE Employee set" +
                " E_Name ="+"\""+name+"\""+
                " WHERE E_Id="+id+";";
    }

    @Override
    public String setDOB(Date DOB, int id) {
        super.DOB=DOB;
        this.e_id=id;
        return "UPDATE Employee set" +
                " E_DOB ="+DOB+
                " WHERE E_Id="+id+";";
    }

    @Override
    public String setAdress(String adress, int id) {
        this.e_id=id;
        super.adress=adress;
        return "UPDATE Employee set" +
                " E_Adress ="+"\""+adress+"\""+
                " WHERE E_Id="+id+";";
    }

    @Override
    public String setEmail(String email, int id) {
        super.email=email;
        this.e_id=id;
        return "UPDATE Employee set" +
                " E_Email ="+"\""+email+"\""+
                " WHERE E_Id="+id+";";
    }

    @Override
    public String setNIC(String NIC, int id) {
        this.e_id=id;
        super.NIC=NIC;
        return "UPDATE Employee set" +
                " E_NIC ="+"\""+NIC+"\""+
                " WHERE E_Id="+id+";";
    }

    @Override
    public String setTP(String TP, int id) {
        super.TP=TP;
        this.e_id=id;
        return "UPDATE Employee set" +
                " E_TP ="+"\""+TP+"\""+
                " WHERE E_Id="+id+";";
    }


    public int getE_Id() {
        return e_id;
    }

    public String getSkills() {
        return skills;
    }


    //can't add a employee - need to specify which type
    public   String addPerson(){
        //return sql query
        //System.out.println(TP);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
        return "INSERT INTO Employee(E_Name, E_DOB, E_Adress, E_TP, E_Email, E_NIC, E_Skills,P_Id, E_Type) VALUES ("+
                "\""+name+"\""+", " +"\""+dateFormat.format(DOB)+"\""+","+"\""+adress+"\""+","+"\""+TP+"\""+","+"\""+email+"\""+", "+"\""+NIC+"\""+", "+"\""+skills+"\""+", "+P_Id+", "+type+");";
    }
    public static String readEmployee(){
        //return sql query
        return "SELECT * FROM Employee;";
    }

    public static void viewtable(ResultSet rs){
        while (true) {
            try {
                if (!rs.next()) break;
                Employee currentEmp=new Employee();
                currentEmp.name=rs.getString("E_NAME");
                currentEmp.e_id=rs.getInt("E_Id");
                currentEmp.DOB=rs.getDate("E_DOB");
                currentEmp.adress=rs.getString("E_Adress");
                currentEmp.TP=rs.getString("E_TP");
                currentEmp.email=rs.getString("E_Email");
                currentEmp.NIC=rs.getString("E_NIC");
                currentEmp.skills=rs.getString("E_Skills");
                currentEmp.P_Id=rs.getInt("P_Id");
                currentEmp.type=rs.getBoolean("E_Type");
                System.out.println(currentEmp.toString());
                currentEmp=null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", skills='" + skills + '\'' +
                ", type=" + type +
                ", P_Id=" + P_Id +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", NIC='" + NIC + '\'' +
                ", TP='" + TP + '\'' +
                '}';
    }
}
