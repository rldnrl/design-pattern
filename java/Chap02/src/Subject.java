public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    // Subject 상태가 변경되었을 때, 모든 옵저버에게 변경 내용을 알리려고 호출되는 메서드.
    public void notifyObservers();
}
