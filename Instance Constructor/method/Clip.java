class Clip{
	String colour;
	String type;
    
	public Clip(String colour,String type){
		System.out.println("create a parameter with string and type");
		this.colour=colour;
		this.type=type;
	}
	public void details(){
		System.out.println("clip colour:"+colour);
		System.out.println("clip type:"+type);
	}
	
}