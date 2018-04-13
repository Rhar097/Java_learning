/*
静态代码块。
格式：
static
{
	静态代码块中的执行语句。
}

特点：随着类的加载而执行，只执行一次，并优先于主函数。
用于给类进行初始化的。

*/


class StaticCode
{
	int num = 9;
	StaticCode()
	{
		System.out.println("b");
	}
	static//静态代码块给类初始化
	{
		System.out.println("a");
		//System.out.println("a"+num);//StaticCodeDemo.java:24: 错误:无法从静态上下文中引用非静态
	}
	{
		System.out.println("c"+num);//构造代码块给对象初始化
	}
	StaticCode(int x)//构造函数给对应对象初始化
	{
		System.out.println("d");
	}
	public static void show()
	{
		System.out.println("show run");
	}
}

class StaticCodeDemo 
{
	static
	{
		//System.out.println("b");
	}
	public static void main(String[] args) 
	{
		new StaticCode(4);
		//new StaticCode();
		//new StaticCode();
		//System.out.println("over");
		//StaticCode.show();
		//StaticCode s = null;
		//s = new StaticCode();

		//StaticCode.show();


	}
	static
	{
		//System.out.println("c");
	}
}

