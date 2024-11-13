import java.util.ArrayList;
import java.util.List;

public class Bai5 {
    public String truyXuatMaNhanVien(String maNhanVien){
        List<staff> listHoSo= new ArrayList<>();
        listHoSo.add(new staff("Dinh ANh Tu","TuDo"));
        listHoSo.add(new staff("Tran Linh","KinhDoanh"));
        listHoSo.add(new staff("Quang Huy","Sale"));
        listHoSo.add(new staff("Bui Phuong Anh","Sale"));
        listHoSo.add(new staff("PH5","Sale"));
        listHoSo.add(new staff("PH6","Sale"));
        listHoSo.add(new staff("PH7","Sale"));
        listHoSo.add(new staff("PH8","Sale"));


        for (staff a :listHoSo
        ) {
            if(a.getMaNV().equalsIgnoreCase(maNhanVien)){
                return a.getMaNV();
            }
        }
        throw new NullPointerException();
    }
}
