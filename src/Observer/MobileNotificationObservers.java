package Observer;

import Observable.StockObservable;

public class MobileNotificationObservers implements NotificationObservers{

    String mobileNumber;
    StockObservable stockObservable;

    public MobileNotificationObservers(String mobileNumber, StockObservable stockObservable){
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        stockObservable.getData();
        sendMobileNotification();
    }

    public void sendMobileNotification(){
        System.out.println("Send mobile notification to " + mobileNumber);
    }

}
