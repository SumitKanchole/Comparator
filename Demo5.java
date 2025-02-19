import java.util.*;
class Employee implements Comparator <Employee> {
	private int id;
	private String name;
	private double salary;
	
	public void SetId(int id){
	  this.id=id;
	  }
	public void SetName(String name){
	  this.name=name;
	  }
	public void SetSalary(double salary){
	  this.salary=salary;
	  }
	public int getId(){
	  return id;
	}
	public String getName(){
	  return name;
	}
	public double getSalary(){
	  return salary;
	}
	
	public Employee(int id, String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public Employee() {
	
	}
	
	public String toString(){
		return "<<<Employee [ID:"+id+" ,Name:"+name+" ,Salary:"+salary+"]>>>";
	}
	
	public int compare(Employee x,Employee y) {
  	  if(x.getSalary()<y.getSalary()){
	  	return +1;
	  	}
	  else if(x.getSalary()>y.getSalary()){
	  	return -1;
	  }
	  else{
	  	return 0;
	  }
	
	}
	}
class Demo5 {
public static void main(String args[]) {
	Employee e1 = new Employee(111,"rashmika",9000);
	Employee e2 = new Employee(102,"pranjal",8000);
	Employee e3 = new Employee(103,"Sumit",60000);
	
	Set <Employee> s = new TreeSet <Employee> (new Employee());
	s.add(e1);
	s.add(e2);
	s.add(e3);
	System.out.println(s);
}

}

