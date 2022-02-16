package service;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.Dao;
import dao.DaoImpl;
import model.MemberVO;

public class ServiceImpl implements Service{

	private Dao dao;

	public ServiceImpl() {
		this.dao = new DaoImpl();
	}
	
	@Override
	public ArrayList idList() {
		// TODO Auto-generated method stub

		return dao.idList();
	}

	@Override
	public MemberVO findMember(String id){
		// TODO Auto-generated method stub
		return dao.findMember(id);
	}

	@Override
	public void registerMember(MemberVO vo) {
		// TODO Auto-generated method stub
		System.out.println("ser:"+vo);
		dao.registerMember(vo);
	}

}
