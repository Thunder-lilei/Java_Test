package Test;

public class callby_value {
	int b = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		callby_value test = new callby_value();
		System.out.println(a);//5
		a = add(a);
		System.out.println(a);//1
		addvoid(a);
		System.out.println(a);//1
		
		System.out.println(test.b);//2
		callby_value test2 = new callby_value();
		test2 = callby_valuye_add(test);
		System.out.println(test2.b);//1
		if(test2 == test)
			System.out.println("相同");
		else
			System.out.println("不同");
		callby_valuye_addvoid(test);
		System.out.println(test.b);//2
	}
	
	public static int add(int a) 
	{
		return a = 1;
	}
	public static void addvoid(int a) 
	{
		a = 2;
	}
	public static callby_value callby_valuye_add(callby_value test) 
	{
		test.b = 1;
		return test;
	}
	public static void callby_valuye_addvoid(callby_value test) 
	{
		test.b = 2;
	}

}
