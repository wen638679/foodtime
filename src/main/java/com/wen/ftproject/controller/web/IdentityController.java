package com.wen.ftproject.controller.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wen.ftproject.entity.Identity;
import com.wen.ftproject.request.Condition;
import com.wen.ftproject.request.PageData;
import com.wen.ftproject.result.Result;
import com.wen.ftproject.result.ResultPageData;
import com.wen.ftproject.service.IdentityService;
import com.wen.ftproject.utils.Constants;
import com.wen.ftproject.utils.FileUtils;

@Controller
@RequestMapping("/identity")
public class IdentityController {
	
	@Resource(name="identityService")
	public IdentityService identityService;
	
	@RequestMapping("/findAll")
	@ResponseBody
	public Result<List<Identity>> findAll(){
		return identityService.findAll();
	}
	
	@RequestMapping("findById")
	@ResponseBody
	public Result<Identity> findById(String id){
		return identityService.findById(id);
	}
	
	@RequestMapping("/findByIds")
	@ResponseBody
	public Result<List<Identity>> findByIds(String[] ids){
		return identityService.findByIds(ids);
	}
	
	@RequestMapping("/findByNumber")
	@ResponseBody
	public Result<Identity> findByNumber(String number){
		return identityService.findByNumber(number);
	}
	
	@RequestMapping("/findByName")
	@ResponseBody
	public Result<List<Identity>> findByName(String name){
		return identityService.findByName(name);
	}
	
	@RequestMapping("/findByNumbers")
	@ResponseBody
	public Result<List<Identity>> findByNumbers(String[] numbers){
		return identityService.findByNumbers(numbers);
	}
	
	@RequestMapping("/findByPages")
	@ResponseBody
	public Result<ResultPageData<Identity>> findByPages(Identity identity, PageData pageData, Condition condition){
		return identityService.findByPages(identity, pageData, condition);
	}
	
	@RequestMapping(value="/updateById", method=RequestMethod.POST)
	@ResponseBody
	public Result<Object> updateById(Identity identity){
		return identityService.updateById(identity);
	}
	
	@RequestMapping(value="/updateByNumber", method=RequestMethod.POST)
	@ResponseBody
	public Result<Object> updateByNumber(Identity identity){
		return identityService.updateByNumber(identity);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public Result<Object> add(Identity identity, MultipartFile frontPhoto, MultipartFile tergalPhoto, HttpServletRequest request){
		String savedDir = request.getSession().getServletContext().getRealPath("imgs");
		System.out.println(savedDir);
		identity.setIdentityFront(FileUtils.saveFile(savedDir, frontPhoto));
		identity.setIdentityTergal(FileUtils.saveFile(savedDir, tergalPhoto));
//		try {
//			if(frontPhoto!=null) {
//				String suffx = frontPhoto.getOriginalFilename().substring(frontPhoto.getOriginalFilename().lastIndexOf("."));
//				String file = System.currentTimeMillis()+suffx;
//				InputStream is = frontPhoto.getInputStream();
//				OutputStream os = new FileOutputStream(new File(savedDir,file));
//				byte[] buff = new byte[1024];
//				int len;
//				while((len=is.read(buff))!=-1) {
//					os.write(buff, 0, len);
//					os.flush();
//				}
//				is.close();
//				os.close();
//				identity.setIdentityFront(file);
//			}
//			if(tergalPhoto!=null) {
//				String suffx = tergalPhoto.getOriginalFilename().substring(tergalPhoto.getOriginalFilename().lastIndexOf("."));
//				String file = System.currentTimeMillis()+suffx;
//				InputStream is = tergalPhoto.getInputStream();
//				OutputStream os = new FileOutputStream(new File(savedDir ,file));
//				byte[] buff = new byte[1024];
//				int len;
//				while((len=is.read(buff))!=-1) {
//					os.write(buff, 0, len);
//					os.flush();
//				}
//				is.close();
//				os.close();
//				identity.setIdentityTergal(file);
//			}
//			System.out.println(identity);
//			return identityService.add(identity);
//		}catch (IOException e) {
//			e.printStackTrace();
//			Result<Object> result = Constants.createFailResult();
//			result.setData(e.getMessage());
//			return result;
//		}
		return identityService.add(identity);
	}
	
	@RequestMapping("/testAddPage")
	public String testAddPage() {
		return "test_add_identity";
	}
	
	
}
