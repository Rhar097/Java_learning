
��һ����ʽ��
try
{
	
}
catch ()
{
}

�ڶ�����ʽ��
try
{
	
}
catch ()
{
}
finally
{

}


��������ʽ��
try
{
	
}
finally
{

}
//��סһ�㣺catch�����ڴ����쳣�ģ����û��catch�ʹ����쳣û�б��������������쳣�Ǽ��ʱ�쳣����ô����������


class Demo
{
	public void method()//ֻҪ���ⱻ����Ͳ���������
	{
		try
		{
			throw new Exception();
		}
		//catch (Exception e)//��catch�ͽ����ⱻ�����
		finally
		{
			//����Դ��
			
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
