package BLL;

import DAL.XuLyDAL;
import hibernate.entity.thietbi;
import hibernate.entity.xuly;

import java.util.List;

public class XuLyBLL {
    XuLyDAL xlDal;
    public XuLyBLL() {
        xlDal = new XuLyDAL();
    }

    public List GetAllXuLy() {
        return xlDal.ReadXuLy();
    }

    public int AddXuLy(xuly xl) {
        return xlDal.CreateXuLy(xl);
    }

    public int EditXuLy(xuly xl) {return xlDal.UpdateXuLy(xl);}

    public int RemoveXuLy(int id) {
        return xlDal.DeleteXuLy(id);
    }
    public xuly GetXuLyById(int maXl) {
        return xlDal.GetXuLyById(maXl);
    }
    public List<xuly> SearchXuLy(String txt) {
        return xlDal.Search(txt);
    }
    public int AuToID(){return xlDal.AutoCreate();}
}
