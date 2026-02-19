import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        lib.addBook(new Book(1,"Java"));
        lib.addBook(new Book(2,"Python"));

        int choice;
        do {
            System.out.println("\n1.View 2.Issue 3.Return 4.Exit");
            choice = sc.nextInt();

            if(choice==1) lib.showBooks();
            if(choice==2){
                System.out.print("Book ID:");
                lib.issueBook(sc.nextInt());
            }
            if(choice==3){
                System.out.print("Book ID:");
                lib.returnBook(sc.nextInt());
            }

        } while(choice!=4);
    }
}
