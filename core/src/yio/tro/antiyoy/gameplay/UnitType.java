package yio.tro.antiyoy.gameplay;

public class UnitType {

    public String name;
    public int strength;
    public int defense;
    public int movement;
    public int manpowerSpend;
    public boolean sea;
    public int range;

    public UnitType(String name,int strength,int defense,int movement,int manpowerSpend,boolean sea,int range){
        this.name=name;
        this.strength=strength;
        this.defense=defense;
        this.movement=movement;
        this.manpowerSpend=manpowerSpend;
        this.sea=sea;
        this.range = range;
    }

    public String getName(){
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    public int getMovement() {
        return movement;
    }

    public int getManpowerSpend() {
        return manpowerSpend;
    }

    public boolean getSea(){return sea;}

    public int getRange(){return range;}

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public void setManpowerSpend(int manpowerSpend) {
        this.manpowerSpend = manpowerSpend;
    }

    public void setSea(boolean sea){this.sea=sea;}

    public void setRange(int range){this.range=range;}
}
