public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;
        System.out.println(" Player rolls a Diece");

        int randomv = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println(" Number Got: " + randomv);
    }
}
