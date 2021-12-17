package com.mobilerechargeapk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mobilerechargeapk.model.AirtelUser;
import com.mobilerechargeapk.model.User;

public class AirtelDao {
  public void insertAirtelnetwork(AirtelUser airtel) throws SQLException {
	  String insertQue="insert into jio(plan_name,price,validity,benefits,operator_id)values(?,?,?,?,?)";
	  ConnectionClass conclass=new ConnectionClass();
	  Connection con=conclass.getConnection();
	  User user=new User();
	  String subQuery="select * from operator_details where operator_name=?";
	  PreparedStatement pst=con.prepareStatement(subQuery);
	  pst.setString(1, user.getOperator().getOperatorname());
      ResultSet rs=pst.executeQuery();
      int opId=0;
	   if( rs.next()){
	    opId=rs.getInt(1);
	   }
	  try {
		PreparedStatement pstmt=con.prepareStatement(insertQue);
		pstmt.setString(1,airtel.getPlanName() );
		pstmt.setDouble(2, airtel.getPrice());
		pstmt.setString(3,airtel.getValidity());
		pstmt.setString(4,airtel.getBenfits());
		pstmt.setObject(5,opId);
		pstmt.execute();
		System.out.println("value inserted succesfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
  }	
}