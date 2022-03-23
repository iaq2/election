//Ittehad Qabid Java - Election Day

import java.util.Scanner;

public class Election {
	public static void main(String[] args) {
		int votesForPolly;								// The Number of Votes for Polly in each Precinct
		int votesForErnest;								// The Number of Votes for Ernest in each Precinct
		int totalPolly;									// The Running Total Number of Votes for Polly
		int totalErnest;								// The Running Total Number of Votes for Ernest
		String response;								// Answer (y or n) to the "more precincts" question
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Election Day Vote Counting Program");		// Prints the Title Election Day Vote Counting Program
		System.out.println();
		
		totalPolly = 0;									// Initializing All Variables 
		totalErnest = 0;
		int WonByPolly = 0;
		int WonByErnest = 0;
		int tie = 0;
		
		while (true) {									// While Loop to Process the Votes in Each Precinct
			
			System.out.println("Votes for Polly: ");	// Asks the User for the Number of Polly's Votes
			votesForPolly = scan.nextInt();
			totalPolly += votesForPolly;
			
			System.out.println("Votes for Ernest: ");	// Asks the User for the Number of Ernest's Votes
			votesForErnest = scan.nextInt();
			totalErnest += votesForErnest;
			
			if (votesForPolly > votesForErnest); {		// Calculates the Total Number of Votes Won by Polly and Ernest
				WonByPolly++;
			}
			if (votesForErnest > votesForPolly)
				WonByErnest++;
			
			if (votesForPolly == votesForErnest)		// ..Unless it is a Total Number of Votes Tie
				tie++;
			
			System.out.println("\nMore Precincts? ");	// Prompts the User to Enter a Character (Y or y) or (N or n)
			response = scan.next();
			System.out.println();
			
			if (response.equals("Y") || response.equals("y"))
				continue;
			else
				break;	}
														// Prints the Results of Election with Total Number of Votes for Polly and Ernest
		System.out.printf("\nTotal Votes for Polly: %d (%.2f%%) ", totalPolly, ((double) totalPolly / (totalPolly + totalErnest)) * 100);
		System.out.printf("\nTotal Votes for Ernest: %d (%.2f%%)", totalErnest, ((double) totalErnest / (totalPolly + totalErnest)) * 100);

		System.out.println();

		System.out.printf("\nPrecincts Won by Polly: %d", WonByPolly);
		System.out.printf("\nPrecincts Won by Ernest: %d", WonByErnest);
		System.out.printf("\nPrecints tie: %d", tie);

		System.out.println();
		
		if (totalPolly > totalErnest)					// Checks if Votes Won by Polly are Greater than Ernest's or Not
			System.out.println("\nPolly Won in the Election!");  // Then prints statement if true
		else
		
		if (totalErnest > totalPolly)					// Checks if Votes Won by Ernest are Greater than Polly's or Not
			System.out.println("\nErnest Won in the Election!"); // Then prints statement if true
		
		else											// Otherwise, the Votes of Polly and Ernest are the Same
																 // Then prints statement if true
		System.out.println("\nTie Between Polly and Ernest in the Election"); 
		scan.close();
		
			
		}
	}

