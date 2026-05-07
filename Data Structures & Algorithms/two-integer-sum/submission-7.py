class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
     map={}
     for i,v in enumerate(nums):
        remaining=target-v
        if remaining in map:
            return [map[remaining],i]
        map[v]=i
