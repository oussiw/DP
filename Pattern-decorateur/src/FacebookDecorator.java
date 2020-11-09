public class FacebookDecorator extends DecoratorNotifier{

    public FacebookDecorator(INotifier notifier) {
        super(notifier);
    }

    public FacebookDecorator() {
        super();
    }

    @Override
    public void send(String message) {
        System.out.println("Send by facebook: "+message);
        if(notifier!=null)
            this.notifier.send(message);
    }
}
