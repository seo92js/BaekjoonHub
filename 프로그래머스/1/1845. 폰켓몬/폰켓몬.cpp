#include <vector>
#include <set>

using namespace std;

int solution(vector<int> nums)
{
    set<int> poketmon;
    
    for(int num : nums) {
        poketmon.insert(num);
    }
    
    return poketmon.size() >= nums.size() / 2 ? nums.size() / 2 : poketmon.size();
}