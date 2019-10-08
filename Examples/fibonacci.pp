let int fib;

func int fibonacci (int n) {
  let int f1, f2, i, aux;
  f1 = 1;
  f2 = 1;
  i = 0;
  while (i < n) {
    aux = f2;
    f2 = f1 + f2;
    f1 = f2;
    i = i + 1;
  }
  return f1;
}

write("Which Fibonacci number do you want?");
read(fib);
if (fib < 0) {
  write("Invalid number");
} else {
  write(fibonacci(fib));
}
