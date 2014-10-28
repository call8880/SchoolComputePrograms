
public class Patron {

    private String Name;
    Book b1;
    Book b2;
    Book b3;
    
    public Patron(String n){
        Name = n;
        b1 = null;
        b2 = null;
        b3 = null;
    }
    public String getName(){
        return Name;
    }
    public boolean canBorrow(){
        if (b1 == null)  return true;
        else if (b2 == null) return true;
        else if (b3 == null) return true;
        else return false;
        
    }
    public boolean borrow(Book b){
        if (b1 == null){
            b1 = b;
            return true;
        }
        else if (b2 == null){
            b2 = b;
            return true;
        }
        else if (b3 == null){
            b3 = b;
            return true;
        }
        else return false;
    }
    public boolean returnBook(Book b){
        if (b == b1){
            b1 = null;
            return true;
        }
        else if (b == b2){
            b2 = null;
            return true;
        }
        else if (b == b3){
            b3 = null;
            return true;
        }
        else return false;
    }
    public boolean hasBook(Book b){
        if (b == b1) return true;
        else if (b == b2) return true;
        else if (b == b3) return true;
        else return false;
    }
}
