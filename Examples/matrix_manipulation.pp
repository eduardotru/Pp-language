let matrix<float>[3][3] A, B;

A = [
  [1,2,3],
  [1.12E-10, -10, +123],
  [0., 1, 10]
];

let int i, j;
i = 0;

while (i < 3) {
  j = 0;
  while (j < 3) {
    B[i][j] = i + j;
    j = j + 1;
  }
  i = i + 1;
}

B = A*B;
