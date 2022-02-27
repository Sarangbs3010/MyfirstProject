package com.company;
import java.util.Scanner;
import java.util.Random;
public class Rock_paper_scissors {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game");
        System.out.println("We ar going to conduct 5 rounds");
        System.out.println("0.Stone\t1.Paper\t2.Scissors");
        Scanner in=new Scanner(System.in);
        Random ran=new Random();
        int i=1;
        int a=0;
        int b=0;
        int user;
        int computer;
        while(i<=5)
        {
            System.out.println("Round "+i+"");
            System.out.println("Your Chance:");
            user= in.nextInt();
            System.out.println("Computer Chance:");
            computer= ran.nextInt(3);
            System.out.println(computer);
            switch(computer)
            {
                case 0:
                    switch (user)
                    {
                        case 0:
                            System.out.println("The match Tied");
                            break;
                        case 1:
                            System.out.println("You Won");
                            a++;
                            break;
                        case 2:
                            System.out.println("You Lost");
                            b++;
                            break;
                        default:
                            System.out.println("You Have Entered The Wrong Option");
                    }
                    break;
                case 1:
                    switch (user)
                    {
                        case 0:
                            System.out.println("You Lost");
                            b++;
                            break;
                        case 1:
                            System.out.println("The match Tied");
                            break;
                        case 2:
                            System.out.println("You Won");
                            a++;
                            break;
                        default:
                            System.out.println("You Have Entered The Wrong Option");
                    }
                    break;
                case 2:
                    switch (user)
                    {
                        case 0:
                            System.out.println("You Won");
                            a++;
                            break;
                        case 1:
                            System.out.println("You Lost");
                            b++;
                            break;
                        case 2:
                            System.out.println("The match Tied");
                            break;
                        default:
                            System.out.println("You Have Entered The Wrong Option");
                    }
                    break;
            }
            System.out.println("Round "+i+" Completed");
            i++;
        }
        System.out.println("Computer Has Won "+b+" Rounds And You Have Won "+a+" Rounds");
        if(b>a)
        {
            System.out.println("So Computer Has Won The Match");
            System.out.println("Better Luck next time");
        }
        else if (a>b)
        {
            System.out.println("Congrats You Have Won The Match");
        }
        else
        {
            System.out.println("The Match Has been Tied");
            System.out.println("Thanks For Ur Participation");
        }
    }
}
