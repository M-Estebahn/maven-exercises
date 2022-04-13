import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter something:");
        String userInput=sc.nextLine();
        System.out.print("you Entered:");
        System.out.println(userInput);

        System.out.println(StringUtils.swapCase(userInput));


//        if (StringUtils.isNumeric(userInput)){
//            System.out.println("That is a number");
//        }else{
//            System.out.println("That is not a number");
//        }





    }
}
