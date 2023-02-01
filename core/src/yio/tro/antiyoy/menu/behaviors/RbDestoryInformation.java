package yio.tro.antiyoy.menu.behaviors;

import yio.tro.antiyoy.menu.ButtonYio;
import yio.tro.antiyoy.menu.scenes.Scenes;

public class RbDestoryInformation extends Reaction{
    @Override
    public void perform(ButtonYio buttonYio) {
        Scenes.sceneShortInformation.onDestroy();
    }
}
