package functionalprogramming.parallelstreams;

import functionalprogramming.implementingstreams.Book;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {

        ArrayList<functionalprogramming.implementingstreams.Book> books = populateLibrary();
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).forEach(System.out::println);

    }

    static ArrayList<functionalprogramming.implementingstreams.Book> populateLibrary(){

        ArrayList<functionalprogramming.implementingstreams.Book> books = new ArrayList<>();
        books.add(new functionalprogramming.implementingstreams.Book("Alice Walker", "The Color Purple"));
        books.add(new functionalprogramming.implementingstreams.Book("Alice Walker", "Meridian"));
        books.add(new functionalprogramming.implementingstreams.Book("Toni Morrison", "Beloved"));
        books.add(new functionalprogramming.implementingstreams.Book("Toni Morrison", "Jazz"));
        books.add(new functionalprogramming.implementingstreams.Book("Toni Morrison", "Paradise"));
        books.add(new functionalprogramming.implementingstreams.Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new functionalprogramming.implementingstreams.Book("John Steinbeck", "East of Eden"));
        books.add(new functionalprogramming.implementingstreams.Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new functionalprogramming.implementingstreams.Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new functionalprogramming.implementingstreams.Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new functionalprogramming.implementingstreams.Book("Jane Austen", "Pride and Prejudice"));
        books.add(new functionalprogramming.implementingstreams.Book("Jane Austen", "Emma"));
        books.add(new functionalprogramming.implementingstreams.Book("Jane Austen", "Persuasion"));
        books.add(new functionalprogramming.implementingstreams.Book("Jane Austen", "Mansfield Park"));
        books.add(new functionalprogramming.implementingstreams.Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new functionalprogramming.implementingstreams.Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));
        return books;
    }
}
