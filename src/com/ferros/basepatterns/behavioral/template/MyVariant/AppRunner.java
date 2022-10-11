package com.ferros.basepatterns.behavioral.template.MyVariant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppRunner {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("Input User name: ");
        String userName= bf.readLine();
        System.out.println("Password: ");
        String password= bf.readLine();

        System.out.println("Input message: ");
        String message= bf.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(bf.readLine());

        if (choice==1){
            network = new Facebook(userName,password);
        }else if(choice==2){
            network = new Twitter(userName,password);
        }
        network.post(message);
    }
}
