def sumSubsets(arr, num):
    subsets = []

    def findSubsets(sum, set, index):
        if sum == num and set not in subsets:
            subsets.append(set)

        for j in range(index, len(arr)):
            curr = arr[j]
            if sum + curr <= num:
                copySet = set[:]
                copySet.append(curr)
                findSubsets(sum + curr, copySet, j+1)

    for i in range(len(arr)):
        element = arr[i]
        curr_set = [element]
        findSubsets(element, curr_set, i+1)

    if len(subsets) == 0:
        subsets.append([])

    return subsets
