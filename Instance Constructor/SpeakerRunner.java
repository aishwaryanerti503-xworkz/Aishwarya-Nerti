class SpeakerRunner{
	public static void main(String[] args){
		
		System.out.println("start running main in speakerRunner");
		
		Speaker speaker=new Speaker(3);
		speaker.setBrand("sony");
		speaker.cost=2000;
		speaker.display();
		
		Speaker speaker1=new Speaker(4);
		speaker1.setBrand("boat");
		speaker1.cost=3000;
		speaker1.display();
		
		Speaker speaker2=new Speaker(2.5);
		speaker2.setBrand("bluetooth");
		speaker2.cost=6000;
		speaker2.display();
	    
	    Rocket rocket=new Rocket("india");
		rocket.setSpeed(40);
		rocket.noOfThrusters=3;
		rocket.display();
		
		Rocket rocket1=new Rocket("california");
		rocket1.setSpeed(80);
		rocket1.noOfThrusters=2;
		rocket1.display();
		
		Rocket rocket2=new Rocket("usa");
		rocket2.setSpeed(100);
		rocket2.noOfThrusters=3;
		rocket2.display();
		
		Chocolate chocolate=new Chocolate("chocolate");
		chocolate.setPrice(50);
		chocolate.brand="diaryMilk";
		chocolate.display();
		
		Chocolate chocolate1=new Chocolate("cream");
		chocolate1.setPrice(100);
		chocolate1.brand="silk";
		chocolate1.display();
		
		Chocolate chocolate2=new Chocolate("stawberry");
		chocolate2.setPrice(150);
		chocolate2.brand="milkybar";
		chocolate2.display();
		
		Projector projector=new Projector("onida");
		projector.setWeight(5);
		projector.colour="white";
		projector.display();
		
		Projector projector1=new Projector("mi");
		projector1.setWeight(5);
		projector1.colour="black";
		projector1.display();
		
		Projector projector2=new Projector("sony");
		projector2.setWeight(5);
		projector2.colour="goldish";
		projector2.display();
		
		Paper paper=new Paper(1);
		paper.setSize("4");
		paper.colour="white";
		paper.display();
		
		Paper paper1=new Paper(2);
		paper1.setSize("3");
		paper1.colour="yellow";
		paper1.display();
		
		Paper paper2=new Paper(1.5);
		paper2.setSize("4");
		paper2.colour="black";
		paper2.display();
	}
}

