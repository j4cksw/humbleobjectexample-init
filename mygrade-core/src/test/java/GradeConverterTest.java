import com.example.GradeConverter;

import org.junit.Assert;
import org.junit.Test;

public class GradeConverterTest {

    @Test
    public void fromScore_given_90_shouldReturn_A() {
        GradeConverter converter = new GradeConverter();

        Assert.assertEquals(converter.fromScore(90), "A");
    }

    @Test
    public void fromScore_given_0_shouldReturn_F() {
        GradeConverter converter = new GradeConverter();

        Assert.assertEquals(converter.fromScore(0), "F");
    }

    @Test
    public void fromScore_given_50_shouldReturn_D() {
        GradeConverter converter = new GradeConverter();

        Assert.assertEquals(converter.fromScore(50), "D");
    }
}
