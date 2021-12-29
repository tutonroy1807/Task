package Prosenjit;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*
        Name: Prosenjit Roy;
        ID: 2012020257;
        Batch: 53;
        email: cse_2012020257@lus.ac.bd;
         */

        Scanner input = new Scanner(System.in);
        String Section;
        System.out.println("Enter Section: ");
        Section = input.nextLine();
        System.out.println("Section: "+Section);

        Studentinfo sinfo = new Studentinfo();
        System.out.println("Name: "+sinfo.Name);
        System.out.println("Student Id: "+sinfo.id);

        HobbyName hname = new HobbyName();
        System.out.println("Hobby Name: "+hname.HobbyName);


    }
}

