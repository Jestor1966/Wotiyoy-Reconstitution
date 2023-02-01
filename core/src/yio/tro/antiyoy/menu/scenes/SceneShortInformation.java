package yio.tro.antiyoy.menu.scenes;

import yio.tro.antiyoy.menu.Animation;
import yio.tro.antiyoy.menu.ButtonYio;
import yio.tro.antiyoy.menu.MenuControllerYio;
import yio.tro.antiyoy.menu.behaviors.Reaction;

public class SceneShortInformation extends AbstractScene{

    private String languageString;
    private Reaction reaction;
    private ButtonYio basePanel;
    private ButtonYio yesButton;


    public SceneShortInformation(MenuControllerYio menuControllerYio, String languageString,Reaction reaction) {
        super(menuControllerYio);
        this.languageString=languageString;
        this.reaction = reaction;
    }

    public SceneShortInformation(MenuControllerYio menuControllerYio) {
        super(menuControllerYio);
        this.languageString="yes";
        this.reaction = Reaction.rbDestoryInformation;
    }


    @Override
    public void create() {
        menuControllerYio.beginMenuCreation();

        menuControllerYio.getYioGdxGame().beginBackgroundChange(3, true, true);

        basePanel = buttonFactory.getButton(generateRectangle(0.05, 0.4, 0.9, 0.15), 410, null);
        if (basePanel.notRendered()) {
            basePanel.addTextLine(getString(languageString));
            basePanel.addTextLine(" ");
            basePanel.addTextLine(" ");
            menuControllerYio.getButtonRenderer().renderButton(basePanel);
        }
        basePanel.setTouchable(false);
        basePanel.setAnimation(Animation.from_center);

        yesButton = buttonFactory.getButton(generateRectangle(0.5, 0.4, 0.9, 0.05), 411, getString("yes"));
        yesButton.setReaction(reaction);
        yesButton.setShadow(false);
        yesButton.setVisualHook(basePanel);
        yesButton.setAnimation(Animation.from_center);

        menuControllerYio.endMenuCreation();
    }

    public void onDestroy() {
        basePanel.destroy();
        yesButton.destroy();
    }
}