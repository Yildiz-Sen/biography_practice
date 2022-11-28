import java.util.ArrayList;
import java.util.List;

public class Author {



    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE

    public Author(List<Book> books, String firstName, String lastName, String country, boolean isAlive, int age) {
        this.books = books;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    public List<Book> books = new ArrayList<>();
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;

    public Author(String firstName, String lastName, String country, boolean isAlive, int age, ArrayList<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
    }

    public Author(String firstName, String lastName, String country, boolean isAlive, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
    }

    /*
        Override toString() method here that returns Author object information
         */
    //YOUR CODE HERE
    @Override
    public String toString() {
        StringBuilder result;
        if (this.age == 0) {
            result = new StringBuilder("Author's information = Author{firstName='" +
                    firstName + "', lastName='" + lastName + "', country='" +
                    country + "', isAlive=" + isAlive + "}");
        } else {
            result = new StringBuilder("\nAuthor's information = Author{firstName='" +
                    firstName + "', lastName='" + lastName + "', country='" +
                    country + "', isAlive=" + isAlive + ", age=" + age + "}");
        }
        if (books.isEmpty()) return result.toString();
        else {
            result.append("\nAuthor's books are as listed below:");
            for (Book book : books) {
                result.append("\n" + book);
            }
        }
        return result.toString();
    }
        /*
        First, program will ask user to enter their favorite author’s information as
below
What is your favorite author’s first name?
What is your favorite author’s last name?
Where is your favorite author from?
Is your favorite author alive? Y/N
If user enters Y, then ask How old is your favorite author? If, user enters N,
then skip this question.
Then, program will ask about user’s favorite author’s books.
First ask, if they want to enter book information with below question
Would you like enter book information? (Y/N)
If answer is Y, then ask below questions about the book
What is the book name?
What is genre of the book?
How many pages does book have?
         */


    public static final String askFirstName = "What is your favorite author’s first name?";
    public static final String askLastName = "What is your favorite author’s last name?";
    public static final String askCountry = "Where is your favorite author from?";
    public static final String askAlive = "Is your favorite author alive? Y/N";
    public static final String askAge = "How old is your favorite author?";


}
