class Hotel{
	String name="udupi";
	Owner owner=new Owner("vinayak",50,'m');
	
	public Hotel(){
		System.out.println("created  hotel using no parameter");
	}
	public void display(){
		System.out.println("hotel name:"+name);
		owner.display();
	}
	
}