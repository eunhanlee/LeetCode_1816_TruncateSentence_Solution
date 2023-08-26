import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testTruncateSentence() {
        Solution solution = new Solution();

        String input1 = "Hello how are you doing today";
        int k1 = 3;
        String expected1 = "Hello how are";
        String actual1 = solution.truncateSentence(input1, k1);
        assertEquals(expected1, actual1);

        String input2 = "This is a test sentence for truncation";
        int k2 = 5;
        String expected2 = "This is a test sentence";
        String actual2 = solution.truncateSentence(input2, k2);
        assertEquals(expected2, actual2);

        String input3 = "Short";
        int k3 = 2;
        String expected3 = "Short";
        String actual3 = solution.truncateSentence(input3, k3);
        assertEquals(expected3, actual3);

        String input5 = "OnlyOneWord";
        int k5 = 1;
        String expected5 = "OnlyOneWord";
        String actual5 = solution.truncateSentence(input5, k5);
        assertEquals(expected5, actual5);

        String input6 = "Hello, world!";
        int k6 = 2;
        String expected6 = "Hello, world!";
        String actual6 = solution.truncateSentence(input6, k6);
        assertEquals(expected6, actual6);

        String input7 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        int k7 = 6;
        String expected7 = "Lorem ipsum dolor sit amet, consectetur";
        String actual7 = solution.truncateSentence(input7, k7);
        assertEquals(expected7, actual7);

        String input8 = "";
        int k8 = 3;
        String expected8 = "";
        String actual8 = solution.truncateSentence(input8, k8);
        assertEquals(expected8, actual8);

        String input9 = "Coding is fun!";
        int k9 = 5;
        String expected9 = "Coding is fun!";
        String actual9 = solution.truncateSentence(input9, k9);
        assertEquals(expected9, actual9);

        String input10 = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        int k10 = 10;
        String expected10 = "A B C D E F G H I J";
        String actual10 = solution.truncateSentence(input10, k10);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
