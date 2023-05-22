package com.nqueens;

import java.util.ArrayList;
import java.util.List;

public class NQueensSolver {
	private final int num;
	private final List<List<String>> output;
	private final SolutionGenerator solutionGenerator;

	public NQueensSolver(int num) {
		this.num = num;
		this.output = new ArrayList<>();
		solutionGenerator = new SolutionGenerator();
	}

	public List<List<String>> solveNQueensProblem() {
		Board board = new Board(num);
		solveNQueens(board, 0);
		return output;
	}

	/*
	 * performs the recursive backtracking logic to find all solutions
	 */
	private void solveNQueens(Board board, int j) {
		if (j == num) {
			output.add(solutionGenerator.generateSolution(board));
			return;
		}

		for (int i = 0; i < num; i++) {
			if (board.isSafe(i, j)) {
				board.placeQueen(i, j);
				solveNQueens(board, j + 1);
				board.removeQueen(i, j);
			}
		}
	}
}
