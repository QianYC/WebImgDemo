package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.FileDAO;

@Controller
@RequestMapping("/img")
public class ImgController {

	@Autowired FileDAO fileDao;
	
	@GetMapping("/home")
	public String visitHome(){
		return "home";
	}
	
	
	@PostMapping("/upload")
	@ResponseBody
	public String uploadImg(@RequestParam("img")MultipartFile img,
			@RequestParam("imgId")String imgId){
		System.out.println(img.getOriginalFilename());
		fileDao.saveFile(img,imgId);
		return "succeed";
	}
	
	@GetMapping("/download")
	public void download(HttpServletRequest request,HttpServletResponse response){
		try {
			ServletOutputStream sos=response.getOutputStream();
			
			sos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
