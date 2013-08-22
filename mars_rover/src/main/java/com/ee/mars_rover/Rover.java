package com.ee.mars_rover;

public class Rover {
	private Direction direction;
	private Position position;

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return this.position;
	}

	public void move(Move move) {
		move.perform(this);
	}
}