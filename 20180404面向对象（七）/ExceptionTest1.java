
/*
��һ��Բ�κͳ����Σ�
�����Ի�ȡ������������������ַǷ�����ֵ����Ϊ�ǻ�ȡ����������⡣
�������ͨ���쳣����ʾ��
��Ҫ�����������л�������ơ�



*/

interface Shape
{
	void getArea();
}

class Rec implements Shape
{
	private int len,wid;

	Rec(int len,int.36]1`q6	 wid)
	{
		this.len = len;
		this.wid = wid;
	}

	public void getArea()
	{
		System.out.println(len*wid);
	}
}

class ExceptionTest1 
{
	public static void main(String[] args) 
	{
		Rec r = new Rec(3,4);
		r.getArea();
	}
}
