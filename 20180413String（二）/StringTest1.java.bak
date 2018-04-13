/*

2.将一个字符串进行反转。将字符串中指定部分进行反转，“abcdefg”；abfedcg
	思路：
	1.曾经学习过对数组的元素进行反转。
	2.将字符串变成数组，对数组反转。
	3.将反转后的数组变成字符串。
	4.只要将或反转的部分的开始和结束位置作为参数传递即可。
*/


class  StringTest1
{
	public static void sop(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) 
	{
		String s = "abcdefg";

		sop(reverseString(s,2,6));
	}

	public static String reverseString(String s,int start,int end)
	{
		//字符串变成数组
		char[] chs = s.toCharArray();

		//数组反转
		reverse(chs,start,end);

		//数组变成字符串
		return new String(chs);
	}

	private static void reverse(char[] arr,int x,int y)
	{
		for (int start=x,end=y-1; start<end; start++,end--)
		{
			swap(arr,start,end);
		}
	}
	private static void swap(char[] arr,int x,int y)
	{
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}

