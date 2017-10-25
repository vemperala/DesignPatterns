package StatergyPattern;

public class AnimalImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog("Zure");
		Animal bird = new Bird("Pecker");
		
		System.out.println("name of the dog :"+ dog.getName());
		dog.setSound("bow bow");
		System.out.println("sound of the "+dog.getClass().toString()+  " : " +dog.getSound());
		System.out.println("fly dog ---  "+ dog.tryToFly());
		System.out.println();
		System.out.println("_______++++++++++________");
		System.out.println();
		System.out.println("name of the bird "+ bird.getName());
		bird.setSound("phew phew");
		System.out.println(bird.getSound());
		System.out.println("fly Bird ----- " + bird.tryToFly());
		
		changeName(dog, "scooby");
		
		System.out.println("name of the dog after change "+ dog.getName());
		
		
	}
	
	public static void changeName(Animal animal, String name){
		animal.setName(name);
	}

}

