import java.util.Date;

public abstract class Person  {
    protected String name;
    protected Date DOB;
    protected String adress;
    protected String email;
    protected String NIC;
    protected String TP;

    public Person() {
    }

    public Person(String name, Date DOB, String adress, String email, String NIC,String TP) {
        this.name = name;
        this.DOB = DOB;
        this.adress = adress;
        this.email = email;
        this.NIC = NIC;
        this.TP=TP;
    }

    public String getName() {
        return name;
    }

    public Date getDOB() {
        return DOB;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public String getNIC() {
        return NIC;
    }

    public abstract String setName(String name,int id);

    public abstract String setDOB(Date DOB,int id);

    public abstract String setAdress(String adress,int id);

    public abstract String setEmail(String email,int id);

    public abstract String setNIC(String NIC,int id);

    public abstract String setTP(String TP, int id);

    public abstract String addPerson();




}
