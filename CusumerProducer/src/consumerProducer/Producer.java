package consumerProducer;

public class Producer implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 1;
		while(true)
		{
			try{
				Thread.sleep(30);
			}catch(InterruptedException e){
				
			}
			Product product = new Product(""+ count);
			ProductQueue.getInstance().addProduct(product);
			count++;
			if(count > 20)
				count = 1;
		}
	}

}
