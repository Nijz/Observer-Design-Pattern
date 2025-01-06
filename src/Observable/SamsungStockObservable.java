package Observable;

import Observer.NotificationObservers;

import java.util.ArrayList;
import java.util.List;

public class SamsungStockObservable implements StockObservable{

    public int stock = 0;
    public List<NotificationObservers> observersList = new ArrayList<>();

    @Override
    public void addObservers(NotificationObservers observer) {
        this.observersList.add(observer);
    }

    @Override
    public void removeObservers(NotificationObservers observer) {
        this.observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationObservers obs: observersList){
            obs.update();
        }
    }

    @Override
    public void setData(int data) {
        if (stock == 0){
            notifyObservers();
        }
        stock = data;
    }

    @Override
    public int getData() {
        return stock;
    }
}
