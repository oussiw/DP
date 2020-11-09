public abstract class DecoratorNotifier implements INotifier{

    protected INotifier notifier;

    public DecoratorNotifier() {
    }

    public DecoratorNotifier(INotifier notifier) {
        this.notifier = notifier;
    }

    public abstract void send(String message);
}
