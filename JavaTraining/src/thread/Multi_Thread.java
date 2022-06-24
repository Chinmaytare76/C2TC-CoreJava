package thread;

public class Multi_Thread {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		Thread obj = new Thread(t);
		obj.start();
		
		
		obj.join();//main thred is invoking
		for (int i =0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}

}


class MyThread implements Runnable
{
	public void run()
	{
		for (int i =0;i<10;i++)
	{
		System.out.println("child thread");
		
	}}}


/*
class MyThread extends  Multi_Thread
{
	public void run()
	{
		for (int i =0;i<10;i++)
	{
		System.out.println("child thread");
		
	}}}*/