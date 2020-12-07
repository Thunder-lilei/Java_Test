package Test;

public class GeLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "lilei";
		String s2 = "laowang";
		s1+=s2;
		System.out.println("s1:"+s1);
		System.out.println("length:"+s1.length());
		int x = 1,y = 2;
		int max = x>y?x:y;
		int min = x<y?x:y;
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		x = 5;
		y = 5;
		y = ++x * - -y;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}

}
