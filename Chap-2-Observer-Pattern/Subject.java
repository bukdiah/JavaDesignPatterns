public interface Subject {
  /*
    Take an Observer as an argument; that is, the Observer
    to be registers or removed
  */
  public void registerObserver(MyObserver o);
  public void removeObserver(MyObserver o);

  // Notifies all observers when Subject's state has changed
  public void notifyObservers();
}