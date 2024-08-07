class KeyBench{
	String material;
	Key key;
	
	public KeyBench(String material,Key key){
		System.out.println("start creating constructor material and key");
		this.material=material;
	}
	public void details(){
		System.out.println("keyBench material:"+material);
	}
}