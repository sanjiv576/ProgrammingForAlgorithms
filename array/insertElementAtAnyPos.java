

// // Note: this is not missing smallest to find
// public class insertElementAtAnyPos {
//     // gloabal variables
//     static int a[];
//     static int  size = 0;
//     insertElementAtAnyPos(int length){
        
//         for (int i =0; i< a.length-1; i++){  // one space is left empty i.e length-1
//             a[i] = 100+i;
//             size++;
//         }
//     }

//     public static void insertAtAnyPosition(int pos, int data) {
//         for(int i= size; i>pos-1; i--){
//             a[i] = a[i-1];
//         }

//         a[pos-1] = data;
//     }

//     public static void main(String[] args){
//         insertElementAtAnyPos m = new insertElementAtAnyPos(5);
//         System.out.println("Array before inserting");
//         for(int i= 0; i<a.length; i++){
//             System.out.println(a[i]);
//         }

//         insertElementAtAnyPos.insertAtAnyPosition(2, 200);
//         System.out.println("Array after inserting");
//         for(int i = 0; i<a.length; i++){
//             System.out.println(a[i]);
//         }
//     }

// }

