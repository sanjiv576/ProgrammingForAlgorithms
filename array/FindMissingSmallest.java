

// find the missing 3rd smallest number in 1689
public class FindMissingSmallest {
    static int num;
    static int rem;
    static boolean[] a = new boolean[10];
    static int counter = 0;
    FindMissingSmallest(int num){
        while (num!=0) {
            rem = num % 10;
            num /= 10;
        }    
    }

    public int findSmallest(){
        for(int i = 0; i<10; i++){
            
            if (a[i] == false){
                counter++;
                if(counter == 3){
                    break;
                }
            }
            
        }
        return counter;
    }
}

class Driver{
    public static void main(String[] args){
        int num = 1454;
        FindMissingSmallest obj = new FindMissingSmallest(num);
        int result = obj.findSmallest();

        System.out.println("Missing Smallest number of " + num + " is :" + result);

    }
}
