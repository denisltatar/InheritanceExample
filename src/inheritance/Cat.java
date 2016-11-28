/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author tatad6701
 */
public class Cat extends Pet {

    // Create constant variables
    private int lives;

    public Cat(String name, int age, String colour, int lives) {
        // Calling the pet constructor
        super(name, age, colour);
        // Saving cat specific variables 
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    // Print it out nicely!
    @Override
    public String toString() {
        String output = "Cat-> Name: " + this.getName()
                + "  Age: " + this.getAge() + "  Colour: "
                + this.getColour() + "  Live: " + this.lives;
        return output;
    }
}
