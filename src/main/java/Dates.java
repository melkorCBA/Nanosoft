public class Dates {
    int day,month,year;

    public Dates() {
    }

    public Dates(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDate(){
        return Integer.toString(year)+"-"+Integer.toString(month)+"-"+Integer.toString(day);
    }
}
