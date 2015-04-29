package ThreadPools2;

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
			double randomDbl = Math.random();
			int randomInt = new Double(randomDbl * 100.0).intValue();
			Thread.sleep(3000 + randomInt);
		}catch(InterruptedException e){
			
		}
		System.out.println("end " + name);
	}

}
