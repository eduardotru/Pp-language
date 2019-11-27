# Pp Programming language
Pp is a programming language for scientific use. It overloads basic operations over matrices and has builtin function for probability distributions, statistic analysis, and plotting. 
Pp was codeveloped by Eduardo Trujillo and Hugo Garcia for the compilers class at ITESM.
## Installation Requirements
For the correct functioning of Pp the following tools are required:
- Python3
- Numpy
- Scipy
- Matplotlib
## How to run Pp
Pp was built using Python3 so you can compile Pp code with the following command:

```$ python3 /path/to/Pp/Grammar/Pp.py filename.pp```

When compiled, Pp code generates 2 files which must always live in the same directory. They are a .json file and a .ppo file. To execute this files you need to run the following command:

```$ python3 /path/to/Pp/Grammar/PpRun.py filename```

To make it easier to use the compiler and virtual machine you can create the following aliases
```
$ alias pp_compile='python3 /path/to/Pp/Grammar/Pp.py'
$ alias pp_run='python3 /path/to/Pp/Grammar/PpRun.py'
```

## How to write Pp
### Basics
#### Data types
The supported data types are:
- `int`
- `float`
- `bool`
- `string`
- `matrix<int>`
- `matrix<float>`
- `matrix<bool>`
- `matrix<string>`

All the usual operations are available for ints, bools, and floats. String operations are not supported.
The basic syntax for the operations is:
##### Arithmetic Operations
- Addition: `5 + 5`
- Subtraction: `10 - 5`
- Multiplication: `4 * 3`
- Division: `4 / 3`
- Modulus: `4 % 2`
##### Boolean Operations
- Logical And: `true and true`
- Logical Or: `true or false`
- Logical Not: `not true`
##### Relational Operations
- Less than: `5 < 3`
- Less than or equal: `5 <= 3`
- Greater than: `5 > 3`
- Greater than or equal: `5 >= 3`
- Equal: `5 == 3`
- Not equal: `5 != 3`
##### Matrix literals
To write a matrix literal we use the basic Python syntax using square brackets (`[]`)
For example:
```
[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
```

#### Variable declaration
Variable declaration must occur at the beginning of the file or at the beginning of each function. The basic syntax for variable declarations is `let {type} {var_name1} [, {var_name2}, ...];`. For `matrix` type you need to specify the dimensions
as `let matrix<{type}>[{dim1}][{dim2}] {var_name1} [, {var_name2}, ...];`
For example:
```
let int i, j;
let matrix<float>[10][10] mat;
let string a;
```
#### Function declaration
Funtion declaration can occur at any point of the file. The basic syntax for declaring functions is `func {return_type} {func_name}([{type} {param_name}, {type} {param_name}, ...]) {...}`
For example:
```
func int fibonacci(int n) {...}
```
#### IO
The basic IO statements are `read` and `write`.
For example:
```
read(i);
write(mat);
```
#### Control statements
Pp allows if/elseif/else and while loops for control statements. Their basic syntax is as follow:
```
if (i < 2) {
  write("Smaller than 2!"); 
} elseif (i < 5) {
  write("Smaller than 5!");
} else {
  write("Bigger or equal than 5!");
}

while (i < 10) {
  ...
  i = i + 1;
}
```

#### Basic Example
With all the knowledge so far we can implement basic programs such as get fibonacci numbers in three different manners.
##### Recursive Fibonacci
```
let int n;

func int fibonacci(int n) {
  if (n == 0) {
    return 0;
  } elseif (n == 1) {
    return 1;
  } else {
    return fibonacci(n - 1) + fibonacci(n - 2); 
  }
}

read(n);
write(fibonacci(n));
```

##### Iterative Fibonacci
```
let int n;

func int fibonacci(int n) {
  let int f0, f1, aux;
  f0 = 0;
  f1 = 1;
  while (n > 0) {
    aux = f1;
    f1 = f1 + f0;
    f0 = aux;
    n = n - 1;
  }
  return f0;
}

read(n);
write(fibonacci(n));
```

##### Matrix exponentiation Fibonacci
```
let int n;

func int fibonacci(int n) {
  let matrix<int>[2][2] f;
  f = [[1, 1], [1, 0]];
  if (n == 0) {
    return 0;
  }
  f = f^n;
  return f[1][0];
}

read(n);
write(fibonacci(n));
```
### Advanced functions
Pp comes with builtin functions for statistial analysis. The builtin functions are:
- `mean`
- `median`
- `mode`
- `variance`
- `stdev`

Pp also has plotting capabilities which are:
- `plot(x, y, "fmt")`
- `hist(data)`
- `showplot()`

Pp comes with several probability distribution functions. For every distribution you can get the Probability Density/Mass Function, Cumulative Distribution Function and generate Random Variables. The builtin distributions are:
- `func float dbeta(float x, float a, float b)`
- `func float cbeta(float x, float a, float b)`
- `func float rbeta(float a, float b)`
- `func float dbinom(int x, int n, float p)`
- `func float cbinom(int x, int n, float p)`
- `func int rbinom(int n, float p)`
- `func float dexp(float x, float lambda)`
- `func float cexp(float x, float lambda)`
- `func float rexp(float lambda)`
- `func float dgamma(float x, float a, float s)`
- `func float cgamma(float x, float a, float s)`
- `func float rgamma(float a, float s)`
- `func float dgeom(int x, float p)`
- `func float cgeom(int x, float p)`
- `func int rgeom(float p)`
- `func float dnorm(float x, float mean, float sd)`
- `func float cnorm(float x, float mean, float sd)`
- `func float rnorm(float mean, float sd)`
- `func float dpois(int x, float lambda)`
- `func float dpois(int x, float lambda)`
- `func int rpois(float lambda)`
- `func float dunif(float x, float min, float max)`
- `func float cunif(float x, float min, float max)`
- `func float runif(float min, float max)`

You can checkout the Examples folder to see how to use them.
