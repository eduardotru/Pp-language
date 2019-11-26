let matrix<int>[4][4] mat;
let int i, j, aux;

func matrix<int>[1][2] find(matrix<int>[4][4] mat, int num) {
    let int i, j;
    i = 0;
    while (i < 4) {
        j = 0;
        while (j < 4) {
            if (mat[i][j] == num) {
                return [[i, j]];
            }
            j = j + 1;
        }
        i = i + 1;
    }
    return [[-1, -1]];
}

write("Escribe 16 numeros separados por enter");
i = 0;
while (i < 4) {
    j = 0;
    while (j < 4) {
        read(mat[i][j]);
        j = j + 1;
    }
    i = i + 1;
}

write(mat);
i = 10;
while (i > 0) {
    write("Que numero deseas buscar?");
    read(aux);
    write(find(mat, aux));
    i = i - 1;
}