package calculadora;

public class calculadora {
    private int num1;
    private int num2;

    public calculadora (int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int suma() {
        int result = num1 + num2;
        return result;
    }

    public int multiplica() {
        int result = num1 * num2;
        return result;
    }

    public int resta() {
        int result = num1 - num2;
        if (resta21())
            result = num1 - num2;
        else
            result = num2 - num1;
        return result;

    }

    public boolean resta21() {
        if (num1 >= num2)
            return true;
        else
            return false;
    }

    public Integer divide2() {
        if (num2 == 0) return null;

        int resul = num1/num2;
        return resul;
    }

}