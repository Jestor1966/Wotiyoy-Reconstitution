package yio.tro.antiyoy.gameplay;

public class Terrain {

    String name;
    int income;
    int movementEffect;


    public Terrain(String name,int income,int movementEffect){
        this.name=name;
        this.income=income;
        this.movementEffect=movementEffect;
    }

    public String getName(){
        return this.name;
    }

    public int getIncome(){
        return this.income;
    }

    public int getMovementEffect(){
        return this.movementEffect;
    }
}
