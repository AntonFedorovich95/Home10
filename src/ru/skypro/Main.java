package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Book firstBook = new Book("Ono", new Author ("Stiven","King"),1986);
        Book secondBook = new Book("Flat World", new Author("Terry","Pratchett"),1983);
        Book firstBookcopy = new Book("Ono", new Author("Stiven","King"),1986);
        System.out.println("firstBook = " + firstBook);
        System.out.println(secondBook);
        Author stivenKing = new Author("Stiven","King");
        Author stivenKingCopy = new Author("Stiven","King");
        Author terryPretchett = new Author("Terry","Pretchett");
        System.out.println("stivenKing.equals(stivenKingCopy) = " + stivenKing.equals(stivenKingCopy));
        System.out.println("stivenKing.equals(terryPretchett) = " + stivenKing.equals(terryPretchett));
        System.out.println("(stivenKing.hashCode() == stivenKingCopy.hashCode()) = " + (stivenKing.hashCode() == stivenKingCopy.hashCode()));
        System.out.println("(stivenKing.hashCode() == terryPretchett.hashCode()) = " + (stivenKing.hashCode() == terryPretchett.hashCode()));
        System.out.println();
        System.out.println("firstBook.equals(firstBookcopy) = " + firstBook.equals(firstBookcopy));
        System.out.println("firstBook.equals(secondBook) = " + firstBook.equals(secondBook));
        System.out.println("(firstBook.hashCode() == firstBookcopy.hashCode()) = " + (firstBook.hashCode() == firstBookcopy.hashCode()));
        System.out.println("(firstBook.hashCode() == secondBook.hashCode()) = " + (firstBook.hashCode() == secondBook.hashCode()));

    }
}