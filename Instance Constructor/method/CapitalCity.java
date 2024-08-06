class CapitalCity{
	String name;
	int population;
	
	public CapitalCity(){
		System.out.println("created capitalcity withot parameter constructor");
	}
	public CapitalCity(String name,int population){
		this.name=name;
		this.population=population;
	}
	public void display(){
		System.out.println("capitalcity name:"+name);
		System.out.println("capitalcity population:"+population);
	}
}