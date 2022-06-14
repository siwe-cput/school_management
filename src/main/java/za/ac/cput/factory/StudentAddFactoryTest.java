package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StudentAddress;
import static org.junit.jupiter.api.Assertions.*;


class StudentAddFactoryTest {
  @Test

    public void test(){
      StudentAddress studentAddress = StudentAddFactory.createStudentAddress();
      assertNotNull(studentAddress);
  }

}