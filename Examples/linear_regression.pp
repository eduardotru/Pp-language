let matrix<float>[1][10] X, Y;
let matrix<float>[2][2] A;
let matrix<float>[2][1] B, y;
let matrix<float>[1][1] aux;
let int sum, i;

X = [[1400, 1600, 1700, 1875, 1100, 1550, 2350, 1450, 1425, 1700]];
Y = [[245, 312, 279, 308, 199, 219, 405, 324, 319, 255]];

A[0][0] = 10;

sum = 0;
i = 0;
while (i < 10) {
  sum = X[0][i] + sum;
  i = i + 1;
}
A[0][1] = sum;
A[1][0] = sum;

aux = X*transpose(X);
A[1][1] = aux[0][0];

sum = 0;
i = 0;
while (i < 10) {
  sum = Y[0][i] + sum;
  i = i + 1;
}
y[0][0] = sum;
aux = X*transpose(Y);
y[1][0] = aux[0][0];

B = A^-1 * y;

plot(X, Y, "o");
plot([[1000, 2400]], [[B[0][0] + B[1][0]*1000, B[0][0] + B[1][0]*2400]], "-");
showplot();

