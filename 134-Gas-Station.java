class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       
        int totalCost = 0;
        int totalGas = 0;
        for (int i = 0; i < gas.length; i++) {
            totalCost += cost[i];
            totalGas += gas[i];
        }

            if (totalGas < totalCost) {
                return -1;
            }
        int start = 0;
        int remaining = 0;
        int i =0;
        
        while(i<gas.length){
            
            if (gas[i] + remaining >= cost[i]) {
                remaining += gas[i] - cost[i];
                i++;
            }
            else{
              start = i+1;
              remaining = 0;
              i++;
            }
            
        }

        return start;
       
    }
}