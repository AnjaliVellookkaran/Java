package Oops;

class Animal
{
	public void eat() {
		System.out.println("eat");
	}

}
class Dog extends Animal
{
	 public void dogfood()
	 {
		 System.out.println("dogfood");
		 
	 }
}
class Tiger extends Animal
{
	 public void tigerfood()
	 {
		 System.out.println("tigerfood");
		 
	 }
}
public class Hierarchialinheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.dogfood();
		Tiger t=new Tiger();
		t.tigerfood();
		t.eat();
			}

}
