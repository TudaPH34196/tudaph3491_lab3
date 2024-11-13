import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test5 {
 Bai5 truyXuatMaNhanVienTuMotPhongBan = new Bai5();
    @Test
    public void testCaseDumg(){
        assertEquals("Dinh ANh Tu",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("Dinh ANh Tu"));
    }
    @Test
    public void testCaseDumg1(){
        assertEquals("Tran Linh",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("Tran Linh"));
    }
    @Test
    public void testCaseDumg2(){
        assertEquals("Quang Huy",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("Quang Huy"));
    }
    @Test
    public void testCaseChuaTaoMaNhanVien(){
        assertThrows(NullPointerException.class,() -> {truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH33");});
    }
    @Test
    public void testCaseDumg5(){
        assertEquals("PH4",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH4"));
    }
    @Test
    public void testCaseDumg6(){
        assertEquals("PH3",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH5"));
    }
    @Test
    public void testCaseDumg7(){
        assertEquals("PH6",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH6"));
    }
    @Test
    public void testCaseDumg8(){
        assertEquals("PH7",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH7"));
    }
    @Test
    public void testCaseDumg9(){
        assertEquals("PH8",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH8"));
    }
    @Test
    public void testCaseDumg10(){
        assertEquals("PH5",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH6"));
    }
}
