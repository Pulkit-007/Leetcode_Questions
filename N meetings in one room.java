class Meeting{
    int start;
    int end;
    
    Meeting(int x,int y)
    {
        this.start=x;
        this.end=y;
        
    }
}

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        Meeting []arr=new Meeting[start.length];
        for (int i = 0; i < start.length; i++) {
            arr[i] = new Meeting(start[i], end[i]);
        }
        Arrays.sort(arr,(a,b)->a.end-b.end);
        
        int cnt=1;
        int freeTime=arr[0].end;
        for(int i=1;i<start.length;i++)
        {
            if(arr[i].start>freeTime)
            {
                cnt+=1;
                freeTime=arr[i].end;
                
            }
        }
        
        return cnt;
    }
}
