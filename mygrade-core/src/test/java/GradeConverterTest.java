import com.example.GradeConverter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GradeConverterTest {

    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void fromScore_given_90_shouldReturn_A() {
        Assert.assertEquals(converter.fromScore(90), "A");
    }

    @Test
    public void fromScore_given_0_shouldReturn_F() {

        Assert.assertEquals(converter.fromScore(0), "F");
    }

    @Test
    public void fromScore_given_50_shouldReturn_D() {
        Assert.assertEquals(converter.fromScore(50), "D");
    }
}
