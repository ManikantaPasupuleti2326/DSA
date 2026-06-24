import java.util.Scanner;

class Solution 
{
    public int maxArea(int[] height) 
    {
        int left=0;
        int right=height.length-1;
        int maxArea=0;

        while(left < right)
        {
            int width=right-left;
            int minHeight=Math.min(height[left],height[right]);
            int area=width*minHeight;
            maxArea=Math.max(area,maxArea);

            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int heights[]=new int[size];
        for(int i=0;i<size;i++)
        {
            heights[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        int result=sol.maxArea(heights);
        System.out.println(result);




        sc.close();
    }
}