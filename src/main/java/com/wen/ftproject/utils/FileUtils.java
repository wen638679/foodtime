package com.wen.ftproject.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.web.multipart.MultipartFile;

public class FileUtils {
	public static String saveFile(String dir, MultipartFile fileMulti) {
		if(fileMulti == null) return null;
		try {
			String suffx = fileMulti.getOriginalFilename().substring(fileMulti.getOriginalFilename().lastIndexOf("."));
			String file = System.currentTimeMillis()+suffx;
			InputStream is = fileMulti.getInputStream();
			OutputStream os = new FileOutputStream(new File(dir,file));
			byte[] buff = new byte[1024];
			int len;
			while((len=is.read(buff))!=-1) {
				os.write(buff, 0, len);
				os.flush();
			}
			is.close();
			os.close();
			return file;
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
