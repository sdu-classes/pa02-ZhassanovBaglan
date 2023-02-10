import java.util.*;

public class Main {
	public static void main(String[] args){
		Student stu = new Student("Danial S.", "Kaskelen, AbylayKhan 1/2", "Computer Science", 3, 1259);
        System.out.println(stu.toString());
        Staff stf = new Staff("Danial S.", "Kaskelen, AbylayKhan 1/2", "school of retards", 1488);
        System.out.println(stf.toString());
	}
}

class Person{
    private String name;
    private String address;
    Person(){}
    Person(String name, String address){this.address = address; this.name = name;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public void setName(String name){this.name = name;}
    public void setAddress(String address){this.address = address;} 
    @Override
    public String toString(){return "Person[name=" + this.name + ",address=" + this.address+"]";}
}

class Student extends Person{
    private String program;
    private int year;
    private double fee;
    Student(){}
    Student(String name, String address, String program, int year, double fee){super.setName(name); super.setAddress(address); this.program = program; this.year = year; this.fee = fee;}
    public String getProgram(){return this.program;}
    public int getYear(){return this.year;}
    public double getFee(){return this.fee;}
    public void setProgram(String program){this.program = program;}
    public void setYear(int year){this.year = year;}
    public void setFee(double fee){this.fee = fee;}
    @Override
    public String toString(){return"Person[name=" + super.getName() + ",address=" + super.getAddress() + ",program=" + this.program + ",year=" + this.year + ",fee=" + this.fee + "]";}
}

class Staff extends Person{
    private String school;
    private double pay;
    Staff(){}
    Staff(String name, String address, String school, double pay){super.setName(name); super.setAddress(address); this.school = school; this.pay = pay;}
    public String getSchool(){return this.school;}
    public double getPay(){return this.pay;}
    public void setSchool(String school){this.school = school;}
    public void set(double pay){this.pay = pay;}
    @Override
    public String toString(){return "Person[name=" + super.getName() + ",address=" + this.getAddress() + ",school=" + this.school + ",pay=" + this.pay + "]";} 
}
