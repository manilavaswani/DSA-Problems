# Problem: Check if Array Is Sorted and Rotated
# Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
# Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
# There may be duplicates in the original array.
# Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.



class Solution(object):
    def check(self, nums):
        length = len(nums)
        count = 0

        if length == 1:  
            return True 

        for i in range(length - 1):  
            if nums[i] > nums[i + 1]:  
                count += 1  

        if nums[length - 1] > nums[0]:  
            count += 1  

        return count <= 1

# Example usage
sol = Solution()
print(sol.check([3, 4, 5, 1, 2]))  # Expected Output: True
print(sol.check([1, 2, 3, 4, 5]))  # Expected Output: True
print(sol.check([2,1,3,4])) #Expected Output: False