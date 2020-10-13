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

public class StudentTest{
    @Test
    public void testUsernameGeneration() {
        Student tester_1 = new Student();
        Student tester_2 = new Student("Mohamed Moustafa", 22, new DateTime(), 1728, new Course(), new ArrayList<Module>());
        // assert statements
        assertEquals("N/A", tester_1.getUsername(), "Username must be N/A");
        assertEquals("Mohamed Moustafa22", tester_2.getUsername(), "Username must be Mohamed Moustafa22");
    }
}