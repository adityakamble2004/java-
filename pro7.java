class pro7 {
  public static void main(String[] args) {

    int t = 1;
    for (int i = 1; i <= 10; i++) {

      System.out.println();
      for (int j = 1; j <= 10; j++) {
        t = i * j;

        System.out.print("\t" + t);

      }
    }
  }
}