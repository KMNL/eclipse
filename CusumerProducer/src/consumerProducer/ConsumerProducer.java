package consumerProducer;

public class ConsumerProducer {

	public static void main(String []args){
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		
		new Thread(producer).start();
		new Thread(consumer).start();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
	
}
