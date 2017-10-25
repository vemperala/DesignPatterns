package StatergyPattern;

public class Dog extends Animal{
	
	public Dog(String name) {
		setName(name);
		System.out.println("this is  dog ----  "+this);
		this.setFlyingType(new CantFly());
	}
	
	public void digHole(){
		System.out.println("dog can dig a hole");
	}
	
}
