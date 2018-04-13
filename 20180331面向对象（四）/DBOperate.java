/*
�������ݿ�Ĳ�����
�����ǣ��û���Ϣ��
1.�������ݿ⡣JDBC Hibernate
2.�������ݿ⡣
	c creat r read u update d delete
3.�ر����ݿ����ӡ�
*/

interface UserInfoDao//data access object
{
	public void add(User user);
	public void delete(User user);
}

class UserInfoByJDBC implements UserInfoDao
{
	public void add(User user)
	{
		1.JDBC�������ݿ⡣��
		2.ʹ��sql������������ݡ���
		3.�ر����ӡ�
	}
	public void delete(User user)
	{
		1.JDBC�������ݿ⡣��
		2.ʹ��sql������������ݡ���
		3.�ر����ӡ�
	}
}

class UserInfoByHibernate implements UserInfoDao
{
	public void add(User user)
	{
		1.Hibernate�������ݿ⡣��
		2.ʹ��sql������������ݡ���
		3.�ر����ӡ�
	}
	public void delete(User user)
	{
		1.Hibernate�������ݿ⡣��
		2.ʹ��sql������������ݡ���
		3.�ر����ӡ�
	}
}

class  DBOperate
{
	public static void main(String[] args) 
	{
		//UserInfoByJDBC ui = new UserInfoByJDBC();
//		UserInfoByHibernate ui = new UserInfoByHibernate();
		UserInfoDao ui = new UserInfoByJDBC();
		ui.add(user);
		ui.delete(user);
	}
}
