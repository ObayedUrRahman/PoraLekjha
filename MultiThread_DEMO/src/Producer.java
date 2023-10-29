import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {
    Queue<Integer> list ;
    Random rand = new Random();
    int value ;

    Producer (Queue<Integer> q)
    {
        super ("Producer") ;
        this.list = q ;
    }

    private synchronized void produce() throws InterruptedException {
        while (list.size() == 10) {
            wait();
        }
        value = rand.nextInt(10) ;
        list.add(value);
        System.out.println(this.getName() + " produced: " + value);
        notifyAll();
        Thread.sleep(500);
    }

    public void run()
    {
        try {
            while (true)
                this.produce();
        }
        catch (Exception e)
        {

        }
    }
}
