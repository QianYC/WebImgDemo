package com.example.demo.dao;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileDAO {

	public void saveFile(MultipartFile img,String imgId){
		System.out.println("invoke fileDAO");
		String base=System.getProperty("user.dir").replaceAll("\\\\", "/")+imgId+".jpg";
		System.out.println(base);
		File f=new File(base);
		try {
			FileCopyUtils.copy(img.getBytes(), f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
