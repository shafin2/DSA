public class LL {
    Node head;
    private int size;
    public int getSize() {
        return size;
    }
    LL(){
        this.size=0;
    }
    public void addAtFirst(String str){
        Node n1=new Node(str);
        size++;
        if(head==null){
            head=n1;
            return ;
        }
        n1.next=head;
        head=n1;
    }
    public void addAtLast(String str){
        Node n1=new Node(str);
        size++;
        if(head==null){
            head=n1;
            return ;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=n1;
    }
    public void addAtLoc(String str,int index){
        if(index>-1 && index<=size){
            if(index==size){
                addAtLast(str);
                return;
            }
            Node n1=new Node(str);
            Node currnNode=head;
            Node preNode=null;
            int i=0;
            while(currnNode!=null){
                if(i==index){
                    if(preNode!=null){
                        n1.next=preNode.next;
                        preNode.next=n1;
                        size++;
                        return;
                    }
                    else{
                        n1.next=currnNode;
                        head=n1;
                        size++;
                        return;
                    }
                }
                preNode=currnNode;
                currnNode=currnNode.next;
                i++;
            }
        }
    }
    public String deleteAtFirst(){
        if(head==null){
            return null;
        }
        String temp=head.data;
        head=head.next;
        size--;
        return temp;
    }
    public String deleteAtLast(){
        if(head==null){
            return null;
        }
        Node currNode=head;
        Node previous=head;
        while(currNode.next!=null){
            previous=currNode;
            currNode=currNode.next;
        }
        String temp=currNode.data;
        previous.next=null;
        size--;
        return temp;
    }
    public boolean deleteByData(String data) {
        if(head == null) {
            return false;
        }
        if(head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        Node currNode = head;
        Node previousNode = null;
        while(currNode!=null){
            if(currNode.data.equals(data)){
                previousNode.next=currNode.next;
                size--;
                return true;
            }
            previousNode=currNode;
            currNode=currNode.next;
        }
        return false;
    }
    public boolean updateAtIndex(int index, String newData) {
        if(index < 0 || index >= size || head == null) {
            return false;
        }
        Node currNode = head;
        int i = 0;
        while(i < index) {
            currNode = currNode.next;
            i++;
        }
        currNode.data = newData;
        return true;
    }
    
    public Node search(String str){
        if(head==null){
            return null;
        }
        Node currNode=head;
        while(currNode!=null){
            if(currNode.data.compareTo(str)==0){
                return currNode;
            }
            currNode=currNode.next;
        }
        return null;
    }
    public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        Node preNode=head;
        Node curNode=head.next;
        Node nextNode=curNode.next;
        while(curNode!=null){
            //updating above bcz if cur node is null then what assign
            nextNode=curNode.next;

            //reverse
            curNode.next=preNode;
            //update
            preNode=curNode;
            curNode=nextNode;
            //update next node at above 
        }
        head.next=null;
        head=preNode;
    }
    public void print(){
        if(head!=null){
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
        }
        System.out.print("Null");
        System.out.println("");
    }
}
