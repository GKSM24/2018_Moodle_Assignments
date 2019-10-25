package JavaMoodle18.ExceptionHandling.Task2;

public interface QueueInterface {
    void enqueue(int item);
    int dequeue() throws Exception;
}

class QueueEmpty extends Exception{
    String message;
    public QueueEmpty(){

    }

    public QueueEmpty(String msg){
        message =msg;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
