package pl.javastart.Obj_Ex1;

public class Company {
    public static void main(String[] args) {
        Employee kowalski = new Employee("Jan","Kowalski","18.01.1999",5);
        Employee nowak = new Employee("Julia","Nowak","13.01.1111",2);
        Employee loki = new Employee("Korwin","Bieniek","18.01.5531",15);
        Employee alki = new Employee("Dawid","Dadalski","08.01.1242",7);

        System.out.println(kowalski.toString());
        System.out.println(nowak.toString());
        System.out.println(loki.toString());
        System.out.println(alki.toString());
    }
}
