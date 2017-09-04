package pl.sda.poznan.Phone2;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Slf4j
public class Phone {
    private String myNumber;
    private List<Contact> contacts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void phoneOptions() {
        log.info("Starting phoneOptions");
        int n = 0;
        while (n != 1) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyjdź z programu");
            System.out.println("2. Wydrukuj kontakty");
            System.out.println("3. Dodaj nowy kontakt");
            System.out.println("4. Zaktualizuj numer");
            System.out.println("5. Usun numer");
            System.out.println("6. Wyszukaj numer");
            System.out.println("7. Zaktualizuj kontakt");
            n = sc.nextInt();

            switch (n) {
                //Quit
                case 1:
                    break;
                case 2:
                    printAllContacts();
                    break;
                case 3:
                    System.out.println("Podaj imie");
                    String name = sc.next();
                    System.out.println("Podaj numer");
                    String number = sc.next();
                    Contact contact = new Contact(name, number);
                    addNumber(contact);
                    break;
                case 4:
                    System.out.println("Podaj imie");
                    String nameU = sc.next();
                    System.out.println("Podaj numer");
                    String numberU = sc.next();
                    updateNumber(nameU, numberU);
                    break;
                case 5:
                    System.out.println("Podaj imie kontaktu");
                    String nameToRemoveContact = sc.next();
                    deleteNumber(nameToRemoveContact);
                    break;
                case 6:
                    System.out.println("Podaj imie");
                    String nameIF = sc.next();
                    doesExist(nameIF);
                    break;
                case 7:
                    System.out.println("Podaj imie starego kontaktu");
                    String nameO = sc.next();
                    for (Contact e : contacts) {
                        if ((e.getName()).equals(nameO)) {
                            System.out.println("Podaj imie");
                            String nameK = sc.next();
                            System.out.println("Podaj numer");
                            String numberK = sc.next();
                            Contact contactNowy = new Contact(nameK, numberK);
                            updateContact(e, contactNowy);
                        }
                    }
            }
        }
    }

    public void printAllContacts() {
        for (Contact c : contacts) {
            System.out.println(c.getName() + " - " + c.getPhoneNumber());
        }
    }

    public boolean addNumber(Contact contact) {
    /*    if(contacts.indexOf(contact) >= 0){
            log.info("Contact already exist");
            return false;
        }*/
        if (!doesExist(contact.getName())) {
            try {
                contacts.add(contact);
            } catch (Exception e) {
                log.info("Couldn't delet contact");
                System.out.println(e);
            }
        }
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (doesExist(oldContact.getName())) {
            contacts.remove(oldContact);
            contacts.add(newContact);

            return true;
        } else {
            log.info("Nie udało sie znaleźć podanego kontaktu");
            return false;
        }
    }

    public void updateNumber(String name, String phoneNumber) {
        for (Contact e : contacts) {
            if ((e.getName()).equals(name)) {
                e.setPhoneNumber(phoneNumber);
                log.info("Contact Added");
                System.out.println("Zmieniono numer");
            } else {
                log.info("Couldn't update contact");
            }

        }
    }

    public boolean deleteNumber(String name) {
        boolean result = false;
        Contact contactToDelete = null;
        for (Contact e : contacts) {
            if ((e.getName()).equals(name)) {
                contactToDelete = e;
                log.info("Contact deleted");
                result = true;
                break;
            } else {
                log.info("Couldn't delete contact");
                result = false;
            }
        }
        contacts.remove(contactToDelete);
        return result;
    }

    public boolean doesExist(String name) {
        boolean result = false;
        for (Contact e : contacts) {
            if ((e.getName()).equals(name)) {
                System.out.println("Kontakt istnieje " + name + " -> " + e.getPhoneNumber());
                result = true;
            } else {
                log.info("Contact already exist");
                result = false;
            }
        }
        return result;
    }
}
