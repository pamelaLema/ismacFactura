package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.DetalleFactura;
@Repository
public class DetalleFacturaDAOImpl implements DetalleFacturaDAO {

	@Autowired
	public SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<DetalleFactura> findAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();

		return session.createQuery("from DetalleFactura",DetalleFactura.class).getResultList();
	}

	@Override
	@Transactional
	public DetalleFactura findOne(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();

		return session.get(DetalleFactura.class,id);
	}

	@Override
	@Transactional
	public void add(DetalleFactura detalleFactura) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(detalleFactura);
	}

	@Override
	@Transactional
	public void up(DetalleFactura detalleFactura) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(detalleFactura);
		
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
        session.delete(findOne(id));
		
	}

	@Override
	@Transactional
	public List<DetalleFactura> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
