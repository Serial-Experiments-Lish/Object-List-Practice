import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tVShows = new ArrayList<>();

        while (true) {
            System.out.println("Enter shows with name, amount of episodes, and genre.  Pressing enter without text will break the loop.");
            System.out.println("Name of the show:");
            String inputShow = scanner.nextLine();

            if(inputShow.equals("")) {
                break;
            }

            System.out.println("How many episodes?");
            int inputEpsodes = scanner.nextInt();
            System.out.println("What is the genre?");
            String inputGenre = scanner.nextLine();

            TvShow data = new TvShow(inputShow, inputEpsodes, inputGenre);
            tVShows.add(data);
        }

        for (TvShow show : tVShows) {
            System.out.println(tVShows);
        }
    }
}