class Solution {
public:
    bool isPowerOfTwo(int n) {
        int num = 1;
        for (int i = 0; i <= 30; i++){
            if (num == n) {return true;}
            num = num << 1;
        }
        return false;
    }
};