/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author tatad6701
 */
public class Bird extends Pet {

    public Bird(String name, int age, String colour) {
        super(name, age, colour);
    }

    @Override
    public void speak() {
        System.out.println("I tawt I taw a putty cat");
    }

    // OVERLOADING! *
    public void speak(int numTimes) {
        for (int i = 0; i < numTimes; i++) {
            System.out.println("TWEET");
        }
        System.out.println("");
    }
}
