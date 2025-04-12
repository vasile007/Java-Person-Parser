/**
 * The Person class represents a person with a first name, last name, and place of birth.
 */



public class Person {

    String First_Name;
    String Last_Name;
    String Place_of_Birth;


    public Person(){

    }

 /**
 * Constructs a new Person object with the specified details.
 *
 */

    public Person(String First_Name, String Last_Name, String Place_of_Birth) {
        this.First_Name=First_Name;
        this.Last_Name=Last_Name;
        this.Place_of_Birth=Place_of_Birth;
    }

    // Getters for firstName, lastName, and placeOfBirth
    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getPlace_of_Birth() {
        return Place_of_Birth;
    }

    public void setPlace_of_Birth(String place_of_Birth) {
        Place_of_Birth = place_of_Birth;
    }

    //To string method to display the person details
    @Override
    public String toString() {
        return First_Name + " " +
                 Last_Name + " " +
                " from "+
                 Place_of_Birth;

    }
}


