package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.entity.Classes;

/**
 * 是数据访问对象 封装对tbl_classes表的操作[select insert update delete]
 * 
 * @author Administrator
 * 
 */
public class ClassesDao {
	/**
	 * 向tbl_classes表中增加一数据
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
	 * 查找ID值对应的表项
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
			if (rs.next()) {// 为真找到了
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
	 * 查找表中所有的数据
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
	 * 更新表中的数据
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
	 * 删除表中的数据
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
