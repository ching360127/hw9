package class5;

public class class6_5 {
	public static void main(String[] args)
	{
	Car carl = new Car("1號車");
	carl.start();
	

	try 
	{
		car1.join();
	}
		catch(InterruptedException e)
	{
			
	}
	System.out.println("正在結束main()的處理工作");
	}
}


	
 class Car extends Thread
 {
	 private String name;
	
	
	public Car(String nm)
	{
	name = nm;
	}

	public void run()
	{
	for(int i=0; 1<5; i++)
	
		{
			System.out.println("正在進行"+name+"的處理工作");
		}
	}

}
