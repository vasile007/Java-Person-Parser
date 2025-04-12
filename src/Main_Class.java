public class Main_Class {


    /*
     * The main method that parses a string of person information, creates Person objects,
     * and displays the details to the console.
     */
    public static void main(String[] args) {


        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";


        String[] personsText = text.split(" ");
        Person[] persons = new Person[personsText.length];

        for (int i = 0; i < persons.length; i++) {
            String[] partsSlash = personsText[i].split("/");
            String[] partsName=partsSlash[0].split("\\.");
            String First_Name= partsName[0];
            String Last_Name= partsName[1];
            String Place_of_Birth = partsSlash[1];

            persons[i] = new Person(First_Name, Last_Name, Place_of_Birth);
        }
      for (Person person : persons){
          System.out.println(person); // This calls the toString() method
      }
    }

}