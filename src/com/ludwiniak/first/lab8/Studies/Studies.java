package com.ludwiniak.first.lab8.Studies;

import com.ludwiniak.first.lab8.Studies.Strategies.OperationalStrategy;
import com.ludwiniak.first.lab8.Studies.Utils.ConsoleReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Studies {
    private final ArrayList<Person> persons = new ArrayList<>();

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public void printAllPersons() {
        for(Person person : persons) {
            System.out.println(person);
        }
    }

    public void findPersonsBySurname(String surname) {
        for(Person person : persons) {
            if(person.getSurname().equals(surname)) {
                System.out.println(person);
            }
        }
    }

    public void getStudentByIndex(int index) {
        for(Person person : persons) {
            if(person instanceof Student && ((Student) person).getIndex() == index) {
                System.out.println(person);
            }
        }
    }

    public void getDidacticWorkerByAchievements(int achievements) {
        for(Person person : persons) {
            if(person instanceof DidacticWorker && ((DidacticWorker) person).getAchievements() >= achievements) {
                System.out.println(person);
            }
        }
    }

    public void getUniversityWorkerByDuty(String  duty) {
        for(Person person : persons) {
            if(person instanceof UniversityWorker && ((UniversityWorker) person).getDuty().equals(duty)) {
                System.out.println(person);
            }
        }
    }

    public void getNewPerson() {
        int type = ConsoleReader.getInt("Wybierz typ osoby:\n1-Student\n2-Profesor\n3-Administacja");
        Person newPerson = null;
        switch (type) {
            case 1 : {
                newPerson = new Student();
            }
            break;
            case 2 : {
                newPerson = new DidacticWorker();
            }
            break;

            case 3 : {
                newPerson = new UniversityWorker();
            }
            break;

            default: {
                System.out.println("Numer poza zakresem");
            }
        }

        if(newPerson == null) {
            getNewPerson();
            return;
        }

        getFromUser(newPerson);
        addPerson(newPerson);
    }

    private void getFromUser(OperationalStrategy operationalStrategy) {
        operationalStrategy.getDataFromConsole();
    }

    public void writeToFile() throws IOException {
        FileOutputStream fout = new FileOutputStream("./studies.db");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(persons);
        fout.close();
        oos.close();
    }

    public void readFile() throws IOException, ClassNotFoundException {
        if(Files.exists(Paths.get("./studies.db"))) {
            FileInputStream fin = new FileInputStream("./studies.db");
            ObjectInputStream ois = new ObjectInputStream(fin);
            List<Person> savedPersons = (List<Person>) ois.readObject();
            persons.addAll(savedPersons);
        }
    }

    public Studies() throws IOException, ClassNotFoundException {
            readFile();
    }
}
