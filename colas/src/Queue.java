public class Queue {
    Node front;
    Node rear;
    int tamaño;

    public Queue(){
        front = rear = null;
        tamaño=0;
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public Node getFrontElement(){
        if(isEmpty()){
            return null;
        }

        return front;
    }

    public Node getRearElement(){
        if(isEmpty()){
            return null;
        }

        return rear;
    }

    public void enqueue(int n){
        Node p = new Node(n);
        if(front == null){
            front = p;
        }else{
            rear.right = p;
        }
        this.tamaño++;
        rear = p;
    }

    public Node dequeue(){
        if(isEmpty()){
            return null;
        }
        Node frontData = front;
        front = front.right;
        if(isEmpty()){
            rear = null;
        }
        this.tamaño--;
        return frontData;
    }
}
