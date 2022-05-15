public class test{
    static int  a[];
static int size=0;
test(int length){
    a=new int[length];

    for(int i=0;i<a.length-1;i++){
        a[i]=100+i;
        size++;
    }
}

public void insertAtAnyPos(int pos,int data){
    for(int i=size;i>pos-1;i--){
        a[i]=a[i-1];
    }
    a[pos-1]=data;
}

public static void main(String [] args){
    test t=new test(5);
    System.out.println(" print array before inserting");
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
    
    t.insertAtAnyPos(2,200);
    System.out.println(" print array after inserting");
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
   }
}

