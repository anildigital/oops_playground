package com.ee.mars_rover;

public enum Direction {
	NORTH {
		public String toString() {
			return "N";
		}
	},
	EAST {
		public String toString() {
			return "E";
		}
	},
	SOUTH {
		public String toString() {
			return "S";
		}
	},
	WEST {
		public String toString() {
			return "W";
		}
	}
}