class MirrorRunner{
	public static void main(String[] args){
		
		Mirror mirror1=new Mirror();
		
		mirror1.shape="ovel";
		
		mirror1.price=1000;
		
		mirror1.quality="good";
		
		mirror1.material="glass";
		
		System.out.println("shape of material:"+mirror1.shape);
		
		System.out.println("price of material:"+mirror1.price);
		
		System.out.println("quality of material:"+mirror1.quality);
		
		System.out.println("material of material:"+mirror1.material);
		
		Mirror mirror2=new Mirror();
		
		System.out.println("shape of material:"+mirror2.shape);
		
		System.out.println("price of material:"+mirror2.price);
		
		System.out.println("quality of material:"+mirror2.quality);
		
		System.out.println("material of material:"+mirror2.material);
		
	}
}