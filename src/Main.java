import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter a year. \nAnswer: ");
        boolean leapYear = false;
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100== 0) {
                if (
                    year % 400==0
                ) {
                    leapYear = true;
                }else{
                    leapYear = false;
                } ;

            } else {
                leapYear = true;
            }

        } else {
            leapYear = false;
        }

        if (leapYear){
            System.out.println("The year is a leap year. \n Entered year :  " + year);

        } else{
            System.out.println("Entered year is not a leap year. \n Entered yar : " + year);
        }

    }

}     