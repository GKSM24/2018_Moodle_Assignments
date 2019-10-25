package JavaMoodle18.ExceptionHandling.Task2;

public class TestDriver {

    public static void main(String args[]){
        try {
            Queue q = new Queue();
            q.enqueue(20);
            q.enqueue(30);
            System.out.println(q);
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            q.dequeue();
        }catch (QueueEmpty qe) { System.out.println(qe.getMessage()); }

    }
}
