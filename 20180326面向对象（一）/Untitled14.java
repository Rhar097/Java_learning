/*
��̬����顣
��ʽ��
static
{
	��̬������е�ִ����䡣
}

�ص㣺������ļ��ض�ִ�У�ִֻ��һ�Σ�����������������
���ڸ�����г�ʼ���ġ�
*/


class StaticCode
{
	static
	{
		System.out.println("a");
	}

}

class StaticCodeDemo 
{
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) 
	{
		new StaticCode();
		new StaticCode();
		System.out.println("over");
	}
	static
	{
		System.out.println("c");
	}
}
