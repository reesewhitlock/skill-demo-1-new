import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void divisionTest() {
        SkillDemo skillDemo = new SkillDemo();
        assertEquals(2, skillDemo.division(4, 2));
    }
}
