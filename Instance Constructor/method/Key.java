class Key{
	double weight;
	String brand;
	
	public Key(double weight,String brand){
		System.out.println("start creating constructor using double and String");
		this.weight=weight;
		this.brand=brand;
	}
	public void details(){
		System.out.println("key weight:"+this.weight);
		System.out.println("key brand:"+this.brand);
	}
}