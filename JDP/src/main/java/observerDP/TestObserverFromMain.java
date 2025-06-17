package observerDP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestObserverFromMain {
    public static void main(String[] args) {
        NewsAgency newsAgency=new NewsAgency();

        Observer observer1=new NewsChannel("NDTV");
        Observer observer2 = new NewsChannel("India Times");

        newsAgency.attach(observer1);
        newsAgency.attach(observer2);

        newsAgency.setNews("Air India plan crashed on Ahmedabad airport.");
    }
}