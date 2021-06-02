package org.example.ex6;

public class App {
    public static void main(String[] args)
    {
        Age userAge = new Age();
        Age userRetirementAge = new Age();
        Year userYear = new Year();

        System.out.println("Enter your age:");
        Integer age = userAge.setAge();

        System.out.println("When would you like to retire?");
        Integer retirementAge = userRetirementAge.setAge();

        Integer currentYear = userYear.calculateYear();

        Integer yearsToRetire = (retirementAge - age);
        Integer retirementYear = (currentYear + retirementAge - age);

        System.out.println("You have " +yearsToRetire+ " years left before you can retire.");
        System.out.println("The year is " +currentYear+ ", you can retire in " + retirementYear);

    }
}
