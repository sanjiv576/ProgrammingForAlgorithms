
public class ReverseInteger {
    static int num;
    static int rem;
    static int reverse = 0;

    int reverseNum(int num){
        while (num!=0){
            rem = num % 10;
            num /= 10;
            reverse = (reverse * 10) + rem;
        }

        return reverse;
    }
    public static void main(String[] args) {
        ReverseInteger rev = new ReverseInteger();
        int result = rev.reverseNum(123456789);
        System.out.println(result);
    }
}
