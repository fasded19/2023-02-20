/*
* File: MainConsole.java
* Author: Nedved Balázs
* Copyright: 2023, Nedved Balázs
* Group: Szoft I/1/N'
* Date: 2023-02-20
* Github: https://github.com/fasded19/
* Licenc: GNU GPL
*/
import java.util.Scanner;

public class MainConsole {
    public MainConsole() {
        doit();
        about();
    }
    public void about(){
        System.out.println("Nedved Baázs");
        System.out.println("SZOFT-I-1-N");
        System.out.println("2023-02-20");
    }
    private String input(String msg){
        System.out.println(msg);
        Scanner scanner=new Scanner(System.in);
        String value=scanner.nextLine();
        return value;
    }        
    private void doit(){
        String aStr=input("A oldal: ");
        String bStr=input("B oldal: ");
        String cStr=input("c oldal: ");
        double a=Double.parseDouble(aStr);
        double b=Double.parseDouble(bStr);
        double c=Double.parseDouble(cStr);

        CountV volume=new CountV();
        double eredmeny=volume.terulet(a,b,c);
        System.out.printf("%.2f\n",eredmeny);
    }
}