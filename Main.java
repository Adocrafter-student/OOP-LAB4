// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import people.Person;
import people.Student;
import people.Teacher;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Hamza", "Buca potok 32");
        System.out.println(p1);

        Student ado = new Student("Adnan D", "Negdje 255");
        int num = ado.getCredits();
        ado.study();
        System.out.println("ado ima score: " + ado.getCredits());
        Teacher murga = new Teacher("Muradif Kupusovic", "Zabrdska 234", 850);
        System.out.println(murga);

        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
        System.out.println("----------------------------------------------");
        Department(people);

    }
    public static void Department(List<Person> people) {
        for(Person p: people) {
            System.out.println(p);
        }

    }
}