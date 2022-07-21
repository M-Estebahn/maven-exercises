public class Grader {

    public char letterGradeConversion(int numberGrade){
         if (numberGrade<0){
            throw new IllegalArgumentException("Number Grade Cannot be Less than Zero");
         }
         else if(numberGrade<60){
             return 'F';
         }else if(numberGrade<70){
             return 'D';
         }else if(numberGrade<80){
             return 'C';
         }else if(numberGrade<90){
             return 'B';
         }else {
             return 'A';
         }

    }

}
