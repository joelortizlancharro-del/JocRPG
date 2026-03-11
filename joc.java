import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class joc {
    Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        joc p = new joc();
        p.principal();
    }
    public void principal(){
     ArrayList<Personatges> arrayPersonatge = new ArrayList<>();

     System.out.println("Welcome to the game!");
    
     do {
        menu();
        whatToDo(arrayPersonatge);

     } while (arrayPersonatge.size() != 2);
    
        
    }

    public void menu(){
        System.out.println("======================");
        System.out.println("1. Create a character.");
        System.out.println("2. Play 1 vs 1.");
        System.out.println("======================");
    }

    public void whatToDo(ArrayList<Personatges> ArrayPersonatge){
        int option = 0;
        do {
            System.out.println("What you want to do?");
            option = controlErrorInt();
            if(option > 2 || option < 1){
               System.out.println("You only have the option 1 and 2.");
               e.nextLine();
            }
        } while (option > 2 || option < 1);
        switch (option) {
            case 1:
                System.out.println("You want to create a character.");
                createCharacter(ArrayPersonatge);
                break;
        
            default:
                break;
        }
    }

    public void createCharacter(ArrayList <Personatges> arrayPersonatge){
    
            System.out.println("What is the name of your character?");
            e.nextLine();
            String name = e.nextLine();

            int age = -1;
            do {
               System.out.println("What is your age?( > 0)");
               age = controlErrorInt();
               e.nextLine();
            } while (age <= 0);
            

            String race;
            do {
                System.out.println("What is your race?(Human, elf, orc or dwarf)");
                race = e.nextLine();
            } while (!race.equalsIgnoreCase("human") && !race.equalsIgnoreCase("elf") && !race.equalsIgnoreCase("orc") && !race.equalsIgnoreCase("dwarf"));
            
            int strength;
            do {
                System.out.println("Introduce strength(5-20)");
                strength = controlErrorInt();
                e.nextLine(); 
            } while (strength < 5 || strength > 20);
            
            int dexterity;
            do {
                System.out.println("Introduce dexterity(5-20)");
                dexterity = controlErrorInt(); 
                e.nextLine();
            } while (dexterity < 5 || dexterity > 20);

            int constitution = 0;
            do {
                System.out.println("Introduce constitution(5-20)");
                constitution = controlErrorInt(); 
                e.nextLine();
            } while (constitution < 5 || constitution > 20);

            int intelligence = 0;
            do {
                System.out.println("Introduce intelligence(5-20)");
                intelligence = controlErrorInt(); 
                e.nextLine();
            } while (intelligence < 5 || intelligence > 20);

            int wisdom = 0;
            do {
                System.out.println("Introduce wisdom(5-20)");
                wisdom = controlErrorInt(); 
                e.nextLine();
            } while (wisdom < 5 || wisdom > 20);

            int charisma = 0;
            do {
                System.out.println("Introduce charisma(5-20)");
                charisma = controlErrorInt(); 
                e.nextLine();
            } while (charisma < 5 || charisma > 20);
        
        Personatges personatge = new Personatges(name, age, race, strength, dexterity, constitution, intelligence, wisdom, charisma, constitution, intelligence);
        arrayPersonatge.add(personatge);

        System.out.println(arrayPersonatge.get(0).toString());
        arrayPersonatge.get(0).getWeapons();
          
    }

    public int controlErrorInt(){
        int num = -1;
        try {
            num = e.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The number can't be decimal or a letter");
        }
        return num;
    }
}

