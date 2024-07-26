class SnackNames{
	public static void main(String[] args){
		System.out.println("start main in snack names");
		
		String snackNames1="chips";
		String snackNames2="chocolate";
		String snackNames3="biscuits";
		String snackNames4="ice cream";
		String snackNames5="vada pav";
		String snackNames6="samosa";
		String snackNames7="pizza";
		String snackNames8="pani puri";
		String snackNames9="sev puri";
		String snackNames10="momos";
		String snackNames11="bhel";
		String snackNames12="chakli";
		String snackNames13="bread";
		String snackNames14="mandakki";
		String snackNames15="french fries";
		String snackNames16="gobi";
		String snackNames17="popcorn";
		String snackNames18="kura kure";
		String snackNames19="kodabele";
		String snackNames20="veg pup";
		String snackNames21="cake";
		String snackNames22="veg rolls";
		String snackNames23="dhokla";
		String snackNames24="kachori";
		String snackNames25="burger";
		
		String[] snackNames={snackNames1,snackNames2,snackNames3,snackNames4,snackNames5,snackNames6,snackNames7,snackNames8,snackNames9,snackNames9};
		
		for(int index=0;index<snackNames.length;index++){
		String ref=snackNames[index];
		System.out.println("snackNames:"+ref);
		System.out.println("index:"+index);
		}

        for(int index=snackNames.length-1;index>=1;index--){
		String ref=snackNames[index];
		System.out.println("snackNames:"+ref);
		System.out.println("index:"+index);
		}		
		
		int name=snackNames.length;
		System.out.println("length of snackNames:"+name);
		
		System.out.println("end main in snack names");
	}
}