//Classes
import com.nuig.firstmavenproject.Module;
import com.nuig.firstmavenproject.Course;
import com.nuig.firstmavenproject.Student;
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