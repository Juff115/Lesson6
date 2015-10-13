import hsa.*;

public class LibraryInterface {

    
    public static void main(String[] args) {
        Console c=new Console();
        Book b1, b2, b3, b4, b5;
        b1 = new Book("From Russia With Love","Greg Hines");
        b2 = new Book("Living Smart","Rita Langill");
        b3 = new Book("Singing in the Rain","Harry Conner");
        b4 = new Book("Good Housekeeping","Pat Burns");
        b5 = new Book("To Be A Model","Lisa Lahey");
        c.println("Here are the books available:\n");
        c.println("Book 1:");
        c.println(""+b1);
        c.println("Book 2:");
        c.println(""+b2);
        c.println("Book 3:");
        c.println(""+b3);
        c.println("Book 4:");
        c.println(""+b4);
        c.println("Book 5:");
        c.println(""+b5);
        Patron p=new Patron("James Gilmor");
        c.println("Lending 4 books to "+p.getName());
        if (p.borrow(b1)){
            c.println(b1.getTitle() +" successfully borrowed.");
        }
        else{
            c.println(b1.getTitle() +" could not be borrowed.");
        }
        //next book
        if (p.borrow(b2)){
            c.println(b2.getTitle() +" successfully borrowed.");
        }
        else{
            c.println(b2.getTitle() +" could not be borrowed.");
        }
        //next book
        if (p.borrow(b3)){
            c.println(b3.getTitle() +" successfully borrowed.");
        }
        else{
            c.println(b3.getTitle() +" could not be borrowed.");
        }
        //next book
        if (p.borrow(b4)){
            c.println(b4.getTitle() +" successfully borrowed.");
        }
        else{
            c.println(b4.getTitle() +" could not be borrowed.");
        }
        //return books
        c.println("-------\nAtempting to return the first book:\n--------------");
        if (p.returnBook(b1)) c.println(""+b1.getTitle()+" successfully returned.");
        else    c.println(""+b1.getTitle()+" was not borrowed");
        c.println("-------\nHere are a list of books currently lent to "+ p.getName()+".\n----");
        if(p.hasBook(b1)) c.println(""+b1);
        if(p.hasBook(b2)) c.println(""+b2);
        if(p.hasBook(b3)) c.println(""+b3);
        if(p.hasBook(b4)) c.println(""+b4);
        if(p.hasBook(b5)) c.println(""+b5);
    }
    
}
