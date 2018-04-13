/*
内部类的访问规则：
1.内部类可以直接访问外部类中的成员，包括私有。
	之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用，格式 外部类名.this
2.外部类要访问内部类，必须建立内部类对象。

访问格式：
当内部类定义在外部类的成员位置上，而且非私有，可以在外部其他类中。
可以直接建立内部类对象。

格式：
	外部类名.内部类名  变量名 = 外部类对象.内部类对象
	Outer.Inner in = new Outer().new Inner();

2.当内部类在成员位置上，就可以被成员修饰符所修饰。
	比如，private：将内部类在外部类中进行封装。
		static：内部类就具备static的特性。

*/
class Outer
{
	private int x = 3;

	class Inner//内部类
	{
		int x = 4;
		void function()
		{
			int x = 6;
			System.out.println("inner :"+Outer.this.x);
		}
	}
	
	void method()
	{
		Inner in = new Inner();
		in.function();
	}
}


class  InnerClassDemo
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();
		out.method();

		//直接访问内部类中的成员
		//Outer.Inner in = new Outer().new Inner();
		//in.function();
	}
}
