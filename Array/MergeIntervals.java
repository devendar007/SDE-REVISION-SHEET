class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans=new ArrayList<>();
         Arrays.sort(intervals,(a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
         });

        for(int i=0;i<intervals.length;i++){
              int st=intervals[i][0];
            int end=intervals[i][1];
        if(ans.size()==0){
          
            List<Integer> temp=new ArrayList<>();
            temp.add(st);
            temp.add(end);
            ans.add(temp);
        }
        else{
            if(ans.get(ans.size()-1).get(1)>=st){
                int max=Math.max(ans.get(ans.size()-1).get(1),end);
                ans.get(ans.size()-1).set(1,max);
            }
            else{
                  List<Integer> temp=new ArrayList<>();
            temp.add(st);
            temp.add(end);
            ans.add(temp);
            }
        }
        }
        int ans2[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            ans2[i][0]=ans.get(i).get(0);
            ans2[i][1]=ans.get(i).get(1);
        }
        return ans2;
    }
}