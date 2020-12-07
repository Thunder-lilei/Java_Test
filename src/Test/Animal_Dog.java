package Test;

public class Animal_Dog {
	public void move() 
	{
		System.out.println("动物可以移动");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_Dog a = new Animal_Dog();
		Animal_Dog b = new Dog();
		a.move();
		b.move();
//		b.bark();//编译错误，方法未定义
	}

}
class Dog extends Animal_Dog
{
	public void move() 
	{
		System.out.println("狗可以跑和走");
	}
	public void bark() 
	{
		System.out.println("狗可以吠叫");
	}
}
