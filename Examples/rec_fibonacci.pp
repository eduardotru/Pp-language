let int fib;

func int fibonacci (int n) {
  if (n == 0) {
    return 0;
  } elseif (n == 1) {
    return 1;
  }
  return fibonacci(n - 1) + fibonacci(n - 2);
}

write("Which Fibonacci number do you want?");
read(fib);
if (fib < 0) {
  write("Invalid number");
} else {
  write(fibonacci(fib));
}
