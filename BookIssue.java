import java.util.Scanner;
public class BookIssue
{
	int systemId;
	BookIssue(int systemId)
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
			System.out.print("Enter that how many book already issued by "+studentsObj.students[1][1]+":");
		}else if (student2 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[2][1]);
			System.out.print("Enter that how many book already issued by "+studentsObj.students[2][1]+":");
		}else if (student3 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[3][1]);
			System.out.print("Enter that how many book already issued by "+studentsObj.students[3][1]+":");
		}else if (student4 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[4][1]);
			System.out.print("Enter that how many book already issued by "+studentsObj.students[4][1]+":");
		}else if (student5 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[5][1]);
			System.out.print("Enter that how many book already issued by "+studentsObj.students[5][1]+":");
		}else if (student6 == systemId) {
			System.out.println("Student Name: "+studentsObj.students[6][1]);
			System.out.print("Enter that how many book already issued by "+studentsObj.students[6][1]+":");
		}else {
				System.out.println("Invalid System Id...");
				System.exit(1);
		}

		int flag;
		int a = 1;
		int b = 2;
		Scanner flagInput = new Scanner(System.in);
		flag = flagInput.nextInt(); 

		if(flag == a || flag == b){

		System.out.println("He is eligible to issue more books\n");

		LibraryData booksObj = new LibraryData();

		int bookId1 = Integer.parseInt(booksObj.books[1][0]);
		int bookId2 = Integer.parseInt(booksObj.books[2][0]);
		int bookId3 = Integer.parseInt(booksObj.books[3][0]);
		int bookId4 = Integer.parseInt(booksObj.books[4][0]);
		int bookId5 = Integer.parseInt(booksObj.books[5][0]);

		Scanner bookIdInput = new Scanner(System.in);
		int bookId;
		System.out.print("Enter Book Id for Issue the book: ");
		bookId = bookIdInput.nextInt();

		System.out.println("");

		if (bookId1 == bookId) {
			System.out.println("Book Id:"+bookId+" | Book Name:"+booksObj.books[1][1]+" | Book Author:"+booksObj.books[1][2]);
			System.out.println("");
			Scanner input = new Scanner(System.in);
			String issueDate, returnDate;
			System.out.print("Enter Issue date:");
			issueDate = input.nextLine();
			System.out.print("Enter Return date:");
			returnDate = input.nextLine();
			System.out.println("");
			System.out.println("Issue Date:"+issueDate+" | Return Date:"+returnDate);
			System.out.println("Book Issued...");
		}else if (bookId2 == bookId) {
			System.out.println("Book Id:"+bookId+" | Book Name:"+booksObj.books[2][1]+" | Book Author:"+booksObj.books[2][2]);
			System.out.println("");
			Scanner input = new Scanner(System.in);
			String issueDate, returnDate;
			System.out.print("Enter Issue date:");
			issueDate = input.nextLine();
			System.out.print("Enter Return date:");
			returnDate = input.nextLine();
			System.out.println("");
			System.out.println("Issue Date:"+issueDate+" | Return Date:"+returnDate);
			System.out.println("Book Issued...");
		}else if (bookId3 == bookId) {
			System.out.println("Book Id:"+bookId+" | Book Name:"+booksObj.books[3][1]+" | Book Author:"+booksObj.books[3][2]);
			System.out.println("");
			Scanner input = new Scanner(System.in);
			String issueDate, returnDate;
			System.out.print("Enter Issue date:");
			issueDate = input.nextLine();
			System.out.print("Enter Return date:");
			returnDate = input.nextLine();
			System.out.println("");
			System.out.println("Issue Date:"+issueDate+" | Return Date:"+returnDate);
			System.out.println("Book Issued...");
		}else if (bookId4 == bookId) {
			System.out.println("Book Id:"+bookId+" | Book Name:"+booksObj.books[4][1]+" | Book Author:"+booksObj.books[4][2]);
			System.out.println("");
			Scanner input = new Scanner(System.in);
			String issueDate, returnDate;
			System.out.print("Enter Issue date:");
			issueDate = input.nextLine();
			System.out.print("Enter Return date:");
			returnDate = input.nextLine();
			System.out.println("");
			System.out.println("Issue Date:"+issueDate+" | Return Date:"+returnDate);
			System.out.println("Book Issued...");
		}else if (bookId5 == bookId) {
			System.out.println("Book Id:"+bookId+" | Book Name:"+booksObj.books[5][1]+" | Book Author:"+booksObj.books[5][2]);
			System.out.println("");
			Scanner input = new Scanner(System.in);
			String issueDate, returnDate;
			System.out.print("Enter Issue date:");
			issueDate = input.nextLine();
			System.out.print("Enter Return date:");
			returnDate = input.nextLine();
			System.out.println("");
			System.out.println("Issue Date:"+issueDate+" | Return Date:"+returnDate);
			System.out.println("Book Issued...");
		}else {
			System.out.println("Invalid Book Id");
		}

		}else{
			System.out.println("Maximum three books are issued for each students... Not eligible for issue new book");
		}

		System.out.println("");

		System.out.println("");
		System.out.println("************** Thank You **************");

	}
}