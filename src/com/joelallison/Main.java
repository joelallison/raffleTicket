package com.joelallison;

import java.util.Random;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static HashMap<Integer, String> tickets;

    public static void main(String[] args) {
        tickets = genTickets(500);
        menu();
    }

    public static void menu() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Hi! What's your name?\n");
            String name = bufferedReader.readLine();
            while (true) {
                System.out.println("\nWould you like to check a ticket or buy a ticket, or quit:\n");
                String choice = bufferedReader.readLine();
                switch (choice) {
                    case "check":
                    case "Check":
                        check(name);
                        break;
                    case "buy":
                    case "Buy":
                        buy(name);
                        break;
                    case "quit":
                    case "Quit":
                        System.out.println("See ya!");
                        System.exit(0);
                    default:
                        System.out.println("\nThat's not a valid option... :)\n");
                }

            }
        } catch (Exception e) {
            System.out.println("Error in menu method - " + e);
        }


    }

    public static void check(String name) {
        //use HashMap<i>.contains("") for empty string

    }

    public static void buy(String name) {
        Random random = new Random();
        tickets.put(random.nextInt(tickets.size()), name);
    }

    private static HashMap<Integer, String> genTickets(int range) {
        for (int i = 1; i <= range; i++) {
            tickets.put(i, "");
        }
        return tickets;
    }


}
