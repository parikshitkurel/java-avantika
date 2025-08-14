import java.util.Arrays;

class ResizeArray {
    public static void main(String[] args) {
        int[] oldArray = {1, 2, 3};

        System.out.println("Old Array: " + Arrays.toString(oldArray));

        // Resize to length 5 (new elements get default value 0)
        int[] newArray = Arrays.copyOf(oldArray, 5);

        System.out.println("New Array (after resizing): " + Arrays.toString(newArray));
    }
}
