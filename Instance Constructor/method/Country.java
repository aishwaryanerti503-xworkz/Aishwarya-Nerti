class Country{
	String name;
	String continent;
	State state=new State("tamilnadu","tamil");
	
	public Country(){
		System.out.println("created  country without parameter constructor");
		
	}
	public Country(String name,String continent){
		System.out.println("create using string constructor"); 
		this.name=name;
		this.continent=continent;
	}
	public void display(){
		System.out.println("country name:"+name);
		System.out.println("country continent:"+continent);
		state.display();
	}
}