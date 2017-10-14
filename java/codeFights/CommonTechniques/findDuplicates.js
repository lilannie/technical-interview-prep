/*
Given an array of integers, write a function that determines whether the array contains any duplicates.
Your function should return true if any element appears at least twice in the array,
and it should return false if every element is distinct.
 */
function containsDuplicates(a) {
    if (a.length <= 1) return false;
    // O(nlogn)
    a = a.sort();

    for (let i = 1; i < a.length; i++) {
        if (a[i-1] == a[i])
            return true;
    }

    return false;
}
