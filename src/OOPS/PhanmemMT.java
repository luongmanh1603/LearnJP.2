package OOPS;

public class PhanmemMT implements MayTinhBoTui, Sapxep{
    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        return a/b;
    }

    @Override
    public void sxTang(double[] arr) {

    }

    @Override
    public void sxGiam(double[] arr) {

    }
}
