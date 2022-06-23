package c2tc.batch.Placement;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="college")

public class College implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="ID")
	private long id;
	private int collegeadmin;
	private String collegename;
	private String location;
	public College() {
		super();
		
	}
	public College(long id, int collegeadmin, String collegename, String location) {
		super();
		this.id = id;
		this.collegeadmin = collegeadmin;
		this.collegename = collegename;
		this.location = location;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCollegeAdmin() {
		return collegeadmin;
	}
	public void setCollegeAdmin(int collegeadmin) {
		this.collegeadmin = collegeadmin;
	}
	public String getCollegeName() {
		return collegename;
	}
	public void setCollegeName(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [collegename=" + collegename + "]";
	}
	

}