import java.io.*;
import java.util.*;

//package com.company;
 class User{
       int userid;
       String userName;
    public User(int userid, String userName) {
        this.userid = userid;
        this.userName = userName;
    }
    @Override
    public String toString() {
        return "User [userid=" + userid + ", userName=" + userName + "]";
    } 
}
class Hash2 {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        // Initialization of a Hashtable
        final Map<Integer, String> ht1 = new Hashtable<Integer, String>(100);

        final Map<String, Integer> ht2 = new Hashtable<String, Integer>(100);

        // Inserting thes element using put method

        int Age = 19;
        String Yourgroup = "Group";
        // String Blood;
        // int Number;
        // String Name;
        // ht1=Number, Name
        System.out.println("Enter your name:");
        Object userName;
        String Name01=((Object) userName).nextline();
        User name1=new User(11,"Sarang");
        User name2=new User(12,"Sarang");
        User name3=new User(13,"Sarang");
        User name4=new User(14,"Sarang");
        HashMap<User,String>nHashMap=new HashMap<>();
        ht1.put(11, "name1");
        ht1.put(12, "name2");
        ht1.put(13, "name3");
        ht1.put(14, "name4");

       
        // ht2.put=
        System.out.println("\n\n===============================================================\n");
        ht2.put("O+ve", 19);
        ht2.put("B+ve", 19);
        ht2.put("A+ve", 29);
        ht2.put("AB+ve", 19);

        if (Age >= 20) {
            Yourgroup = "RED";
        } else if (Age >= 15 && Age < 20) {
            Yourgroup = "BLUE";
        }

        else if (Age >= 10 && Age < 15) {
            Yourgroup = "YELLOW";
        }

        System.out.println("The entries made are : " + ht1 + " \n\n" + ht2 + " \n\n" + Yourgroup);
        int delete;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be deleted");
        delete = sc.nextInt();

        ht1.remove(delete);
        ht2.remove(delete);

        System.out.println("Updated / Final map : " + ht1 + " " + ht2 + " " + Yourgroup);
    }

    public Hash2() {
    }
}