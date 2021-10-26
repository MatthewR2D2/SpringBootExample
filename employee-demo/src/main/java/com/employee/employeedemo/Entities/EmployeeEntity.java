package com.employee.employeedemo.Entities;
import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emp_no;

    private String first_name;
    private String last_name;
    private String birth_date;
    private String hire_date;
    private String gender;
     
    // getters and setters...
    public Integer getEmpNo() {return this.emp_no;}
    public void setEmpNo(Integer emp_no) {this.emp_no = emp_no;}
    
    public String getFirstName() {return this.first_name;}
    public void setFirstName(String first_name) {this.first_name = first_name;}
    
    public String getLastName() {return this.last_name;}
    public void setLastName(String last_name) {this.last_name = last_name;}

    public String getBirthDate() {return this.birth_date;}
    public void setBirthDate(String birth_date) {this.birth_date = birth_date;}
    
    public String getHireDate() {return this.hire_date;}
    public void setHireDate(String hire_date) {this.hire_date = hire_date;}

    public String getGender() {return this.gender;}
    public void setGender(String gender) {this.gender = gender;}
}
    

