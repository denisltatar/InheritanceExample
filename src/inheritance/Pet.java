/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author tatad6701
 */
public abstract class Pet {
    // Create constants to be used 

    private String name;
    private int age;
    private String colour;

    /**
     * Constructor for the pet (The info that is getting passed through by the
     * user)
     *
     * @param name the pet's name
     * @param age the pet's age
     * @param colour the pet's colour
     */
    public Pet(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    /**
     * Method that gets the name of the pet
     *
     * @return the name of the pet
     */
    public String getName() {
        return name;
    }

    /**
     * Method that get the colour of the pet
     *
     * @return the colour of the pet
     */
    public String getColour() {
        return colour;
    }

    /**
     * Method that gets the age of the pet
     *
     * @return the age of the pet
     */
    public int getAge() {
        return age;
    }

    // Any pet that you make, needs to have a speak method!
    public abstract void speak();
}
