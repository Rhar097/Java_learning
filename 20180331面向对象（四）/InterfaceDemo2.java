/*
接口的特点：
1.接口是对外暴露的规则。
2.接口是程序的功能扩展。降低了耦合性。
3.接口可以用来多实现。
4.类和接口之间是实现关系，而且类可以继承一个类的同时实现多个接口。
5.接口与接口之间可以有继承关系。

*/





//abstract class Student
//{
//	abstract void study();
//	void sleep()
//	{
//		System.out.println("sleep");
//	}

	//void smoke()
	//{
	//	System.out.println("smoke");
	//}
//}

//interface Smoking
//{
//	void smoke();
//}

//class Zhangsan extends Student implements Smoking
//{
//	void study(){}
//	public void smoke(){}
//}

//class Lisi extends Student
//{
//}

abstract class Sporter
{
	abstract void play();
}

interface study
{
}

class Wangwu extends Sporter implements study
{
}

class  InterfaceDemo2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
