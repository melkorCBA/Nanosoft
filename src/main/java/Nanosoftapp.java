import java.sql.*;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Nanosoftapp {
    public static void main(String[] args) throws ParseException {
        //String dbULR="jdbc:mysql://127.0.0.1:3306/nanosoft?autoReconnect=true&useSSL=false";
        //String username="root";
        //String password="Messi@1996";
        //

/*
        Calendar today = Calendar.getInstance();
        //today.set(Calendar.HOUR_OF_DAY, 0);
        Date date=today.getTime();
*/      SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
        Date date=dateFormat.parse("1996-07-05");
        //System.out.println(date.toString());

        //Project p1=new Project("Bermuda tri","desc2","platforom2");
        //auto increment
        //PermentEmp emp1=new PermentEmp(1000.00,5000.00,"skill1",true,1,"chatura",date ,"60/4 wiskam","email","96187","0768091157");
        //PermentEmp emp1=new PermentEmp(10000.00f,5000.00f,"skill1",true,1,"chatura2",date ,"60/4 wiskam2","email2","96187","0768091157");
        //ConnectionDB newCon=new ConnectionDB();
        //newCon.updateQuery(emp1.addPerson());
        //System.out.println(emp1.addPerson());


        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myConnection=DriverManager.getConnection(dbULR,username,password);
            Statement st=myConnection.createStatement();
            Employee.viewtable(st.executeQuery(Employee.readEmployee()));
            //st.executeUpdate(emp1.addPerson());
            //System.out.println(emp1.addPerson());
           // Date date=new Date();
           //TO_DATE('17/12/2015', 'DD/MM/YYYY')
           // st.executeUpdate(p1.addProject());
            //Project.viewtable(st.executeQuery(Project.readProject()));
        } catch (SQLException e) {
            e.printStackTrace();} catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        */

       // Employee emp1=new Employee();
        //System.out.println(emp1.getCurrentEmpId());
        //PermentEmp pemp=new PermentEmp(20000.00,5000.00,)
       // ConnectionDB newCon=new ConnectionDB();
        //Employee.viewtable(newCon.selectQuery(Employee.readEmployee()));

       /*
       //add new customer with project
       Customer cus1=new Customer(12000.00f,"whoami",date,"galle road galle","ezmail@cmail.com'","805879241V","0118956147");
        Project ro1=new Project("projectwho 1","do it", "windows");
        ConnectionDB newcon=new ConnectionDB();
        CustomerProject cp=new CustomerProject(newcon.insertQuery(cus1.addPerson()),newcon.insertQuery(ro1.addProject()));
       newcon.updateQuery(cp.addCustomerPro());
*/
      /* //add new permanent employee
        Employee newone=new Employee("skill1",true,1,"bashika",date ,"60/4 wiskam","email","96187","0768091157");
        ConnectionDB con=new ConnectionDB();
        PermentEmp newpone=new PermentEmp(con.insertQuery(newone.addPerson()),2000.00f,500.00f);
        con.updateQuery(newpone.addPerson());
*/
      /*  //add new temp employee
        Employee newone=new Employee("skill1",false,1,"de silva",date ,"60/4 wiskam","email","96187","0768091157");
        ConnectionDB con=new ConnectionDB();
        TempEmp newpone=new TempEmp(con.insertQuery(newone.addPerson()),2000.00f);
        con.updateQuery(newpone.addPerson());
/*
      //categorize projects and assign team leader
      LargeProject newpro=new LargeProject(1,300,4);
      ConnectionDB newcon=new ConnectionDB();
      newcon.updateQuery(newpro.addProject());

*/   /*   //edit customer - name and price
        Customer nwcus=new Customer();
        nwcus.setC_Id(6);
        ConnectionDB nwcon=new ConnectionDB();
        //nwcon.updateQuery(nwcus.editC_Name("rakatic"));
        nwcon.updateQuery(nwcus.editpPrice(20.00000f));
*/
    }


    }

