package com.mobilerechargeapk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mobilerechargeapk.model.JioUser;
import com.mobilerechargeapk.model.Operator;
import com.mobilerechargeapk.model.User;

public class JioDao {
    public boolean insertJionetwork(JioUser jio) throws SQLException{
    	User user=new User();
       
       ConnectionClass conclass=new ConnectionClass();
       Connection con=conclass.getConnection();
       String subQuery="select * from operator_details where operator_name=?";
       PreparedStatement pst=con.prepareStatement(subQuery);
       pst.setString(1, user.getOperator().getOperatorname());
       ResultSet rs=pst.executeQuery();
	    int opId=0;
	   if( rs.next()){
	    opId=rs.getInt(1);
	   }
	   String insertQuery="insert into jio_plan(plan_name,price,validity,benefits,operator_id)values(?,?,?,?,?)";
       try {
		PreparedStatement pstmt=con.prepareStatement(insertQuery);
		pstmt.setString(1,jio.getPlanName() );
		pstmt.setDouble(2, jio.getPrice());
		pstmt.setString(3,jio.getValidity());
		pstmt.setString(4,jio.getBenfits());
		pstmt.setInt(5,opId );
	ResultSet rst=pstmt.executeQuery();
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
	return false;
    }
}