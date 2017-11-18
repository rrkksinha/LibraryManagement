import java.util.Scanner;
public class LibraryManagement
{
	static
	{
		System.out.println("");
		System.out.println("Press:");
		System.out.println("1. for Book Issue");
		System.out.println("2. for Book Return");
		System.out.println("3. for Book Reissue");
		System.out.println("4. for Library Database");
		System.out.println("");
		System.out.print("Enter your choice: ");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ch;
		ch = input.nextInt();

		switch(ch)
		{
			case 1:
				System.out.print("Enter student's System Id: ");
				Scanner sysId = new Scanner(System.in);
				int systemId;
				systemId = sysId.nextInt();
				BookIssue issueObj = new BookIssue(systemId);
				break;
			case 2:
				System.out.print("Enter Student's System Id: ");
				Scanner sysId1 = new Scanner(System.in);
				int systemId1;
				systemId1 = sysId1.nextInt();
				BookReturn issueObj1 = new BookReturn(systemId1);
				break;
			case 3:
				System.out.print("Enter Student's System Id: ");
				Scanner sysId2 = new Scanner(System.in);
				int systemId2;
				systemId1 = sysId2.nextInt();
				BookReissue issueObj2 = new BookReissue(systemId1);
				break;
			case 4:
				LibraryData data = new LibraryData();
				data.displayDatabase();
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
}