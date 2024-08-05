class Paper{
	double thickness;
	String size;
	String quality="good";
	String colour;
	
	public void display(){
	System.out.println("thickness:"+thickness);
    System.out.println("size:"+size);
    System.out.println("quality:"+quality);
    System.out.println("colour:"+colour);	
	}
	public Paper(double thickness){
		this.thickness=thickness;
	}
	public void setSize(String size){
		this.size=size;
	}
}