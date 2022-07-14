import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

public class ProgD3Test {

    @Test
    public void testMain()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        StandardInputStream in = new StandardInputStream();
        System.setIn(in);

        // action
        ProgD3.main(null);
        // undo the binding in System
        System.setOut(originalOut);
        
        String prints[] = bos.toString().split("\r\n|\n", -1);
        // assertion
        assertEquals("10937072", prints[0],"利用者の合計値が不正です!");
        assertEquals("377140", prints[1],"利用者の平均値が不正です!");
    }
}
