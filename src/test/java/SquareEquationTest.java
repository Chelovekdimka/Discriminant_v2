
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareEquationTest {
    @Test
    public void testSquareEquationSolveWhenNoSolution () {
        SquareEquation squareEquation = new SquareEquation();
        Assert.assertNull(squareEquation.solve(3, -4, 2), "check for d<0");
    }

    @Test
    public void testSquareEquationSolveWhenTwoSolutions () {
        SquareEquation squareEquation = new SquareEquation();
        Solution s = squareEquation.solve(1,-4,-5);
        Assert.assertEquals(s.x1, 5);
        Assert.assertEquals(s.x2, -1);
    }

    @Test
    public void testSquareEquationSolveWhenOneSolution () {
        SquareEquation squareEquation = new SquareEquation();
        Solution s = squareEquation.solve(-4,28,-49);
        Assert.assertEquals(s.x1, 3.5);
        Assert.assertEquals(s.x2, 3.5);
    }
}
