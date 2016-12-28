package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.entity.Classes;

/**
 * �����ݷ��ʶ��� ��װ��tbl_classes��Ĳ���[select insert update delete]
 * 
 * @author Administrator
 * 
 */
public class ClassesDao {
	/**
	 * ��tbl_classes��������һ����
	 * 
	 * @param classes
	 * @return
	 */
	public int insert(Classes classes) {
		Connection conn = DBUtils.getconn();
		String sql = "insert into tbl_classes values(?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, classes.getId());
			pstmt.setString(2, classes.getName());
			pstmt.setInt(3, classes.getNum());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.close(pstmt);
		}
		return 0;
	}

	/**
	 * ����IDֵ��Ӧ�ı���
	 * @param id
	 * @return
	 */
	public Classes findById(int id) {
		Connection conn = DBUtils.getconn();
		String sql = "select * from tbl_classes where cid=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Classes clas = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {// Ϊ���ҵ���
				clas = new Classes();
				clas.setId(rs.getInt("cid"));
				clas.setName(rs.getString("cname"));
				clas.setNum(rs.getInt("cnum"));
				return clas;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			DBUtils.close(pstmt, rs);
		}
		return clas;
	}
	
	/**
	 * ���ұ������е�����
	 * @return
	 */
	public ArrayList<Classes> findAll(){
		ArrayList<Classes> classesList = new ArrayList<>();
		Connection conn = DBUtils.getconn();
		String sql = "select * from tbl_classes";
		PreparedStatement pstat = null;
		ResultSet rs = null;
		Classes clas = null;
		try {
			pstat = conn.prepareStatement(sql);
			rs = pstat.executeQuery();
			while (rs.next()) {
				clas = new Classes();
				clas.setId(rs.getInt("cid"));
				clas.setName(rs.getString("cname"));
				clas.setNum(rs.getInt("cnum"));
				classesList.add(clas);
			}
			return classesList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(pstat, rs);
		}
		return null;
	}
	
	/**
	 * ���±��е�����
	 * @param c
	 */
	public int update(Classes c){
//		Connection conn = DBUtils.getconn();
		String sql = "updata tbl_classes set cname=?, cnum=? where cid=?";
//		PreparedStatement pstat = null;
//		try {
//			pstat = conn.prepareStatement(sql);
//			pstat.setString(1, c.getName());
//			pstat.setInt(2, c.getNum());
//			pstat.setInt(3, c.getId());
//			return pstat.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			DBUtils.close(pstat);
//		}
//		return 0;
		return DBUtils.executeUpdate(sql, c.getName(), c.getNum(), c.getId());
	}
	
	/**
	 * ɾ�����е�����
	 * @param id
	 * @return
	 */
	public int delete(int id){
//		Connection conn = DBUtils.getconn();
		String sql = "delete from tbl_classes where cid=?";
//		PreparedStatement pstat = null;
//		try {
//			pstat = conn.prepareStatement(sql);
//			pstat.setInt(1, id);
//			return pstat.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			DBUtils.close(pstat);
//		}
//		return 0;
//	}
		return DBUtils.executeUpdate(sql, id);
	}
}
