/*
������
ͬ����Ƕ��ͬ����
*/

class Ticket implements Runnable
{
	private int tick = 100;
	Object obj = new Object();
	boolean flag = true;
	public void run()
	{
		if(flag)
		{
			while(true)
			{
			
				synchronized(obj)//ͬ��������־λ0��1,��Ȼ𳵵������䣨�������ˣ�
				{
					show();
				}	
			}
		}
		else
			while(true)	
				show();
		
			
	}
	public synchronized void show()
	{
		synchronized(obj)
		{
			if(tick>0)
			{
				try{Thread.sleep(10);}catch(Exception e){}
				System.out.println(Thread.currentThread().getName()+"...sale:"+tick--);
			}
		}
		
	}
}

class DeadLockDemo
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		//Thread t3 = new Thread(t);
		//Thread t4 = new Thread(t);

		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag = false;
		t2.start();
		//t3.start();
		//t4.start();

	}
}