package com.xiang.practice;

import java.util.Random;
import java.util.TreeSet;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array[] = getRandom(6,33);
		Integer[] array = getRandomSet(6,33);
		printLottery(array);
		

	}
	
	
	//��������
	private static int[] getRandom(int size,int redIndex,int[] array){
		Random random = new Random();
		int num = 0;
		boolean[] bool = new boolean[redIndex+1];	//����Ҫ��1�����Դ˴��߽�Ҫע��
		for(int i = 0;i < size;i++){
			do{
				num = random.nextInt(redIndex)+1;	//�������0��ʼ������Ҫ����1
			}while(bool[num]);					 	//���ظ�����У��
			bool[num] = true;
			array[i] = num;
		}
		return array;
	}
	
	//ͨ��treeSet��������������
	private static Integer[] getRandomSet(int size,int redIndex){
		Integer[] array = new Integer[size];
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random random = new Random();
		int count = 0;
		while(count < size){
			boolean succeed = set.add(random.nextInt(redIndex)+1);
			//System.out.println(succeed);
			if(succeed)count++;
		}
		return set.toArray(array);
		
	}
	
	private static void printLottery(Integer[] array){
		Random random = new Random();
		System.out.print("red balls:");
		for(int i:array)
		System.out.print(i+" ");
		System.out.println();
		System.out.println("blue ball:"+(random.nextInt(16)+1));
		
	}
	
	//it is a test
}
