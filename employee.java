
package employee;

public class employee {
	public int number;
	public String name;
	private double salary;
	private String address;
	private String email;
	public String phoneNo;
	public String managerName;
	public byte departmentNo;
	private String experience;
	private int HRA;
	private int DA;
	private int TA;
	private int PF;
	private double totalSalary;
	private employee(){
		PF=10000;
	}
	employee(int number, String name, double salary, String address, String email,String phoneNo, String managerName, byte departmentNo, String experience){
		this();
		this.number=number;
		this.name=name;
		this.salary=salary;
		this.address=address;
		this.email=email;
		this.phoneNo=phoneNo;
		this.managerName=managerName;
		this.departmentNo=departmentNo;
		this.experience=experience;
	}
	void HRA(){
		this.HRA=30*(int)salary/100;
	}
	void DA(){
		this.DA=20*(int)salary/100;
	}
	void TA(){
		this.TA=10*(int)salary/100;
	}
	void totalSalary(){
		this.totalSalary=(double)salary+(double)HRA+(double)DA+(double)TA-(double)PF;
	}
	void print(){
		System.out.println("number"+ this.number);
		System.out.println("name"+this.name);
		System.out.println("salary"+this.salary);
		System.out.println("address"+this.address);
		System.out.println("email"+this.email);
		System.out.println("phoneNo"+this.phoneNo);
		System.out.println("manager name"+this.managerName);
		System.out.println("department number"+this.departmentNo);
		System.out.println("experience"+this.experience);
		System.out.println("PF "+this.PF);
		System.out.println("HRA"+this.HRA);
		System.out.println("DA"+this.DA);
		System.out.println("TA"+this.TA);
		System.out.println("total salary"+this.totalSalary);
	}
	
	}
	
	
	
	


