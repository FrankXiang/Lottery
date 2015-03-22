package com.xiang.practice;

import java.util.Random;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = getRandom(6,33);
		printLottery(array);
		

	}
	
	
	//获得随机数
	public static int[] getRandom(int size,int redIndex){
		int[] array = new int[size];
		Random random = new Random();
		int num = 0;
		boolean[] bool = new boolean[redIndex+1];	//后面要＋1，所以此处边界要注意
		for(int i = 0;i < size;i++){
			do{
				num = random.nextInt(redIndex)+1;	//随机数从0开始，所以要加上1
			}while(bool[num]);					 	//作重复数字校验
			bool[num] = true;
			array[i] = num;
		}
		return array;
	}
	
	public static void printLottery(int[] array){
		Random random = new Random();
		System.out.print("red balls:");
		for(int i:array)
		System.out.print(i+" ");
		System.out.println();
		System.out.println("blue ball:"+(random.nextInt(16)+1));
		
	}
	

}
