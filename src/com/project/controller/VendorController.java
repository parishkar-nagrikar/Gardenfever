package com.project.controller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.project.entities.Product;
import com.project.entities.User;
import com.project.models.entUser;
import com.project.service.LoginServices;
import com.project.service.VendorServices;
@Controller
public class VendorController {
	@Autowired
	private LoginServices vendorservices;

	@RequestMapping("/changepasswordvendor")
	public String updatePassword( @Valid @ModelAttribute("command") User user2,BindingResult res,HttpSession session)
	{
		
		
		User user1=(User)session.getAttribute("user");
		user1.setPassword(user2.getPassword());
		

		boolean b1=vendorservices.updatepassword(user1);
		//System.out.println(user1.getFirst_name());
			if(user1==null)
				return "t_vchangeaddress";
			
			if(b1)
				return "t_vendorAccount";
			else
				return "redirect:t_vendorAccount";

			/*entUser entuser=new entUser();
			ModelAndView mav=new ModelAndView("t_default", "command", entuser);
			return mav;
		*/
		
		
		
		
		
		
		
		
		
	/*User user1 =	(User)session.getAttribute("user");
	user1.setPassword(user.getPassword());
	//System.out.println(user1.getPhone_no());

	boolean b1=vendorservices.updatepassword(user1);
//		System.out.println(user1.getFirst_name());
		if(user1==null)
			return "t_vchangepassword";
		
		if(b1)
			return "t_vendorAccount";
		else
			return "redirect:t_vendorAccount";
*/
	}
	/*@RequestMapping("/cpassadmin")
	public ModelAndView showChangePassword()
	{
		entUser entuser=new entUser();
		ModelAndView mav=new ModelAndView("t_adminchangepassword", "command",entuser );
		return mav;
	}*/

	//////////////////////////////////////
	//////////////////////change Address Admin//////////////////////////////////
	/////////////////////////////


	@RequestMapping("/changeaddressvendor")
	public String updateAddress( @Valid @ModelAttribute("command") User user,BindingResult res,HttpSession session)
	{
		
	User user1 =	(User)session.getAttribute("user");
	user1.setAddress(user.getAddress());
	user1.setCity(user.getCity());
	user1.setPincode(user.getPincode());
	//System.out.println(user1.getPhone_no());

	boolean b1=vendorservices.updateAddress(user1);
	//System.out.println(user1.getFirst_name());
		if(user1==null)
			return "t_vchangeaddress";
		
		if(b1)
			return "t_vendorAccount";
		else
			return "redirect:t_vendorAccount";

	}

	/////////////////////////////////////
	/////////////////////////Change mobile no Admin////////////////////////////////
	/////////////////////////

	@RequestMapping("/changemobilevendor")
	public String changeMobilenoAdmin(@Valid @ModelAttribute User user,BindingResult res,HttpSession session)
	{
		User user1=(User)session.getAttribute("user");
		user1.setPhone_no(user.getPhone_no());
		boolean b1=vendorservices.updatemobile(user1);
		//System.out.println(user1.getFirst_name());
			if(user1==null)
				return "t_vchangemobile";
			
			if(b1)
				return "t_vendorAccount";
			else
		 		return "redirect:t_vendorAccount";
		
	}
	
	@RequestMapping(value = "/sell", method = RequestMethod.POST)
	public String insertProduct( @Valid @ModelAttribute("command") Product product,@RequestParam(value="img")MultipartFile file,HttpServletRequest  req,BindingResult res,HttpSession session)
	{
		//String msg="Please enter the Product info";
		 String msg="",relpath="",actpath;
	        
	        try 
	        {
	            relpath=req.getSession().getServletContext().getRealPath("/");
	            actpath="E:/20_jan/Garden Fever/Garden fever/WebContent/images/"+file.getOriginalFilename();
	            String path = "images/"+file.getOriginalFilename();
	            System.out.println(actpath);
	           product.setImage_path(path);
	          File newFile = new File(actpath);
	          if (!newFile.exists()) {  
	                newFile.createNewFile();  
	               }  
	          OutputStream os=new FileOutputStream(newFile);
	              byte[] data=file.getBytes();
	              
	              os.write(data);
	              os.close();
	           
	              
	        }
	        catch (IllegalStateException | IOException e) 
	        {
	            msg="t_img_error";
	            e.printStackTrace();
	        }
	        User u=(User)session.getAttribute("user");
	        System.out.println(u);
		product.setVendor_id(u.getUser_id());
		product.setVendor_name(u.getFirst_name());
		boolean b1=vendorservices.insertProduct(product);
				if(product==null)
				{
			session.setAttribute("errormsg", msg);
			return "t_register";
				}
		if(b1)
			return "t_vendorAccount";
		else
			return "error";

}


}
