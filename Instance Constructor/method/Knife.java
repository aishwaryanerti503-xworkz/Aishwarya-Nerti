class Knife{
	double weight;
	double height;
	
	public Knife(double weight,double height){
		System.out.println("create a constructor with weight and height");
		this.weight=weight;
		this.height=height;
	}
	public void details(){
		System.out.println("Knife weight:"+weight);
		System.out.println("Knife height:"+height);
	}
}