/** @Author seth kerr
 *  CopyRight 2018
 *  Oak Development Technologies
 *
 *  MIT License. See license on MyGameBase repository on GitHub
 *
 */

package SpriteModels;

import Interfaces.CharacterBase;
import Interfaces.MovableCharacter;

import java.util.ArrayList;

public class MyMovableCharacter extends IsMovable implements CharacterBase, MovableCharacter {

    private String characterName;
    private String spriteConfigFileName;
    private boolean isHero;
    private double health;
    private double startingX;
    private double startingY;
    private double width;
    private double height;
    private double boundingRadius;
    private double[] mainViewValues = new double[4];
    private ArrayList<double[]> viewports = new ArrayList<>();

    public MyMovableCharacter(String characterName, boolean isHero, double health, double startingX,
                              double startingY, double width, double height, String spriteConfigFileName) {
        super(0,0,startingX,startingY);
        this.characterName = characterName;
        this.spriteConfigFileName = spriteConfigFileName;
        this.isHero = isHero;
        this.health = health;
        this.startingX = startingX;
        this.startingY = startingY;
        this.width = width;
        this.height = height;

    }

    @Override
    public void setMainViewValues(double[] viewValues, double x, double y, double width, double height) {
        mainViewValues = viewValues;
        mainViewValues[0] = x;
        mainViewValues[1] = y;
        mainViewValues[2] = width;
        mainViewValues[3] = height;
        viewports.add(0,mainViewValues);
    }

    public double[] setCurrentView(int index) {
        return viewports.get(index);
    }

    @Override
    public void addNewViewValues(double[] newViewValues, double x, double y, double width, double height) {
        newViewValues[0] = x;
        newViewValues[1] = y;
        newViewValues[2] = width;
        newViewValues[3] = height;
        viewports.add(newViewValues);
    }

    public double[] getViewport(int index) {
        return viewports.get(index);
    }

    public int getNumViewPorts() {
        return viewports.size();
    }

    @Override
    public String toString() {
        return null;
    }

    public double getStartingX() {
        return startingX;
    }

    public double getStartingY() {
        return startingY;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getHealth() {
        return health;
    }

    public String getCharacterName() {
        return characterName;
    }

    public boolean getIsHero() {
        return isHero;
    }

    public String getSpriteConfigFileName() {
        return spriteConfigFileName;
    }
}
