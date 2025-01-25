package oop.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Step 1: Declare and initialize an array of grades
        int[] grades = {85, 90, 78, 92, 88};

        // Step 2: Display the grades
        System.out.println("Student Grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }

        // Step 3: Calculate and display the average grade
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.println("\nAverage Grade: " + average);

        // Step 4: Find and display the highest and lowest grades
        int highest = grades[0];
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        // Step 5: Update a grade (e.g., correcting Student 3's grade)
        grades[2] = 80; // Correcting Student 3's grade
        System.out.println("\nUpdated Grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }
    }
}