package controller;

import java.util.ArrayList;
import model.Person;

public class PhonebookController {

    private ArrayList<Person> personlist;

    public PhonebookController() {
        this.personlist = new ArrayList<Person>();

    }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> PersonList) {
        this.personlist = PersonList;
    }

    public void addContact(Person p) {
        personlist.add(p);
    }

    public void removeContact(Person p) {
        for (Person d : personlist) {
            if (d.equals(p)) {
                personlist.remove(p);
                break;

            }
        }
    }

    public void updateConptact(Person oldPerson, Person newPerson) {
        for (Person p : personlist) {
            if (p.equals(oldPerson)) {
                oldPerson.setName(newPerson.getName());
                oldPerson.setAge(newPerson.getAge());
                oldPerson.setGender(newPerson.getGender());
                oldPerson.setPhoneNumber(newPerson.getPhoneNumber());
                break;
            }
        }
    }
    private Person foundPerson;

    public Person search(String searchKey) {
        searchKey = searchKey.trim().toLowerCase();
        foundPerson = null;
        for (Person p : personlist) {
            if (p.getName().trim().toLowerCase().contains(searchKey)) {
                foundPerson = p;
                break;
            }
        }

        return foundPerson;

    }

}
