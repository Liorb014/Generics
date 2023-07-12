package org.example;

public class Main {
    public static void main(String[] args) {
        String text= "lol";
        Integer number = 1;
        Pair pair1 = new Pair(text,number);
        Pair temp = swap(pair1);
        System.out.println(pair1);
        System.out.println(temp);

    }
    public static Pair swap (Pair pair){
        return new Pair(pair.getSecond(),pair.getFirst());
    }
}
