class finaldemo{
	final int i;
	finaldemo(){
		i=10;
		System.out.println(i);
		}
	public static void main(String[] args){
		final int j=5;
		finaldemo d=new finaldemo();
		System.out.println(j);
		}
}