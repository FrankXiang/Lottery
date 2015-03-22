package com.xiang.practice;

import java.util.Random;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = getRandom(6,33);
		printLottery(array);
		

	}
	
	
	//��������
	public static int[] getRandom(int size,int redIndex){
		int[] array = new int[size];
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
	
	public static void printLottery(int[] array){
		Random random = new Random();
		System.out.print("red balls:");
		for(int i:array)
		System.out.print(i+" ");
		System.out.println();
		System.out.println("blue ball:"+(random.nextInt(16)+1));
		
	}
	

}
