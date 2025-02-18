package lv.rvt;

public class CD implements Packable {
    private String author;
    private String BookName;
    private int year;

    public CD(String author, String BookName, int year){
        this.author = author;
        this.BookName = BookName;
        this.year = year;
    }

    public double weight(){
        return 0.1;
    }

    public String toString(){
        return this.author + ": " + this.BookName + " (" + this.year + ")";
    }


}
