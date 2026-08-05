// Solve using Singly LinkedList
// The approach is intricate yet beneficial, especially for those with a curious disposition.
class Node {
    public int val;
    public Node next;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
}
class FrontMiddleBackQueue {
    Node head;
    int size;
    public FrontMiddleBackQueue() {
        head = null;
        size = 0;
    }
    
    public void pushFront(int val) {
        //System.out.println("Push Front");
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
        //System.out.println(size);
        //show();
    }
    
    public void pushMiddle(int val) {
        //System.out.println("Push Middle");
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else if(head.next == null){
            newNode.next = head;
            head = newNode;
        }
        else{
            int count = 0;
            Node temp = head;
            while(temp != null){
                count++;
                if(count == size/2){
                    Node nextNode = temp.next;
                    temp.next = newNode;
                    newNode.next = nextNode;
                    break;
                }
                temp = temp.next;
            }
        }
        size++;
        //System.out.println(size);
        //show();
    }
    
    public void pushBack(int val) {
        //System.out.println("Push Back");
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
        //System.out.println(size);
        //show();
    }
    
    public int popFront() {
        //System.out.println("Pop Front");

        if(head == null){
            return -1;
        }
        if(head.next == null){
            int val = head.val;
            head = null;
            size--;
            //System.out.println(size);
            //show();
            return val;
        }
        int val = head.val;
        head = head.next;
        //show();
        size--;
        //System.out.println(size);
        return val;
    }
    
    public int popMiddle() {
        //System.out.println("Pop Middle");
        if(head == null){
            return -1;
        }
        if(head.next == null){
            int val = head.val;
            head = null;
            size--;
            //System.out.println(size);
            //show();
            return val; 
        }
        if(size == 2){
            int val = head.val;
            head = head.next;
            size--;
            //System.out.println(size);
            //show();
            return val;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(count == (size - 1)/2){
                int val = temp.val;
                prev.next = temp.next;
                temp = null;
                size--;
                //System.out.println(size);
                //show();
                return val;
            }
            count++;
            prev = temp;
            //prev = 4 ,
            temp = temp.next;
            // temp = 3
        }
        size--;
        //System.out.println(size);
        //show();
        return -1;
    }
    
    public int popBack() {
        //System.out.println("Pop Back");

        if(head == null){
            return -1;
        }
        if(head.next == null){
            int val = head.val;
            head = null;
            size--;
            //System.out.println(size);
            //show();
            return val;
        }
        Node prev = null;
        Node temp = head;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        size--;
        //System.out.println(size);
        //show();
        return temp.val;
    }
    // void show(){
    //     Node temp = head;
    //     while(temp != null){
    //         System.out.print(temp.val + "->");
    //         temp = temp.next;
    //     }
    //     //System.out.println("null");
    // }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */