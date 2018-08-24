package com.accp.course.util;

import java.util.Arrays;

public class TestBubbleSort {

	public static void main(String[] args) {
		//int[] arr1 = new int[] {4,7,5,2,8,1,3,6};  //测试sort1
		//int[] arr1 = new int[] {5,8,6,9,1,2,3,4};  //测试sort2 
		int[] arr1 = new int[] {3,4,2,1,5,6,7,8}; 
		//test
		System.out.println("数组排序前:"+Arrays.toString(arr1));
		sort3(arr1);
		System.out.println("数组排序后:"+Arrays.toString(arr1));
	}	
	
	
	/**
	 * 原始冒泡排序
	 */
	public static void sort1(int[] arr) {
		int sortCount = 0;
		int temp = 0;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				sortCount++;
			}
		}
		System.out.println("共比较"+sortCount+"次");
	}
	
	/**
	 * 优化冒泡排序1
	 */
	public static void sort2(int[] arr) {
		int sortCount = 0;
		int temp = 0;
		for(int i = 0; i < arr.length-1; i++) {
			boolean isSorted = true;   //是否已经排序完成
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = false;
				}
				sortCount++;
			}
			if(isSorted) {
				break;
			}
		}
		System.out.println("共比较"+sortCount+"次");
	}
	
	/**
	 * 再次优化
	 */
	public static void sort3(int[] arr) {
		int sortCount = 0;
		int temp = 0;
		int lastChangeIndex = 0;  //记录最后一次交换的位置
		int sortBorder = arr.length - 1;  //无序数列的边界，每次只需要比较到这里为止
		for(int i = 0; i < arr.length - 1; i++) {
			boolean isSorted = true;
			for(int j = 0; j < sortBorder; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = false;
					lastChangeIndex = j;  //把无序数列的边界更新为最后一次交换元素的位置
				}
				sortCount++;
			}
			sortBorder = lastChangeIndex;
			if(isSorted) {
				break;
			}
		}
		System.out.println("共比较"+sortCount+"次");
	}
	
}
