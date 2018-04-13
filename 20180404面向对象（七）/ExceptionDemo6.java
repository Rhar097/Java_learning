
第一个格式：
try
{
	
}
catch ()
{
}

第二个格式：
try
{
	
}
catch ()
{
}
finally
{

}


第三个格式：
try
{
	
}
finally
{

}
//记住一点：catch是用于处理异常的，如果没有catch就代表异常没有被处理过，如果该异常是检测时异常，那么必须声明。


class Demo
{
	public void method()//只要问题被解决就不用声明。
	{
		try
		{
			throw new Exception();
		}
		//catch (Exception e)//有catch就叫问题被解决。
		finally
		{
			//关资源。
			
		}
		
	}
}

class ExceptionDemo6
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
