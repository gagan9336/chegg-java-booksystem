import BookDetails.book1;
import java.util.*;

public class book2

{
    public static void main(String args[])
    {
        try (
                Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of entries of books:- ");
            int k = sc.nextInt();
            book1[] b = new book1[k];

            for (int i = 0; i < b.length; i++) {
                System.out.println("Enter Serial Number:");
                int sNo = sc.nextInt();
                System.out.println("Enter Title:");
                String title = sc.nextLine();
                System.out.println("Enter Publisher");
                String publisher = sc.nextLine();
                System.out.println("Enter Publish Year:");
                int year = sc.nextInt();
                System.out.println("Enter Pages:");
                int pages = sc.nextInt();
                b[i] = new book1(sNo, title, publisher, year, pages);
            }
            for (int i = 0; i < b.length; i++) {
                for (int j = i + 1; j < b.length; j++) {
                    if (b[i].sNo != b[j].sNo) {
                        b[i].show();
                    } else {
                        System.out.println("Serial number are same.");
                        System.exit(0);
                    }
                }

            }
        }
    }
}
