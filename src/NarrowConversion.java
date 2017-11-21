public class NarrowConversion {
    public static void main(String[] args){
        int iValue = 233;
        //强制把一个int 类型转换成byte转换成int类型
        byte bValue = (byte)iValue;
        //将输出-23
        System.out.println(bValue);
        double dValue = 3.98;
        //强制把一个double类型转换成int类型ys
        int tol = (int)dValue;
        //将输出3
        System.out.println(tol);
        float a = 5.6f;

    }
}
