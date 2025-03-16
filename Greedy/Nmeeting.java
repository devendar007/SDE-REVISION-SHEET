class Solution {
  
    public int maxMeetings(int start[], int end[]) {
      int arr[][]=new int[start.length][2];
      for(int i=0;i<start.length;i++){
          arr[i][0]=start[i];
          arr[i][1]=end[i];
      }
      Arrays.sort(arr,(a,b)->{
          return Integer.compare(a[1],b[1]);
      });
      int count=1;
     int ed=arr[0][1];
      for(int i=1;i<arr.length;i++){
          if(ed>=arr[i][0])  continue;
          ed=arr[i][1];
          count++;
      }
      return count;
      
    }
}
