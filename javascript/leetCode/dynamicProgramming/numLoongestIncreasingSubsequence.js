function numLongestIncreasingSubsequence(nums) {
    let lis = [];
    let ways = [];
    let n = nums.length;
    for (let i = n-1; i >= 0; i--) {
        lis[i] = 1;
        ways[i] = 1;

        for (let j = i + 1; j < n; j++) {
            if (nums[j] > nums[i]) {
                if (1 + lis[j] > lis[i]) {
                    lis[i] = 1 + lis[j];
                    ways[i] = ways[j];
                }
                else if (1 + lis[j] == lis[i]) {
                    ways[i] += ways[j];
                }
            }
        }
    }
    console.log(lis);
    console.log(ways);
}

console.log(numLongestIncreasingSubsequence([1,3,5,4,7]));