/*
�����ڲ��ࣺ
1.�����ڲ�����ʵ�����ڲ���ļ�д��ʽ��
2.���������ڲ����ǰ�᣺
	�ڲ�������Ǽ̳�һ�������ʵ�ֽӿڡ�
3.�����ڲ���ĸ�ʽ��  new ������߽ӿ�(){�������������}
4.��ʵ�����ڲ������һ������������󡣶�����������е��֣� �������Ϊ�����ݵĶ���
5.�����ڲ����ж�һ�������ò�Ҫ����3����

*/

abstract class AbsDemo
{
	abstract void show();
}

class Outer
{
	int x = 3;

	/*
	class Inner extends AbsDemo
	{
		void show()
		{
			System.out.println("show :"+x);
		}
	}
	*/

	public void function()
	{
		//new Inner().show();



		AbsDemo d = new AbsDemo()
		{
			int num = 9;
			void show()
			{
				System.out.println("num="+num);
			}
			void abc()
			{
				System.out.println("hahah");
			}
		};

		d.show();
		//d.abc();//����ʧ�ܣ�
	}
}



class InnerClassDemo4 
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}
