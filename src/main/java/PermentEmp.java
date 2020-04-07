import java.text.SimpleDateFormat;
import java.util.Date;

public class PermentEmp extends Employee {
    private float salary;
    private float allownces;


    public PermentEmp() {
        super();
    }

    public PermentEmp(float salary, float allownces, String skills, boolean type, int P_Id, String name, Date DOB, String adress, String email, String NIC, String TP) {
        super(skills, type,P_Id ,name,DOB, adress,email,NIC,TP);
        this.salary = salary;
        this.allownces = allownces;

    }

    public PermentEmp(int e_id,float salary, float allownces) {
        //super(skills, type, P_Id, name, DOB, adress, email, NIC, TP);
        super.e_id=e_id;
        this.salary = salary;
        this.allownces = allownces;
    }

    public float getSalary() {
        return salary;
    }

    public float getAllownces() {
        return allownces;
    }

    public String setSalary(float salary,int e_id) {

        this.salary = salary;
        super.e_id=e_id;
        return "UPDATE E_Perment set" +
                " E_P_Salary ="+salary+
                " WHERE E_P_Id="+e_id+";";

    }

    public String setAllownces(float allownces, int e_id) {
        this.allownces = allownces;
        super.e_id=e_id;
        return "UPDATE E_Perment set" +
                " E_P_Allownecs ="+salary+
                " WHERE E_P_Id="+e_id+";";
    }

    public String addPerson() {
        //return sql query
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
        //int nextId=super.getCurrentId()+1;
        return "INSERT INTO E_Perment(E_P_Id,E_P_Salary, E_P_Allownecs) VALUES ("+ e_id+", "+
                salary+", "+allownces+")";
        //E_P_Id
        //E_P_Salary
        //E_P_Allownecs

    }

    public String readPermentEmployee(){
        //return sql query
        return "SELECT * FROM E_Perment, Employee WHERE E_Perment.E_P_Id=Employee.E_Id ";
    }
}
