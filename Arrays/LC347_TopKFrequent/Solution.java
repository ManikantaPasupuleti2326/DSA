class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer, Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());

        int result[]=new int[k];
        for(int i=0; i<k; i++)
        {
            result[i]=list.get(i).getKey();
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.topKFrequent(arr, k);



        sc.close();
    }
}