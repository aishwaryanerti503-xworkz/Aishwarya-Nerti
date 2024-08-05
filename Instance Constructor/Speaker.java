class Speaker{
	String brand;
	double sizeInInches;
	double cost;
	String output="volume";
	
	public void display(){
		System.out.println("brand name:"+brand);
		System.out.println("sizeInInches:"+sizeInInches);
		System.out.println("price:"+cost);
		System.out.println("output"+output);
	}
	public Speaker(double sizeInInches){  
		this.sizeInInches=sizeInInches;
	}
	public void setBrand(String brand){ 
		this.brand=brand;
	}
	
}