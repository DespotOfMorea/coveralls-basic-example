import vnuk.App;
import org.testng.annotations.*;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
     @DataProvider(name="getValuesForAddFive")
    public Object[][] createConcatenationAssertionSetForAddFive(){
        return new Object[][]{
                new Object []{12, 17},
                new Object []{2, 7},
                new Object []{5, 10},          
        };
    }

    @Test (dataProvider="getValuesForAddFive")
    public void testAddFive(int num1, int num2)
    {
        Assert.assertEquals(App.addFive(num1),num2);
    }

    @DataProvider(name="getValuesForAddSeven")
    public Object[][] createConcatenationAssertionSetForAddSeven(){
        return new Object[][]{
                new Object []{12, 19},
                new Object []{2, 9},
                new Object []{5, 12},
        };
    }

    @Test (dataProvider="getValuesForAddSeven")
    public void testAddSeven(int num1, int num2)
    {
        Assert.assertEquals(App.addSeven(num1),num2);
    }
}
