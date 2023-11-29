package ClientSide;

import java.net.InetAddress;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Greetings! Hope you're doing great...!");
        System.out.print("Give me the destionation IP address: ");
        //String destIP = scan.nextLine();
        InetAddress IP = InetAddress.getByName(scan.nextLine());
        System.out.print("Got it, and destination port number: ");
        Integer port = Integer.parseInt(scan.nextLine());
        System.out.print("Enter your message: ");
        String message = scan.nextLine();
        
        Client c = new Client(IP, port);
        c.sendMessage(message);
        scan.close();
        

    }
}