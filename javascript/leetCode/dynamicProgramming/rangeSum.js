/**
 * @param {number[]} nums
 */
var NumArray = function(nums) {
    this.cumSum = [];
    this.cumSum[0] = 0;

    sum = 0;
    for (let i = 1; i <= nums.length; i++) {
        sum += nums[i-1];
        this.cumSum[i] = sum;
    }
};

/**
 * @param {number} i
 * @param {number} j
 * @return {number}
 */
NumArray.prototype.sumRange = function(i, j) {
    return this.cumSum[j+1] - this.cumSum[i];
};

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = Object.create(NumArray).createNew(nums)
 * var param_1 = obj.sumRange(i,j)
 */