import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        
        int[] grades = new int[numSubjects];

        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double averageGrade = sum / numSubjects;

      
        System.out.println("Average percentage: " + averageGrade);
        
        if(averageGrade > 95 && averageGrade < 100){
            System.out.println("Grade : A+");
        }
        if(averageGrade > 90 && averageGrade < 95){
            System.out.println("Grade : A-");
        }
        if(averageGrade > 80 && averageGrade < 90){
            System.out.println("Grade : A");
        }
        if(averageGrade > 70 && averageGrade < 80){
            System.out.println("Grade : B+");
        }if(averageGrade > 65 && averageGrade < 75){
            System.out.println("Grade : B");
        }if(averageGrade > 55 && averageGrade < 65){
            System.out.println("Grade : C");
        }if(averageGrade > 33 && averageGrade < 55){
            System.out.println("Grade : D");
        }
        

        scanner.close();
    }
}
