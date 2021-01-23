package string;
/**
 * booleam startsWith(String str)
 * 判断字符串是否是以给定的字符串开始的
 *
 * booleam endsWith(String str)
 * 判断字符串是否是以给定的字符串结尾的
 */
public class StartsWithDome {
    public static void main(String[] args) {
        String str = "www.tedu.cn";

        //判断str是否是以“www”开始的
        boolean starts = str.startsWith("www");
        System.out.println("starts:"+starts);//true

        //判断str是否是以".cn"结尾的
        boolean ends = str.endsWith(".cn");
        System.out.println("ends:"+ends);
    }
}
