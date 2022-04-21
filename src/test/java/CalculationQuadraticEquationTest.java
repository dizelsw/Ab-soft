import net.absoft.mortalwombat.AgeChecker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationQuadraticEquationTest {
    @Test
    public void testHaveTwoRoots() {
        CalculationQuadraticEquation calculationQuadraticEquation = new CalculationQuadraticEquation();
        Assert.assertTrue(calculationQuadraticEquation.possibilityTwoRootOfTheEquation(calculationQuadraticEquation
                .сalculationOfTheRootsOfQuadraticEquation(1, -4, -5)), "Quadratic equation has not 2 roots");
    }

    @Test
    public void testHaveOneRoots() {
        CalculationQuadraticEquation calculationQuadraticEquation = new CalculationQuadraticEquation();
        Assert.assertTrue(calculationQuadraticEquation.possibilityOneRootOfTheEquation(calculationQuadraticEquation
                .сalculationOfTheRootsOfQuadraticEquation(1, -6, 9)), "Quadratic equation has not 1 roots");
    }

    @Test
    public void testHaveNorRoots() {
        CalculationQuadraticEquation calculationQuadraticEquation = new CalculationQuadraticEquation();
        Assert.assertTrue(calculationQuadraticEquation.lackOfEquationRootsOfTheEquation(calculationQuadraticEquation
                .сalculationOfTheRootsOfQuadraticEquation(3, -4, 2)), "Quadratic equation has  roots");
    }

    @Test
    public void testHaveNorRootsCheckException() {
        CalculationQuadraticEquation calculationQuadraticEquation = new CalculationQuadraticEquation();
        Assert.assertTrue(calculationQuadraticEquation.possibilityTwoRootOfTheEquation(calculationQuadraticEquation
                .сalculationOfTheRootsOfQuadraticEquation(3, -4, 2)), "Quadratic equation has not 2 roots");
    }
}
