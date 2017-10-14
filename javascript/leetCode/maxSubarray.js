
function findMaxSubarray(nums) {
    let n = nums.length;
    let dp = [];
    let max = Number.NEGATIVE_INFINITY;
    let max_i = 0;
    let max_j = 0;

    let contSum = Number.NEGATIVE_INFINITY;

    for (let i = 0; i < n; i++) {
        dp[i] = [];
        dp[i][i] = nums[i];
        setMax(dp[i][i], i, i);

        if (contSum == Number.NEGATIVE_INFINITY)
            contSum = dp[i][i];
        else
            contSum += dp[i][i];
        dp[0][i] = contSum;
        setMax(contSum, 0, i);

    }

    for (let i = n - 1; i > 1; i--) {
        for (let j = n - 2; j >= 1; j--) {
            setMax(dp[0][i] - Math.abs(dp[0][j-1]), i, j);
        }
    }

    function setMax(val, i, j) {
        if (max < val) {
            max = val;
            max_i = i;
            max_j = j;
            console.log("max "+max);
            console.log("i "+max_i);
            console.log("j "+max_j);
        }
    }

    return nums.slice(max_i, max_j+1);
};

console.log(findMaxSubarray([-2,-2,-3,0,-3,1,-3]));