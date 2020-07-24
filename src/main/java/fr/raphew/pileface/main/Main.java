package fr.raphew.pileface.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This file of '[CMD] Pile ou face - Jeu à boire' was created by Raphew on 24/07/2020
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberParticipants;
        String[] HeadsTails = new String[]{"Heads", "Tails"};
        System.out.println("How many participants are there ?");
        numberParticipants = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> playerName = new ArrayList<>();
        for (int i = 1 ; i <= numberParticipants ; i++){
            String answer;
            System.out.println("Player " + i + ", what's your name ?");
            answer = scanner.nextLine();
            playerName.add(answer);
        }
        int round;
        System.out.println("Thank you all for your name ! \nNow, choose how many round of the game do you want to do ?");
        round = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1 ; i <= round ; i ++){
            System.out.println("Start of round " + i);
            for (int y = 0 ; y <= playerName.size()-1 ; y++){
                String answer = "";
                while(!answer.equalsIgnoreCase("heads") && !answer.equalsIgnoreCase("tails")) {
                    System.out.println(playerName.get(y) + ", it's your turn, you think the coin is going to make heads or tails ?");
                    answer = scanner.nextLine();
                }

                int random = new Random().nextInt(2);
                String coinsHT = HeadsTails[random];
                if(coinsHT.equalsIgnoreCase(answer)){
                    System.out.println("Well done " + playerName.get(y) + ", you win !");
                }else{
                    System.out.println("You lost " + playerName.get(y) + " !!! You have to drink !");
                }
            }
        }
        System.out.println("Thanks for playing, see you next time !");
    }

}