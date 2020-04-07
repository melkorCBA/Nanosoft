import java.text.SimpleDateFormat;
import java.util.Date;

public class TempEmp extends Employee {
    protected float rate;


    public TempEmp() {
        super();
    }

    public TempEmp(float rate, String skills, boolean type, int P_Id, String name, Date DOB, String adress, String email, String NIC, String TP) {
        super(skills, type,P_Id ,name,DOB, adress,email,NIC,TP);
        this.rate = rate;

    }

    public TempEmp(int e_id,float rate) {
        super.e_id=e_id;
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }

    public String setRate(float rate, int e_id) {
        this.rate = rate;
        super.e_id=e_id;
        return "UPDATE E_Temp set" +
                " E_T_Rate ="+rate+
                " WHERE E_T_Id="+e_id+";";
    }

    public String addPerson() {
        //return sql query
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
        //int nextId=super.getCurrentId()+1;
        return  "INSERT INTO E_Temp(E_T_Id, E_T_Rate) VALUES ("+ e_id+", " + rate +");";




        //

        //E_T_Id
        //E_T_Rate
    }

    public String readPerson(){
        //return sql query
        return "SELECT * FROM E_Temp;";
    }


}
