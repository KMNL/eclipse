package consumerProducer;

import java.util.LinkedList;
import java.util.Queue;

public class ProductQueue {

	private static ProductQueue instance = new ProductQueue();
	private Queue<Product> productQueue = new LinkedList<Product>();
	private final int MAX_QUEUE = 20;
	
	public void addProduct(Product product){
		synchronized(productQueue){
			if(productQueue.size() >= MAX_QUEUE){
				try {
					System.out.println("add wait queue");
					productQueue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			synchronized(productQueue){
				productQueue.add(product);
				System.out.println("add " + product.toString());
				productQueue.notifyAll();
				return;
			}

	}
	
	public Product removeProduct(){
		synchronized(productQueue){
			if(productQueue.isEmpty())
			{
			try {
				System.out.println("remove wait queue");
				productQueue.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
			synchronized(productQueue){
			 Product product = productQueue.remove();
			System.out.println("remove " + product.toString());
			productQueue.notifyAll();
			return product;
			}
		
	}
	
	public static ProductQueue getInstance(){
		return instance;
	}
}
