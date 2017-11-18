import java.util.Scanner;
public class BookReissue
{
	int systemId;
	BookReissue(int systemId)
	{
		this.systemId = systemId;
		System.out.println("");
		System.out.println("********************************************");
		System.out.println("");

		StudentsDatabase studentsObj = new StudentsDatabase();

		int student1 = Integer.parseInt(studentsObj.students[1][0]);
		int student2 = Integer.parseInt(studentsObj.students[2][0]);
		int student3 = Integer.parseInt(studentsObj.students[3][0]);
		int student4 = Integer.parseInt(studentsObj.students[4][0]);
		int student5 = Integer.parseInt(studentsObj.students[5][0]);
		int student6 = Integer.parseInt(studentsObj.students[6][0]);

		if(student1 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[1][1]);
			System.out.print("\nEnter number of days "+studentsObj.students[1][1]+" has keeped the books: ");
		}else if (student2 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[2][1]);
			System.out.print("\nEnter number of days "+studentsObj.students[2][1]+" has keeped the books: ");
		}else if (student3 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[3][1]);
			System.out.print("\nEnter number of days "+studentsObj.students[3][1]+" has keeped the books: ");
		}else if (student4 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[4][1]);
			System.out.print("\nEnter number of days "+studentsObj.students[4][1]+" has keeped the books: ");
		}else if (student5 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[5][1]);
			System.out.print("\nEnter number of days "+studentsObj.students[5][1]+" has keeped the books: ");
		}else if (student6 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[6][1]);
			System.out.print("\nEnter number of days "+studentsObj.students[6][1]+" has keeped the books: ");
		}else {
				System.out.println("Invalid System Id... Please enter valid System Id");
				System.exit(1);
		}

		int days;
		Scanner daysInput = new Scanner(System.in);
		days = daysInput.nextInt(); 

		if(days <= 7) {
			System.out.println("\nNo fine...\n");

		}else{
			System.out.println("__________________________________");

			int fine = 5;
			
			fine = fine*(days-7);
			System.out.println("Your fine is Rs."+fine+"\nBook returned...");

			System.out.println("");
		}


		LibraryData booksObj = new LibraryData();

		int bookId1 = Integer.parseInt(booksObj.books[1][0]);
		int bookId2 = Integer.parseInt(booksObj.books[2][0]);
		int bookId3 = Integer.parseInt(booksObj.books[3][0]);
		int bookId4 = Integer.parseInt(booksObj.books[4][0]);
		int bookId5 = Integer.parseInt(booksObj.books[5][0]);

		Scanner bookIdInput = new Scanner(System.in);
		int bookId;
		System.out.print("Enter Book Id for Reissue the book: ");
		bookId = bookIdInput.nextInt();

		System.out.println("");

		if (bookId1 == bookId) {
			System.out.println("Book Id:"+bookId+" | Book Name:"+booksObj.books[1][1]+" | Book Author:"+booksObj.books[1][2]);
			System.out.println("");
			Scanner input = new Scanner(System.in);
			String ReissueDate, returnDate;
			System.out.print("Enter Reissue date:");
			ReissueDate = input.nextLine();
			System.out.print("Enter Return date:");
			returnDate = input.nextLine();
			System.out.println("");
			System.out.println("Reissue Date:"+ReissueDate+" | Return Date:"+returnDate);
			System.out.println("Book Reissued...");
		}else if (bookId2 == bookId) {
			System.out.println("Book Id:"+bookId+" | Book Name:"+booksObj.books[2][1]+" | Book Author:"+booksObj.books[2][2]);
			System.out.println("");
			Scanner input = new Scanner(System.in);
			String ReissueDate, returnDate;
			System.out.print("Enter Reissue date:");
			ReissueDate = input.nextLine();
			System.out.print("Enter Return date:");
			returnDate = input.nextLine();
			System.out.println("");
			System.out.println("Reissue Date:"+ReissueDate+" | Return Date:"+returnDate);
			System.out.println("Book Reissued...");
		}else if (bookId3 == bookId) {
			System.out.println("Book Id:"+bookId+" | Book Name:"+booksObj.books[3][1]+" | Book Author:"+booksObj.books[3][2]);
			System.out.println("");
			Scanner input = new Scanner(System.in);
			String ReissueDate, returnDate;
			System.out.print("Enter Reissue date:");
			ReissueDate = input.nextLine();
			System.out.print("Enter Return date:");
			returnDate = input.nextLine();
			System.out.println("");
			System.out.println("Reissue Date:"+ReissueDate+" | Return Date:"+returnDate);
			System.out.println("Book Reissued...");
		}else if (bookId4 == bookId) {
			System.out.println("Book Id:"+bookId+" | Book Name:"+booksObj.books[4][1]+" | Book Author:"+booksObj.books[4][2]);
			System.out.println("");
			Scanner input = new Scanner(System.in);
			String ReissueDate, returnDate;
			System.out.print("Enter Reissue date:");
			ReissueDate = input.nextLine();
			System.out.print("Enter Return date:");
			returnDate = input.nextLine();
			System.out.println("");
			System.out.println("Reissue Date:"+ReissueDate+" | Return Date:"+returnDate);
			System.out.println("Book Reissued...");
		}else if (bookId5 == bookId) {
			System.out.println("Book Id:"+bookId+" | Book Name:"+booksObj.books[5][1]+" | Book Author:"+booksObj.books[5][2]);
			System.out.println("");
			Scanner input = new Scanner(System.in);
			String ReissueDate, returnDate;
			System.out.print("Enter Reissue date:");
			ReissueDate = input.nextLine();
			System.out.print("Enter Return date:");
			returnDate = input.nextLine();
			System.out.println("");
			System.out.println("Reissue Date:"+ReissueDate+" | Return Date:"+returnDate);
			System.out.println("Book Reissued...");
		}else {
			System.out.println("Invalid Book Id");
		}

		System.out.println("");
		System.out.println("************** Thank You **************");

	}
}