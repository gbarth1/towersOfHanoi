package com.company;
import java.util.*;
public class TowersOfHanoi
{

    public int tower1;
    public int tower2;
    public int tower3;

    public void TowersOfHanoi()
    {
        tower1 = 6;
        tower2 = 0;
        tower3 = 0;
    }

    public int solve(int disks)
    {


        if(tower3==0){
            tower3 += 1;
            tower1 -= 1;
            System.out.println("1. move the smallest disk to tower #3 ");
        }

        if(tower2==0){
            tower2 += 2;
            tower1 -= 2;
            System.out.println("2. move the middle disk to tower #2");
        }

        if(tower2==2){
            tower2 += 1;
            tower3 -= 1;
            System.out.println("3. move the smallest disk to tower #2");
        }

        if(tower3==0){
            tower3 += 3;
            tower1 -= 3;
            System.out.println("4. move the biggest disk to tower #3");
        }

        if(tower1==0){
            tower1 += 1;
            tower2 -= 2;
            System.out.println("5. move the smallest disk to tower #1");
        }

        if(tower3==3){
            tower3 += 2;
            tower2 -= 2;
            System.out.println(" 6. move the middle disk to tower #3");
        }

        if(tower3==5){
            tower3 += 1;
            tower1 -= 1;
            System.out.println("7. move the smallest disk to tower #3 to finish your tower");
        }


    }
}
