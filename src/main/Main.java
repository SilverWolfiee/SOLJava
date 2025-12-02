package main;

import java.util.*;

public class Main {

    private Scanner sc = new Scanner(System.in);
    private Student regulerstudent;
    private Student gueststudent;
    //avoid overuse of static functions
    public Main() {
        while (true) {
            clear();
            System.out.println("=== STUDENT CREATION MENU ===");
            System.out.println("1. Create Regular Student");
            System.out.println("2. Create Auditing (Guest) Student");
            System.out.println("3. Exit");
            System.out.print(">> ");

            try {
                int input = sc.nextInt();
                sc.nextLine(); 

                if (input == 1) {
                	clear();
                	if(regulerstudent!=null) {
                		System.out.println("Someone has occupied this seat");
                		pause();
                		continue;
                	}
                    regulerstudent = createRegularStudent();
                    pause();
                } 
                else if (input == 2) {
                	clear();
                	if(gueststudent!=null) {
                		System.out.println("Someone has occupied this seat");
                		pause();
                		continue;
                	}
                    gueststudent = createAuditingStudent();
                    pause();
                } 
                else if (input == 3) {
                    
                    break;
                } 
                else {
                    System.out.println("Invalid choice");
                    pause();
                }

            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextLine();
                pause();
            }
        }
        if(regulerstudent==null && gueststudent== null) {
        	System.out.println("No student, exiting program");
        	return;
        }
        Report printer = null;
        Reportgenerator generator = new Reportgenerator();
        while (printer == null) {
            clear();
            System.out.println("Choose report output format:");
            System.out.println("1. Console");
            System.out.println("2. Excel");
            System.out.print(">> ");

            try {
                int format = sc.nextInt();
                sc.nextLine();

                if (format == 1) {
                    printer = new Consolereport();
                } 
                else if (format == 2) {
                    printer = new Excelreport();
                } 
                else {
                    System.out.println("Invalid option");
                    pause();
                }

            } catch (Exception e) {
                System.out.println("Input error! Defaulting to console.");
                printer = new Consolereport();
            }
        }

        clear();
        if(regulerstudent!=null) {
        	generator.generateReport(regulerstudent, printer);
        }
        if(gueststudent!=null) {
        	generator.generateReport(gueststudent, printer);
        }
        System.out.println("\nReport generation finished.");
    }
    private Student createRegularStudent() {
        clear();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Number of grades: ");
        int count = sc.nextInt();
        sc.nextLine();

        double[] grades = new double[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }
        sc.nextLine();

        return new Regularstudent(name, grades);
    }

    private Student createAuditingStudent() {
        clear();
        System.out.print("Enter auditing student name: ");
        String name = sc.nextLine();
        return new Auditingstudent(name);
    }

    public void clear() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }

    public void pause() {
        System.out.println("Press ENTER to continue...");
        sc.nextLine();
    }

    public static void main(String[] args) {
        new Main();
    }
}
