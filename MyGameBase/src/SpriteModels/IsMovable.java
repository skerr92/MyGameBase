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

import Interfaces.MovableCharacter;

public abstract class IsMovable extends javafx.scene.image.ImageView implements MovableCharacter {

    private double direction;
    private double speed;
    private static final double MAX_SPEED = 10;

    public IsMovable(double speed, double direction, double startingX, double startingY) {
        this.direction = direction;
        this.speed = speed;
        super.setX(startingX);
        super.setY(startingY);
    }

    @Override
    public double getCenterX() {
        return super.getX() + 0.5 * super.getFitWidth();
    }

    @Override
    public double getCenterY() {
        return super.getY() + 0.5 * super.getFitHeight();
    }

    @Override
    public double getBoundingRadius() {
        return 0.5 * (super.getFitWidth() + super.getFitHeight())/2;
    }

    //Speed getters and setters
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    //Direction getters and setters
    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getDirection() {
        return direction;
    }
    @Override
    public void move() {
        Double x_velocity = this.getSpeed() * Math.cos(this.getDirection() * Math.PI / 180.0);
        Double y_velocity = this.getSpeed() * Math.sin(this.getDirection() * Math.PI / 180.0);
        this.setX(this.getX() + x_velocity);
        this.setY(this.getY() + y_velocity);
    }

}
