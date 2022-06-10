public class main {
    public static int main(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return main(n-1) + main(n - 2);
    }

}
