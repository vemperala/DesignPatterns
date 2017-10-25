package StatergyPattern;

public class Bird extends Animal{
	
	public Bird(String name){
		super();
		setName(name);
		System.out.println("this is   bird ----  "+this);
		this.setFlyingType(new CanFly());
	}
	public void buildNest(){
		System.out.println("completed to build a nest");
	}
}
