let int fact;

write("Which number factorial do you want?");
read(fact);

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