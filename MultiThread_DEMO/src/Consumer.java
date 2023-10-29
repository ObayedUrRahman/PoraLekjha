import java.util.Queue;

public class Consumer extends Thread {
    Queue<Integer> list ;

    Consumer (Queue<Integer> q)
    {
        super ("Consumer") ;
        this.list = q ;
    }
    private synchronized void consume() throws InterruptedException {
        while (list.size() == 0) {
            wait();
        }
        System.out.println(this.getName() + " consumed : " + list.poll());
        notifyAll();
        Thread.sleep(500);
    }
    public void run()
    {
        try {
            while (true)
                this.consume();
        }
        catch (Exception e)
        {

        }
    }
}
