class GanaviRunner{
	public static void main(String[] args){
		System.out.println("start running main in ganaviRunner");
		Clip clip=new Clip("black","Butterfly clip");
		clip.details();
		Ganavi ganavi=new Ganavi("ganavi@gmail.com",clip);
		ganavi.details();
	}
}