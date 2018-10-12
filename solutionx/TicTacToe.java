import java.util.Arrays;

class TicTacToe {

	public static char check(char[][] grid) {
	    
        boolean diag1 = true;
        boolean diag2 = true;
	    for (int x = 0; x < grid.length - 1; x++) {
	        boolean line = true;
	        boolean column = true;
	        for (int y = 0; y < grid.length - 1; y++) {
	            line &= grid[x][y] == grid[x][y + 1];
	            column &= grid[y][x] == grid[y + 1][x];
	        }
            if (line) {
                return grid[x][0];
            }
            if (column) {
                return grid[0][x];
            }
	        diag1 &= grid[x][x] == grid[x + 1][x + 1];
	        diag2 &= grid[x][grid.length - 1 - x] == grid[x + 1][grid.length - 2 - x];
	    }
        if (diag1) {
            return grid[0][0];
        }
        if (diag2) {
            return grid[0][grid.length - 1];
        }	    
	    return '.';
	}
}
