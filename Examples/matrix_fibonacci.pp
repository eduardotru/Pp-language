let int fib;

func int fibonacci (int n) {
  let matrix<int>[2][2] fib;
  fib = [[1, 1], [1, 0]];
  if (n == 0) {
    return 0;
  } else {
    fib = fib^n;
    return fib[0][1];
  }
}

write("Which Fibonacci number do you want?");
read(fib);
if (fib < 0) {
  write("Invalid number");
} else {
  write(fibonacci(fib));
}
