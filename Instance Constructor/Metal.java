class Metal{
	String name;
	double price;
	
	public Metal(){
	System.out.println("no parameter constructor");	
	}
	public Metal(String name){
		System.out.println("name parameter constructor");
		this.name=name;
	}
	public Metal(double price){
		this.price=price;
		System.out.println("price parameter constructor");
	}
	public Metal(String name,double price){
		this.name=name;
		this.price=price;
		System.out.println("name and price parameterised constructor");
	}
}