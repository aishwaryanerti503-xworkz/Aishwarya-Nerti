class WatchRunner{
	
	public static void main(String[] args){
		
		Watch watch=new Watch(2000,"steel");
		
		System.out.println("priceLocal:"+watch.price);
		
		System.out.println("materialLocal:"+watch.material);
		
		System.out.println("brand:"+watch.brand);
		
		watch.colour="silver";

        System.out.println("material watch:"+watch.colour);		
		
		Watch watch1=new Watch(3000,"glass");
		
		System.out.println("priceLocal:"+watch1.price);
		
		System.out.println("materialLocal:"+watch1.material);
		
		System.out.println("brand:"+watch1.brand);
		
		watch1.colour="gold";
		
		System.out.println("colour of watch:"+watch1.colour);
		
		//
		
		Cable cable=new Cable("samsung","wire");
		
		System.out.println("nameLocal:"+cable.name);
		
		System.out.println("materialLocal:"+cable.material);
		
		System.out.println("price:"+cable.price);
		
		cable.colour="white";
		
		System.out.println("cable colour:"+cable.colour);
		
		Cable cable1=new Cable("redmi","wire");
		
		System.out.println("nameLocal:"+cable1.name);
		
		System.out.println("materialLocal:"+cable1.material);
		
		System.out.println("price:"+cable1.price);
		
		cable1.colour="black";
		
		System.out.println("colour of cable:"+cable1.colour);
		
		Radio radio=new Radio("high",700);
		
		System.out.println("volume radio:"+radio.volume);
		
		System.out.println("price of radio:"+radio.price);
		
		System.out.println("material of radio:"+radio.material);
		
		radio.brand="philips";
		
		System.out.println("radio brand:"+radio.brand);
		
		Radio radio1=new Radio("high",700);
		
		System.out.println("volume radio:"+radio1.volume);
		
		System.out.println("price of radio:"+radio1.price);
		
		System.out.println("material of radio:"+radio1.material);
		
		radio1.brand="bajaj";
		
		System.out.println("radio1 brand:"+radio1.brand);
		
		Trumpet trumpet=new Trumpet("French Horn","high");
		
		System.out.println("trumpet name:"+trumpet.name);
		
		System.out.println("trumpet volume:"+trumpet.volume);
		
		System.out.println("trumpet material:"+trumpet.material);
		
		trumpet.price=1000;
		
		System.out.println("trumpet price:"+trumpet.price);
		
		Trumpet trumpet1=new Trumpet("tuba","medium");
		
		System.out.println("trumpet name:"+trumpet1.name);
		
		System.out.println("trumpet volume:"+trumpet1.volume);
		
		System.out.println("trumpet material:"+trumpet1.material);
		
		trumpet1.price=2000;
		
		System.out.println("price of trupet:"+trumpet1.price);
		
		Harmonica harmonica=new Harmonica("chromatic",2000);
	
		System.out.println("harmonica type:"+harmonica.type);
		
		System.out.println("harmonica price:"+harmonica.price);
		
		System.out.println("harmonica colour:"+harmonica.colour);
		
		harmonica.material="steel";
		
		System.out.println("harmonica material:"+harmonica.material);
		
		Harmonica harmonica1=new Harmonica("brass",2500);
	
		System.out.println("harmonica type:"+harmonica1.type);
		
		System.out.println("harmonica price:"+harmonica1.price);
		
		System.out.println("harmonica colour:"+harmonica1.colour);
		
		harmonica1.material="steel";
		
		System.out.println("harmonica1 material:"+harmonica1.material);
		
		Pendulum pendulum=new Pendulum("yellow",800);
		
		System.out.println("pendulum colour:"+pendulum.colour);
		
		System.out.println("pendulum price:"+pendulum.price);
		
		System.out.println("pendulum shape:"+pendulum.shape);
		
		pendulum.name="dont know";
		
		System.out.println("pendulum colour:"+pendulum.name);
		
		Pendulum pendulum1=new Pendulum("goldish",850);
		
		System.out.println("pendulum colour:"+pendulum1.colour);
		
		System.out.println("pendulum price:"+pendulum1.price);
		
		System.out.println("pendulum shape:"+pendulum1.shape);
		
		pendulum1.name="franch";
		
		System.out.println("pendulum colour:"+pendulum1.name);
		
		Syringe syringe=new Syringe(10,"5ml");
		
		System.out.println("Syringe price:"+syringe.price);
		
		System.out.println("Syringe quantity:"+syringe.quantity);
		
		System.out.println("Syringe colour:"+syringe.colour);
		
		syringe.material="plastic";
		
		System.out.println("syringe material:"+syringe.material);
		
		Straightner straighter=new Straightner("nova",3000);
		
		System.out.println("straightner brand:"+straighter.brand);
		
		System.out.println("straightner price:"+straighter.price);
		
		System.out.println("straightner quantity:"+straighter.quality);
		
		straighter.colour="pink";
		
		System.out.println("straightner colour:"+straighter.colour);
		
		Straightner straighter1=new Straightner("philips",3500);
		
		System.out.println("straightner brand:"+straighter1.brand);
		
		System.out.println("straightner price:"+straighter1.price);
		
		System.out.println("straightner quantity:"+straighter1.quality);
		
		straighter1.colour="black";
		
		System.out.println("straightner colour:"+straighter1.colour);
		
		Mask mask=new Mask("woolen", 10);
		
		System.out.println("mask material:"+mask.material);
		
		System.out.println("mask price:"+mask.price);
		
		System.out.println("mask quality:"+mask.quality);
		
		mask.colour="blue";
		
		System.out.println("mask colour:"+mask.colour);
		
		Mask mask1=new Mask("cotton", 50);
		
		System.out.println("mask material:"+mask1.material);
		
		System.out.println("mask price:"+mask1.price);
		
		System.out.println("mask quality:"+mask1.quality);
		
		mask1.colour="black";
		
		System.out.println("mask colour:"+mask1.colour);
		
		Mug mug=new Mug("medium","glass");
		
		System.out.println("quantity mug:"+mug.shape);
		
		System.out.println("quantity price:"+mug.material);
		
		System.out.println("quantity quality:"+mug.quality);
		
		mug.price=100;
		
		System.out.println("quantity material:"+mug.price);
		
		Mug mug1=new Mug("small","plastic");
		
		System.out.println("quantity mug:"+mug1.shape);
		
		System.out.println("quantity price:"+mug1.material);
		
		System.out.println("quantity quality:"+mug1.quality);
		
		mug1.price=150;
		
		System.out.println("quantity material:"+mug1.price);
		
		Anklets anklets=new Anklets("small",100);
		
		System.out.println("anklets size:"+anklets.size);
		
		System.out.println("anklets price:"+anklets.price);
		
		System.out.println("anklets shape:"+anklets.shape);
		
		anklets.material="stones";
		
		System.out.println("anklets material:"+anklets.material);
		
		Anklets anklets1=new Anklets("large",150);
		
		System.out.println("anklets size:"+anklets1.size);
		
		System.out.println("anklets price:"+anklets1.price);
		
		System.out.println("anklets shape:"+anklets1.shape);
		
		anklets1.material="threads";
		
		System.out.println("anklets material:"+anklets1.material);
		
		
		
	}
	
}
