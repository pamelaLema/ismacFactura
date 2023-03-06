package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Producto;

@Repository

public class ProductoDAOImpl implements ProductoDAO{

	
	
	@Autowired
	private SessionFactory sessionFactory;

 
	@Override
	@Transactional
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<Producto> productos=session.createQuery("select PR from Producto PR",Producto.class).getResultList();
		return productos;
	}

	@Override
	@Transactional
	public Producto findOne(int id) {
		// TODO Auto-generated method stub
		/*Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("select PR from Producto where  idProducto= : keyId",Producto.class);
		query.setParameter("keyId", id);
		return (Producto) query.getSingleResult();*/
		
		Session session=sessionFactory.getCurrentSession();

		Query query=session.createQuery("select PR from Producto PR where idProduto=: keyID",Producto.class);

		return session.get(Producto.class,id);

	}

	@Override
	@Transactional

	public void add(Producto producto) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
        session.save(producto);

		
	}

	@Override
	

	public void up(Producto producto) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("update Producto set nombre=:nombre,descripcion=:descripcion,precio=:precio,stock=:stock where idProducto=:id_producto");
		query.setParameter("nombre",producto.getNombre());
		query.setParameter("descripcion",producto.getDescripcion());
		query.setParameter("precio",producto.getPrecio());
		query.setParameter("stock",producto.getStock());
		query.setParameter("id_producto",producto.getIdProducto());

		query.executeUpdate();
	}

	@Override
	@Transactional

	public void del(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("delete from Producto where idProducto =: id");
		
        query.setParameter("id",id);
        query.executeUpdate();
		
		
	}



	@Override
	@Transactional
	public List<Producto> findAll(String busqueda){
		Session session=sessionFactory.getCurrentSession();
        Query<Producto> query= session.createQuery(
        		
        		"select PR"
        		+ " from Producto PR "
        		+ " where PR.nombre LIKE: Busqueda "
        		+" or PR.descripcion LIKE: Busqueda "
        		+" or PR.precio LIKE: Busqueda "
        		+" or PR.stock LIKE: Busqueda "
        		

     		,Producto.class);
        query.setParameter("Busqueda","%"+busqueda+"%");
		return query.getResultList();
	}

	
	
	
	
	
}
