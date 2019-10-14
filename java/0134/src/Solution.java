class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sub = 0;
        int index = 0;
        int rest = 0;
        for (int i = 0; i < gas.length; i++) {
            sub += gas[i] - cost[i];
            rest += gas[i] - cost[i];
             if(rest < 0){
                index = i + 1;
                rest = 0;
            }
        }
        if (sub < 0) {
            return -1;
        }
        return index;
    }
}