package DAL;
import hibernate.entity.thietbi;
import hibernate.entity.xuly;
import hibernate.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class XuLyDAL {
    static SessionFactory factory;

    public XuLyDAL(){ factory = HibernateUtil.getSessionFactory();}

    public  List<xuly> ReadXuLy() {
        Session session = factory.openSession();
        Transaction tx = null;
        List<xuly> list = null;
        try {
            tx = session.beginTransaction();
            list = session.createQuery("FROM xuly", xuly.class).list();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
    public int CreateXuLy(xuly xl){
        Session session = factory.openSession();
        int result = 0;
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(xl);
            tx.commit();
            result = 1;
        }catch (HibernateException e){
            if (tx !=null){
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;

    }
    public int UpdateXuLy(xuly xl) {
        Session session = factory.openSession();
        Transaction tx = null;
        int result = 0;
        try {
            tx = session.beginTransaction();
            session.update(xl);
            tx.commit();
            result = 1;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }
    public int DeleteXuLy(int id) {
        Session session = factory.openSession();
        Transaction tx = null;
        int result = 0;
        try {
            tx = session.beginTransaction();
            xuly xl = session.get(xuly.class, id);
            if (xl != null) {
                session.delete(xl);
                tx.commit();
                result = 1;
            } else {
                result = 0;
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

    public xuly GetXuLyById(int maXl) {
        Session session = factory.openSession();
        xuly obj = null;
        try {
            String hql = "FROM xuly WHERE TrangThaiXL = 1 AND MaXL = :maXl";
            Query<xuly> query = session.createQuery(hql, xuly.class);
            query.setParameter("maXl", maXl);
            obj = query.uniqueResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return obj;
    }
    public List<xuly> Search(String txt) {
        Session session = factory.openSession();
        List<xuly> result = null;
        try {
            String hql;
            Integer maXuLy = null;
            try {
                maXuLy = Integer.parseInt(txt);
            } catch (NumberFormatException e) {}
            if (maXuLy != null) {
                hql = "FROM xuly WHERE MaXL = :maXuLy";
            } else {
                hql = "SELECT xl FROM xuly xl JOIN thanhvien tv ON tv.MaTV = xl.MaTV WHERE tv.HoTen LIKE CONCAT('%', :txt, '%')";
            }

            Query<xuly> query = session.createQuery(hql, xuly.class);

            if (maXuLy != null) {
                query.setParameter("maXuLy", maXuLy);
            } else {
                query.setParameter("txt", txt);
            }

            result = query.getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }
    public int AutoCreate(){
        Session session=factory.openSession();Integer matt=null;
        try{
            String hql="SELECT MaXL FROM xuly ORDER BY MaXL DESC";
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

}
