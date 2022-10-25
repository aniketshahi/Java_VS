// package com.company;

import java.util.Scanner;

 public class Main {

    public static void main(String[] args)
    {
        String Yourgroup = "group";

        Scanner name = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String urname = name.nextLine();

        System.out.print("Age: ");
        
        int urage = name.nextInt();

        if(  urage >= 20)
        {
             Yourgroup = "RED";
        }
        else if (urage>=15 && urage<20)
        {
             Yourgroup = "BLUE";
        }

        else if (urage>=10 && urage<15)
        {
             Yourgroup = "YELLOW";
        }

        System.out.print("Blood group: ");
        Scanner Bloodgroup = new Scanner(System.in);
        String urBloodgroup = Bloodgroup.nextLine();

        System.out.println();

        System.out.println("||----------------------||");
        System.out.println("   Name: " + urname);
        System.out.println("   Age: " + urage);
        System.out.println("   Blood group: " + urBloodgroup);
        System.out.println("||----------------------||");
        System.out.println("   Your group: " + Yourgroup);
        System.out.println("||----------------------||");
    }
}
