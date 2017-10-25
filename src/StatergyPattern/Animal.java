package StatergyPattern;

public class Animal {
	private String name;
	private String favFood;
	private String sound;
	private int weight;
	private double height;
	private double speed;
	
	//Add the type -- interface for fly
	private Flys flytype;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void setFlyingType(Flys flyType){
		System.out.println("this in Animal class   ))) "+ this);
		this.flytype = flyType;
	}
	
	public String tryToFly(){
		return this.flytype.fly();
	}
	
}
