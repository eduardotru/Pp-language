let matrix<float>[1000][1] his, nor, x, ex;
let int n;
let float delta;
n = 999;
delta = 0.0;
while (n >= 0) {
    his[n][0] = rnorm(50, 10);
    nor[n][0] = dnorm(delta, 50, 10) * 1000;
    ex[n][0] = dexp(delta, 10) * 100;
    x[n][0] = delta;
    delta = delta + 0.1;
    n = n - 1;
}
// Comentario
hist(his);
plot(x, nor, "-");
plot(x, ex, "--");
showplot();
