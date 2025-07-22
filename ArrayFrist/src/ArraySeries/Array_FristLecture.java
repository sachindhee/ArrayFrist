package ArraySeries;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.Scanner;

public class Array_FristLecture {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                   int temp= arr[i];
                   arr[i] =arr[j];
                   arr[j]=temp;

                }
            }
        }

        System.out.println();
        System.out.println("decreasing order");

        for(int i : arr)
        {
            System.out.print(i+ " ");
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j= i+1;j<arr.length;j++)
            {
                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }


                }
            }
        System.out.println();
        System.out.println("Increasing order");

        for (int i : arr)
        {
            System.out.print(i+" ");
        }

        int len = arr.length;
        int min = arr[0];
        System.out.println();
        System.out.println(min);

        System.out.println(arr[len-1]);


        }
    }
