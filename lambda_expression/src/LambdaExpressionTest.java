/**
 * Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
 * Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
 * 使用 Lambda 表达式可以使代码变的更加简洁紧凑。
 *
 * 可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
 * 可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
 * 可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
 * 可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
 *
 *
 * lambda 表达式只能引用标记了 final 的外层局部变量，这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
 *
 * @AUTHOR: liuquanwei
 * @DATE: 2019/1/25
 * @TIME: 14:37
 */


public class LambdaExpressionTest {
    public static void main(String[] args) {
        LambdaExpressionTest lambdaExpressionTest = new LambdaExpressionTest();
        MathOperation addition = (a, b) -> a +b;
        System.out.println(lambdaExpressionTest.operate(1,2,addition));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    public int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
