package com.ee.mars_rover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarsRoverTest {

	@Test
	public void itShouldInitializePlateau() {
		// Given
		int rows = 5;
		int columns = 5;

		// When
		Plateau plateau = new Plateau(rows, columns);

		// Then
		assertEquals(5, plateau.rows());
		assertEquals(5, plateau.columns());
	}

	@Test
	public void itShouldMoveRoverToLeftFromNorth() {
		Rover rover = new Rover();
		rover.setDirection(Direction.NORTH);

		MoveLeft left = new MoveLeft();
		
		// When
		rover.move(left);

		// Then
		assertEquals(Direction.WEST, rover.getDirection());
	}

	@Test
	public void itShouldMoveRoverToLeftFromEast() {
		Rover rover = new Rover();
		rover.setDirection(Direction.EAST);

        MoveLeft left = new MoveLeft();

		// When
		rover.move(left);

		// Then
		assertEquals(Direction.NORTH, rover.getDirection());
	}

	@Test
	public void itShouldMoveRoverToLeftFromSouth() {
		Rover rover = new Rover();
		rover.setDirection(Direction.SOUTH);

        MoveLeft left = new MoveLeft();

		// When
        rover.move(left);

		// Then
		assertEquals(Direction.EAST, rover.getDirection());
	}

	@Test
	public void itShouldMoveRoverToLeftFromWest() {
		Rover rover = new Rover();
		rover.setDirection(Direction.WEST);

        MoveLeft left = new MoveLeft();

		// When
        rover.move(left);

		// Then
		assertEquals(Direction.SOUTH, rover.getDirection());
	}

	@Test
	public void itShouldMoveRoverToRightFromNorth() {
		Rover rover = new Rover();
		rover.setDirection(Direction.NORTH);

        MoveRight right = new MoveRight();

		// When
		rover.move(right);

		// Then
		assertEquals(Direction.EAST, rover.getDirection());
	}

	@Test
	public void itShouldMoveRoverToRightFromEast() {
		Rover rover = new Rover();
		rover.setDirection(Direction.EAST);
        MoveRight right = new MoveRight();

		// When
		rover.move(right);

		// Then
		assertEquals(Direction.SOUTH, rover.getDirection());
	}

	@Test
	public void itShouldMoveRoverToRightFromWest() {
		Rover rover = new Rover();
		rover.setDirection(Direction.WEST);

        MoveRight right = new MoveRight();

        // When
        rover.move(right);

		// Then
		assertEquals(Direction.NORTH, rover.getDirection());
	}

	@Test
	public void itShouldMoveRoverToRightFromSouth() {
		Rover rover = new Rover();
		rover.setDirection(Direction.SOUTH);
        MoveRight right = new MoveRight();

		// When
        rover.move(right);

		// Then
		assertEquals(Direction.WEST, rover.getDirection());
	}

	@Test
	public void itShouldMoveRoverForwardtoWest() {
		// Given
        Rover rover = new Rover();
        rover.setDirection(Direction.WEST);
		int rows = 5;
		int columns = 5;
		Plateau plateau = new Plateau(rows, columns);

		Position position = plateau.getPosition(3, 3);

        rover.setPosition(position);

        MoveForward forward = new MoveForward();


        // When
        rover.move(forward);

		// Then
        assertEquals(2, rover.getPosition().getX());
        assertEquals(3, rover.getPosition().getY());
	}

	@Test
	public void itShouldMoveRoverForwardtoNorth() {
		// Given
        Rover rover = new Rover();
        rover.setDirection(Direction.NORTH);
		int rows = 5;
		int columns = 5;
		Plateau plateau = new Plateau(rows, columns);

        Position position = plateau.getPosition(3, 3);

        rover.setPosition(position);

        MoveForward forward = new MoveForward();


		// When
        rover.move(forward);

		// Then
		Position roverPosition = rover.getPosition();
		assertEquals(3, roverPosition.getX());
		assertEquals(4, roverPosition.getY());
	}

	@Test
	public void itShouldMoveRoverForwardtoSouth() {
		// Given
        Rover rover = new Rover();
        rover.setDirection(Direction.SOUTH);
		int rows = 5;
		int columns = 5;
		Plateau plateau = new Plateau(rows, columns);

        Position position = plateau.getPosition(3, 3);

        rover.setPosition(position);

        MoveForward forward = new MoveForward();

		// When
        rover.move(forward);

		// Then
		Position roverPosition = rover.getPosition();
		assertEquals(3, roverPosition.getX());
		assertEquals(2, roverPosition.getY());
	}
    @Test
    public void itShouldMoveRoverForwardtoEast() {
        // Given
        Rover rover = new Rover();
        rover.setDirection(Direction.EAST);
        int rows = 5;
        int columns = 5;
        Plateau plateau = new Plateau(rows, columns);

        Position position = plateau.getPosition(3, 3);

        rover.setPosition(position);

        MoveForward forward = new MoveForward();

        // When
        rover.move(forward);

        // Then
        Position roverPosition = rover.getPosition();
        assertEquals(4, roverPosition.getX());
        assertEquals(3, roverPosition.getY());
    }

	@Test
	public void roverShouldFollowPassedCommands1() {
		// Given
		int rows = 5;
		int columns = 5;
		Plateau plateau = new Plateau(rows, columns);

		Position position = plateau.getPosition(1, 2);

		Rover rover = new Rover();
		rover.setPosition(position);
		rover.setDirection(Direction.NORTH);

		// When
        MoveForward forward = new MoveForward();
        MoveRight right = new MoveRight();
        MoveLeft left = new MoveLeft();

		rover.move(left);
		rover.move(forward);
        rover.move(left);
        rover.move(forward);
        rover.move(left);
        rover.move(forward);
        rover.move(left);
        rover.move(forward);
        rover.move(forward);

		// Then
		Position roverPosition = rover.getPosition();
		assertEquals(1, roverPosition.getX());
		assertEquals(3, roverPosition.getY());
		assertEquals(Direction.NORTH, rover.getDirection());
	}

	@Test
	public void roverShouldFollowPassedCommands2() {
		// Given
		int rows = 5;
		int columns = 5;
		Plateau plateau = new Plateau(rows, columns);

		Position position = plateau.getPosition(3, 3);

		Rover rover = new Rover();
		rover.setPosition(position);
		rover.setDirection(Direction.EAST);

        MoveForward forward = new MoveForward();
        MoveRight right = new MoveRight();
        MoveLeft left = new MoveLeft();


        // When
		rover.move(forward);
		rover.move(forward);
		rover.move(right);
		rover.move(forward);
		rover.move(forward);
		rover.move(right);
		rover.move(forward);
		rover.move(right);
		rover.move(right);
		rover.move(forward);

		// Then
		Position roverPosition = rover.getPosition();
		//assertEquals(4, roverPosition.getX());
		assertEquals(1, roverPosition.getY());
		assertEquals(Direction.EAST, rover.getDirection());
	}

}