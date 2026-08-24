package com.snpsu.oops.pillars.Encapsulation;

public class Employee {
    private String empname;
    private int empId;
    Employee(String empname, int empId){
        this.empname = empname;
        this.empId = empId;
    }
    String getEmpname(){
        return empname;
    }
    int getEmpId(){
        return empId;
    }
    void setEmpname(String empname1){
        empname=empname1;
    }
    void setEmpId(int empId){
        this.empId=empId;
    }
    void printDetail(){
        System.out.println("EMPLOYEE NAME "+ this.empname);
        System.out.println("employee id "+ this.empId);
    }
}
class DriverCode{
    public static void main(String[] args) {
        Employee emp1=new Employee("kavya",101);
        emp1.printDetail();
        System.out.println(emp1.getEmpname());
        emp1.setEmpname("perumal");
        emp1.printDetail();
    }
}