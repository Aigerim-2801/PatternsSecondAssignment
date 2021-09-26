import java.util.List;

public interface Observer {
    public void update(List<String> blogs);
    public void subscribe();
    public void unSubscribe();
}