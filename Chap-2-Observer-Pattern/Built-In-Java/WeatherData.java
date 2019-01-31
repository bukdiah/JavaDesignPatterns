import java.util.Observable;
import java.util.Observer;

/*
  We extend Observable and no longer need to keep track of our
  observers anymore, or manage their registration or removal since
  superclass handles that
*/
public class WeatherData extends Observable {
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {

  }

  public void measurementsChanged() {
    setChanged(); // indicate state behavior has changed
    notifyObservers(); // Not sending data- so we are using PULL model
  }

  /*
  Observers use these methods to obtain WeatherData object's state
  */
  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
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