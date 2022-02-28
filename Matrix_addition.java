package com.company;
import java.util.Scanner;
public class Problems_array {
    public static void main(String[] args) {
        int [][] a=new int[3][2];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the rows and coloumns of both the matrix:");
        int m= in.nextInt();;
        int n=in.nextInt();
        int [][] b=new int[m][n];
        int c[][]=new int[m][n];
        System.out.println("Enter the 1st matrix elements:");
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {

                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the 2nd matrix elements:");
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {

                b[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Resultant Matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.printf("%d\t",c[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
