
/*
��̬���������Ϊ������ڵĶ���������̬��

�ˣ����ˣ�Ů��

���è����

è x = new è();

���� x = new è();

1.��̬������
	���������ָ�����Լ����������
	���������Ҳ���Խ����Լ����������
2.��̬��ǰ��
	�����������֮���й�ϵ��Ҫô�̳У�Ҫôʵ�֡�
	ͨ��������һ��ǰ�᣺���ڸ��ǡ�

3.��̬�ĺô�
	��̬�ĳ��ִ�������˳������չ�ԡ�

4.��̬�ı׶�
	�������չ�ԣ�����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա��

5.��̬��Ӧ��

6.��̬�ĳ��ִ����е��ص㣨��̬ʹ�õ�ע�����



�ڶ������⣺���ʹ���������з�����
*/

/*
���
è����

*/

abstract class Animal
{
	public abstract void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}

	public void catchMouse()
	{
		System.out.println("ץ����");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}

	public void kanJia()
	{
		System.out.println("����");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("������");
	}
	public void GongDi()
	{
		System.out.println("����");
	}
}


//--------------------------------------------------



class DuoTaiDemo2 
{
	public static void main(String[] args) 
	{
		//Animal a = new Cat();//��������----������ת�͡�
		//a.eat();

		//�����Ҫ����è�����з���ʱ����β�����
		//ǿ�ƽ��������ã�ת���������͡�����ת�͡�
		//Cat c = (Cat)a;
		//c.catchMouse();

		//ǧ��Ҫ���������Ĳ��������ǽ��������ת�����������͡�
		//������ת�����Ǹ�������ָ�����Լ����������ʱ�������ÿ��Ա�������Ҳ���Ա�ǿ��ת����
		//��̬��ʼ���ն���������������ű仯��
//		Animal a = new Animal();
//		Cat c = (Cat)a;


/*
		����ү x = new ����ʦ();//����ʦαװ�ɱ���ү

		x.����();

		����ʦ y =(����ʦ)x;//����ʦ��ԭ�ɱ���ʦ

		y.����Ӱ();
*/
		function(new Dog());
		function(new Cat());
	}
	public static void function(Animal a)//Animal a = new Cat();
	{
		a.eat();
		if (a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.kanJia();
		}
		
	}
}
