/** @Author seth kerr
 *  CopyRight 2018
 *  Oak Development Technologies
 *
 *  MIT License. See license on MyGameBase repository on GitHub
 *
 *  Use this interface when building any sprite type character.
 *
 *  We recommend either using a Rectangle or a Circle Object as your extended class for your sprite
 *  Example: public Class HeroSprite extends Rectangle implements CharacterViews
 *
 */

package Interfaces;

import javafx.scene.image.ImageView;

public interface CharacterViews {

    abstract public double getCenterX();

    abstract public double getCenterY();

    abstract public double getBoundingRadius();

    abstract public void move();

}
