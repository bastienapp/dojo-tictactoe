import junit.framework.*;
import org.junit.Test;

public class TicTacToeTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testXWins() throws Exception {
		char grid[][] = {
			{'x','x','o'},
			{'o','x','o'},
			{'x','o','x'},
		};
		assertEquals('x', TicTacToe.check(grid));
	}

	@Test
	public void testOWins() throws Exception {
		char grid[][] = {
			{'o','o','o'},
			{'x','x','o'},
			{'x','o','x'},
		};
		assertEquals('o', TicTacToe.check(grid));
	}

	@Test
	public void testDraw() throws Exception {
		char grid[][] = {
			{'o','x','o'},
			{'x','x','o'},
			{'o','o','x'},
		};
		assertEquals('.', TicTacToe.check(grid));
	}
}