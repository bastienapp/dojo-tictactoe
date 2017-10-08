import java.util.Arrays;

class TicTacToe {

	public static char check(char[][] grid) {
		char[][] lines = getLines(grid);
		char winner = '.';
		for (int i = 0; i < lines.length; i++) {
			winner = whoWins(lines[i]);
			if (winner != '.') {
				return winner;
			}
		}
		return winner;
	}

	public static char[][] getLines(char[][] grid) {
		int lineCount = 0;
		char[][] lines = new char[grid.length * 2 + 2][grid.length];
		for (int i = 0; i < grid.length; i++) {
			// get row
			lines[lineCount++] = grid[i];
			// get column
			char column[] = new char[grid.length];
			for (int j = 0; j < grid.length; j++) {
				column[j] = grid[i][j];
			}
			lines[lineCount++] = column;
		}
		char[] diagonal1 = new char[grid.length];
		char[] diagonal2 = new char[grid.length];
		for (int i = 0; i < grid.length; i++) {
           diagonal1[i] = grid[i][i];
           diagonal2[i] = grid[grid.length-1 - i][i];
        }
		lines[lineCount++] = diagonal1;
		lines[lineCount++] = diagonal2;

		return lines;
	}

	public static char whoWins(char[] line) {
		char player = line[0];
		for (int i = 1; i < line.length; i++) {
			if (player != line[i]) {
				return '.';
			}
		}
		return player;
	}
}
