public class Bai4 {
    public String truyXuat2PhanTu(int[] arr, int index1,int index2) {
        if (arr == null || index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            throw new IllegalArgumentException("Invalid array or index");
        }
        return arr[index1] +", "+ arr[index2] ;
    }
    public int truyXuat1PhanTu(int[] arr, int index1) {
        if (arr == null || index1 < 0 || index1 >= arr.length) {
            throw new IndexOutOfBoundsException("Invalid array or index");
        }
        return arr[index1];
    }
}
