class SoftwareEngineer{
	String name;
	int experience;
	String designation;
	double salary;
	
	public SoftwareEngineer(){
		System.out.println("created SoftwareEngineer withot parameter");
	}
	
	public SoftwareEngineer(String name,int experience,String designation,double salary){
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	
	public void display(){
		System.out.println("SoftwareEngineer name:"+name);
		System.out.println("SoftwareEngineer experience:"+experience);
		System.out.println("SoftwareEngineer designation:"+designation);
		System.out.println("SoftwareEngineer salary:"+salary);	
	}
}