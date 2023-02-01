package yio.tro.antiyoy.gameplay.loading.gameDatas;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.annotation.JSONBuilder;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import yio.tro.antiyoy.YioGdxGame;
import yio.tro.antiyoy.gameplay.Obj;
import yio.tro.antiyoy.gameplay.UnitType;
import yio.tro.antiyoy.menu.scenes.Scenes;
import yio.tro.antiyoy.stuff.LanguagesManager;
import yio.tro.antiyoy.stuff.Yio;

public class UnitLoader {
    public ArrayList<UnitType> unitTypeArrayList;

    public UnitLoader(String path){
        FileHandle fileUnit;
        unitTypeArrayList=new ArrayList<>();
        if(path=="VANILLA"){
            fileUnit=Gdx.files.internal("datas/Vanilla/units.json");
        }else{
            fileUnit=Gdx.files.external("AntiyoyDatas/Mods/"+path+"/units.json");
        }
        load(fileUnit);
    }

    public File getPath (FileHandle fileHandle) {
        return new File(Gdx.files.getLocalStoragePath()+"assets\\", fileHandle.path());
    }

    public void load(FileHandle file){
        String unitTypeString;

        //Recomplie
        if(file.exists()){
            final BufferedReader reader;
            String unitsDatas=file.readString();
            try {
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(getPath(file))));
                String line;
                StringBuilder stringBuilder = new StringBuilder();
                while ((line = reader.readLine()) != null){
                    stringBuilder.append(line);
                }
                final JSONArray parse = JSONArray.parseArray(String.valueOf(stringBuilder));
                for (int i = 0; i < parse.size(); i++){
                    JSONObject json = parse.getJSONObject(i);
                    unitTypeArrayList.add(json.toJavaObject(UnitType.class));
                }
            } catch (IOException e) {
                e.printStackTrace();//File not exist
            }
        }else{
            Scenes.sceneNotification.show(LanguagesManager.getInstance().getString("no_file"));//Assets bug
        }

        for(UnitType unitType:unitTypeArrayList){
            System.out.println(unitType.getName());
        }
    }


}
