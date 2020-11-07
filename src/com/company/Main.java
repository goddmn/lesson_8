package com.company;

public class Main {

    public static void main(String[] args) {
	    int num = 10;
	    int nums[] = {1,2,3,4,5};
	    int[] nums_2 = new int[5];
	    nums_2[0] = 1;
	    nums_2[1] = 2;

	    if (num <= 10){
            System.out.println("Число верное");
        } else  {
            System.out.println("Число не верное");
        }

	    switch (num){
            case 5:
                System.out.println("Число равно 5");
                break;
            case 10:
                System.out.println("Число равно 10");
                break;
            default:
                System.out.println("Число не распознано");
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Число равно: " + i);
        }

        for (int value : nums){
            System.out.println(value);
        }

        additional();
        additional(10, 30);
    }

    public static void additional(){
        System.out.println(10 * 30);
    }

    public static void additional(int num_1, int num_2){
        System.out.println(num_1 * num_2);
    }
}
