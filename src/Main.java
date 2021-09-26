import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Observable channel = new YouTubeChannel(new ArrayList<Observer>(), "Astana IT University");
        ((YouTubeChannel) channel).addBlog("Встреча с ректором");
        Observer observer = new Users(channel, "Nursultan");
        observer.subscribe();
        ((YouTubeChannel) channel).addBlog("OOP Lecture");
        Observer observer2 = new Users(channel, "Aiym");
        observer2.subscribe();
        ((YouTubeChannel) channel).addBlog("Праграмма магистратуры") ;
        ((YouTubeChannel) channel).removeBlog("OOP Lecture") ;
        observer2.unSubscribe();
        Observable channel2 = new YouTubeChannel(new ArrayList<Observer>(), "Cooking with Ainura");
        ((YouTubeChannel) channel2).addBlog("Приготовим сегодня торт Три шоколада");
        Observer observer3 = new Users(channel2, "Maryam");
        observer3.subscribe();
        ((YouTubeChannel) channel2).addBlog("Как испечь шоколадное печенье");
        ((YouTubeChannel) channel2).removeBlog("Приготовим сегодня торт Три шоколада");
    }
}
