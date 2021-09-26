public interface Observable {
    void subscriberUser(Observer user);
    void unsubscriberUser(Observer user);
    void notifyAllUsers();
    public String channelName();
}
