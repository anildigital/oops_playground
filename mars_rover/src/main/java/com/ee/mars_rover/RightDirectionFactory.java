package com.ee.mars_rover;

/**
 * Created with IntelliJ IDEA.
 * User: anil
 * Date: 22/8/13
 * Time: 11:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class RightDirectionFactory extends DirectionFactory {
    @Override
    public Direction create(Direction direction) {


        if (direction == Direction.NORTH) {
            return Direction.EAST;
        }
        if (direction == Direction.EAST) {
            return Direction.SOUTH;
        }
        if (direction == Direction.WEST) {
            return Direction.NORTH;
        }
        if (direction == Direction.SOUTH) {
            return Direction.WEST;
        }

        return null;
    }

}
