package pl.javastart.Iterators;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String, Student> students = new TreeMap<>();
        Student stud1 = new Student("Korwin", "Bieniek", 21);
        Student stud2 = new Student("Julia", "Saferna", 13);
        Student stud3 = new Student("Anna", "Aniol", 17);
        Student stud4 = new Student("Przemyslaw", "Kula", 18);
        Student stud5 = new Student("Guacio", "Ronaldinho", 36);


        students.put(stud1.getLastName(), stud1);
        students.put(stud2.getLastName(), stud2);
        students.put(stud3.getLastName(), stud3);
        students.put(stud4.getLastName(), stud4);
        students.put(stud5.getLastName(), stud5);

        Collection<Student> values = students.values();
        Iterator<Student> iterator = values.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
