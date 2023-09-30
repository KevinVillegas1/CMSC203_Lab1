import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Movie m = new Movie();
		String title,rating;
		int tickets;
		System.out.println("Enter the name of a movie:");
		title = input.nextLine();
		m.setTitle(title);
		System.out.println("Enter the rating of the movie:");
		rating = input.nextLine();
		m.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie:");
		tickets = input.nextInt();
		m.setSoldTickets(tickets);
		System.out.println("Goodbye");
	}
}