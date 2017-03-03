public interface Dequeable{
  public void enqueue(int k);
  public int dequeue();
  public int size();
  public boolean isEmpty();
  public void enqueueFront(int k);
  public int dequeueFront();
  public void enqueueRear(int k);
  public int dequeueRear();
}