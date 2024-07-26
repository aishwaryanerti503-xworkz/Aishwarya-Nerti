public class AnimalNames{
	public static void main(String[] args){
		System.out.println("start main in animal names");
		
		String animalNames1="dog";
		String animalNames2="cat";
		String animalNames3="elephant";
		String animalNames4="horse";
		String animalNames5="cow";
		String animalNames6="rabbit";
		String animalNames7="camel";
		String animalNames8="goat";
		String animalNames9="lion";
		String animalNames10="tiger";
		String animalNames11="monkey";
		String animalNames12="donkey";
		String animalNames13="zibra";
		String animalNames14="gorilla";
		String animalNames15="chimpanze";
		String animalNames16="ship";
		String animalNames17="buffalo";
		String animalNames18="polar bear";
		String animalNames19="cheetah";
		String animalNames20="crocodile";
		
		String[] animalNames={animalNames1,animalNames2,animalNames3,animalNames4,animalNames5,animalNames6,animalNames7,animalNames8,animalNames9,animalNames10,animalNames11,animalNames12,animalNames13,animalNames14,animalNames15,animalNames16,animalNames17};
		
		for(int index=0;index<animalNames.length;index++){
		String ref=animalNames[index];
		System.out.println("animalNames:"+ref);
		System.out.println("index:"+index);
		}	
		
		for(int index=animalNames.length-1;index>=0;index--){
		String ref=animalNames[index];
		System.out.println("animalNames:"+ref);
		System.out.println("index:"+index);
		}	
		
		int name=animalNames.length;
		System.out.println("length of animalNames:"+name);
		
		System.out.println("start main in animal names");
	}
} 