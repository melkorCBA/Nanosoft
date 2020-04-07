public class CustomerProject {
    private int c_id;
    private int p_id;

    //give parameters using getCurretId from customer and  projects
    public CustomerProject(int c_id, int p_id) {
        this.c_id = c_id;
        this.p_id = p_id;
    }

    public String addCustomerPro(){
        return "INSERT INTO Customer_Project(P_Id, C_Id) VALUES ( "+p_id+","+c_id+")";
    }
}
