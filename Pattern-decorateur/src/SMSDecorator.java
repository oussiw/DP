public class SMSDecorator extends DecoratorNotifier{

    public SMSDecorator(INotifier notifier) {
        super(notifier);
    }

    public SMSDecorator() {
    }

    @Override
    public void send(String message) {
        System.out.println("Send by message: "+message);
        if(notifier!=null)
            this.notifier.send(message);
    }
}
