package com.wen.ftproject.controller.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wen.ftproject.entity.ApplyRole;
import com.wen.ftproject.result.Result;
import com.wen.ftproject.service.ApplyRoleService;
import com.wen.ftproject.utils.FileUtils;

@Controller
@RequestMapping("/applyRole")
public class ApplyRoleController {
	@Resource(name="applyRoleService")
	public ApplyRoleService applyRoleService;
	
	@RequestMapping("/add")
	@ResponseBody
	public Result<Object> add(ApplyRole ar, MultipartFile frontPhoto, MultipartFile tergalPhoto, HttpServletRequest request){
		String savedDir = request.getSession().getServletContext().getRealPath("imgs");
		System.out.println(savedDir);
		ar.setIdentityFront(FileUtils.saveFile(savedDir, frontPhoto));
		ar.setIdentityTergal(FileUtils.saveFile(savedDir, tergalPhoto));
		return applyRoleService.add(ar);
	}
	
	@RequestMapping("/updateById")
	@ResponseBody
	public Result<Object> updateById(ApplyRole ar){
		return applyRoleService.updateById(ar);
	}
	
	@RequestMapping("/agreedApply")
	@ResponseBody
	public Result<Object> isAgreedApply(String id, boolean isAgreed, String cause){
		ApplyRole ar = new ApplyRole();
		ar.setArId(id);
		if(isAgreed) {
			ar.setIsAgreed(1);
		}else {
			ar.setIsAgreed(2);
		}
		ar.setArCause(cause);
		return applyRoleService.updateById(ar);
	}
	
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public Result<Object> deleteById(String id){
		return applyRoleService.deleteById(id);
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public Result<ApplyRole> findById(String id){
		return applyRoleService.findById(id);
	}
	
	@RequestMapping("/findByIds")
	@ResponseBody
	public Result<List<ApplyRole>> findByIds(String[] id){
		return applyRoleService.findByIds(id);
	}
	
	@RequestMapping("/findByUserId")
	@ResponseBody
	public Result<List<ApplyRole>> findByUserId(String id){
		return applyRoleService.findByUserId(id);
	}
	
	@RequestMapping("/findByUserIds")
	@ResponseBody
	public Result<List<ApplyRole>> findByUserIds(String[] ids){
		return applyRoleService.findByUserIds(ids);
	}
	
	@RequestMapping("/findByRoleId")
	@ResponseBody
	public Result<List<ApplyRole>> findByRoleId(String id){
		return applyRoleService.findByRoleId(id);
	}
	
	@RequestMapping("/findByRoleIds")
	@ResponseBody
	public Result<List<ApplyRole>> findByRoleIds(String[] ids){
		return applyRoleService.findByRoleIds(ids);
	}
}
