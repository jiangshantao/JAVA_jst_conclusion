public class AutoConversion {
    public static void main(String[] args){
        int a = 6;
        // int 类型可以转换成float类型
        float f = a;
        //下面将输出6.0
        System.out.println(f);
        //定义一个byte类型的整数变量
        byte b = 9;
        //下面的代码将出错,byte类型不能自动转换成char类型
        //char c = b;
        //byte 类型可以自动转换成double类型
        double e = b;
        //下面将输出9.0
        System.out.println(e);
    }
}
/*JAVA自动转换类型如⬇
*             char↘
* byte➡short➡ int ➡long➡ float➡ double
* 8bit 16bit  32bit 64bit  32bit  64bit
*/
