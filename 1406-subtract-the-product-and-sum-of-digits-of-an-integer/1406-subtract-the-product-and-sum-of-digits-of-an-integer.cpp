class Solution {
public:
    int subtractProductAndSum(int n) {
        int digit;
        int sum = 0;
        int product = 1;

        while (n != 0){
            digit = n % 10;
            n /= 10;
            sum += digit;
            product *= digit;
        }

        return (product - sum);
    }
};