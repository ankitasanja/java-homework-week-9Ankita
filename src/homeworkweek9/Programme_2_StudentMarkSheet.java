package homeworkweek9;

import java.util.Scanner;

public class Programme_2_StudentMarkSheet {


    public static void main(String[] args) {

        //scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.next();
        System.out.println("Enter Student Roll no: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter Marks of subject Maths: ");
        int mathsMarks = sc.nextInt();
        boolean mathsResult = true;
        while (mathsResult) {
            if (mathsMarks < 0 || mathsMarks > 100) {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.println("Please enter correct marks: ");
                mathsMarks = sc.nextInt();

            } else {
                mathsResult = false;
            }
        }

        System.out.println("Enter Marks of subject English: ");
        int englishMarks = sc.nextInt();
        boolean englishResult = true;
        while (englishResult) {
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.println("Please enter correct marks: ");
                englishMarks = sc.nextInt();
            } else {
                englishResult = false;
            }

        }

        System.out.println("Enter Marks of subject Science: ");
        int scienceMarks = sc.nextInt();
        boolean scienceResult = true;
        while (scienceResult) {
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.println("Please enter correct marks: ");
                scienceMarks = sc.nextInt();
            } else {
                scienceResult = false;
            }
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNo, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        sc.close();
    }

    //Calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int englishMarks, int scienceMarks) {
        if (mathsMarks < 35 || englishMarks < 35 || scienceMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "-";
            }
        }
        return grade;
    }

    //Printing the Mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMark, int scienceMarks, int englishMarks,
                                         double total, double percentage, String result, String grade) {

        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|-------------------------- |");
        System.out.println("| Name:" + name + "               |");
        System.out.println("| Roll No:" + rollNum + "             |");
        System.out.println("|---------------------------|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("| Science:" + scienceMarks + "            |");
        System.out.println("| English:" + englishMarks + "            |");
        System.out.println("|---------------------------|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|---------------------------|");
        System.out.println("| Percentage:" + percentage + "         |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                   |");
        System.out.println("|---------------------------|");
    }
}
