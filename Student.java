package oop;

public class Student {
    String name;
    String curriculum;
    String country;
    String address;
    int id;
    int admission_year;
    int account_number;
    int phone_number;

    public Student(String name, String curriculum, String country, String address, int id,
                   int admission_year, int account_number, int phone_number) {
        this.name = name;
        this.curriculum = curriculum;
        this.country = country;
        this.address = address;
        this.id = id;
        this.admission_year = admission_year;
        this.account_number = account_number;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdmission_year() {
        return admission_year;
    }

    public void setAdmission_year(int admission_year) {
        this.admission_year = admission_year;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", curriculum='" + curriculum + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", admission_year=" + admission_year +
                ", account_number=" + account_number +
                ", phone_number=" + phone_number +
                '}';
    }
}
