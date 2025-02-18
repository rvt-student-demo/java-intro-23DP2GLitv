package lv.rvt;

public class Book implements Packable {
    private String author;
    private String BookName;
    private double weight;

    public Book(String author, String BookName, double weight){
        this.author = author;
        this.BookName = BookName;
        this.weight = weight;
    }

    public double weight(){
        return this.weight;
    }

    public String toString(){
        return this.author + ": " + this.BookName;
    }

    
}
