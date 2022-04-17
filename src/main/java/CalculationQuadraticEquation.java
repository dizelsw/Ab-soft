import java.util.HashMap;

public class CalculationQuadraticEquation {
    public HashMap<String, Double> сalculationOfTheRootsOfQuadraticEquation(int a, int b, int c) {
        double x, y;
        HashMap<String, Double> map = new HashMap<>();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) //Decrement > 0
        {
            x = (-b - Math.sqrt(d)) / (2 * a);
            y = (-b + Math.sqrt(d)) / (2 * a);
            map.put("x", x);
            map.put("y", y);
        } else if (d == 0) { //Decrement = 0
            x = (-b) / (2 * a);
            y = (-b) / (2 * a);
            map.put("x", x);
            map.put("y", y);
        } else//Decrement < 0
        {
            map.put("x", null);
            map.put("y", null);
        }
        return map;
    }


    public boolean possibilityOneRootOfTheEquation(HashMap rootsEquations) {
        HashMap rootsEquationsTest = rootsEquations;
        try {
            System.out.println(rootsEquationsTest.get("x"));
            System.out.println(rootsEquationsTest.get("y"));
            return (double) rootsEquationsTest.get("x") == (double) rootsEquationsTest.get("y");
        } catch (NullPointerException e) {
            System.out.print("NullPointerException caught");
            return false;
        }
    }

    public boolean possibilityTwoRootOfTheEquation(HashMap rootsEquations) {
        HashMap rootsEquationsTest = rootsEquations;
        try {
            System.out.println(rootsEquationsTest.get("x"));
            System.out.println(rootsEquationsTest.get("y"));
            return (double) rootsEquationsTest.get("x") != (double) rootsEquationsTest.get("y");
        } catch (NullPointerException e) {
            System.out.print("NullPointerException caught");
            return false;
        }
    }

    public boolean lackOfEquationRootsOfTheEquation(HashMap rootsEquations) {
        HashMap rootsEquationsTest = rootsEquations;
        System.out.println(rootsEquationsTest.get("x"));
        System.out.println(rootsEquationsTest.get("y"));
        return rootsEquationsTest.get("x") == null;
    }


}
