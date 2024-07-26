class GamesName{
	public static void main(String[] args){
		System.out.println("Start main in games name");
		
		String gameName1="cricket";
		String gameName2="kho kho";
		String gameName3="basket ball";
		String gameName4="foot ball";
		String gameName5="running race";
		String gameName6="volley ball";
		String gameName7="basket ball";
		String gameName8="throw ball";
		String gameName9="settle cock";
		String gameName10="high jump";
		
		String[] games={gameName1,gameName7,gameName8,gameName5,gameName6,gameName9};
			
		for(int index=0;index<games.length;index++){
		String ref=games[index];
		System.out.println("games name:"+ref);
		System.out.println("index:"+index);
		}

        for(int index=games.length-1;index>=0;index--){
		String ref=games[index];
		System.out.println("games name:"+ref);
		System.out.println("index:"+index);
		}		
		
		int name=games.length;
		System.out.println("length of games:"+name);
			
		System.out.println("end main in games name");
	}
}