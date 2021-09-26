import java.util.List;

public class Users implements Observer{

    private Observable channel;
    private String userName;

    public Users(Observable channel,String userName){
        this.channel = channel;
        this.userName = userName;
    }

    @Override
    public void update(List<String> blogs) {
        System.out.println("Dear "+ this.userName+"\nWe have some changes in list of blogs " + blogs + " in this < " + channel.channelName() + " > channel.\n");
    }

    @Override
    public void subscribe() {
        System.out.println("Dear "+userName+" you have successfully subscribed to the < "+channel.channelName()+" >!\n");
        this.channel.subscriberUser(this) ;
    }

    @Override
    public void unSubscribe() {
        System.out.println("Dear "+userName+" you have successfully unsubscribed from the < "+channel.channelName()+" >!\n");
        this.channel.unsubscriberUser(this) ;
    }
}
