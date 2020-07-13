

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    var newArr = nums.filter((v,i,a) => a.indexOf(v) === i).sort((a,b) => a-b);

    return (newArr.length > 1) ? newArr[newArr.length - 2] : newArr[0];
}




/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    if (nums.length == 1) {
        return nums[0];
    } else {
        nums.sort((a,b) => b - a);
        return Array.from(new Set(nums))[1];
    }
}


