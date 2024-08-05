class Rocket{
	String country;
	double speed;
	String fuelCapacity;
	int noOfThrusters=3;
	
	public void display(){
		System.out.println("rocket country:"+country);
		System.out.println("rocket speed:"+speed);
		System.out.println("rocket fuelCapacity:"+fuelCapacity);
		System.out.println("rocket noOfThrusters:"+noOfThrusters);
	} 
	public Rocket(String country){
		this.country=country;
	}
	public void setSpeed(double speed){
		this.speed=speed;
	}
}