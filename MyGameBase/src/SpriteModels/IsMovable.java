/** @Author seth kerr
 *  CopyRight 2018
 *  Oak Development Technologies
 *
 *  MIT License. See license on MyGameBase repository on GitHub
 *
 *  for all methods indicating you should override, think about how you would get the center
 *  of an object based on the X and Y lengths of the object itself.
 *
 *  And for getBoundingRadius() remember that it will be an operation built around the difference of the
 *  X and Y values of the sprite.
 */

package SpriteModels;

import Interfaces.CharacterViews;
import javafx.scene.image.ImageView;

abstract public class IsMovable extends javafx.scene.image.ImageView {

    //Override me!
    public double getCenterX() {
        return 0.0;
    }

    //Override me!
    public double getCenterY() {
        return 0.0;
    }

    //Override me!
    public double getBoundingRadius() {
        return 0.0;
    }


    //Fill this out later
    public void move() {

    }

}
