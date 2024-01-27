import java.util.Scanner;

class pro8 {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("enter number");

      int num = sc.nextInt();
      int t = num;

      System.out.println("enter number is " + t);

      for (int i = 1; i <= 10; i++) {
        t = num * i;
        System.out.println(t);

      }
    }

  }
}