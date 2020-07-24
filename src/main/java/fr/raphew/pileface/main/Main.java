package fr.raphew.pileface.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This file of '[CMD] Pile ou face - Jeu à boire' was created by Raphew on 24/07/2020
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nbrPS;
        String[] pf = new String[]{"Heads", "Tails"};
        System.out.println("How many participants are there ?");
        nbrPS = sc.nextLine();
        int nbrP = Integer.valueOf(nbrPS);
        ArrayList<String> p = new ArrayList<>();
        for (int i = 1 ; i <= nbrP ; i++){
            String rep;
            System.out.println("Player " + i + ", what's your name ?");
            rep = sc.nextLine();
            p.add(rep);
        }
        int tour;
        System.out.println("Thank you all for your name ! \nNow, choose how many round of the game do you want to do ?");
        tour = sc.nextInt();
        sc.nextLine();
        for (int i = 1 ; i <= tour ; i ++){
            System.out.println("Start of round " + i);
            for (int y = 0 ; y <= p.size()-1 ; y++){
                String rep = "a";
                while(!rep.equalsIgnoreCase("heads") && !rep.equalsIgnoreCase("tails")) {
                    System.out.println(p.get(y) + ", it's your turn, you think the coin is going to make heads or tails ?");
                    rep = sc.nextLine();
                }

                int piece = new Random().nextInt(2);
                String pieceS = pf[piece];
                if(pieceS.equalsIgnoreCase(rep)){
                    System.out.println("Well done " + p.get(y) + ", you win !");
                }else{
                    System.out.println("You lost " + p.get(y) + " !!! You have to drink !");
                }
            }
        }
        System.out.println("Thanks for playing, see you next time !");
    }

}