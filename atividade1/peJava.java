class Main {
  public static void main(String[] args) {
    System.out.println("Ex1: " + sumMultiplesUpTo(1000));
    System.out.println("Ex2: " + sumEvenFibsUpTo(4000000));
  }

  public static int sumMultiplesUpTo(int limit) {
        int sum = 0;

        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
  
  public static int sumEvenFibsUpTo(int limit) {
        int a = 1, b = 2, sum = 0;

        while (a <= limit) {
            if (a % 2 == 0) {
                sum += a;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }
}
