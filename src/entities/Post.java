package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    public static SimpleDateFormat fmrt = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private int likes;
    private List<Comment> comment = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComent() {
        return comment;
    }

    public void addComment(Comment comment){
        this.comment.add(comment);
    }

    public void removeComment(Comment comment){
        this.comment.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(fmrt.format(moment)+"\n");
        sb.append(content+"\n");
        sb.append("Comments: \n");
        for (Comment c: comment) sb.append(c.getText() + "\n");
        return sb.toString();

    }
}
