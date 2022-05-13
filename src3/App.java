import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();

        Book book1 = new Book("Hamlet", 135, 1603);
        Book book2 = new Book("Othello", 125, 1622);
        Book book3 = new Book("Macbeth", 192, 1623);
        book.add(book1);
        book.add(book2);
        book.add(book3);

        while (true) {
            System.out.println("Enter a book title, its number of pages, and the year it was published.");
            System.out.println("Pressing enter without entering a title will stop the loop.");
            System.out.println("Book Title:");
            String inputTitle = scanner.nextLine();
            
            if (inputTitle.equals("")) {
                break;
            }
            System.out.println("Number of pages:");
            int inputPages = scanner.nextInt();
            System.out.println("Year published:");
            int inputYear = scanner.nextInt();

            Book info = new Book(inputTitle, inputPages, inputYear);
            book.add(info);
        }
        System.out.println("Enter 'title' to print only the Book Title or 'everything' to print all information.");
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();

        for (int i = 0; i < book.size(); i++) {
            if (answer.equalsIgnoreCase("everything")) {
                System.out.println(book.get(i).toString());
            } else if (answer.equalsIgnoreCase("title")) {
                System.out.println(book.get(i).getBookTitle());
            }
        }
    }
}