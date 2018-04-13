/*
包 package

1.对类文件进行分类管理。

2.给类提供多层命名空间

3.写在程序文件的第一行。

4.类名的全称是 包名.类名。

5.包也是一种封装形式。


总结：
	包与包之间进行访问，被访问的包中的类以及类中的成员，，需要public修饰。

	不同包中的子类还可以访问父类中被protected权限修饰的成员。

包与包之间可以使用的权限只有两种，public protected。


				public		protected		default		private
同一个类中		  ok			ok			  ok			ok
同一个包中		  ok            ok            ok             /
子类			  ok            ok
不同包中		  ok

*/

package pack;

/*
为了简化类名的书写，使用一个关键字，import。
import 导入的是包中的类。

建议：不要写通配符*，需要用到包中的哪个类，就导入哪个类。

建议定义包名不要重复，可以使用url来完成定义，url是唯一的。


*/

class  PackageDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello package!");
	}
}
