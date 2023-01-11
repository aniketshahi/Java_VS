 Scanner sc=new Scanner(myFile);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            System.out.println(line);
        }
        sc.close();