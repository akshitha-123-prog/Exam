public class TestFactorial {
    public static void main(String[] args) {
        try {
            
            if (Factorial.compute(4) != 24) {
                throw new AssertionError("Test failed for 4");
            }
            if (Factorial.compute(3) != 6) {
                throw new AssertionError("Test failed for 6");
            }
            if (Factorial.compute(2) != 2) {
                throw new AssertionError("Test failed for 6");
            }
            System.out.println("All test cases passed!");
        } catch (AssertionError e) {
            System.out.println( e.getMessage());
            System.exit(1);  // make Jenkins fail the build
        } catch (Exception e) {
            System.out.println( e.getMessage());
            System.exit(1);
        }
    }
}