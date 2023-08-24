#include <stdio.h>

int main(void) {

  int i;
  int sum;
  for (i = 0; i < 1000; i++) {
    if (i % 3 == 0 || i % 5 == 0) {
      sum += i;
    }
  }
  printf("ex1: %d", sum);

  int a = 1, b = 2;
  sum = 2;
  while (1) {
    int next = a + b;
    a = b;
    b = next;
    if (next > 4000000) {
      break;
    }
    if (next % 2 == 0) {
      sum += next;
    }
  }
  printf(" ex2: %d", sum);
}
