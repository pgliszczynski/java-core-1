package task3;

public class IdentityChanger {
    public void changeIdentity(Person p1, Person p2) {
        Person tempPerson = new Person(p1.getName(), p1.getAge());

        p1.setValues(p2);
        p2.setValues(tempPerson);
    }
}
