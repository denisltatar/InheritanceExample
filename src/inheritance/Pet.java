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
     * Constructor for the pet
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

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }
}
