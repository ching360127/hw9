package class5;

public class class_4 {
	public static void main(String[] args)
	{
	Car carl = new Car("1號車");
	carl.start();
	
	for(int i=0; 1<5; i++)
	{
	try {
		Thread.sleep(1000);
		System.out.println("正在進行main()的處理工作");		
		}
			catch(InterruptedException e) {
			}
		}
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
			System.out.println("正在進行main()的處理工作");
		}
	}

}
