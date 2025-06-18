package BehavioralDP.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{

    private List<Observer> observerList=new ArrayList<>();
    private String news;

    public void setNews(String news){
        this.news=news;
        notifyObservers();
    }
    @Override
    public void attach(Observer o) {
        observerList.add(o);
    }

    @Override
    public void detach(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observerList){
            o.update(news);
        }
    }
}
