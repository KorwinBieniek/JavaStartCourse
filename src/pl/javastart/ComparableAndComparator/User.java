package pl.javastart.ComparableAndComparator;

import java.util.Comparator;

public class User implements Comparable<User>{
    private final String firstName;
    private final String lastName;
    private final int salary;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public User(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "first name: " + firstName + ", last name: " + lastName + ", salary: " + salary;
    }


    @Override
    public int compareTo(User o) {
        int lastNameComparison = lastName.compareTo(o.lastName);
            if(lastNameComparison > 0)
                return lastNameComparison;
            else if(lastNameComparison < 0){
                return -lastNameComparison;
            }
            else{
                return firstName.compareTo(o.firstName);
            }
    }

    public static class UserNameComparator implements Comparator<User> {
        @Override
        public int compare(User p1, User p2) {
            return p1.getLastName().compareTo(p2.getLastName());
        }
    }
}
