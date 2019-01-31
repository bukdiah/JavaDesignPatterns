import java.util.ArrayList;

public class WeatherData implements Subject {
  private ArrayList observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList<MyObserver>();
  }

  public void registerObserver(MyObserver o) {
    observers.add(o); // add to list to register
  }

  public void removeObserver(MyObserver o) {
    int i = observers.indexOf(o);
    if(i >= 0) {
      observers.remove(i); // remove from list to un-register
    }
  }
  /*
    Because Observers all implement update, we know how to notify them
  */
  public void notifyObservers() {
    for (int i=0; i<observers.size(); i++) {
      MyObserver observer = (MyObserver) observers.get(i);
      observer.update(temperature,humidity,pressure);
    }
  }

  // We notify observers when we get updated data from Weather Service
  public void measurementsChanged() {
    notifyObservers();
  }

  /*
  Dummy Weather Service
  */
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}