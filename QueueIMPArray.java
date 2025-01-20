public class QueueIMPArray {

    public static class Queue{
        int size;
        int cap;
        int arr[];
        Queue(int c){
            cap = c;
            arr = new int[cap];
            size = 0;
            
        }

        void enqueue(int x){
           if (isFull()) {
              return;
           }
           arr[size] = x;
           size++;
        }

        void dequeue(){
            if (isEmpty()) {
                return;
            }
            for (int i = 0; i < size-1; i++) {
                arr[i] = arr[i+1];
                
            } 
            size--;
        }

        int getFront(){
            if (isEmpty()) {
                return -1;
            }else{
                return 0;
            }

        }
        int getRear(){
           if (isEmpty()) {
               return -1;
           }else{
              return size-1;
           }
        }
        boolean isFull(){
           return (size == cap);
          
        }
        boolean isEmpty(){
            return (size == 0);
        }
        
    }
    public static void main(String[] args) {
        Queue que = new Queue(3);
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);

        System.out.println(que.getFront());
        System.out.println(que.getRear());
        
    }
}