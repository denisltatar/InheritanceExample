/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author tatad6701
 */
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 7, "White");
        Cat cat = new Cat("Fluffy", 5, "Black", 9);
        Dog dog2 = new Dog("Gidget", 1, "Brindle");
        Cat cat2 = new Cat("Spike", 5, "Brown", 9);
        Bird bird = new Bird("Tweety", 7, "Yellow");


        Pet[] pets = {dog, cat, dog2, cat2};
        // Go through each pet in the array
        for (Pet pet : pets) {
            System.out.println(pet);
            pet.speak();

            // Checking if the pet is actually a cat
            if (pet instanceof Cat) {
                // Casting (change the pet back into a Cat)
                Cat c = (Cat) pet;
                System.out.println("This is a cat with " + c.getLives() + " lives.");
            }
        }
    }
}
