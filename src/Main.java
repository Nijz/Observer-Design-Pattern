import Observable.SamsungStockObservable;
import Observable.StockObservable;
import Observer.EmailNotificationObservers;
import Observer.MobileNotificationObservers;
import Observer.NotificationObservers;

public class Main {
    public static void main(String[] args) {

        StockObservable stockObservable = new SamsungStockObservable();

        NotificationObservers emailObserver1 = new EmailNotificationObservers("viratkohli@gmail.com", stockObservable);
        NotificationObservers emailObserver2 = new EmailNotificationObservers("rohitsharma@gmail.com", stockObservable);
        NotificationObservers mobileObserver1 = new MobileNotificationObservers("9876543210", stockObservable);
        NotificationObservers mobileObserver2 = new MobileNotificationObservers("1234567890", stockObservable);

        stockObservable.addObservers(emailObserver1);
        stockObservable.addObservers(emailObserver2);
        stockObservable.addObservers(mobileObserver1);
        stockObservable.addObservers(mobileObserver2);

        stockObservable.setData(10);

    }
}