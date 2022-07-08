public class Employee {
	
	
	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name, int salary) { 
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
		public int getId() { 
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Employee n=new Employee(1,"abc",60000);
		Employee n1=new Employee(2,"abcqw",50000);
		System.out.println(n.getId()+" " +n.getName()+" "+ n.getSalary());
		System.out.println(n1.getId()+" " + n1.getSalary());
		//System.out.println(n1.getId());
		
		/*System.out.println(n);
		System.out.println(n1);*/
	}
}