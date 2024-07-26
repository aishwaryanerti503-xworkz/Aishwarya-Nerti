class SongName{
	public static void main(String[] args){
		System.out.println("start main in song name");
		
		String SongName1="tere sang yaara";
		String SongName2="dil meri na sune";
		String SongName3="tera hua";
		String SongName4="dil divan gallan";
		String SongName5="tu jaane na";
		String SongName6="roja";
		String SongName7="tum kya mile";
		String SongName8="yeh dil hai mushkil";
		String SongName9="ondu male billu";
		String SongName10="gombe gombe";
		
		String[] SongNames={SongName1,SongName2,SongName3,SongName4,SongName5,SongName6,SongName7,SongName8,SongName9,SongName10};
		
		for(int index=SongNames.length-1;index>=0;index--){
			String ref=SongNames[index];
			System.out.println("song names:"+ref);
			System.out.println("index:"+index);
		}
		
		for(int index=0;index<=SongNames.length;index++){
			String ref=SongNames[index];
			System.out.println("song names:"+ref);
			System.out.println("index:"+index);
		}
		
		int Song=SongNames.length;
		System.out.println("length of songNames:"+Song);
		
		System.out.println("end main in song name");
	}
}