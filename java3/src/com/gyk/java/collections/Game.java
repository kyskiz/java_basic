package com.gyk.java.collections;

public class Game implements Comparable<Game>{
    private String title;
    private GameGenre genre;
    private Double price;
    private Integer copiesSold;

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                '}';
    }

    public Game(String title, GameGenre genre, Double price, Integer copiesSold) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GameGenre getGenre() {
        return genre;
    }

    public void setGenre(GameGenre genre) {
        this.genre = genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(Integer copiesSold) {
        this.copiesSold = copiesSold;
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

    public void childMethod() {
        System.out.println("Called child method");
    }

    public void parentMethod() {
        System.out.println("Called parent method");
        this.childMethod();
    }

    @Override
    public int compareTo(Game o) {
        return Integer.compare(this.getCopiesSold(), o.getCopiesSold());
    }
}
