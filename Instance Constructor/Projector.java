class Projector{
	String company;
	String shape="Rectangle";
	String colour;
	double weight;
	
	public void display(){
		System.out.println("projector comapany:"+company);
		System.out.println("projector type:"+shape);
		System.out.println("projector colour:"+colour);
		System.out.println("projector weight:"+weight);
	}
	
	public Projector(String Company){
		this.company=company;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
}