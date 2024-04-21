package DAL;
import hibernate.entity.thongtinsd;
import hibernate.utils.HibernateUtil;
import org.apache.xmlbeans.impl.xpath.XQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ThongTinSDDAL {
    static SessionFactory factory;
    public ThongTinSDDAL(){
        factory=HibernateUtil.getSessionFactory();
    }

    public int AddTTSD(thongtinsd ttsd) {
        try (Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(ttsd);
            tx.commit();
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int UpdateTTSD(thongtinsd ttsd) {
        try (Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(ttsd);
            tx.commit();
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 0;
        }
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
        try (Session session = factory.openSession()) {
            Query<thongtinsd> query = session.createQuery("FROM thongtinsd WHERE MaTV = :maTV AND MaTB = :maTB AND TGTra IS NULL", thongtinsd.class);
            query.setParameter("maTV", matv);
            query.setParameter("maTB", matb);
            return query.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

}
