package string;

/**
 * String toLowerCase()
 * 将当前字符串中的英文部分转换为全小写
 *
 * String toUpperCase（）
 * 将当前字符串中的英文部分转换为全大写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java";
        System.out.println(str);

        String upper = str.toUpperCase();
        System.out.println(upper);

        String lower = str.toLowerCase();
        System.out.println(lower);

        //验证码忽略大小写使用
        String code = "Ae3fH";
        String input = "ae3fh";
        code = code.toLowerCase();
        input = input.toLowerCase();
        if(code.equals(input)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
