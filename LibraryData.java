import java.lang.*;
public class LibraryData
{
	String[][] books = {
		{ "Book Id", "Subject", "Author"},
		{ "101", "Maths", "KC Sinha"},
		{ "102", "Physics", "HC Verma"},
		{ "103", "C Programming", "Yashwant Karnetkar"},
		{ "104", "Java Programming", "Yashwant Karnetkar"},
		{ "105", "Operating System", "xyz"}
	};

	String[][] books_quantity = {
		{ "Book Id", "Book Quantity" },
		{ "101", "20" },
		{ "102", "20" },
		{ "103", "20" },
		{ "104", "20" },
		{ "105", "20" }
	};

	int total_books = 100;

	public void displayDatabase()
	{
		for (int i=0; i<6; i++) {
			System.out.println("");
			for (int j=0; j<3; j++) {
				System.out.print(books[i][j]+" | ");
			}
		}
		System.out.println("");
		System.out.println("");
		for (int i=0; i<6; i++) {
			System.out.println("");
			for (int j=0; j<2; j++) {
				System.out.print(books_quantity[i][j]+" | ");
			}
		}
	}
}