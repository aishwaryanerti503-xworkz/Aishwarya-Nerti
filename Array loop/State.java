class State{
	public static void main(String[] args){
		System.out.println("start main in state");
		
		String State1="Andhra pradesh";
		String State2="Arunachal pradesh";
		String State3="Assam";
		String State4="bihar";
		String State5="chhattisgarh";
		String State6="goa";
		String State7="gujarat";
		String State8="haryana";
		String State9="himachal pradesh";
		String State10="jharkhand";
		String State11="karnataka";
		String State12="kerala";
		String State13="madhya pradesh";
		String State14="maharashtra";
		String State15="manipur";
		String State16="meghalaya";
		String State17="mizoram";
		String State18="nagaland";
		String State19="odisha";
		String State20="punjab";
		String State21="rajasthan";
		String State22="sikkim";
		String State23="tamil nadu";
		String State24="telangana";
		String State25="tripura";
		String State26="uttar pradesh";
		String State27="uttar khand";
		String State28="west bengal";
		
		String[] States={State2,State10,State5,State1,State9,State27,State20,State18,State15,State3};
		
		for(int index=0;index<States.length;index++){
		String ref=States[index];
		System.out.println("states in contry:"+ref);
		System.out.println("index:"+index);
		}
		
		for(int index=States.length-1;index>=0;index--){
		String ref=States[index];
		System.out.println("states in contry:"+ref);
		System.out.println("index:"+index);
		}
		
		int name=States.length;
		System.out.println("length of states:"+name);
		
		
		System.out.println("end main in state");
	}
}