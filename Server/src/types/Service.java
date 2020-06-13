package types;

public class Service {
    private String name;
    private int price;
    private String hostel;
    private int number;
    private String time;
    private String master;

    public Service() {
        this.name = "";
        this.price = 0;
        this.hostel = "";
        this.number = 0;
        this.master ="";
        this.time="";
    }

    public Service(String name, String hostel,int number, int price, String time, String master) {
        this.name = name;
        this.price = price;
        this.hostel = hostel;
        this.number = number;
        this.time = time;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

   // public int getSumma() {        return this.price;    }
}
