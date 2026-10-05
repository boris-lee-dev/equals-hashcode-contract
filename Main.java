import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1.5, 2.5);
        ComplexNumber num2 = new ComplexNumber(1.5, 2.5);
        ComplexNumber num3 = new ComplexNumber(3.0, 4.0);

        System.out.println("num1 равен num2? " + num1.equals(num2));
        System.out.println("num1 равен num3? " + num1.equals(num3));

        System.out.println("hashCode num1: " + num1.hashCode());
        System.out.println("hashCode num2: " + num2.hashCode());
        System.out.println("hashCode num3: " + num3.hashCode());
    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ComplexNumber that = (ComplexNumber) o;

            return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(re, im);
        }
    }
}