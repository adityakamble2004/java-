import java.util.Scanner;

class pro6 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int temp, sum = 0, rev;

    System.out.println("Enter input");
    int num = sc.nextInt();

    temp = num;
    while (num > 0) {

      rev = num % 10;
      sum = (sum * 10) + rev;
      num = num / 10;
    }
    if (temp == sum) {
      System.out.println("is polydrom num");
    }

    else {
      System.out.println("is not polydrom num");
    }
  }
}