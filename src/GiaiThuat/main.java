package GiaiThuat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        findChar("abcbdcef");
    }

    public static void findChar(String str) {
        List<String> list = new ArrayList<>();
        String[] array = new String[str.length()];
        String[] array2 = new String[20];
        array = str.split("");
        boolean flag = false;
        for (int i = 0; i < array.length-1; i++) {
        if(array[i] == (array[i+1])){
        list.add(array[i]);
        flag = true;
        } else {
            flag = false;
        }
        }
        if (flag){
            System.out.println(list);
        }else {
            System.out.println("Mang rong");
        }
    }
}