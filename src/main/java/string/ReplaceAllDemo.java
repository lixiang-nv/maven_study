package string;

/**
 *String支持正则表达式的方法之三：
 *
 * String replaceAll(String regex,String str）
 * 将当前字符串满足正则表达式的部分替换为给定内容
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi789jkl";
        //将字符串的数字部分替换为“#NUMBER#”
    //     str = str.replaceAll("[0-9]+","#NUMBER#");
        //将满足的部分替换为空字符串可以达到“去除”的效果。
        str = str.replaceAll("[0-9]+","");
        System.out.println(str);

        //和谐用语
        String regex = "(djb|fk|nc|dsb|nmsl|wcnm|wqnmlgb|cnm)";
        String message = "fk!你个nc！你就是一个djb！";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
    }
}
