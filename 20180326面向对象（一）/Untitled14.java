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
