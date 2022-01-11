package com.mobilerechargeapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mobilerechargeapp.daoimpl.AirtelDAOImpl;
import com.mobilerechargeapp.daoimpl.JioDAOImpl;
import com.mobilerechargeapp.model.AirtelUser;
import com.mobilerechargeapp.model.JioUser;

/**
 * Servlet implementation class SearchAirtelPlanController
 */
@WebServlet("/SearchAirtelPlanController")
public class SearchAirtelPlanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAirtelPlanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
      String plan=request.getParameter("airtelplan");
		
		AirtelDAOImpl airtelDao=new AirtelDAOImpl();
		List<AirtelUser> ShowPlan=airtelDao.showAirtelplan();
		List<AirtelUser> list=new ArrayList<AirtelUser>();
		for(int i=0;i<ShowPlan.size();i++)
		{
			AirtelUser user=ShowPlan.get(i);
		if(user.getPlanName().equalsIgnoreCase(plan))
		{
			list.add(user);
		}
		else if(user.getValidity().equalsIgnoreCase(plan))
		{
			list.add(user);
		}
		//Double amount=Double.parseDouble(plan);
		//String s=String.valueOf(amount);
		else if(String.valueOf(user.getPrice()).equalsIgnoreCase(plan))
		{
			list.add(user);
		}
		
		
		for(int j=0;j<list.size();j++)
		{
			AirtelUser userlist=list.get(j);
		}
		}
		HttpSession session=request.getSession();
		session.setAttribute("list", list);
		response.sendRedirect("SearchAirtelPlan.jsp");
		
		
			
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
