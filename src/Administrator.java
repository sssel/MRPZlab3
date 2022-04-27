public class Administrator {
    Subscriber[] subscribers;
    public Administrator(Subscriber[] subscribers){
        this.subscribers = subscribers;
    }
    public void changeNumber(int indexSubscriber, int newNumber){
        Subscriber subscriber = new Subscriber(
                newNumber, subscribers[indexSubscriber].getCheck()
        );
        subscribers[indexSubscriber] = subscriber;
    }
    public void disableSubscriber(int indexSubscriber){
        subscribers[indexSubscriber] = null;
    }
}
