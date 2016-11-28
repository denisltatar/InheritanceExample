/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author tatad6701
 */
public class Dog extends Pet {

    // Constructor for the dog class
    public Dog(String name, int age, String colour) {
        // A call to the Dog constructor
        super(name, age, colour);
    }
    
    // Print it out nicely!
    @Override
    public String toString(){
       String output = "Dog-> Name: " + this.getName() + "  Age: " + this.getAge() + "  Colour: " + this.getColour();
       return output;
    }
}
