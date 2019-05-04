package librarybook;

/**
 * Class CSC113
 * @author Davindra O'Neal
 * Purpose of Program - 
 */
public class Book {
    private String author;
    private String title;
    private static int id = 100;
    private String bookID;

    public Book(String author, String myTitle) {
        this.author = author;
        this.title = myTitle;
        this.id++;
        
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        if ((author.charAt(0) == 'X') || (author.charAt(0) == 'x')) {
                    
                 System.out.println("Sorry the application does not allow author's"
                        + " name that begin with X, the orginal author's"
                        + this.author + " will remain");
                
            } 
            else {
                
               this.author = author;
            }
    }

    public void setTitle(String myTitle) {
        this.title = myTitle;
    }
    
    public void displayBookDetails(){
        System.out.println("Title - " + this.title);
        System.out.println("Author - " + this.author);
        System.out.println("Book ID - " + generateBookID());
        System.out.println("=============================");


    }
    private String generateBookID(){
        StringBuilder buildID = new StringBuilder(String.valueOf(id));
        buildID.append(author.charAt(2));
        this.bookID = buildID.toString();
        return bookID;
    }
}
