package y;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
 
import org.junit.BeforeClass;
import org.junit.Test;
import org.hamcrest.Matcher;
 
/**
 * Unit test for simple App.
 */
public class AppTest {
    static App app;
    
    @BeforeClass
    public static void init(){
        app = new App();
    }
 
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }
 
    @Test
    public void checkName(){
        app.name = "Test";
        assertEquals("App name should be Test", "Test", app.getName());
    }

    @Test
    public void doArraysEqual(){
        int[] arr = new int[]{2,3,4,5};
        assertArrayEquals(arr, app.toArray(2,3,4,5));
    }
    @Test
    public void hamcrestTest(){
        assertThat(50, is(not(40)));
    }
    @Test
    public void compareObjects(){}
}