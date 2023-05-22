package com.nqueens;

public class SafeChecker {

	private final Board board;

	public SafeChecker(Board board) {
		this.board = board;
	}

	public boolean isSafe(int row, int col) {
		// Check if a queen can be placed at the given position and Check the left side
		// of the current row
		for (int i = 0; i < col; i++) {
			if (board.getCellValue(row, i) == 1) {
				return false;
			}
		}

		// Check the upper diagonal on the left side
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board.getCellValue(i, j) == 1) {
				return false;
			}
		}

		// Check the lower diagonal on the left side
		for (int i = row, j = col; i < board.getSize() && j >= 0; i++, j--) {
			if (board.getCellValue(i, j) == 1) {
				return false;
			}
		}

		return true;
	}
}
