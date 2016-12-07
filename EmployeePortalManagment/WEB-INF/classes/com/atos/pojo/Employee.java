package com.atos.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NamedQuery(name="Person.findAll", query="SELECT e FROM Employee e")
@Table(name = "EMPLOYEE")
public class Employee {
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="EMPLOYEE_GENERATOR" )
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_GENERATOR")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
	private int eid;
		 private String DasID;
		  private String name;
		  private String uname;
		  private String passwd;
		  private String city;
		  private double salary;
		  private String role;
		  private String deg;
		public Employee() {
			super();
		}
		public Employee(int eid, String dasID, String name, String uname,
				String passwd, String city, double salary, String role,
				String deg) {
			super();
			this.eid = eid;
			DasID = dasID;
			this.name = name;
			this.uname = uname;
			this.passwd = passwd;
			this.city = city;
			this.salary = salary;
			this.role = role;
			this.deg = deg;
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getDasID() {
			return DasID;
		}
		public void setDasID(String dasID) {
			DasID = dasID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getPasswd() {
			return passwd;
		}
		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getDeg() {
			return deg;
		}
		public void setDeg(String deg) {
			this.deg = deg;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", DasID=" + DasID + ", name="
					+ name + ", uname=" + uname + ", passwd=" + passwd
					+ ", city=" + city + ", salary=" + salary + ", role="
					+ role + ", deg=" + deg + "]";
		}
		 
}
