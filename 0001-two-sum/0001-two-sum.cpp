class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> ht;
        map<int,int>::iterator it;
        for (int i = 0; i < nums.size(); i++){
            it = ht.find(target - nums[i]);
            if (it == ht.end()){
                ht.insert(pair<int,int>(nums[i],i));
            } else {
                return {i,it->second};
            }
        }
        return {0,0};
    }
};