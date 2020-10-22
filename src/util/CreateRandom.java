package util;

import java.text.DecimalFormat;
import java.util.Random;

public class CreateRandom {
	
	public int index_final(int index,int tail) 
	{
		Random r = new Random();
		int count = 0;
		int max = 1000000000;
		for(int i=0;i<max;i++) 
		{	int num = r.nextInt(41);
			if(num==40)count++;
//			System.out.println(num);
		}
		DecimalFormat df = new DecimalFormat("0.00");//格式化小数  
//		String num = df.format((float)1/40);//返回的是String类型  
		String num2 = df.format((float)count/max);//返回的是String类型  
//		System.out.println("共出现"+count+"次40");
//		System.out.println("正常概率："+num);
//		System.out.println("当前概率："+num2);
		return Integer.parseInt(num2);
	}
}
