package wrap.java.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @description:
 * @author: zwjlf
 * @created: 2021/01/24
 */
public class Mutual implements Lock, Serializable {

  private static class Sync extends AbstractQueuedSynchronizer{

    private Sync(){
      super();
    }

    @Override
    protected boolean tryAcquire(int arg) {
      if(compareAndSetState(0, 1)){
        setExclusiveOwnerThread(Thread.currentThread());
        return true;
      }
      return false;
    }

    @Override
    protected boolean tryRelease(int arg) {
      if(getState() == 0){
        throw new IllegalMonitorStateException();
      }
      setExclusiveOwnerThread(null);
      setState(0);
      return true;
    }

    @Override
    protected boolean isHeldExclusively() {
      return getState() == 1;
    }

    Condition newCondition(){
      return new ConditionObject();
    }

    private void readObject(ObjectInputStream s)
        throws IOException, ClassNotFoundException {
      s.defaultReadObject();
      setState(0); // reset to unlocked state
    }
  }

  private final Sync sync = new Sync();

  @Override
  public void lock() {
    sync.acquire(1);
  }

  @Override
  public void lockInterruptibly() throws InterruptedException {
    sync.acquireInterruptibly(1);
  }

  @Override
  public boolean tryLock() {
    return sync.tryAcquire(1);
  }

  @Override
  public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
    return sync.tryAcquireNanos(1, unit.toNanos(time));
  }

  @Override
  public void unlock() {
    sync.release(1);
  }

  @Override
  public Condition newCondition() {
    return sync.newCondition();
  }


}
