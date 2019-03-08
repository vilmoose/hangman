/*
 *Vilmos Feher 
 *hangman.java
 *05/03/2019
 */

package hangman;

import javax.swing.JOptionPane;

/**
 *
 * @author vifeh1685
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String games[] = {"Portal", "Minecraft", "Battlefield", "Halo"};
        String movies[] = {"Godzilla", "Popstars", "Cars", "Bunnies"};
        String bands[] = {"Queen", "Backstreetboys", "KDA", "Beatles"};
        String toys[] = {"Doll", "Lego", "Bakugans", "Pokemon"};
        String word = "";
        String categories [][] = {games, movies, bands, toys};

        int randomNum1 = (int) (Math.random() * (4));
        int randomNum2 = (int) (Math.random() * (4));
        String random = categories[randomNum1][randomNum2] ; 
        //System.out.println(random);  
        
        for (int i = 0; i <= random.length(); i++){
            word += "-";
            
        }
        System.out.println("Your word is = " + word);
        
        String input = JOptionPane.showInputDialog("Enter your guess here: ");
        String guess = input.toLowerCase();
        if( random.contains(guess) ){
            
            System.out.println(word.replace("-", guess));
        }
        else{
            System.out.println("Guess is incorrect");
        }
    }
}
