//package pl.kobietydokodu.bazakotow.model;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.sql.DataSource;
//import javax.transaction.Transactional;
//
//@Repository
//public class KotDAO {
//    //List<Kot> koty = new ArrayList<Kot>();
//
//    @PersistenceContext
//    EntityManager entityManager;
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Transactional
//    public void dodajKota(Kot kot){
//        entityManager.merge(kot);
//        //----------------------JDBC-------------------------
////        String sql = "INSERT INTO koty" +
////        "(ID, IMIE_KOTA, DATA_URODZENIA, WAGA, IMIE_OPIEKUNA) VALUES (?,?,?,?)";
////        Connection conn = null;
////
////        try {
////            conn = dataSource.getConnection();
////            PreparedStatement ps = conn.prepareStatement(sql);
////            ps.setString(1,kot.getImie());
////            java.sql.Date sDate = new java.sql.Date(kot.getDataUrodzenia().getTime());
////            ps.setDate(2,sDate);
////            ps.setFloat(3,kot.getWaga());
////            ps.setString(4, kot.getImieOpiekuna());
////
////            ps.executeUpdate();
////            ps.close();
////        } catch (SQLException e) {
////            throw new RuntimeException(e);
////        } finally {
////            if (conn != null) {
////                try {
////                    conn.close();
////                } catch (SQLException e) {
////                }
////            }
////        }
////            koty.add(kot);
//    }
//
////    public Boolean czyPusta(){
////        return koty.isEmpty();
////    }
//
//    @Transactional
//    public List<Kot> getKoty() {
//        Query query = entityManager.createQuery("SELECT k FROM Kot k");
//        List<Kot> koty = query.getResultList();
//        return koty;
//    }
//
//    @Transactional
//    public Kot getKotById(Integer id){
////        String sql = "SELECT * FROM koty WHERE KOT_ID=?";
////        Connection conn = null;
////
////        try{
////            conn=dataSource.getConnection();
////            PreparedStatement ps = conn.prepareStatement(sql);
////            ps.setInt(1, id);
////            Kot kot = null;
////            ResultSet rs = ps.executeQuery();
////            if (rs.next()) {
////                kot = new Kot();
////                kot.setImie(rs.getString("KOT_IMIE"));
////                kot.setDataUrodzenia(rs.getDate("DATA_URODZENIA"));
////                kot.setWaga(rs.getFloat("WAGA"));
////                kot.setImieOpiekuna(rs.getString("IMIE_OPIEKUNA"));
////            }
////            rs.close();
////            ps.close();
////        } catch (SQLException e) {
////            throw new RuntimeException(e);
////        } finally {
////            if (conn != null) {
////                try {
////                    conn.close();
////                } catch (SQLException e) {}
////            }
////        }
////
////        if (id<koty.size()) {
////            return koty.get(id);
////        } else {
////            return null;
////        }
//        return entityManager.find(Kot.class, id);
//    }
//}