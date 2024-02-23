/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinal.appleistore3.employee;

import dinal.appleistore3.CSVHandler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author dnlx
 */
public class Employee {    
    private String empId;
    private String empName;
    private String empPw;
    private String permission;


    public Employee(String empName, String empPw, String permission) {
        UUID randomUUID = UUID.randomUUID();
        this.empId = randomUUID.toString();        
        this.empName = empName;
        this.empPw = empPw;
        this.permission = permission;
    }
        
    public Employee (String empId, String empName, String empPw, String permission) {
        this.empId = empId;
        this.empName = empName;
        this.empPw = empPw;
        this.permission = permission;
    }

    public String getEmpName() {
        return empName;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public String getEmpPw() {
        return empPw;
    }
    
    public void setEmpPw(String empPw) {
        this.empPw = empPw;
    }
    
    public String getPermission() {
        return permission;
    }
    
    public void setPermission(String permission) {
        this.permission = permission;
    }

@Override
    public String toString() {
        return this.empId + "," + this.empName + ","+ this.empPw + "," + this.permission ;
    }
//write data rows to CSV file
    public boolean save() throws IOException {
        String content = this.toString();
        CSVHandler.write("./employee.csv", content, true);
        return true;
    }
//update CSV file with current data
    public boolean update() throws FileNotFoundException, IOException {
        ArrayList<String> employees = CSVHandler.read("./employee.csv");
        for (int index = 0; index < employees.size(); index++) {
            String employee = employees.get(index);
            String[] data = employee.split(",");
            if (data[0].equals(this.empId)) {
                data[1] = this.empName;
                data[2] = this.empPw;
                data[3] = this.permission;
                employees.set(index, String.join(",", data));
            }
        }
        CSVHandler.write("./employee.csv", employees, false);
        return true;
    }
//delete rows in CSV file
    public boolean delete() throws FileNotFoundException, IOException {
        // delete file logic
        ArrayList<String> employees = CSVHandler.read("./employee.csv");
        for (int index = 0; index < employees.size(); index++) {
            String product = employees.get(index);
            String[] data = product.split(",");
            if (data[0].equals(this.empId)) {
                employees.remove(index);
            }
        }
        CSVHandler.write("./employee.csv", employees, false);
        return true;
    }

}

