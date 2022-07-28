package c2tc.batch.Placement;
//using mysql datbase for data store
//use postman application for curd operation
//use spring tool suit for make spring boot project
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	private long id;
	private String fname;
	private String lname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
