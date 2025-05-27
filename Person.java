import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayPersonName() {
        System.out.println("Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter;
        if (dob.contains("-") && dob.indexOf('-') == 4) {
            formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        } else {
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        }

        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person("Meghana");
        p.displayPersonName();
        p.displayAge("2003-05-10");
    }
}