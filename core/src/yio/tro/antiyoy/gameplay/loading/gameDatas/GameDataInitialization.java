package yio.tro.antiyoy.gameplay.loading.gameDatas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class GameDataInitialization {
    public GameDataInitialization(){
        Initialization();
    }

    private void Initialization(){
        FileHandle initialization = Gdx.files.external("AntiyoyDatas/temp.txt");
        initialization = Gdx.files.external("AntiyoyDatas/Mods/temp.txt");
        initialization = Gdx.files.external("AntiyoyDatas/Maps/temp.txt");
        initialization = Gdx.files.external("AntiyoyDatas/Music/temp.txt");
    }
}
