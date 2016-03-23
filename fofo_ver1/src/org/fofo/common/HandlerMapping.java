package org.fofo.common;

import java.util.HashMap;


import org.fofo.freeboard.controller.*;
import org.fofo.freecomment.controller.*;

import org.fofo.noticeboard.controller.*;
import org.fofo.noticecomment.controller.*;

import org.fofo.qaboard.controller.*;

import org.fofo.member.controller.*;

import org.fofo.project.controller.*;

<<<<<<< HEAD
=======
/*import org.fofo.freeboard.controller.AddfBoardController;
import org.fofo.freeboard.controller.GetfBoardController;
import org.fofo.freeboard.controller.GetfBoardListController;
import org.fofo.freeboard.controller.ModifyfBoardController;
import org.fofo.freeboard.controller.ModifyViewfBoardController;
import org.fofo.freeboard.controller.RemovefBoardController;*/

/*import org.fofo.freecomment.controller.AddfCommentController;
import org.fofo.freecomment.controller.ModifyfCommentController;
<<<<<<< HEAD
import org.fofo.freecomment.controller.RemovefCommentController;
import org.fofo.member.controller.DoIdCheckController;
import org.fofo.member.controller.DoJoinController;
import org.fofo.member.controller.DoLoginController;
import org.fofo.member.controller.DoLogoutController;
import org.fofo.message.controller.GetMessageController;
import org.fofo.message.controller.GetMessageListController;
import org.fofo.noticeboard.controller.AddnBoardController;
=======
import org.fofo.freecomment.controller.RemovefCommentController;*/

/*import org.fofo.noticeboard.controller.AddnBoardController;
>>>>>>> 9d78f72c86e1f8ace926c07f53acf6dbb99a85c6
import org.fofo.noticeboard.controller.GetnBoardController;
import org.fofo.noticeboard.controller.GetnBoardListController;
import org.fofo.noticeboard.controller.ModifyViewnBoardController;
import org.fofo.noticeboard.controller.ModifynBoardController;
import org.fofo.noticeboard.controller.RemovenBoardController;*/

/*import org.fofo.noticecomment.controller.AddnCommentController;
import org.fofo.noticecomment.controller.ModifynCommentController;
import org.fofo.noticecomment.controller.RemovenCommentController;*/

/*import org.fofo.member.controller.DoIdCheckController;
import org.fofo.member.controller.DoJoinController;
import org.fofo.member.controller.DoLoginController;
import org.fofo.member.controller.DoLogoutController;*/

/*import org.fofo.project.controller.AddProjectController;
import org.fofo.project.controller.GetProjectEditorController;
<<<<<<< HEAD
import org.fofo.qaboard.controller.AddQABoardController;
import org.fofo.qaboard.controller.GetQABoardListController;
import org.fofo.qaboard.controller.GetQABoardController;
=======
import org.fofo.project.controller.LoadProjectListController;*/


>>>>>>> 92f13baec22fd827aa8ca4d94fdb104348f5e014


public class HandlerMapping {

	HashMap<String, Controller> mappings;
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		init();
	}
	
	void init(){
//		mappings.put("/hello.do", new HelloController());
		
		/* Board */
		mappings.put("/freeboard.do", new GetfBoardListController());
//		mappings.put("/addProjectList.do", new AddProjectController());
//		mappings.put("/getProjectEditor.do", new GetProjectEditorController());
		mappings.put("/getfreeboard.do", new GetfBoardController());
		mappings.put("/addfreeboard.do", new AddfBoardController());
		mappings.put("/modifyfreeboard.do", new ModifyfBoardController());
		mappings.put("/removefreeboard.do", new RemovefBoardController());
		mappings.put("/modifyviewfreeboard.do", new ModifyViewfBoardController());
		mappings.put("/qaboard.do", new GetQABoardListController());
		mappings.put("/addqaboard.do", new AddQABoardController());
		mappings.put("/getqaboard.do", new GetQABoardController());

		/* Free Board */
		mappings.put("/freeboard.do", new GetfBoardListController());
		mappings.put("/getfreeboard.do", new GetfBoardController());
		mappings.put("/addfreeboard.do", new AddfBoardController());
		mappings.put("/modifyfreeboard.do", new ModifyfBoardController());
		mappings.put("/removefreeboard.do", new RemovefBoardController());
		mappings.put("/modifyviewfreeboard.do", new ModifyViewfBoardController());
		
		mappings.put("/addfreecomment.do", new AddfCommentController());
		mappings.put("/removefreecomment.do", new RemovefCommentController());
		mappings.put("/modifyfreecomment.do", new ModifyfCommentController());
		
		
		/* Notice Board */
		mappings.put("/noticeboard.do", new GetnBoardListController());
		mappings.put("/getnoticeboard.do", new GetnBoardController());
		mappings.put("/addnoticeboard.do", new AddnBoardController());
		mappings.put("/modifynoticeboard.do", new ModifynBoardController());
		mappings.put("/removenoticeboard.do", new RemovenBoardController());
		mappings.put("/modifyviewnoticeboard.do", new ModifyViewnBoardController());
		
		mappings.put("/addnoticecomment.do", new AddnCommentController());
		mappings.put("/removenoticecomment.do", new RemovenCommentController());
		mappings.put("/modifynoticecomment.do", new ModifynCommentController());
		
		
		/* Project */
		mappings.put("/addProject.do", new AddProjectController());
		mappings.put("/loadProjectList.do", new LoadProjectListController());
		mappings.put("/project.do", new GetProjectEditorController());
//		mappings.put("/addProjectList.do", new AddProjectController());
		
		
		/* Member */
		mappings.put("/doJoin.do", new DoJoinController());
		mappings.put("/doLogout.do", new DoLogoutController());
		mappings.put("/doLogin.do", new DoLoginController());
		mappings.put("/doLogout.do", new DoLogoutController());
		mappings.put("/idCheck.do", new DoIdCheckController());
//		mappings.put("/project.do", new ProjectController());
//		mappings.put("/addProjectList.do", new AddProjectController());
		
		/* Message */
		mappings.put("/message.do", new GetMessageListController());
		mappings.put("/readmessage.do", new GetMessageController());
	}
	
	public Controller getController(String path){
		return mappings.get(path);
	}

}
