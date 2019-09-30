package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Member {

    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty PN;
    private final SimpleIntegerProperty ID;


   public Member(String fName, String lName, String PN, Integer UserID) {
        this.firstName = new SimpleStringProperty(fName);
        this.lastName = new SimpleStringProperty(lName);
        this.PN = new SimpleStringProperty(PN);
        this.ID =new SimpleIntegerProperty(UserID);

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

    public Integer getID() {
        return ID.get();
    }

    public void setID(Integer userID) {
        ID.set(userID);
    }
}