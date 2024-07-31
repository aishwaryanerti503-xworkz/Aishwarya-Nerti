class WalletRunner{
	
	public static void main(String[] args){
		
	Wallet def=new Wallet();
	
	def.price=500;
	
	def.material="leather";
	
	def.type="3partition";
	
	def.quality="good";
	
	System.out.println("price of wallet:"+def.price);
	
	System.out.println("material of wallet:"+def.material);
	
	System.out.println("type of wallet:"+def.type);
	
	System.out.println("quality of wallet:"+def.quality);
		
	Wallet def1=new Wallet();
	
	System.out.println("price of wallet:"+def1.price);
	
	System.out.println("material of wallet:"+def1.material);
	
	System.out.println("type of wallet:"+def1.type);
	
	System.out.println("quality of wallet:"+def1.quality);
	
	}
}