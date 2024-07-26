class Bus{
	public static void main(String[] args){
		System.out.println("start main in bus");
		
		String BusNos1="KA-26 F-0965";
		String BusNos2="KA-25 F-4523";
		String BusNos3="KA-57 F-7881";
		String BusNos4="KA-40 F-1425";
		String BusNos5="KA-11 F-0448";
		
		String[] busNos={BusNos1,BusNos2,BusNos3,BusNos4,BusNos5};
		
		for(int index=0;index<busNos.length;index++){
		String ref=busNos[index];
		System.out.println("busNos:"+ref);
		System.out.println("index:"+index);
		}

        for(int index=busNos.length-1;index>=0;index--){
		String ref=busNos[index];
		System.out.println("busNos:"+ref);
		System.out.println("index:"+index);
		}		
		
		int name=busNos.length;
		System.out.println("length of busNos:"+name);
		
		System.out.println("start main in bus");	
		
	}
}