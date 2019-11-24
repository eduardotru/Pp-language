let int fact;

func int factorial (int n) {
  let int i, res;
  i = 1;
  res = 1;
  while (i <= n) {
    res = res*i;
    i = i + 1; 
  }
  return res;
}

write("Which number factorial do you want?");
read(fact);
if (fact < 0) {
  write("Invalid number");
} else {
  write(factorial(fact));
}

write("Recursive Factorial");

func int rec_factorial (int n) {
  let int res;
  if (n == 0) {
    write(1);
    return 1;
  }
  res = rec_factorial(n - 1)*n;
  write(res);
  return res;
}

rec_factorial(fact);