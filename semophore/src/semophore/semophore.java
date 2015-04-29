package semophore;

public class semophore {
	public static void main(String [] args){
	}
	
	private final static int MAX_NUM_THREAD = 10;
	private static Integer semophoreCount = 0;
	public static int getSemophore(){

		synchronized(semophoreCount){
			if(semophoreCount < MAX_NUM_THREAD)
				return ++semophoreCount;			
		}
		
	}
}
