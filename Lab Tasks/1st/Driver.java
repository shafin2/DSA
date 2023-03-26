public class Driver {
    public static void main(String[] args) {
    // Creating an object of MyArray class with size 10.
    MyArray mr=new MyArray(10);
    // Adding elements to the array.
    System.out.println("Adding");
    boolean a0=mr.addAtEnd(10);
    boolean a1=mr.addAtEnd(20);
    boolean a2=mr.addAtEnd(30);
    boolean a5=mr.addAtEnd(30);
    boolean a3=mr.addAtEnd(40);
    boolean a4=mr.addAtEnd(50);

    // Printing the array.
    mr.printArray();
    System.out.println("---------------");

    // Deleting an element from a specific index.
    System.out.println("Deleting at index 2");
    int deleted_val=mr.deleteAtIndex(2);
    mr.printArray();
    System.out.println("---------------");

    // Adding an element at a specific index.
    System.out.println("Add at index 2");
    boolean b0=mr.addAtIndex(30,2);
    mr.printArray();
    System.out.println("---------------");

    // Deleting an element from the end of the array.
    System.out.println("Delete at end");
    int dv2=mr.deleteAtEnd();
    mr.printArray();
    System.out.println("---------------");

    // Searching for the index of a specific value in the array.
    System.out.println("Searching index of value 30 ");
    System.out.println(mr.linearSearchOfOne(30));

    // Searching for all the indexes of a specific value in the array.
    System.out.println("Searching all indexes of value 30 ");
    int arr[]=mr.linearSearchOfAll(30);
    System.out.print("At index ");
    for(int i=0;i<arr.length;i++){
        if(arr[0]!=-1){
            if(arr[0]==0){
                System.out.print(arr[i]+",");
            }
            if(arr[i]!=0){
                System.out.print(arr[i]+",");
            }
        }
    }
    System.out.println();
    System.out.println("---------------");

    // Updating an element at a specific index.
    System.out.println("Update at index 2");
    int deleted_val2=mr.updateAtIndex(40, 2);
    mr.printArray();

    // Updating the first matching element with a specific value.
    System.out.println("Update val by finding first match");
    int deleted_val3=mr.updateOneVal(10, 40);
    mr.printArray();

    // Updating all the matching elements with a specific value.
    System.out.println("Update all finding val");
    int deleted_val4=mr.updateAllMatchingVal(40, 100);
    mr.printArray();
    System.out.println("---------------");

    // Sorting the array.
    System.out.println("Sorting");
    boolean a7=mr.addAtEnd(70);
    mr.sorting();
    mr.printArray();
    System.out.println("---------------");

    // Performing binary search on the array.
    System.out.println("Binary Search");
    System.out.println(mr.binarySearch(100));
}
}
