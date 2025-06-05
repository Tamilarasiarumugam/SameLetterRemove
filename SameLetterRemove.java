package Basics;

public class SameLetterRemove {
	
	public static String remove(String s1,String s2)
	{
		int[] arr=new int[26];
		int index;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=0;
		}
		for(int i=0;i<s2.length();i++)
		{
			index=(int)s2.charAt(i)-97;
			arr[index]++;
		}
		String ans="";
		for(int i=0;i<s1.length();i++)
		{
			index=(int)s1.charAt(i)-97;
			if(arr[index]==0)
			{
				ans+=s1.charAt(i);
			}
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		String s1="occurance";
		String s2="car";
		System.out.println(remove(s1,s2));
	}

}
