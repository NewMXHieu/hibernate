package BLL;

import DAL.ThanhVienDAL;
import hibernate.entity.thanhvien;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ThanhVienBLL {
    private ThanhVienDAL tvDal;

    public ThanhVienBLL(){
        tvDal = new ThanhVienDAL();
    }
    public String GetHoTenByID(int id) {
        return tvDal.GetHoTenById(id);
    }
    public List GetAllThanhVien(){
        return tvDal.ReadThanhVien();
    }
    public List<thanhvien>GetThanhVienToDelete(int matv){
        return tvDal.GetThanhVienToDelete(matv);
    }
    public List GetAllThanhVien1(){
        return tvDal.GetAllThanhVien();
    }
    public int AddThanhVien(thanhvien tv){
        return tvDal.CreateThanhVien(tv);
    }
    public ArrayList<String> getListKhoa() {
    	return tvDal.getListKhoa();
    }
    public ArrayList<String> getListNganh(){
    	return tvDal.getListNganh();
    }
    public int EditThanhVien(thanhvien tv){return tvDal.UpdateThanhVien(tv);}
    public int RemoveThanhVien(thanhvien tv){return tvDal.DeleteThanhVien(tv);}
    public int ImportExcel(File file){return tvDal.ImporExcel(file);}
    public thanhvien getById(int maTV) {return tvDal.GetById(maTV);}

    public long CheckMaTTExists(int maTV){return tvDal.isMaTVExists(maTV);}
    public long checkViPham(int matv){
        return tvDal.Countvipham(matv);
    }
}
