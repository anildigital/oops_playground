package com.ee.mars_rover;

public class MoveLeft implements Move {

    public void perform(Rover rover) {

        DirectionFactory direction = new LeftDirectionFactory();
        Direction returnDirection = direction.create(rover.getDirection());
        rover.setDirection(returnDirection);
    }
}
