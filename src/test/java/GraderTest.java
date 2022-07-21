import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
//    testing multiple tests not combining one test (best practices)
    @Test
    void hundredShouldReturnA(){
        Grader grader= new Grader();
        char grade= grader.letterGradeConversion(100);
        assertEquals('A',grade);
    }

    @Test
    void eightyFiveShouldReturnB(){
        Grader grader= new Grader();
        char grade= grader.letterGradeConversion(85);
        assertEquals('B',grade);
    }

    @Test
    void seventyNineShouldReturnC(){
        Grader grader= new Grader();
        char grade= grader.letterGradeConversion(79);
        assertEquals('C',grade);
    }

    @Test
    void sixtySevenShouldReturnD(){
        Grader grader= new Grader();
        char grade= grader.letterGradeConversion(67);
        assertEquals('D',grade);
    }

    @Test
    void fiftyEightShouldReturnF(){
        Grader grader= new Grader();
        char grade= grader.letterGradeConversion(58);
        assertEquals('F',grade);
    }
    @Test
    void lessThanZeroShouldReturnIAE(){
        Grader grader= new Grader();
        assertThrows(IllegalArgumentException.class,() ->{grader.letterGradeConversion(-4);});

    }


}