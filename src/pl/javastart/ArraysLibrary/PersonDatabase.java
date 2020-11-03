package pl.javastart.ArraysLibrary;

import java.util.Arrays;

public class PersonDatabase {

    private Person[] personArr = new Person[1];
    private int currentPerson = 0;

    public void add(Person p){
        try{
            if(currentPerson+1 > personArr.length){
                personArr = Arrays.copyOf(personArr, personArr.length*2);
            }
            personArr[currentPerson] = p;
            currentPerson++;
        }catch(NullPointerException e){
            System.out.println("Person can't be null!");
        }
    }

    void remove(Person person) {
        if (person == null)
            throw new NullPointerException("person cannot be null");
        final int notFound = -1;
        int foundIndex = notFound;
        for (int i = 0; i < currentPerson && foundIndex == notFound; i++) {
            if (person.equals(personArr[i])) {
                foundIndex = i;
            }
        }
        if (foundIndex != notFound) {
            System.arraycopy(personArr, foundIndex + 1, personArr, foundIndex, personArr.length - foundIndex - 1);
            currentPerson--;
            personArr[currentPerson] = null;
        }
    }

    public Person get(int index){
        if(index > 0 && index < currentPerson){
            return personArr[index];
        }else{
            throw new ArrayIndexOutOfBoundsException("Index needs to be between 0 and " + currentPerson);
        }
    }

    public int size(){
        return currentPerson;
    }

    public void print(){
        for (int i = 0; i < currentPerson; i++) {
            if(personArr[i] == null){
                continue;
            }
            System.out.println(personArr[i]);
        }
    }
}
