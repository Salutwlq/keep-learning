/**
 * Lambda ���ʽ��Ҳ�ɳ�Ϊ�հ��������ƶ� Java 8 ����������Ҫ�����ԡ�
 * Lambda ����Ѻ�����Ϊһ�������Ĳ�����������Ϊ�������ݽ������У���
 * ʹ�� Lambda ���ʽ����ʹ�����ĸ��Ӽ����ա�
 *
 * ��ѡ��������������Ҫ�����������ͣ�����������ͳһʶ�����ֵ��
 * ��ѡ�Ĳ���Բ���ţ�һ���������趨��Բ���ţ������������Ҫ����Բ���š�
 * ��ѡ�Ĵ����ţ�������������һ����䣬�Ͳ���Ҫʹ�ô����š�
 * ��ѡ�ķ��عؼ��֣��������ֻ��һ�����ʽ����ֵ����������Զ�����ֵ����������Ҫָ�������ʽ������һ����ֵ��
 *
 *
 * lambda ���ʽֻ�����ñ���� final �����ֲ������������˵������ lambda �ڲ��޸Ķ���������ľֲ������������������
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
