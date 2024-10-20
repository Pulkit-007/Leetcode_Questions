class Solution {
    static boolean isVowel(char[] arr, int i){

        char ic = arr[i];

         if(ic=='a' || ic=='e' || ic=='i' || ic=='o' || ic=='u' 
         || ic=='A' || ic=='E' || ic=='I' || ic=='O' || ic=='U' ){
                return true;
            }

            return false;
    }
    public String reverseVowels(String s) {
        char [] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            while(i<j && !isVowel(arr,i))
            {
                i++;
            }
            while(i<j && !isVowel(arr,j))
            {
              j--;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
        
    }
}
