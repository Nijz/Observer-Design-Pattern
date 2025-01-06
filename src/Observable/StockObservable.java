package Observable;

import Observer.NotificationObservers;

public interface StockObservable {

    public void addObservers(NotificationObservers observer);
    public void removeObservers(NotificationObservers observers);
    public void notifyObservers();
    public void setData(int data);
    public int getData();

}
