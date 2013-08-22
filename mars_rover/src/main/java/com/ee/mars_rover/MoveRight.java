package com.ee.mars_rover;

public class MoveRight implements Move {

    public void perform(Rover rover) {

        DirectionFactory direction = new RightDirectionFactory();
        Direction returnDirection = direction.create(rover.getDirection());
        rover.setDirection(returnDirection);
    }
}
