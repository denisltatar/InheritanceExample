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
    public String toString() {
        String output = "Dog-> Name: " + this.getName() + "  Age: " + this.getAge() + "  Colour: " + this.getColour();
        return output;
    }

    @Override
    public void speak() {
        System.out.println("OOUF");
    }

    /**
     * Gets the age in dog years
     *
     * @return int the age in dog years
     */
    @Override
    public int getAge() {
        // Grab the age from pet
        int oldAge = super.getAge();
        // Return the old age multiplied by 7
        return oldAge * 7;
    }
}
