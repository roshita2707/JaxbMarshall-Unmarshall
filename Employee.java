package Roshitha;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(propOrder= {"eId","eName","desg","salary","exp"})
public class Employee {
	
	String eId;
	String eName;
	String desg;
	double salary;
	int exp;
	long phoneNumber;
	
	public String geteId() {
		return eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDesg() {
		return desg;
	}
	@XmlElement
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSalary() {
		return salary;
	}
	@XmlElement
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@XmlTransient
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@XmlAttribute
	public void seteId(String eId) {
		this.eId = eId;
	}
	

}
