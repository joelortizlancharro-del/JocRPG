import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class joc {
    ArrayList<Personatges> arrayPersonatge = new ArrayList<>();
    Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        joc p = new joc();
        p.principal();
    }
    public void principal(){
        int controlPlayer = 0;
        System.out.println("Welcome to the game! \nFirst you have to create two characters! \n");
        do {
            createCharacter(arrayPersonatge, controlPlayer);
        } while (arrayPersonatge.size() != 2);
        
        
        do {
          int weaponInHand = chooseWeapon(controlPlayer);
          System.out.println(arrayPersonatge.get(controlPlayer).toString());
            menu(controlPlayer);
            whatToDo(arrayPersonatge); 
        } while (arrayPersonatge.get(0).getHealth() != 0 && arrayPersonatge.get(1).getHealth() != 0);
            
    }

    public void menu(int controlPlayer){
        System.out.println("It's the turn fo the player " + (controlPlayer+1) + ": " + arrayPersonatge.get(0).getName());
        System.out.println("============");
        System.out.println("1. Atac.");
        System.out.println("2. Defend.");
        System.out.println("============");
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
                System.out.println("You want to atac.");
                //createCharacter(ArrayPersonatge);
                break;
        
            default:
                break;
        }
    }

    public void createCharacter(ArrayList <Personatges> arrayPersonatge, int controlPlayer){
        int pointsToCharacter = 60;
    
            System.out.println("What is the name of your character?");
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
            
            do {
                System.out.println("\nNow introduce the points of your character. You have to use all the points. \nYou have 60 points. \n" );
                int strength;
                do {
                    System.out.println("Introduce strength(5-20)");
                    strength = controlErrorInt();
                    e.nextLine(); 
                } while (strength < 5 || strength > 20);
                pointsToCharacter = pointsToCharacter - strength;
                System.out.println("Left " + pointsToCharacter + " points");
                
                int dexterity;
                do {
                    System.out.println("Introduce dexterity(5-20)");
                    dexterity = controlErrorInt(); 
                    e.nextLine();
                } while (dexterity < 5 || dexterity > 20);
                pointsToCharacter = pointsToCharacter - dexterity;
                System.out.println("Left " + pointsToCharacter + " points");

                int constitution = 0;
                do {
                    System.out.println("Introduce constitution(5-20)");
                    constitution = controlErrorInt(); 
                    e.nextLine();
                } while (constitution < 5 || constitution > 20);
                pointsToCharacter = pointsToCharacter - constitution;
                System.out.println("Left " + pointsToCharacter + " points");

                int intelligence = 0;
                do {
                    System.out.println("Introduce intelligence(5-20)");
                    intelligence = controlErrorInt(); 
                    e.nextLine();
                } while (intelligence < 5 || intelligence > 20);
                pointsToCharacter = pointsToCharacter - intelligence;
                System.out.println("Left " + pointsToCharacter + " points");

                int wisdom = 0;
                do {
                    System.out.println("Introduce wisdom(5-20)");
                    wisdom = controlErrorInt(); 
                    e.nextLine();
                } while (wisdom < 5 || wisdom > 20);
                pointsToCharacter = pointsToCharacter - wisdom;
                System.out.println("Left " + pointsToCharacter + " points");

                int charisma = 0;
                do {
                    System.out.println("Introduce charisma(5-20)");
                    charisma = controlErrorInt(); 
                    e.nextLine();
                } while (charisma < 5 || charisma > 20);
                pointsToCharacter = pointsToCharacter - charisma;
                System.out.println("Left " + pointsToCharacter + " points \n");

                if(pointsToCharacter == 0){
                    Personatges personatge = new Personatges(name, age, race, strength, dexterity, constitution, intelligence, wisdom, charisma, null, constitution, intelligence);
                    arrayPersonatge.add(personatge);
                    System.out.println("Here the stats of your character!");
                    System.out.println(arrayPersonatge.get((arrayPersonatge.size()-1)).toString());
                        
                    if(arrayPersonatge.size() == 1){
                            System.out.println("Now the second player!!! \n");
                        }
                        else{
                            System.out.println("It's time to play! \n");
                        }
                }
                else{
                    System.out.println("You assigned the points wrong, try again. \n");
                    pointsToCharacter = 60;
                }
            } while (pointsToCharacter != 0);
               
    }
 
    public int chooseWeapon(int controlPlayer){
        int weaponChoosen = 0;
        do {
            System.out.println("What weapon you want to use?");              
            arrayPersonatge.get(controlPlayer).seeAllWeapons();
            weaponChoosen = controlErrorInt();
            arrayPersonatge.get(controlPlayer).equipWeapon(arrayPersonatge.get(controlPlayer).getWeapons().get(weaponChoosen-1));
            if(weaponChoosen > 11 ||  weaponChoosen < 0){
                System.out.println("You can only choose between 1 and 12.");
                weaponChoosen = -1;
            }
            if(arrayPersonatge.get(controlPlayer).getIntelligence() < 10 && arrayPersonatge.get(controlPlayer).getWeapon().getIsMagic()){
                System.out.println("You can't use a magic weapon with less of 10 of intelligence! \nChoose another weapon.");
                weaponChoosen = -1;
            }
        } while(weaponChoosen < 0 || weaponChoosen > 11);
        return weaponChoosen;
        
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

