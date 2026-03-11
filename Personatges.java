import java.util.ArrayList;

public class Personatges {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private double health;
    private double mana;
    private String name;
    private int age;
    private String race;
    private ArrayList<Armes> weapons = new ArrayList<>();

    public Personatges(String name, int age, String race, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, double health, double mana){
        this.name = name;
        this.age = age;
        this.race = race;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.health = constitution*50;
        this.mana = intelligence*30;

        weapons.add(new Armes("Excalibur", true, 20, "Sword"));
        weapons.add(new Armes("Iron Sword", false, 10, "Sword"));
        weapons.add(new Armes("Dragon Slayer", true, 25, "Sword"));

        weapons.add(new Armes("Hunter Bow", false, 11, "Bow"));
        weapons.add(new Armes("GodSlayer", true, 18, "Bow"));
        weapons.add(new Armes("Elven Bow", true, 16, "Bow"));

        weapons.add(new Armes("Apprentice Staff", false, 9, "Staff"));
        weapons.add(new Armes("Arcane Staff", true, 17, "Staff"));
        weapons.add(new Armes("Ancient Staff", true, 21, "Staff"));

        weapons.add(new Armes("Woodcutter Axe", false, 12, "Axe"));
        weapons.add(new Armes("Battle Axe", false, 15, "Axe"));
        weapons.add(new Armes("Doom Axe", true, 23, "Axe"));

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setRace(String race){
        this.race = race;
    }

    public String getRace(){
        return this.race;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return this.strength;
    }
    
    public void setDexterity(int dexterity){
        this.dexterity = dexterity;
    }

    public int getDexterity(){
        return this.dexterity;
    }

     public void setConstitution(int constitution){
        this.constitution = constitution;
        this.health = this.constitution*50;
    }

    public int getConstitution(){
        return this.constitution;
    }

    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
         this.mana = this.intelligence*30;
    }

    public int getIntelligence(){
        return this.intelligence;
    }

    public void setWisdom(int wisdom){
        this.wisdom = wisdom;
    }

    public int getWisdom(){
        return this.wisdom;
    }

    public void setCharisma(int charisma){
        this.charisma = charisma;
    }

    public int getCharisma(){
        return this.charisma;
    }

    public double getHealth(){
        return this.health;
    }

    public double getMana(){
        return this.mana;
    }

    public void setWeapon(Armes weapon){
        weapons.add(weapon);
    }

    public void getWeapons(){
      for(int i = 0; i < weapons.size(); i++){
        System.out.println("Weapon " + (i+1) + ": " + weapons.get(i).toStringArmes());
      }
    }
    public String toString(){
       String info;
       info = " Name:" + name + "\n Age:" + age + "\n Race:" + race + 
        "\n Strength:" + strength + "\n Dexterity:" + dexterity + 
        "\n Constitution:" + constitution + "\n Intelligence:" + intelligence + 
        "\n Wisdom:" + wisdom + "\n Charisma:" + charisma + "\n Health:" + health + "\n Mana:" + mana;

       return info;
    }
}