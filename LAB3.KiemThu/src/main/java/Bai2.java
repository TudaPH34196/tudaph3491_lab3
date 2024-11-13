public class Bai2 {
    public double tinhThuong(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Devide by 0");
        }else{
            return (double) a/b;
        }
    }
}
