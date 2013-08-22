package com.ee.mars_rover;

/**
 * Created with IntelliJ IDEA.
 * User: anil
 * Date: 22/8/13
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class LeftDirectionFactory extends DirectionFactory {
    @Override
    public Direction create(Direction direction) {


        if (direction == Direction.NORTH) {
            return Direction.WEST;
        }
        if (direction == Direction.EAST) {
            return Direction.NORTH;
        }
        if (direction == Direction.WEST) {
            return Direction.SOUTH;
        }
        if (direction == Direction.SOUTH) {
            return Direction.EAST;
        }

        return null;
}
}
