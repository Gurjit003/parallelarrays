/*
 * Gurjit Singh
 * Tuesday December 10th - 2019
 * This program displays data management and parallel arrays
 */

package parallelarrays;
import java.util.Scanner;

/**
 *
 * @author gusin5788
 */
public class Parallelarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int option;
        int tempSpeeds;
        String tempAnimals;
        
        String animals [] = {"Peregrine Falcon", "Eurasian Hobby", "Rock Dove", "Cheetah", "Springbok", "Blue Wildebeest", "Black Marlin", "Sailfish", "Swordfish"};
        int speeds [] = {389, 160, 149, 115, 88, 81, 129, 109, 97};
        
        System.out.println("SPEEDS OF ANIMALS:");
        System.out.println("");
        System.out.println("Enter 1 to see the animals and their speeds before sorting them");
        System.out.println("Enter 2 to see the animals and their speeds after sorting them");
        option = input.nextInt();
        System.out.println("");
        
        if (option == 1) {
            System.out.println("Before Sorting:");
            System.out.println("");
            
            for (int i = 0; i < 9; i = i + 1) {
            System.out.println(animals[i] + "'s speed is " + speeds[i] + " km/h.");
            }
        }
        else if (option == 2) {
            for (int i = 0; i <= 8; i++) {
                for (int j = 0; j <= 7; j++) {
                    if (speeds[j] > speeds[j+1]) {
                        tempSpeeds = speeds[j];
                        speeds[j] = speeds[j+1];
                        speeds[j+1] = tempSpeeds;
                        
                        tempAnimals = animals[j];
                        animals[j] = animals[j+1];
                        animals[j+1] = tempAnimals;
                    }
                }
            }
        
            System.out.println("");
            System.out.println("After Sorting:");
            System.out.println("");
        
            for (int i = 0; i < 9; i = i + 1) {
                System.out.println(animals[i] + "'s speed is " + speeds[i] + " km/h.");
            }
        }
        
        System.out.println("");
        
        
    }
    
}
