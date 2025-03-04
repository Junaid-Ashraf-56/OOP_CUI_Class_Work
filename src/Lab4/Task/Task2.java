package OOP_CUI_Class_Work.src.Lab4.Task;
class Book{
    private String author;
    private String[] chapterNames = new String[100];
    public Book(){
       this.author = "unknown";
       this.chapterNames[0] = "Default";
    }
    public Book(String name,String[] arr){
       this.author = name;
       this.chapterNames = arr;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getChapterNames() {
        return chapterNames;
    }

    public void setChapterNames(String[] chapters) {
        this.chapterNames = chapters;
    }

    // Compare authors of two books
    public boolean compareBooks(Book other) {
        return this.author.equals(other.author);
    }

    // Compare chapter counts of two books
    public static Book compareChapterNames(Book b1, Book b2) {
        int count1 = 0, count2 = 0;
        for (String chap : b1.chapterNames) {
            if (chap != null) count1++;
        }
        for (String chap : b2.chapterNames) {
            if (chap != null) count2++;
        }
        return count1 >= count2 ? b1 : b2;
    }

    public void display() {
        System.out.println("Author: " + author);
        System.out.println("Chapters:");
        for (String chap : getChapterNames()) {
            if (chap != null) {
                System.out.println(chap);
            }
        }
    }
}
public class Task2 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setAuthor("J.K. Rowling");
        b1.setChapterNames(new String[]{"Chapter 1", "Chapter 2", "Chapter 3"});

        // Second book using parameterized constructor
        String[] chapters = {"Chapter A", "Chapter B", "Chapter C", "Chapter D"};
        Book b2 = new Book("J.K. Rowling", chapters);

        // Compare authors
        boolean sameAuthor = b1.compareBooks(b2);
        System.out.println("Do both books have the same author? " + sameAuthor);

        // Compare chapters and display the author of the book with more chapters
        Book largerBook = Book.compareChapterNames(b1, b2);
        System.out.println("The book with more chapters is authored by: " + largerBook.getAuthor());
    }
}