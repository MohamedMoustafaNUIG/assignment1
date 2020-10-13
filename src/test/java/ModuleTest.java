//Classes
import com.nuig.assignment1.Module;
import com.nuig.assignment1.Course;
import com.nuig.assignment1.Student;
//Utils
import java.util.ArrayList;
//JUnit
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ModuleTest{
    @Test
    public void testModuleCreation() {
        Module tester = new Module("Software Engineering III", "CT417", new ArrayList<Student>(), new ArrayList<Course>());
        // assert statements
        assertEquals("Software Engineering III", tester.getModule_name(), "Module name should be Software Engineering III");
        assertEquals("CT417", tester.getId(), "Id must be CT417");
    }
}