import java.util.*;

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void showBooks() {
        for (Book b : books) {
            System.out.println(b.id + " " + b.title + " Issued:" + b.issued);
        }
    }

    void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id && !b.issued) {
                b.issued = true;
                System.out.println("Book issued");
                return;
            }
        }
        System.out.println("Not available");
    }

    void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id && b.issued) {
                b.issued = false;
                System.out.println("Book returned");
                return;
            }
        }
        System.out.println("Invalid");
    }
}
