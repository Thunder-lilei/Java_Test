package Test;

import java.text.DecimalFormat;
import java.util.Random;

public class main {

	public void changename(Test test) 
	{
		test = new Test();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test lilei = new Test();
//		lilei.setname("feiwu");
//		lilei.chageone();
//		System.out.println(lilei.name);
//		lilei.chagetwo();
//		System.out.println(lilei.name);
		
		Random r = new Random();
		int count = 0;
		int max = 1000000000;
		for(int i=0;i<max;i++) 
		{	int num = r.nextInt(41);
			if(num==40)count++;
//			System.out.println(num);
		}
		DecimalFormat df = new DecimalFormat("0.000000");//格式化小数  
		String num = df.format((float)1/40);//返回的是String类型  
		String num2 = df.format((float)count/max);//返回的是String类型  
		System.out.println("共出现"+count+"次40");
		System.out.println("正常概率："+num);
		System.out.println("当前概率："+num2);
	}

}
