package train.year_2026.July;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class t_26 {
    private static Scanner scan;

    public static void main(String[] args) {
        InputStream inp=null;
        try {
            inp=new FileInputStream(new File("src","test.txt"));
            System.setIn(inp);
            scan=new Scanner(System.in);
            int n=scan.nextInt(),ret=0;
            int[] arr=new int[3];
            switch (n){
                case 0:
                    System.out.println(0);return;
                case 1:
                    ret=scan.nextInt();System.out.println(ret);return;
                case 2:
                    arr[0]=scan.nextInt();arr[1]=scan.nextInt();System.out.println(Math.min(arr[0],arr[1]));return;
            }
            arr[0]=scan.nextInt();
            arr[1]=scan.nextInt();
            for(int i=2;i<n;i++){
                ret=scan.nextInt();
                arr[2]=ret+Math.min(arr[0],arr[1]);
                arr[0]=arr[1];
                arr[1]=arr[2];
            }
            System.out.println(Math.min(arr[1],arr[2]));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
