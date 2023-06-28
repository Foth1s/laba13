package ru.javacore;

public class Tester {
    String name;
    String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    int experienceInYears;
    String englishLevel;
    double salary;

    public Tester(String name){
        setName(name);
        setEnglishLevel("A1");
        setSalary(100.2);
        setSurname("Surname");
        setExperienceInYears(20);
    }
    public Tester(String name, String surname){
        this(name);
        setSurname(surname);
        setExperienceInYears(10);
        setSalary(135.532);
        setEnglishLevel("B2");
    }
    public Tester(String name, String surname, double salary){
        this(name, surname);
        setSalary(salary);
        setEnglishLevel("B1");
        setExperienceInYears(3);
    }
    public Tester(String name, String surname, double salary, int experienceInYears){
        this(name, surname, salary);
        setExperienceInYears(experienceInYears);
        setEnglishLevel("A1");
    }

    public static void printTester(String name, String surname, double salary, int experienceInYears, String englishLevel){
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nSalary: " + salary + "\nExperience in years: "+
                experienceInYears + "\nEnglish level: " + englishLevel);
    }
}
