package librarybook;

/**
 * Class CSC113
 * @author Davindra O'Neal,Giovanni Wells
 * Purpose of Program - A Object that represents a book within a library, the object
 * has 4 instance variables and multiple behaviors 
 */
public class Book {
    private String author;
    private String title;
    private static int id = 100;
    private String bookID;
    
    //A two arguement constructor that accepts the Author and the Book Title
    public Book(String author, String myTitle) {
        this.author = author;
        this.title = myTitle;
        bookID = generateBookID();
        
    }
    //Accessor for the author variable
    public String getAuthor() {
        return author;
    }
    
    //Accessor for the title variable
    public String getTitle() {
        return title;
    }
    //Mutator for the author varible
    public void setAuthor(String author) {
        //If the author's name is entered through the mutator and it begins with
        //X/x, it will be denied, and the previous title 
        if ((author.charAt(0) == 'X') || (author.charAt(0) == 'x')) {
                    
                 System.out.println("Sorry the application does not allow author's"
                        + " name that begin with X, the orginal author's"
                        + this.author + " will remain");
                
            } 
            else {
               //Otherwise the new author is set and the id value is increased by one
               this.author = author;
               id++;
            }
    }
    //Mutator for the title varible
    public void setTitle(String myTitle) {
        this.title = myTitle;
    }
    //Method Name - displayBookDetails
    //Purpose of Method - Display the the title, author and Book ID variable
    //in an organized and proper manner
    //Inputs - the method receives none, but it does use accessors to pull the 
    //title and author
    //Outputs - A printout showing the title, author and the bookID
    public void displayBookDetails(){
        System.out.println("Title - " + this.title);
        System.out.println("Author - " + this.author);
        System.out.println("Book ID - " + this.bookID);
        System.out.println("=============================");


    }
    //Method Name - generateBookID
    //Purpose of Method - generate the BookID by adding the third letter of the 
    //author's name to the end of the ID variable
    //Input - the method recieves nothing but uses the author and id varible
    //Output - a generated book ID.
    private String generateBookID(){
        StringBuilder buildID = new StringBuilder(String.valueOf(id++));
        buildID.append(author.charAt(2));
        this.bookID = buildID.toString();
        return bookID;
    }
}
