package Client;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Greetings! Hope you're doing great...!");
        System.out.print("Give me the destionation IP address: ");
        String destIP = scan.nextLine();
        System.out.print("Got it, and destination port number: ");
        int destPort = Integer.parseInt(scan.nextLine());
        System.out.println("Establishing connection with IP:" + destIP + " on port:" + Integer.toString(destPort)
        + " ...");
        System.out.println("Yet to implement client server connection.. terminating program...");
        scan.close();

    }
}