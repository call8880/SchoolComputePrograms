
public class libraryInterface {

    public static void  main(String[] args){
        
        //create books
       Book b1 = new Book("From Russia With Love, ", "Ian Fleming");
       Book b2 = new Book("Living Smart, ", "Rita Langill");
       Book b3 = new Book("Singing in the rain, ", "Harry Connor");
       Book b4 = new Book("Good Housekeeping, ", "Pat Burns");
       Book b5 = new Book("To Be a Model, ", "Lisa Lahey");
        
        //show book availability
        System.out.println("Here are the books available: ");
        System.out.println("\n-----------------------------\n");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println("\n----------------------------\n");
        //create a patron
        Patron p = new Patron("Miles Davis");
        //System.out.println(p);
        
    }
}