package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
		@Id
		private int id;
		private String studentname;
		private String departmentname;
		private String mailid;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getStudentname() {
			return studentname;
		}
		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}
		public String getDepartmentname() {
			return departmentname;
		}
		public void setDepartmentname(String departmentname) {
			this.departmentname = departmentname;
		}
		public String getMailid() {
			return mailid;
		}
		public void setMailid(String mailid) {
			this.mailid = mailid;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", studentname=" + studentname + ", departmentname=" + departmentname
					+ ", mailid=" + mailid + "]";
		}
		
}
