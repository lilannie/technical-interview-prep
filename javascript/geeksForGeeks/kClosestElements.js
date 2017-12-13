function findKClosestElements(arr, k, n) {
    let closest = [];

    let pivot =  binarySearch();
    let left_pointer = pivot - 1;
    let right_pointer = pivot + 1;

    if (arr[pivot] != n) {
        closest.push(pivot);
    }

    while(closest.length < k && (left_pointer >= 0 || right_pointer < arr.length)) {
        let left = Number.MIN_VALUE, right = Number.MIN_VALUE;

        if (left_pointer >= 0) {

        }
    }
}

function binarySearch(arr, n) {
    let low = 0;
    let high = arr.length - 1;

    while (low <= high) {
        let mid = Math.floor((high- low)/2) + low;

        if (arr[mid] === n) {
            return mid;
        }
        else if (arr[mid] < n) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }

    return Math.abs(arr[low] - n) < Math.abs(arr[high] - n) ? low : high;
}