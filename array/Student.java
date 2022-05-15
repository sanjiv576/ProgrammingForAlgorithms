public class Student {
    public String name;
    public int roll;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}

class TestStudent{
    public static void main(String[] args){
        int arrSize = 5;
        Student[] arr;
        arr = new Student[arrSize];

        arr[0] = new Student("Sanjiv", 210205);
        arr[1] = new Student("Rajiv", 212205);
        arr[2] = new Student("Sanjaya", 2105);
        arr[3] = new Student("Santosh", 410205);
        arr[4] = new Student("Rangit", 2005);
        
        for(int i = 0; i<arrSize; i++){
            System.out.println("Element at index " + i + " : " + arr[i].name + ", " + arr[i].roll);
        }
    }
}
