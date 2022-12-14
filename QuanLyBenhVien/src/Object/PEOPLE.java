
package Object;

public class PEOPLE {
    private String ID, Name, Email, Phone, Address;
    private boolean Sex;
    private double Age;

    public PEOPLE(String iD, String name, String email, String phone, String address, boolean sex, double age) {
        ID = iD;
        Name = name;
        Email = email;
        Phone = phone;
        Address = address;
        Sex = sex;
        Age = age;
    }

    public PEOPLE(String iD, String name, String phone, double age) {
        ID = iD;
        Name = name;
        Phone = phone;
        Age = age;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public boolean isSex() {
        return Sex;
    }

    public void setSex(boolean sex) {
        Sex = sex;
    }

}
