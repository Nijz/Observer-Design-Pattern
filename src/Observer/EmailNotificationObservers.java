package Observer;

import Observable.StockObservable;

public class EmailNotificationObservers implements NotificationObservers{

    String email;
    StockObservable stockObservable;

    public EmailNotificationObservers(String email, StockObservable stockObservable){
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        stockObservable.getData();
        sendEmail();
    }

    public void sendEmail(){
        System.out.println("Send email to " + email);
    }
}
