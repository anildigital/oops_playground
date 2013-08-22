package com.ee.mars_rover;

import java.util.HashMap;
import java.util.Map;

public class Plateau {
	private Position[][] board = null;
	private Map<Rover, Position> positionResolver;

	public Plateau(int rows, int columns) {
		this.board = new Position[rows][columns];
		this.positionResolver = new HashMap<Rover, Position>();
		Position pos;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				pos = new Position();
				pos.setX(i);
				pos.setY(j);
				this.board[i][j] = pos;
			}
		}
	}

	public int rows() {
		return this.board[0].length;
	}

	public int columns() {
		return this.board.length;
	}

	public Position getPosition(int row, int column) {
		if (row == this.board[0].length) {
			row = row - 1;
		}
		if (column == this.board.length) {
			column = column - 1;
		}

		return board[row][column];

	}

}