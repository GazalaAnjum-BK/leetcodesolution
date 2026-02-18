class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]==9)
            {
               digits[i]=0;

            }else
            {
                digits[i]++;
                return  digits;
            }
            
        }
        int [] Array=new int[n+1];
         Array[0]=1;
        return Array;

        }
}