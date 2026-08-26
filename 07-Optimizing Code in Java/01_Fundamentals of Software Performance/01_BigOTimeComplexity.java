package 07-Optimizing Code in Java.01_Fundamentals of Software Performance;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        
        // Edit numberOfContacts to see how it affects execution time 
        int numberOfContacts = 1000;
        for (int i = 0; i < numberOfContacts; i++) {
            manager.addContact(new Contact("Contact_" + i));
        }
        Contact result = manager.findContact("Contact_" + (numberOfContacts - 1));
        System.out.println("Found: " + result.getName());
    }
}

class ContactManager {
    private ArrayList<Contact> contacts;
    
    public ContactManager() {
        contacts = new ArrayList<>();
    }
    
    public void addContact(Contact contact) {
        contacts.add(contact);
    }
    
    public Contact findContact(String name) {
        // Complete loop to search through contacts
        for (Contact contact: contacts) {
            if (contact.getName().equals(name)) {
                // Return the match
                return contact;
            }
        }
        return null;
    }
}
