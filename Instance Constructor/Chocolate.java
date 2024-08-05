class Chocolate{
	String brand; 
	double price;
	String flavour;
	String size="medium";
	
	public void display(){
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("flavour:"+flavour);
		System.out.println("size:"+size);
	}
	
	public Chocolate(String flavour){
		this.flavour=flavour;
	}
	public void setPrice(double price){
		this.price=price;
	}
}