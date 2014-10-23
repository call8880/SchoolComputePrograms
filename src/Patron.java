
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
    public boolean canBorrow(){
        if (b1 == null)  return true;
        else if (b2 == null) return true;
        else if (b3 == null) return true;
        else return false;
        
    }
    public boolean borrow(){
        if (canBorrow() == true){
            
        }
        
    }
}
