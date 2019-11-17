package cn.jjdcn.leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Subject1
 * desc:
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那
 * 两个 整数，并返回他们的数组下标。你可以假设每种输入只会对应一个答案。
 * 但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/two-sum
 */

public class TowSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println("result = " + arrayToList(twoSum(nums, target)));
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			if (map.containsKey(comp)) {
				return new int[]{map.get(comp), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");

	}

	private static List arrayToList(int []array){

		List<Integer> list = new ArrayList<>();
		for (int a : array) {
			list.add(a);
		}
		return list;
	}
}
