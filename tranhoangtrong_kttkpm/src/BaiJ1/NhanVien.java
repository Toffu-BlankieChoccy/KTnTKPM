package BaiJ1;

public class NhanVien {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(int totalHour) {
        this.totalHour = totalHour;
    }

    public NhanVien(String name, int age, String address, double wage, int totalHour) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.wage = wage;
        this.totalHour = totalHour;
    }

    String name;
    int age;
    String address;
    double wage;
    int totalHour;

    public String getThongTin(){
        return "Name: " + getName() + "\nAge " + age + "\nAddress: " + address + "\nWage: " + wage +
                "\nTotal Hour: " + totalHour + "\nBonus: " + tinhLuong();
    }

    double tinhLuong(){
        if (totalHour<100)
                return 0;
        if (totalHour<200)
                return wage * 10 / 100;
        else return wage * 20/100;
    }
}
