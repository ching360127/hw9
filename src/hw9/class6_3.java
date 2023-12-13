package class5;

public class class6_3 {
	public static void main(String[] args)
	{
	Car2 carl = new Car2("1號車");
	carl.start();
	
	for(int i=0; 1<5; i++)
		{
		System.out.println("正在進行main()的處理工作");
		}
	}
}

	
 class Car2 extends Thread
 {
	 private String name;
	
	
	public Car2(String nm)
	{
	name = nm;
	}

	public void run()
	{
	for(int i=0; 1<5; i++)
		{
		try {
			sleep(1000);
			System.out.println("正在進行main()的處理工作");		
			}
				catch(InterruptedException e) {
				}
			}
	}

}
