/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretphrase;
import java.util.Scanner;
/**
 *
 * @author canno
 */
public class SecretPhrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
 char userGuess; 
 Scanner input = new Scanner(System.in);
 String phraseSolution = "column";
 StringBuilder hiddenPhrase = new StringBuilder("co****");
 System.out.print( hiddenPhrase + " Enter a letter please " ); 
 while (!phraseSolution.equals(hiddenPhrase.toString()) ){

  System.out.println(" Enter a letter please ");
  userGuess = Character.toLowerCase(input.nextLine().charAt(0));
  boolean check = check(userGuess, phraseSolution);
  if (check){
  int spot = placeLocator(userGuess, phraseSolution); 
  hiddenPhrase.setCharAt(spot, userGuess);  
  System.out.println(hiddenPhrase);
  System.out.println(" Correct! Enter another Letter please "); 
   }
 else{
   System.out.println(" Sorry! Guess again! ");
  }
 }
 System.out.print(" You win! "); 
    }

public static int placeLocator(char input, String phraseSolution){
 int place;
 int x = 0;
 while(input != phraseSolution.charAt(x)){
  x++;
 }
 place = x;
 return place;
}

public static boolean check(char input, String phraseSolution){
 boolean checker = false;
 int letter = 0; 
 
 for(int x = 0; x < phraseSolution.length(); x++){
  if(input != phraseSolution.charAt(x)){
    checker = false; 
  } else {
    checker = true;
    letter++; 
    }
 }
 if(letter >= 1){
    checker = true; 
    }
return checker;
}
}
    
    

