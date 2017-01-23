package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Tower of Hanoi Game Instructions :)");
        System.out.println("This program will solve this puzzle for you.");
        System.out.println("Please input the number of disks to solve for:");
        Scanner ans = new Scanner(System.in);
        int diskNum = ans.nextInt();

        TowersOfHanoi instructions=new TowersOfHanoi(diskNum);
        System.out.println(instructions.solve());



    }
}
