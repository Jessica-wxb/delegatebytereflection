package DesignMode.BuilderPattern.behavioralPattern.interpreterPattern.interpreterOne;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 14:39
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        String statement ="3*4/2%4";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        int result = calculator.compute();
        System.out.println(statement+"="+result);

    }

}
