import static org.junit.Assert.fail;
import org.junit.Test;

public class TestFoo {
    @Test
    public void test1() {
        assert Foo.foo() == false;
    }

    @Test
    public void test2() {
        assert Foo.foo() == true;
    }
}
