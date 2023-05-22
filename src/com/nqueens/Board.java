package com.nqueens;

public class Board {
	private final int[][] board;
	private final SafeChecker safeChecker;

	public Board(int num) {
		this.board = new int[num][num];
		this.safeChecker = new SafeChecker(this);
	}

	public int getSize() {
		return board.length;
	}

	public boolean isSafe(int row, int col) {
		return safeChecker.isSafe(row, col);
	}

	public void placeQueen(int row, int col) {
		board[row][col] = 1;
	}

	public void removeQueen(int row, int col) {
		board[row][col] = 0;
	}

	public int getCellValue(int i, int j) {
		if (board[i][j] == 1) {
			return 1;
		}
		return 0;
	}
}
