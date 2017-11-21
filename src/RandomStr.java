public class RandomStr {
    //生成一个6位随机验证码的方法
    public static void main(String[] args){
        //定义一个空字符串
        String result = "";
        for (int i=0; i<6; i++){
            //生成一个0-9之间的int类型证书
            int intVal = (int)(Math.random() * 10);
            result = result + intVal;
            System.out.println(intVal);
        }
        System.out.println(result);
    }
}
