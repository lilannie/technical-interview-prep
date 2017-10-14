/*
You have two integer arrays, a and b, and an integer target value v.
Determine whether there is a pair of numbers, where one number is taken from a and the other from b,
that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.
 */

function sumOfTwo(a, b, v) {
    a = a.sort((a,b) => a-b);
    b = b.sort((a,b) => a-b);

    console.log(a);
    console.log(b);
    if (a.length <= b.length) {
        for (let i = 0; i < a.length; i++) {
            if (binarySearch(b, v - a[i])) return true;
        }
    } else {
        for (let i = 0; i < b.length; i++) {
            if (binarySearch(a, v - b[i])) return true;
        }
    }

    return false;
}

function binarySearch(arr, value) {
    let low = 0;
    let high = arr.length - 1;

    while (low <= high) {
        let mid = Math.floor((high - low)/2) + low;

        if (arr[mid] == value) return true;

        if (arr[mid] < value) low = mid+1;

        if (arr[mid] > value) high = mid-1;
    }

    return false;
}
