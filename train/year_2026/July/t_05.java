package train.year_2026.July;

public class t_05 {

    public static void main(String[] args) {
        StringBuilder sBu=new StringBuilder();
        sBu.append("Hello").append("World");
        System.out.println(sBu);
        System.out.println(sBu.insert(5,"Beautiful"));
        System.out.println(sBu.reverse());              //反转

        sBu.delete(0,4);                        //删除指定的字符
        System.out.println(sBu);

        StringBuffer strBuff=new StringBuffer("Java");
        strBuff.append("Buffer");
        System.out.println(strBuff);
    }

}
