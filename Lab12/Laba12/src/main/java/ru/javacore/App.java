package ru.javacore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, Данила!" );
        Tester tester = new Tester("Danila", "Mironchik");
        new PrinterClass(tester.getName(), tester.getSurname(), tester.getSalary(), tester.getExperienceInYears(), tester.getEnglishLevel());
    }
}
