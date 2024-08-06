class Company{
    String id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("ISE",5,"project enginnering",3.5);
	
	public Company(){
		System.out.println("created comapny without constructor...");
	}
	public Company(String id,String name,String location){
		System.out.println("creat company id name and location using string constructor");
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void display(){
		System.out.println("company id:"+id);
		System.out.println("company name:"+name);
		System.out.println("company location:"+location);
		
		softwareEngineer.display();
	}
}