package yio.tro.antiyoy.gameplay;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson2.JSON;

import java.util.HashMap;
import java.util.List;

public class UnitType {

    String name;
    int strength;
    int defense;
    int movement;
    int manpowerSpend;
    int range;
    int rangeStrength;
    int cost;
    int maintain;
    HashMap<String, Boolean> terrainAdaption;

    public UnitType(String name, int strength, int defense, int movement, int manpowerSpend, int range, int rangeStrength, int cost, int maintain, HashMap<String, Boolean> terrainAdaption){
        this.name=name;
        this.strength=strength;
        this.defense=defense;
        this.movement=movement;
        this.manpowerSpend=manpowerSpend;
        this.rangeStrength=rangeStrength;
        this.cost=cost;
        this.maintain=maintain;
        this.range = range;
        this.terrainAdaption=terrainAdaption;
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

    public int getRange(){return range;}

    public int getRangeStrength(){return rangeStrength;}

    public int getCost(){return cost;}

    public int getMaintain(){return maintain;}

    public HashMap<String, Boolean> getTerrainAdaption(){return terrainAdaption;}
}
