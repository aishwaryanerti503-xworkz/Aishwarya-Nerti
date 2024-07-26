class CarNames{
	public static void main(String[] args){
		System.out.println("Start main in car names");
		
		String CarName1="tata nexon";
		String CarName2="maruti alto";
		String CarName3="maruti swift";
		String CarName4="maruti baleno";
		String CarName5="maruti brezza";
		String CarName6="hyundai i20";
		String CarName7="tata tiago";
		String CarName8="maruti omni";
		String CarName9="mahindra bolero";
		String CarName10="honda amaze";
		String CarName11="honda city";
		String CarName12="hyundai verna";
		String CarName13="maruti ciaz";
		String CarName14="ford ecoSport";
		String CarName15="toyota";
		
		String[] carNames={CarName1,CarName2,CarName3,CarName4,CarName6,CarName1,CarName2,CarName3,CarName4,CarName6,CarName11};
		
		for(int index=0;index<carNames.length;index++){
		String ref=carNames[index];
		System.out.println("car names:"+ref);
		System.out.println("index:"+index);
		}
		
		for(int index=carNames.length-1;index>=0;index--){
		String ref=carNames[index];
		System.out.println("car names:"+ref);
		System.out.println("index:"+index);
		}
		
		int name=carNames.length;
		System.out.println("length of car names:"+name);
		
		System.out.println("end main in car names");
	}
}