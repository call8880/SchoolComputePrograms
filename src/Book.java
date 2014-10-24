
public class Book {

    private  String Title = "";
    private  String Author = "";
    
    public Book(String a, String b){
        Title += a;
        Author += b;
    }
    public String toString(){ 
        String result = "";
        result += Title;
        result += Author;
        return result;
    }
    public String getTitle(){
        return Title;
    }
    
}
