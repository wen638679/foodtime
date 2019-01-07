package com.wen.ftproject.controller.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wen.ftproject.entity.Role;
import com.wen.ftproject.request.Condition;
import com.wen.ftproject.request.PageData;
import com.wen.ftproject.result.Result;
import com.wen.ftproject.result.ResultPageData;
import com.wen.ftproject.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Resource(name="roleService")
	private RoleService roleService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public Result<Object> add(Role role){
		System.out.println(role);
		return roleService.add(role);
	}
	
	@RequestMapping("/findByPages")
	@ResponseBody
	public Result<ResultPageData<Role>> findByPages(Role role, PageData pageData, Condition condition){
		System.out.println("findByPages");
		return roleService.findByPages(role, pageData, condition);
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public Result<List<Role>> findAll(){
		return roleService.findAll();
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public Result<Role> findById(String id){
		return roleService.findById(id);
	}
	
	@RequestMapping("/findByIds")
	@ResponseBody
	public Result<List<Role>> findByIds(String[] id){
		return roleService.findByIds(id);
	}
	
	@RequestMapping(value="/updateById", method=RequestMethod.POST)
	@ResponseBody
	public Result<Object> updateById(Role role){
		return roleService.updateById(role);
	}
	
	@RequestMapping(value="/deleteById", method=RequestMethod.POST)
	public Result<Object> deleteById(String id){
		return roleService.deleteById(id);
	}

	@RequestMapping(value="/deleteByIds", method=RequestMethod.POST)
	public Result<Object> deleteByIds(String[] id){
		return roleService.deleteByIds(id);
	}
	
	@RequestMapping(value="/deleteByName", method=RequestMethod.POST)
	public Result<Object> deleteByName(String rName){
		return roleService.deleteByName(rName);
	}
}
