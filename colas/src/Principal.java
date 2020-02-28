public class Principal {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        Queue m = q;
        while(!q.isEmpty()){
            System.out.println("tamaño "+m.getTamaño());
            System.out.println("rear " + m.getRearElement().data);
            System.out.println("font " + m.getFrontElement().data);
            System.out.println("remove " + m.dequeue().data);
        }
    }
}
