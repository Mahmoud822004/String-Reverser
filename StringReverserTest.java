public class StringReverserTest {
    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();
        int passed = 0;
        int failed = 0;

        // Test 1: Normal string
        if ("cba".equals(reverser.reverse("abc"))) {
            System.out.println("✓ Reverse normal string test passed");
            passed++;
        } else {
            System.out.println("✗ Reverse normal string test failed");
            failed++;
        }

        // Test 2: Single character
        if ("a".equals(reverser.reverse("a"))) {
            System.out.println("✓ Reverse single character test passed");
            passed++;
        } else {
            System.out.println("✗ Reverse single character test failed");
            failed++;
        }

        // Test 3: Empty string
        if ("".equals(reverser.reverse(""))) {
            System.out.println("✓ Reverse empty string test passed");
            passed++;
        } else {
            System.out.println("✗ Reverse empty string test failed");
            failed++;
        }

        // Test 4: Null input
        if (reverser.reverse(null) == null) {
            System.out.println("✓ Reverse null test passed");
            passed++;
        } else {
            System.out.println("✗ Reverse null test failed");
            failed++;
        }

        System.out.println("\nResults: " + passed + " passed, " + failed + " failed");

        if (failed > 0) {
            System.exit(1); // Exit with error code if tests fail
        }
    }
}
