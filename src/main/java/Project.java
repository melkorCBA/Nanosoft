import java.sql.ResultSet;
import java.sql.SQLException;

public class Project {
    protected String p_name;
    protected int p_id;
    protected String desc;
    protected String platform;
    protected static int currentPId;
    protected boolean p_type; //can be null for for a record
    //add a boolean type field .......

    public Project() {
    }

    public Project(int p_id) {
        this.p_id = p_id;
    }

    public Project(String p_Name, String desc, String platform) {
        p_name = p_Name;
        //p_id = p_Id;
        this.desc = desc;
        this.platform = platform;
    }

    public Project(int p_id,String p_Name, String desc, String platform) {
        p_name = p_Name;
        //p_id = p_Id;
        this.desc = desc;
        this.platform = platform;
    }

    public  static int getCurrentId() {
        ConnectionDB newConnection = new ConnectionDB();
        ResultSet rs = newConnection.selectQuery("SELECT MAX(P_Id) AS MaxID FROM Project;");

        try {
            while (rs.next()) {
                currentPId = rs.getInt("MaxID");
            }
            //rs.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return currentPId;
    }

    public String getP_Name() {
        return p_name;
    }

    public int getP_Id() {
        return p_id;
    }

    public String getDesc() {
        return desc;
    }

    public String getPlatform() {
        return platform;
    }

    public String setP_Name(String p_Name, int p_id) {
        this.p_name=p_Name;
        this.p_id=p_id;

        return "UPDATE Project set" +
                " P_NAME ="+"\""+p_Name+"\""+
                " WHERE P_Id="+p_id+";";
    }

    public void setP_Id(int p_Id) {
        this.p_id=p_Id;
    }

    public String setDesc(String desc,int p_id) {
        this.desc=desc;
        this.p_id=p_id;

        return "UPDATE Project set" +
                " P_Desc ="+"\""+desc+"\""+
                " WHERE P_Id="+p_id+";";
    }

    public String setPlatform(String platform) {
        this.platform=platform;
        this.p_id=p_id;

        return "UPDATE Project set" +
                " P_Platform ="+"\""+platform+"\""+
                " WHERE P_Id="+p_id+";";
    }

    public static String readProject(){
        //return sql query
        return "SELECT * FROM project;";
    }

    public String addProject(){
        return "INSERT INTO project(P_NAME, P_Desc, P_Platform) VALUES ("+"'"+p_name+"'"+","+"'"+desc+"'"+","+"'"+platform+"'"+");";
    }

    public static void viewtable(ResultSet rs){
        while (true) {
            try {
                if (!rs.next()) break;
                Project currentProject=new Project();
                currentProject.p_name=rs.getString("P_NAME");
                currentProject.p_id=rs.getInt("P_Id");
                currentProject.platform=rs.getString("P_Platform");
                currentProject.desc=rs.getString("P_Desc");
                System.out.println(currentProject.toString());
                currentProject=null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public String toString() {
        return "Project{" +
                "p_name='" + p_name + '\'' +
                ", p_id=" + p_id +
                ", desc='" + desc + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }


}
