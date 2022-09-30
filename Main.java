public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is why QA Engineers always have to do boundary testing! The array only has 3 values and you've requested a 4th");
        }
    }

}
