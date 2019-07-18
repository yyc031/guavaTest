import com.guava.example.*;
import org.junit.Test;

import java.io.IOException;

/**
 * @author : yyc
 * @date : 2019-7-8
 */
public class GuavaTest {

    @Test
    public void test01() {

        OptionalTester tester = new OptionalTester();

        tester.testOne();
    }

    @Test
    public void test02() {

        BiMapTester tester = new BiMapTester();

        tester.biMapTest();
    }

    @Test
    public void test03() throws IOException {

        JoinerTester joinerTester = new JoinerTester();

        joinerTester.joinerTest();
    }

    @Test
    public void test04() {

        SplitterTester tester = new SplitterTester();
        tester.testSplitter();
    }

    @Test
    public void test05() {

        CharMatcherTester tester = new CharMatcherTester();
        tester.testCharMatcher();
    }

    @Test
    public void test06() {

        MultiMapTester multiMapTester = new MultiMapTester();
        multiMapTester.testMultiMap();
    }

    @Test
    public void test07() {
        String name =null;
        System.out.println(isEmpty(name));
    }

    @Test
    public void test08() {
        Integer start = 5;
        Integer end =3;
        if (start-end >0) {
            start = end;
            end = start;
        }
        System.out.println(start+":"+end);
    }

    private Boolean isEmpty(String str) {

        return str == null || "".equals(str.trim());
    }
}
