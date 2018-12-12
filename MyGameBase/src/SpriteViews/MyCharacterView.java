/** @Author seth kerr
 *  CopyRight 2018
 *  Oak Development Technologies
 *
 *  MIT License. See license on MyGameBase repository on GitHub
 *
 */

package SpriteViews;

import SpriteModels.MyMovableCharacter;
import javafx.geometry.Rectangle2D;

import java.util.ArrayList;

public class MyCharacterView extends MyMovableCharacter {

    private MyMovableCharacter myCharacter;
    ArrayList<Rectangle2D> myViewPorts;

    public MyCharacterView(MyMovableCharacter myCharacter) {
        super(myCharacter.getCharacterName(), myCharacter.getIsHero(),myCharacter.getHealth(),myCharacter.getStartingX(),myCharacter.getStartingY(),myCharacter.getWidth(),myCharacter.getHeight(),myCharacter.getSpriteConfigFileName());
        for (int i = 0; i < myCharacter.getNumViewPorts(); i++) {
            Rectangle2D newViewPort = new Rectangle2D(myCharacter.getViewport(i)[0], myCharacter.getViewport(i)[1],
                    myCharacter.getViewport(i)[2], myCharacter.getViewport(i)[3]);
            myViewPorts.add(newViewPort);

        }


    }
}
