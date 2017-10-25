/**
 * 
 */
package StatergyPattern;

/**
 * @author akhilesh
 * this interface is an example for implementing statergy pattern 
 * some animals can fly and others dont so we have provide the type if it flys or not
 * for that we will create an interface for flys and have a method to fly based on the animal we can 
 * tell an animal can fly or not
 * 
 * 
 * using statergy pattern we can change the type at the runtime, all the sub algorithms will have a parent interface
 * 
 *
 */
public interface Flys {
	
	public String fly();
}
