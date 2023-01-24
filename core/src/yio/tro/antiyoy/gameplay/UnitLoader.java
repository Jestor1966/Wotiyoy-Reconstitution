package yio.tro.antiyoy.gameplay;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.google.gson.*;

public class UnitLoader {
    public ArrayList<UnitType> unitTypeArrayList;
    FileHandle file;
    Gson gson=new Gson();

    public UnitLoader(String path){
        unitTypeArrayList=new ArrayList<>();
        if(path=="VANILLA"){
            file = Gdx.files.internal("datas/Vanilla/units.json");
            String unitsDatas=file.readString();
            System.out.println(unitsDatas);
        }
    }

    private void vanillaLoader(){
        file=Gdx.files.internal("datas/Vanilla/units.json");
        String unitsDatas=file.readString();
        System.out.println(unitsDatas);
    }
}
