package org.fofo.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fofo.board.dao.FreeBoardDAO;
import org.fofo.board.vo.FreePost;
import org.fofo.common.Controller;

public class GetBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//?΄?Ό?΄?Έ?Έ?? seq κ°μ λ°μ DB? ?±λ‘?
		//getBoard.jspλ‘? ?΄??΄? λ³΄μ¬μ£ΌκΈ°
		FreeBoardDAO dao = new FreeBoardDAO();
		FreePost freepost = new FreePost();
		freepost.setfPostId(Integer.parseInt(request.getParameter("seq")));
		dao.doGetBoard(freepost);
		
		request.setAttribute("board", freepost);
		
		return "/getBoard.jsp";
	}

}
