class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        HashMap<Integer, Integer> hMap1=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        

        for(int n1 : nums1)
        {
            hMap1.put(n1, hMap1.getOrDefault(n1, 0)+1);

        }
        for(int n2 : nums2)
        {
            if(hMap1.containsKey(n2) && hMap1.get(n2) > 0)
            {
                result.add(n2);
                hMap1.put(n2, hMap1.get(n2) - 1);
            }
        }

        int answer[]=new int[result.size()];
        int index=0;
        for(int n : result)
        {
            answer[index++]=n;
        }
        return answer;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();

        int arr1[]=new int[size1];
        int arr2[]=new int[size2];

        for(int i=0; i<size1; i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<size2; i++)
        {
            arr2[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.intersect(arr1, arr2);



        sc.close();
    }
}