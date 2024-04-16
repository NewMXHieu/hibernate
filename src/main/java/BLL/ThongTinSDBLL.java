package BLL;


import DAL.ThongTinSDDAL;
import hibernate.entity.thongtinsd;

import java.util.List;

public class ThongTinSDBLL {
    ThongTinSDDAL ttDal;
    public ThongTinSDBLL(){ttDal=new ThongTinSDDAL();}

    public List GetAllThongTinSD(){
        return ttDal.ReadTTSD();
    }
    public List<thongtinsd> GetTVById(int matv){return ttDal.readTVById(matv);}

    public int AddThongTinSD(thongtinsd ttsd){
        return ttDal.AddTTSD(ttsd);
    }
    public int UpdateThongTinSD(thongtinsd ttsd){
        return ttDal.UpdateTTSD(ttsd);
    }
    public int AutoID(){return ttDal.AutoCreate();}
    public thongtinsd UpdateMuon(int matv,int matb){return ttDal.UpdateMuon(matv,matb);}
}
