let matrix<int>[10][1] arr;

func matrix<int>[10][1] merge(matrix<int>[10][1] left, matrix<int>[10][1] right, int length_left, int lenght_right) {
    let matrix<int>[10][1] sorted_list;
    let int i, l, r;
    i = 0;
    l = 0;
    r = 0;
    while (i < length_left + lenght_right) {
        if (l < length_left and r < lenght_right) {
            if (left[l][0] < right[r][0]) {
                sorted_list[i][0] = left[l][0];
                l = l + 1;
            } else {
                sorted_list[i][0] = right[r][0];
                r = r + 1;
            }
        } elseif (l < length_left) {
            sorted_list[i][0] = left[l][0];
            l = l + 1;
        } elseif (r < lenght_right) {
            sorted_list[i][0] = right[r][0];
            r = r + 1;
        }
        i = i + 1;
    }
    return sorted_list;
}

func matrix<int>[10][1] mergesort(matrix<int>[10][1] arr, int length) {
    let matrix<int>[10][1] left, right;
    let int mid, i, j;

    if (length <= 1) {
        return arr;
    }

    mid = length/2;
    i = 0;
    j = 0;
    while (i < mid) {
        left[j][0] = arr[i][0];
        j = j + 1;
        i = i + 1;
    }
    j = 0;
    while (i < length) {
        right[j][0] = arr[i][0];
        j = j + 1;
        i = i + 1;
    }
    return merge(mergesort(left, mid), mergesort(right, length - mid), mid, length - mid);
}

arr = transpose([[10, 4, 5, 7, 8, 1, 3, 2, 6, 9]]);
arr = mergesort(arr, 10);
write(arr);