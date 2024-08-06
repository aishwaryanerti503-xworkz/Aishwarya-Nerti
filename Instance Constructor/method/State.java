class State{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity("banglore",200000);
	
	public State(){
		System.out.println("created state withot parameter constructor");
	}
	public State(String name,String language){
		System.out.println("create using string and string constructor");
		this.name=name;
		this.language=language;
	}
	public void display(){
		System.out.println("state name:"+name);
		System.out.println("state language:"+language);
		capitalCity.display();
	}
}