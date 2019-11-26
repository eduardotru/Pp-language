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