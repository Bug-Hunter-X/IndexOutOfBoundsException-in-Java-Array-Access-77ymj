public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0 && 0 <= 4) { // Check if index is within bounds
            arr[4] = 10; 
        }
        System.out.println("Hello");
    }
}