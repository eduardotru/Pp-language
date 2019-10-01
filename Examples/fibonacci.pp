func int fibonacci (int n) {
  let int f1, f2, i;
  f1 = 1;
  f2 = 1;
  i = 0;
  while (i < n) {
    let int aux;
    aux = f2;
    f2 = f1 + f2;
    f1 = f2;
    i = i + 1;
  }
  return f1;
}

let int fib;
write("Which Fibonacci number do you want?");
read(fib);

write(fibonacci(fib));
