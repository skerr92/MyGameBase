/** @Author seth kerr
 *  CopyRight 2018
 *  Oak Development Technologies
 *
 *  MIT License. See license on MyGameBase repository on GitHub
 *
 *  Use this interface when building any sprite type character.
 *
 *  This is not a character view. See MovableCharacter interface for creating
 *  the view models for your sprites.
 *
 *  Example: public Class HeroSprite  implements CharacterBase
 *
 */


package Interfaces;

public interface CharacterBase {

    public void setMainViewValues(double[] viewValues, double x, double y, double width, double height);

    public void addNewViewValues(double[] newViewValues, double x, double y, double width, double height);

}
