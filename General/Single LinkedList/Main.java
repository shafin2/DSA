public class Main{
    public static void main(String[] args) {
        LL list = new LL();
        System.out.println("Initial size: " + list.getSize());
        System.out.println("Adding nodes...");
        list.addAtFirst("A");
        list.addAtFirst("B");
        list.addAtLast("C");
        list.addAtLoc("D", 2);
        list.print();
        System.out.println("Size after adding nodes: " + list.getSize());
        System.out.println("Deleting nodes...");
        System.out.println("Deleted node: " + list.deleteAtFirst());
        System.out.println("Deleted node: " + list.deleteAtLast());
        list.deleteByData("D");
        list.print();
        System.out.println("Size after deleting nodes: " + list.getSize());
        System.out.println("Updating node at index 0...");
        list.updateAtIndex(0, "E");
        list.print();
        
        //Searching
        Node a=list.search("E");
        System.out.println("Searching for node with data 'E'");
        if(a!=null){
            System.out.println("Data:"+a.data+", Next: "+a.next);
        }
        else{
            System.out.println("Not find");
        }

        System.out.println("Again Adding nodes...");
        list.addAtFirst("C");
        list.addAtFirst("A");
        list.addAtLast("f");
        list.print();
        System.out.println("Reversing ");
        list.reverseList();
        list.print();

        // LL l1=new LL();
        // // l1.addAtFirst("is");
        // // l1.addAtFirst("This");
        // // l1.addAtLast("a");
        // // l1.addAtLast("list");
        // // l1.print();
        // // System.out.println("");
        // // System.out.println("Deleted : "+l1.deleteAtFirst());
        // // l1.print();
        // // System.out.println("");
        // // System.out.println("Deleted : "+l1.deleteAtLast());
        // // l1.print();
        // // System.out.println("");
        // // System.out.println(l1.getSize());

        // // //Searching
        // // Node a=l1.search("is");
        // // if(a!=null){
        // //     System.out.println("Data:"+a.data+", Next: "+a.next);
        // // }

        // l1.addAtFirst("is");
        // l1.addAtFirst("This");
        // l1.addAtLast("a");
        // l1.addAtLast("list");
        // l1.print();
        // l1.addAtLoc("Beautiful", 4);
        // l1.print();
    }
}