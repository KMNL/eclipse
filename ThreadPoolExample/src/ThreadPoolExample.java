import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPoolExample {
	public static void main(String[] args){
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=0; i< 20; i++){
			Runnable runner = new WorkingThread("thread" + i);
			executor.execute(runner);
		}
		executor.shutdown();
	}
}
