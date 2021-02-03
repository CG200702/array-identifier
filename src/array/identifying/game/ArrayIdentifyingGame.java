/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.identifying.game;

/**
 *
 * @author CG200702
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class ArrayIdentifyingGame {

    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      
        System.out.println("Player 1, are you the computer?");
        String p1 = input.next();
        p1 = p1.toUpperCase();
        String YES = "YES";
        String p2;
        
        if (p1.equals(YES)){
           
            p1 = "Computer";
            p2 = "Player";
        }
        else{
            p2 = "Computer";
            p1 = "Player";
        }
        System.out.println("What is your name player 1?");
        String name1 = input.next();
        
        System.out.println("What is your name player 2?");
        String name2 = input.next();
        
        System.out.println(name1 + ",you are the: "+p1+"." + name2 + ", you are the: "+ p2);
        String[][] board = new String[10][8];
        // set up board
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[  ]";
            }
        }

        //In random positions in the array store a random amount of coins
        int amountOfTreasure = random.nextInt((20 - 10) + 1) + 10; // Generates random number between 10 and 20
        System.out.println(amountOfTreasure);

        for (int i = 0; i < amountOfTreasure; i++) {
            //get random location on board
            int randX = random.nextInt(10);
            int randY = random.nextInt(8);
            //get random amount of treasure and put it in location
            board[randX][randY] = "[" + Integer.toString(random.nextInt((99 - 10) + 1) + 10) + "]";
        }
         board[0][0]="["+99+"]";

        //print out board
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
       
        //Get the user to enter coordinates where they think the treasure is
        int treasureTotal = 0;
       
        for (int i = 0; i < 10; i++) {
            System.out.println("Please type in X coordinate");
            int xCoord = input.nextInt();
            System.out.println("Please type in Y coordinate");
            int yCoord = input.nextInt();
           
            if (xCoord < 10 && xCoord >= 0 && yCoord < 8 && yCoord >= 0) { // if it is a valid coordinate on the board
               
                if(!board[xCoord][yCoord].equals("[  ]")){ // if string is not empty
                   
                    String treasureNumber = board[xCoord][yCoord].charAt(1)+""+board[xCoord][yCoord].charAt(2);
                    treasureTotal = treasureTotal + Integer.parseInt(treasureNumber);
                }

        
//        String [][] board = new String[10][10];
//        for (int i = 0; i<10 ; i++) {
//            for (int j = 0; j <10 ; j++){
//                board[i][j] = "[  ]";
//                System.out.print(board[i][j]);
//                
//            
//            }
//            System.out.println(" ");
//        }
//        for (int a = 0 ; a<5;a++){
//            
//            int randoPlace1 = random.nextInt(5);
//            int randoPlace2 = random.nextInt(5);
//            board[randoPlace1][randoPlace2] = "[" +Integer.toString(random.nextInt(50)) + "]";
//            
//               
//    }
            }}}
    
}
