//Classes
import com.nuig.assignment1.Module;
import com.nuig.assignment1.Course;
import com.nuig.assignment1.Student;
//Utils
import java.util.ArrayList;
//Dependencies
import org.joda.time.DateTime;
//JUnit
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CourseTest{
    @Test
    public void testCourseCreation() {
        Course tester = new Course("CS&IT", new ArrayList<Module>(), new ArrayList<Student>(), new DateTime(), new DateTime());
        // assert statements
        assertEquals("CS&IT", tester.getCourse_name(), "Course name must be CS&IT");
    }
}