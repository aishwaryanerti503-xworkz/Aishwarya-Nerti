class KeyRunner{
	public static void main (String[] args){
		System.out.println("start running main in keyRunner");
		Key key=new Key(5,"doorLock");
		key.details();
		KeyBench keyBench=new KeyBench("steel",key);
		keyBench.details();
	}
}