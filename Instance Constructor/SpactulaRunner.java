class SpactulaRunner{
	
	public static void main(String[] args){
		
	Spactula spactula1=new Spactula();
	
	spactula1.material="steel";
	
	spactula1.price=1500;
	
	spactula1.length=15;
	
	spactula1.quality="good";
	
	System.out.println("material of spectula1:"+spactula1.material);
		
	System.out.println("price of spectula1:"+spactula1.price);
	
	System.out.println("length of spectula1:"+spactula1.length);
		
	System.out.println("quality of spectula1:"+spactula1.quality);
	
	Spactula spactula2=new Spactula();
	
	System.out.println("material of spectula:"+spactula2.material);
		
	System.out.println("price of spectula:"+spactula2.price);
	
	System.out.println("length of spectula:"+spactula2.length);
		
	System.out.println("quality of spectula:"+spactula2.quality);
	
	
	}
	
}