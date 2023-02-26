package ppu.edu;

import java.util.ArrayList;

public class SumExpert {
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(ArrayList<Integer>arr){
        int sum =0 ;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        return sum;
    }

}
