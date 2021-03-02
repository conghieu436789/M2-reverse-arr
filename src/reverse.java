import java.util.Scanner;
public class reverse {
    static void reverse(int[] arr) {
        int middle;
        for (int i=0;i<arr.length/2;i++) {
            middle = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = middle;
        }
        for (int i = 0; i<arr.length; i++) {
            System.out.printf("%2d", arr[i]);
        }
    }
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter size of array <= 20");
            size = input.nextInt();
            if (size>20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i=0; i<size; i++) {
            System.out.printf("enter the element %d",i);
            array[i] = input.nextInt();
        }
        reverse(array);
    }
}
