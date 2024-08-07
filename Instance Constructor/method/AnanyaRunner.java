class AnanyaRunner{
     public static void main(String[] args){
		 System.out.println("create main in ananyarunner");
		 Knife knife=new Knife(2.5,5);
		 knife.details();
		 Ananya ananya=new Ananya(8088890503L,knife);
		 ananya.details();
	 }
}