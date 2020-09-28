package pl.javastart.Enkapsulacja_Ex1.Logic;

public class LastNameLogic {
    private String firstName, lastName;

    public LastNameLogic() {
    }

    public LastNameLogic(String firstName) {
        this.firstName = firstName;
    }

    public LastNameLogic(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void print(LastNameLogic l)
    {
        if(l.getFirstName() == null && l.getLastName() == null)
        {
            System.out.println("Witaj nieznajomy");
        }
        else if(l.getFirstName() == null)
        {
            System.out.println("Witaj Panie " + l.getLastName());
        }
        else if(l.getLastName() == null)
        {
            System.out.println("Cześć " + l.getFirstName());
        }
        else
            System.out.println("Witam " + l.getFirstName() + " " + l.getLastName());
    }
}
