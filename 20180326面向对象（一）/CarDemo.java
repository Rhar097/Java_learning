//面向对象：三个特征：封装，继承，多态。

//以后开发：其实就是找对象使用。没有对象，就创建一个对象。

//找对象，建立对象，使用对象，维护对象的关系。


/*
类和对象的关系。

现实生活中的对象：张三 李四。
想要描述：提取对象中共性内容，对具体的抽象。
描述时：这些对象的共性有：姓名，年龄，性别，学习java功能。


映射到java中，描述就是class定义的类。
具体对象就是对应java在堆内存中用new建立实体。



类就是：对现实生活中事物的描述。
对象：就是这类事物，实实在在存在个体。




*/


//需求：描述汽车。描述事物其实就是在描述事物的属性和行为。

//属性对应是类中变量，行为对应的类中的函数（方法）。
//其实定义类，就是在描述事物，就是在定义属性和行为。属性和行为共同成为类中的成员（成员变量和成员方法）。

/*
成员变量和局部变量。
作用范围：
成员变量作用于整个类中。
局部变量变量作用于函数中，或者语句中。
在内存中的位置：
成员变量：在堆内存中，因为对象的存在，才在内存中存在。有默认值
局部变量：存在栈内存中。
*/
class Car
{
	//描述颜色
	String color = "红色";
	//描述轮胎数
	int num = 4;

	//运行行为。
	void run()
	{
		System.out.println(color+".."+num);
	}
}


class  CarDemo
{
	public static void main(String[] args) 
	{
		//生产汽车，在java中通过new操作符来完成。
		//其实就是在堆内存产生一个实体。
		//Car c = new Car();//c就是一个有类类型变量。记住：类类型变量指向对象。
		
		//需求：将已有车的颜色改成蓝色。指挥该对象做使用。在java指挥方式是：对象.对象成员
		//c.color = "blue";

		//c.run();

		//Car c1 = new Car;

		//c1.run();//red 4;

//		Car c = new Car();
//		c.num = 5;

		//new Car().num = 5;
		//new Car().color = "blue";
		//new Car().run();

		//Car c = new Car();
		//c.run();
	//	c.num = 4;
	//	new Car().run();
		//匿名对象使用方式一：当对对象的方法只调用一次时，可以用匿名对象来完成，这样写比较简化。
		//如果对一个对象进行多个成员调用，必须给这个对象起个名字。
		//匿名对象使用方式二：可以将匿名对象作为实际参数进行传递。

		//Car q = new Car();
		//show(q);

		show(new Car());
	}

	//需求：汽车修配厂。对汽车进行改装，将来的车修改成黑车，三个轮胎。
	public static void show(Car c)
	{
		c.num = 3;
		c.color = "black";
		c.run();

	}
}
