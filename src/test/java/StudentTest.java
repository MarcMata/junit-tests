import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class StudentTest {

    //tests to test CRUD Functionality
    @Test
    public void testCreateStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("John");
        student.setGrades(new ArrayList<>());

        //tests getID
        assertEquals(1, student.getId());
        //tests getName
        assertEquals("John", student.getName());
        //tests getGrades.size
        assertEquals(0, student.getGrades().size());
    }

    @Test
    public void testAddGrades(){
        Student student = new Student();
        student.setId(1);
        student.setName("John");
        student.setGrades(new ArrayList<>());
        student.getGrades().add(100);
        student.getGrades().add(80);
        student.getGrades().add(90);

        //tests getGrades.size
        assertEquals(3, student.getGrades().size());
        //tests getGrades.get(0)
        assertEquals(100, (int) student.getGrades().get(0));
        //tests getGrades.get(1)
        assertEquals(80, (int) student.getGrades().get(1));
        //tests getGrades.get(2)
        assertEquals(90, (int) student.getGrades().get(2));
    }

    @Test
    public void testGetGradeAverage(){
        Student student = new Student();
        student.setId(1);
        student.setName("John");
        student.setGrades(new ArrayList<>());
        student.getGrades().add(100);
        student.getGrades().add(80);
        student.getGrades().add(90);

        //tests getGradeAverage
        assertEquals(90, student.getGradeAverage(), 0.01);
    }

    //test get grades
    @Test
    public void testGetGrades(){
        Student student = new Student();
        student.setId(1);
        student.setName("John");
        student.setGrades(new ArrayList<>());
        student.getGrades().add(100);
        student.getGrades().add(80);
        student.getGrades().add(90);

        //tests getGrades
        assertEquals(3, student.getGrades().size());
    }

    //test for updateGrade
    @Test
    public void testUpdateGrade(){
        Student student = new Student();
        student.setId(1);
        student.setName("John");
        student.setGrades(new ArrayList<>());
        student.getGrades().add(100);
        student.getGrades().add(80);
        student.getGrades().add(90);
        student.getGrades().set(0, 95);

        //tests getGrades.get(0)
        assertEquals(95, (int) student.getGrades().get(0));
    }

    //test for deleteGrade
    @Test
    public void testDeleteGrade(){
        Student student = new Student();
        student.setId(1);
        student.setName("John");
        student.setGrades(new ArrayList<>());
        student.getGrades().add(100);
        student.getGrades().add(80);
        student.getGrades().add(90);
        student.getGrades().remove(0);

        //tests getGrades.size
        assertEquals(2, student.getGrades().size());
    }





}
