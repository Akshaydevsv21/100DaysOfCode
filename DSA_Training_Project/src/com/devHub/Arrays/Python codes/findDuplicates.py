class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        set1=set()
        for num in nums:
            if num in set1:
                return num
            set1.add(num)

        