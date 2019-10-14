public class RunMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] gas = {1,2,3,4,5};
        int[] cost = {5,3,1,2,4};
        int res = solution.canCompleteCircuit(gas, cost);
        System.out.println(res);
    }
}
