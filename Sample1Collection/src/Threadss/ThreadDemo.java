package Threadss;

public class ThreadDemo implements Runnable {

	Thread t;
	String name;
	public ThreadDemo(String name) {
		// TODO Auto-generated constructor stub
		t = new Thread(this);
		this.name = name;
		t.start();
	
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<10; i++)
		{
			System.out.println(name +" ::  "+i);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
		
	}

}
