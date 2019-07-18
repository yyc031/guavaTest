import com.io.IoTest;
import org.junit.Test;

import java.io.IOException;

/**
 * @author : yyc
 * @date : 2019-7-10
 */
public class FileTest {

    @Test
    public void test01() throws IOException {
        IoTest ioTest = new IoTest();
        ioTest.writeFile("C:\\Users\\ecidi\\Desktop\\test.csv");
    }
}
