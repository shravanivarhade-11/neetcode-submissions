

class Solution {
public List<List<Integer>> threeSum(int[] nums) {

List<List<Integer>> ans = new ArrayList<>();

// Step 1: Sort the array
Arrays.sort(nums);

// Step 2: Fix one element
for (int i = 0; i < nums.length - 2; i++) {

// Skip duplicate fixed elements
if (i > 0 && nums[i] == nums[i - 1]) {
continue;
}

// Two pointers
int l = i + 1;
int r = nums.length - 1;

while (l < r) {

int sum = nums[i] + nums[l] + nums[r];

if (sum < 0) {
l++;        // Need a bigger sum
}
else if (sum > 0) {
r--;        // Need a smaller sum
}
else {

// Found a triplet
ans.add(Arrays.asList(nums[i], nums[l], nums[r]));

l++;
r--;

// Skip duplicate left values
while (l < r && nums[l] == nums[l - 1]) {
l++;
}

// Skip duplicate right values
while (l < r && nums[r] == nums[r + 1]) {
r--;
}
}
}
}

return ans;
}
}