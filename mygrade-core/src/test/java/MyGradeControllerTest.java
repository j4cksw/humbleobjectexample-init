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

    @Test
    public void onSubmit_score_greater_than_89_should_show_grade_A(){
        GradeDisplay mockedDisplay = Mockito.mock(GradeDisplay.class);
        Mockito.when(mockedDisplay.getScore()).thenReturn(90);

        MyGradeController controller = new MyGradeController(mockedDisplay);

        controller.onSubmit();

        Mockito.verify(mockedDisplay).setGrade("A");
    }

    @Test
    public void onSubmit_score_lower_than_90_should_show_grade_F(){
        GradeDisplay mockedDisplay = Mockito.mock(GradeDisplay.class);
        Mockito.when(mockedDisplay.getScore()).thenReturn(0);

        MyGradeController controller = new MyGradeController(mockedDisplay);

        controller.onSubmit();

        Mockito.verify(mockedDisplay).setGrade("F");
    }
}
