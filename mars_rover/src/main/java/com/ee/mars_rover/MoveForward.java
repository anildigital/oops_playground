package com.ee.mars_rover;

/**
 * Created with IntelliJ IDEA.
 * User: anil
 * Date: 21/8/13
 * Time: 4:58 PM
 * To change this template use File | Settings | File Templates.
 */

public class MoveForward implements Move {

    public void perform(Rover rover) {

        Position currentPosition = rover.getPosition();

        if (rover.getDirection() == Direction.WEST) {
            Position newPosition = new Position();
            newPosition.setX(currentPosition.getX() - 1);
            newPosition.setY(currentPosition.getY());
            rover.setPosition(newPosition);
        }

        if (rover.getDirection() == Direction.NORTH) {
            Position newPosition = new Position();
            newPosition.setX(currentPosition.getX());
            newPosition.setY(currentPosition.getY() + 1);
            rover.setPosition(newPosition);
        }

        if (rover.getDirection() == Direction.SOUTH) {
            Position newPosition = new Position();
            newPosition.setX(currentPosition.getX());
            newPosition.setY(currentPosition.getY() - 1);
            rover.setPosition(newPosition);
        }

        if (rover.getDirection() == Direction.EAST) {
            Position newPosition = new Position();
            newPosition.setX(currentPosition.getX() + 1);
            newPosition.setY(currentPosition.getY());
            rover.setPosition(newPosition);
        }
    }
}