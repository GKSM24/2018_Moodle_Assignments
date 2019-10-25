package JavaMoodle18.ExceptionHandling.Task2;

public class Queue implements QueueInterface{
    int queue[], size;

    public Queue(){
        queue = new int[10];
        size = 0;
    }

    public Queue(int capacity){
        queue = new int[capacity];
        size = 0;
    }

    public void enqueue(int item){
        queue[size++] = item;
    }

    public int dequeue() throws QueueEmpty{
        if (size == 0){
            throw new QueueEmpty("queue empty");
        }
        else {
            int temp = queue[0];
            for (int index = 0; index < size - 1; index++)
                queue[index] = queue[index+1];
            queue[size - 1] = 0;
            size--;
            return temp;
        }
    }

    @Override
    public String toString() {
        String elements = "";
        for (int index = 0; index < size; index++)
            elements += queue[index]+",";
        return "["+elements+"]";
    }
}
