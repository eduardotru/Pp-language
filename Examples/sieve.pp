let int n, num_primes, i, j;
let matrix<bool>[100][1] is_prime;
let matrix<int>[100][1] primes;

n = 100;
i = 0;
num_primes = 0;

while (i < n) {
  is_prime[i][0] = true;
  i = i + 1;
}

is_prime[0][0] = false;
is_prime[1][0] = false;

i = 2;
while (i < n) {
  if (is_prime[i][0]) {
    primes[num_primes][0] = i;
    num_primes = num_primes + 1;
    j = i * i;
    while (j < n) {
      is_prime[j][0] = false;
      j = j + i;
    }
  }
  i = i + 1;
}

i = 0;
while (i < num_primes) {
  write(primes[i][0]);
  i = i + 1;
}