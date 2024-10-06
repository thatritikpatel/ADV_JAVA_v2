package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.List;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		if(ServletFileUpload.isMultipartContent(request)){
			String fileUploadPath = getServletContext().getRealPath("/WEB-INF");

			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);
			
			List<FileItem> list = null;
			try{
				list = sfu.parseRequest(request);
			}catch(FileUploadException e){
				e.printStackTrace();
			}

			for(FileItem fi : list){
				if(fi.isFormField()){
					String fieldName = fi.getFieldName();
					String fieldValue = fi.getString();
					System.out.println(fieldName+"~~~~~~~~~~~~~~~~~~~"+fieldValue);
				}else{
					File file = new File(fileUploadPath,fi.getName());
					try{
						fi.write(file);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}

		request.getRequestDispatcher("next.html").forward(request,response);
	}
}