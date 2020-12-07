package Test;

public class StringMethod {
    public static void main(String[] args) {
        String str = "lilei is a big stupid pig!";
        String str2 = "aaa";
        String str3 = "";
        String str4 =  "aaalilei is a big stupid pig!";
        String str5 = "Big";
        String str6 = "big";
        String str7 = "    lilei     ";

        //提取单个字符
        char ch = str.charAt(3);
        System.out.println(ch);//e
        //连接字符串，创建一个新对象
        System.out.println(str2.concat(str));//aaalilei is a big stupid pig!
        System.out.println(str3.length());//0
        System.out.println(str2.concat(str3)==str2);//true，str3长度为0，返回原对象
        System.out.println(str2.concat(str)==str4);//false
        //比较
        System.out.println(str5.equals(str6));//false
        System.out.println(str5.equalsIgnoreCase(str6));//true，忽略大小写
        //io流
        System.out.println(str.getBytes());
        //指定字符或子串第一次出现索引
        System.out.println(str.indexOf("lilei"));//0
        System.out.println(str.indexOf("b"));//11
        //替换
        System.out.println(str.replace("lilei","gaoxuebo"));//gaoxuebo is a big stupid pig!
        //开始结束
        System.out.println(str.startsWith("lilei"));//true
        System.out.println(str.endsWith("!"));//true
        //大小写
        System.out.println(str.toUpperCase());//LILEI IS A BIG STUPID PIG!
        System.out.println(str.toLowerCase());//lilei is a big stupid pig!
        //副本，去除前后空白
        System.out.println(str7);//    lilei
        System.out.println(str7.trim());//lilei

        System.out.println(false&&true);
        System.out.println(true||false);
        System.out.println(!false||!true);
        System.out.println(!false&&!true);

        String a = "aaa";
        String b = null;
        System.out.println(b.equals(a));
//        System.out.println(a.equals(b));

    }
}
