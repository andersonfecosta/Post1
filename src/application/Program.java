package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat fmrt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow thats awesome!");
        Post p1 = new Post(fmrt.parse("21/06/2018 13:05:44"),
                "Travelling to New Zealand",
                "Im going to visit this wondeful country!",
                12);

        p1.addComment(c1);
        p1.addComment(c2);


    }
}
