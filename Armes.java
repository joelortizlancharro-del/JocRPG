public class Armes {
    
    private String name;
    private boolean isMagic;
    private int damage;
    public String type;

    public Armes(String name, boolean isMagic, int damage, String type){
        this.name = name;
        this.isMagic = isMagic;
        this.damage = damage;
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setIsMagic(boolean isMagic){
        this.isMagic = isMagic;
    }

    public boolean getIsMagic(){
        return this.isMagic;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
