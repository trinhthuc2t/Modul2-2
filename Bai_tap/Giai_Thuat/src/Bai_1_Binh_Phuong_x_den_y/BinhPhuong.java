import java.util.Scanner;

public class BinhPhuong {
    public static void main(String[] args) {
        // Nhập 2 số nguyên x và y. Viết chương trình tính tổng bình phương các số từ x đến y.

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập x:");
        int x = input.nextInt();
        System.out.println("Nhập y:");
        int y = input.nextInt();
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
