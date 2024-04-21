package DAL;
import hibernate.entity.thongtinsd;
import hibernate.utils.HibernateUtil;
import org.apache.xmlbeans.impl.xpath.XQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ThongTinSDDAL {
    static SessionFactory factory;
    public ThongTinSDDAL(){
        factory=HibernateUtil.getSessionFactory();
    }

    public int AddTTSD(thongtinsd ttsd){
        Session session=factory.openSession();
        int result=0;
        Transaction tx=null;
        try{
            tx=session.beginTransaction();
            session.save(ttsd);
            tx.commit();
            result=1;
        }catch (HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally
            {
                session.close();
            }
        return result;
    }
    public int UpdateTTSD(thongtinsd ttsd){
        Session session=factory.openSession();
        Transaction tx=null;
        int result=0;
        try{
            tx = session.beginTransaction();
            session.update(ttsd);
            tx.commit();
            result = 1;
        }catch (Exception ex){
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return result;
    }


    public List<thongtinsd> ReadTTSD(){
        Session session=factory.openSession();
        Transaction tx =null;
        List<thongtinsd>list=null;
        try{
            tx= session.beginTransaction();
            list=session.createQuery("FROM thongtinsd", thongtinsd.class).list();

        }catch (HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return list;
    }
    public List<thongtinsd> searchTTSD(Date date, String khoa, String nganh){
        Session session=factory.openSession();
        Transaction tx =null;
        List<thongtinsd>list=null;
        try{
    		tx= session.beginTransaction();
        	String hql = "SELECT tt FROM thongtinsd tt JOIN thanhvien tv ON tt.thanhvien = tv.MaTV WHERE ";
        	if (date != null) {
        		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        		String dateString = sdf.format(date);
        		hql += "TGVao between '"+dateString+" 00:00:00' AND '"+dateString+" 23:59:59' AND ";
        	}
        	hql += "Khoa = COALESCE(:khoa, Khoa) AND Nganh = COALESCE(:nganh,Nganh)";
            Query<thongtinsd> query = session.createQuery(hql, thongtinsd.class);
        	if(khoa != null) {
        		query.setParameter("khoa", khoa);
        	} else query.setParameter("khoa", null);
        	if(nganh != null) {
        		query.setParameter("nganh", nganh);
        	} else query.setParameter("nganh", null);
        	list = query.getResultList();
        }catch (HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return list;

    }
    public List<thongtinsd> readTVById(int matv){
        Session session=factory.openSession();
        List<thongtinsd>result =null;
        try{
            String hql="FROM thongtinsd WHERE MaTV= : maTV";
            Query<thongtinsd>query =session.createQuery(hql, thongtinsd.class);
            query.setParameter("maTV",matv);
            result=query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return result;
    }
    public int AutoCreate(){
        Session session=factory.openSession();
        Integer matt=null;
        try{
            String hql="SELECT MaTT FROM thongtinsd ORDER BY MaTT DESC";
            Query<Integer>query=session.createQuery(hql,Integer.class);
            query.setMaxResults(1);
            matt=query.uniqueResult();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return matt;
    }
    public thongtinsd UpdateMuon(int matv, int matb) {
        Session session = factory.openSession();
        thongtinsd obj = null;
        try {
            String hql = "FROM thongtinsd tt WHERE tt.MaTV = :maTV AND tt.MaTB = :maTB AND TGTra IS NULL";
            Query<thongtinsd> query = session.createQuery(hql, thongtinsd.class);
            query.setParameter("maTV", matv);
            query.setParameter("maTB", matb);
            obj = query.uniqueResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return obj;
    }

}
