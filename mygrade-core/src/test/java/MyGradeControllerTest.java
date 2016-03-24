import com.example.GradeDisplay;
import com.example.MyGradeController;

import org.junit.Test;
import org.mockito.Mockito;

public class MyGradeControllerTest {

    @Test
    public void onSubmit_should_call_getScore_from_activity(){
        GradeDisplay mockedDisplay = Mockito.mock(GradeDisplay.class);
        MyGradeController controller = new MyGradeController(mockedDisplay);

        controller.onSubmit();

        Mockito.verify(mockedDisplay).getScore();
    }
}
