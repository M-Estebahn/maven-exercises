import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void hundredShouldReturnA(){
        Grader grader= new Grader();
        char grade= grader.letterGradeConversion(100);


        assertEquals('A',grade);
    }


}