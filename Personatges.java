public class Personatges {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private double health;
    private double mana;

    public Personatges(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, double health, double mana){
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.health = constitution*50;
        this.mana = intelligence*30;
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
    
}