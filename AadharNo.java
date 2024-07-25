class AadharNo{
	public static void main(String[] args){
		System.out.println("start main in AadharNo");
		
		String aadharNos1="8444 2354 2354";
		String aadharNos2="6470 7783 8776";
		String aadharNos3="8449 4231 9087";
		String aadharNos4="4567 3465 1423";
		String aadharNos5="9087 4578 5347";
		
	    String[] aadharNos={aadharNos1,aadharNos2,aadharNos3};
		int name=aadharNos.length;
		System.out.println("aadharNos:"+name);
		
		for(int index=0;index<aadharNos.length;index++){
			String ref=aadharNos[index];
			System.out.println("array of aadharNos:"+ref);
		}
		
		System.out.println("end main in AadharNo");
	}
}