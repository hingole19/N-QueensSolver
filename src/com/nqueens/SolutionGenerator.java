package com.nqueens;

import java.util.ArrayList;
import java.util.List;

public class SolutionGenerator {

	public List<String> generateSolution(Board board) {
		List<String> solution = new ArrayList<>();
		for (int row = 0; row < board.getSize(); row++) {
			StringBuffer sb = new StringBuffer();
			for (int col = 0; col < board.getSize(); col++) {
				if (board.getCellValue(row, col) == 1) {
					sb.append("Q");
				} else {
					sb.append(".");
				}
			}
			solution.add(sb.toString());
		}
		return solution;
	}
}