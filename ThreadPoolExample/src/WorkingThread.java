
public class WorkingThread implements Runnable {

	private String name;
	public WorkingThread(String name){
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			System.out.println("start " + name);
			Double random = Math.random();
			int ranInt = new Double(random * 100.0).intValue();
			Thread.sleep(300 + ranInt);

		}catch(InterruptedException e){	
		}
		System.out.println("end " + name);
	}
	

}
