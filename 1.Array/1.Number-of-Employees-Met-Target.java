class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        
        
        ArrayList<Integer> res = new ArrayList<>();
        
        
        for(int i=0; i<hours.length; i++){
            
            if(hours[i] >= target){
                res.add(hours[i]);
                
            }
        }
        
        return res.size();
        
    }
}