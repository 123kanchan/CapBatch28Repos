package Pack1;

public class Employee {
private int empId;
private String empName;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
}
public Employee(int empId, String empName, float sal) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.sal = sal;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public float getSal() {
	return sal;
}
public void setSal(float sal) {
	this.sal = sal;
}
private float sal;
}
