
function findMaxSubarray(nums) {
    let max = nums[0];
    let curr_max = nums[0];
    let start = 0;
    let end = 0;

    for (let i = 1; i < nums.length; i++) {
        if (curr_max + nums[i] < nums[i]) {
            start = i;
            end = i;
            curr_max = nums[i];
        }
        else {
            curr_max += nums[i];
        }

        if (curr_max > max) {
            end = i;
        }

        max = Math.max(max, curr_max);
    }

    console.log(start);
    console.log(end);
    return max;
};

console.log(findMaxSubarray([-2,1,-3,4,-1,2,1,-5,4]));