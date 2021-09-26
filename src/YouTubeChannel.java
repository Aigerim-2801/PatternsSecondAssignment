import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Observable{

    private List<String> blogs = new ArrayList<>();
    private List<Observer>users;
    private String channelName;

    public YouTubeChannel(List<Observer>users,String channelName){
        this.users = users;
        this.channelName = channelName;
    }
    public void addBlog(String blog){
        this.blogs.add(blog);
        notifyAllUsers();
    }
    public void removeBlog(String blog){
        this.blogs.remove(blog);
        notifyAllUsers();
    }
    @Override
    public void subscriberUser(Observer user) {
        users.add(user);
    }

    @Override
    public void unsubscriberUser(Observer user) {
        users.remove(user);
    }

    @Override
    public void notifyAllUsers() {
        System.out.println();
        for(Observer user : users){
            user.update(blogs);
        }
    }
    @Override
    public String channelName() {
        return channelName;
    }
}
