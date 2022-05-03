package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 5");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
                if ((i == 2 && j == 0) || (i == 0 && j == 2)) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int colum : row) {
                System.out.print(colum + " ");
            }
            System.out.println();
        }
        System.out.println("Задание 6");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Задание 7");

        int [] array={5, 4, 3, 2, 1};
        for (int i= array.length-1;i>=0;i--){
            //ОГРОМНЫЙ ВОПРОС!!!!!!!
        }

        System.out.println("Задание 8");

        int [] b={-6,2,5,-8,8,10,4,-7,12,1};
        Arrays.sort(b);
        System.out.print(Arrays.toString(b));
        System.out.println();
        int first=0;
        int last=b.length-1;
        int sum=-2;
        while(first<last){
            int s=b[first]+b[last];
            if(s==sum) {
                first++;
                last--;
                System.out.println(b[first] + " " + b[last]);
            }else{
                if(s<sum) {
                    first++;
                }else{
                    last--;
                }

            }
        }

        }
    }
