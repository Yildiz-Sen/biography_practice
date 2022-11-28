import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        ArrayList<Author> authors = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println(Author.askFirstName);
        String firstName = input.nextLine();

        System.out.println(Author.askLastName);
        String lastName = input.nextLine();

        System.out.println(Author.askCountry);
        String country = input.nextLine();

        System.out.println(Author.askAlive);
        boolean isAlive = input.next().toUpperCase().startsWith("Y");

        int age = 0;
        if(isAlive){
            System.out.println(Author.askAge);
            age = input.nextInt();

        }

        ArrayList<Book> books = new ArrayList<>();
        String answer;
        do {
            System.out.println(Book.askFavoriteBook); // if yes then ask; if no then end.
            answer = input.next();

            if (answer.toUpperCase().startsWith("N")) break;
            else if (answer.toUpperCase().startsWith("Y")){
                System.out.println(Book.askBookName);
                input.nextLine();
                String name = input.nextLine();

                System.out.println(Book.askGenre);
                String genre = input.next();

                System.out.println(Book.askPages);
                int totalPage = input.nextInt();

                Book book = new Book(name, genre, totalPage);
                books.add(book);
            }
        } while (answer.toUpperCase().startsWith("Y"));


        Author author = new Author(firstName, lastName, country, isAlive, age, books);
        authors.add(author);
        System.out.println(author);
        System.out.println(books);




        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

            //YOUR CODE HERE


    }
}
