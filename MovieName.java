public class MovieName{
	public static void main(String[] args){
		System.out.println("start main in movie name");
		
		String movieName1="jawan";
		String movieName2="adipurush";
		String movieName3="hrudhayam";
		String movieName4="baahubali1";
		String movieName5="baahubali2";
		String movieName6="kgf1";
		String movieName7="kgf2";
		String movieName8="yuva";
		String movieName9="eagle";
		String movieName10="satyabhama";
		String movieName11="kalki";
		String movieName12="pari";
		String movieName13="12th fail";
		String movieName14="maharaja";
		String movieName15="premalu";
		String movieName16="manjumel boys";
		String movieName17="katera";
		String movieName18="baby";
		String movieName19="saptasagardache";
		String movieName20="milana";
		
		String[] movieName={movieName1,movieName2,movieName3,movieName4,movieName5,movieName6,movieName7,movieName8,movieName9,movieName10};
		
		for(int index=0; index<movieName.length;index++){
            String ref=movieName[index];
			System.out.println("movie name:"+ref);
			System.out.println("index:"+index);
		} 
		
		int MovieName=movieName.length;
		
		System.out.println("end main in movie name");
	}
}