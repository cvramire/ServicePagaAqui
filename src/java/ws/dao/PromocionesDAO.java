/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.dao;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ws.dto.HibernateUtil;
import ws.model.Tpromociones;
/**
 *
 * @author Usuario
 */
public class PromocionesDAO {
    public Tpromociones buscaUsuario(int id){ 
        Session session = HibernateUtil.getSessionFactory().openSe­ssion(); 
        Tpromociones promocion = (Tpromociones) session.get(Tpromociones.class, id); 
        return promocion; 
    }
}
