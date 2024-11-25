public class Add {

    public int addNumbers(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        Add addition = new Add();
        int result = addition.addNumbers(4, 5);

        System.out.println("The sum of the numbers is: " + result);
    }
}
