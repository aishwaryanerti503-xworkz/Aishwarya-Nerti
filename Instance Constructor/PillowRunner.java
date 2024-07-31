class PillowRunner{
	public static void main(String[] args){
		
	Pillow pillow1=new Pillow();
	
	pillow1.colour="white";
	
	pillow1.size="medium";
	
	pillow1.price=500;
	
	pillow1.material="cotton";
	
	System.out.println("colour of pillow:"+pillow1.colour);
	
	System.out.println("size of pillow:"+pillow1.size);
	
	System.out.println("price of pillow:"+pillow1.price);
	
	System.out.println("material of pillow:"+pillow1.material);
	
	Pillow pillow2=new Pillow();
	
	System.out.println("colour of pillow:"+pillow2.colour);
	
	System.out.println("size of pillow:"+pillow2.size);
	
	System.out.println("price of pillow:"+pillow2.price);
	
	System.out.println("material of pillow:"+pillow2.material);
	
	
	}
}