package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.List;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

public class FileUploadServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		boolean flag = ServletFileUpload.isMultipartContent(request);

		if(flag){
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);

			
			List<FileItem> list = null;
			try{
				list = sfu.parseRequest(request);
			}catch(FileUploadException e){
				e.printStackTrace();	
			}

			System.out.println("#########################");
			System.out.println(list.size());
			System.out.println("#########################");
			
			FileItem fi = list.get(0);

			String uploadPath = getServletContext().getRealPath("/");
			File file = new File(uploadPath,fi.getName());

			try{
				fi.write(file);	
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		request.getRequestDispatcher("next.html").forward(request,response);
	}
}