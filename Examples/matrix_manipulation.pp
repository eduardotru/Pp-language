let matrix<float>[3][3] A;
let matrix<int>[3][1] B;
let int i, j;

B = A*B;

A = [
  [1,2,3],
  [1.12E-10, -10, +123],
  [0., 1, 10]
];
write(A);

i = 0;

while (i < 3) {
  j = 0;
  while (j < 1) {
    B[i][j] = i + j;
    j = j + 1;
  }
  i = i + 1;
}
write(B);

B = A*B;
write(B);
