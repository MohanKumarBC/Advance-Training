package Day02;




import java.util.*;

public class FindingFrequency {
	public static void findFrequency(int[] nums,int left,int right,Map<Integer,Integer>freq) 
	{
		if(left>right)
		{
			return;
		}
		if(nums[left]==nums[right])
		{
			Integer count=freq.get(nums[left]);
			if(count==null)
			{
				count=0;
			}
			freq.put(nums[left],count + (right-left+1));
			return;
		}
		int mid=(left+right)/2;
		findFrequency(nums,left,mid,freq);
		findFrequency(nums,mid+1,right,freq);
	
	}
	public static void main(String[] args)
	{
		int[] nums= {2,2,3,3,3,4,4,5,5,7,9,9};
		Map<Integer,Integer> freq =new HashMap<>();
		findFrequency(nums, 0,nums.length-1,freq);
		System.out.println(freq);
	}
}