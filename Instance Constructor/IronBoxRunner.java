class IronBoxRunner{
	
	public static void main(String[] args){
	
	IronBox ironbox1=new IronBox();
	
	ironbox1.brand="bajaj";
	
	double price=ironbox1.price;
	
	System.out.println("brand of ironbox:"+ironbox1.brand);
	
	System.out.println("price of ironbox:"+price);
	
	IronBox ironbox2=new IronBox();
	
	ironbox2.brand="bajaj";
	
	ironbox2.price=1500;
	
	String type=ironbox2.type;
	
	System.out.println("brand of ironbox:"+ironbox2.brand);
	
	System.out.println("price of ironbox:"+ironbox2.price);
	
	System.out.println("type of ironbox:"+type);
	
	IronBox ironbox3=new IronBox();
	
	ironbox3.brand="bajaj";
	
	ironbox3.price=1500;
	
	ironbox3.type="normal";
	
	String quality=ironbox3.quality;
	
	System.out.println("brand of ironbox:"+ironbox3.brand);
	
	System.out.println("price of ironbox:"+ironbox3.price);
	
	System.out.println("type of ironbox:"+ironbox3.type);
	
	System.out.println("quality of ironbox:"+quality);
	
	IronBox ironbox4=new IronBox();
	
	ironbox4.brand="bajaj";
	
	ironbox4.price=1500;
	
	ironbox4.type="normal";
	
	ironbox4.quality="good";
	
	System.out.println("brand of ironbox:"+ironbox4.brand);
	
	System.out.println("price of ironbox:"+ironbox4.price);
	
	System.out.println("type of ironbox:"+ironbox4.type);
	
	System.out.println("quality of ironbox:"+ironbox4.quality);
	
	
	
	
	}
	
}