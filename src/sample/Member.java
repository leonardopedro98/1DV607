package sample;

import javafx.beans.property.SimpleStringProperty;

public class Member {

    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty PN;


   public Member(String fName, String lName, String PN, Integer UserID) {
        this.firstName = new SimpleStringProperty(fName);
        this.lastName = new SimpleStringProperty(lName);
        this.PN = new SimpleStringProperty(PN);


    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lName) {
        lastName.set(lName);
    }

    public String getPN() {
        return PN.get();
    }

    public void setPN(String PersonalN) {
        PN.set(PersonalN);
    }
}