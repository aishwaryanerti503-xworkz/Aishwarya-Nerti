class Ganavi{
	
	String email;
	Clip clip;

	public Ganavi(String email,Clip clip){
		System.out.println("create constructor using string and clip");
		this.email=email;
		this.clip=clip;
	} 
	public void details(){
		System.out.println("Ganavi email:"+email);
		System.out.println("Ganavi clip:"+clip);
	}
}