import java.util.*;
class Solution 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int result[]=new int[arr1.length];
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num : arr1)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int index=0;
        for(int num : arr2)
        {
            int count=map.get(num);

            while(count > 0)
            {
                result[index++] = num;
                count--;
            }
            map.remove(num);
        }

        ArrayList<Integer> remainingList=new ArrayList<>();
        for(int key : map.keySet())
        {
            int count=map.get(key);

            while(count > 0)
            {
                remainingList.add(key);
                count--;
            }
        }

        Collections.sort(remainingList);
        for(int num : remainingList)
        {
            result[index++] = num;
        }

        return result;

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        
        int arr1[]=new int[size1];
        for(int i=0; i<size1; i++)
        {
            arr1[i]=sc.nextInt();
        }

        int arr2[]=new int[size2];
        for(int i=0; i<size2; i++)
        {
            arr2[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.relativeSortArray(arr1, arr2);

        sc.close();
    }

}