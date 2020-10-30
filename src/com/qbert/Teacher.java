package com.qbert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO or MODEL or BEAN

@Entity
@Table(name = "TeacherInfo")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int t_id;
	private String t_name;
	@Column(unique = true)       
	private String subject;
	private double salary;
	public Teacher() {
		super();
	}
	public Teacher(int t_id, String t_name, String subject, double salary) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.subject = subject;
		this.salary = salary;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [t_id=");
		builder.append(t_id);
		builder.append(", t_name=");
		builder.append(t_name);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	
	
}
