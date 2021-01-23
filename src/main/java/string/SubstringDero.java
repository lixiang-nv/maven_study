package string;

/**
 * String substring(int start,int end)
 * 截获指定范围内的字符串。两个参数分别是范围对应的下标。
 * 注：JAVA API中使用两个数字表示范围时都是“含头不含尾”的。
 */
public class SubstringDero {
    public static void main(String[] args) {
        //             01234567890
        String host = "www.tedu.cn";

        String sub = host.substring(4,8);
        System.out.println(sub);//tedu
        //重载的substring传入一个参数为:从指定位置截取到字符串末尾
        sub = host.substring(4);
        System.out.println(sub);//tedu.cn
    }



}
