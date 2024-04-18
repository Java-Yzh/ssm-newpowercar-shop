package com.action;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Peihuo;
import com.service.PeihuoService;
import com.entity.City;
import com.service.CityService;
import com.util.PageHelper;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/peihuo", produces = "text/plain;charset=utf-8")
public class PeihuoAction extends BaseAction {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	@Resource
	private PeihuoService peihuoService;
	@Autowired
	@Resource
	private CityService cityService;

	// 准备添加数据
	@RequestMapping("createPeihuo.action")
	public String createPeihuo() {
		List<City> cityList = this.cityService.getAllCity();
		this.getRequest().setAttribute("cityList", cityList);
		return "admin/addpeihuo";
	}

	// 添加数据
	@RequestMapping("addPeihuo.action")
	public String addPeihuo(Peihuo peihuo) {
		this.peihuoService.insertPeihuo(peihuo);
		return "redirect:/peihuo/createPeihuo.action";
	}

	// 通过主键删除数据
	@RequestMapping("deletePeihuo.action")
	public String deletePeihuo(String id) {
		this.peihuoService.deletePeihuo(id);
		return "redirect:/peihuo/getAllPeihuo.action";
	}

	// 批量删除数据
	@RequestMapping("deletePeihuoByIds.action")
	public String deletePeihuoByIds() {
		String[] ids = this.getRequest().getParameterValues("peihuoid");
		for (String peihuoid : ids) {
			this.peihuoService.deletePeihuo(peihuoid);
		}
		return "redirect:/peihuo/getAllPeihuo.action";
	}

	// 更新数据
	@RequestMapping("updatePeihuo.action")
	public String updatePeihuo(Peihuo peihuo) {
		this.peihuoService.updatePeihuo(peihuo);
		return "redirect:/peihuo/getAllPeihuo.action";
	}

	// 显示全部数据
		@RequestMapping("getAllPeihuo.action")
		public String getAllPeihuo(String number) {
			List<Peihuo> peihuoList = this.peihuoService.getAllPeihuo();
			PageHelper.getPage(peihuoList, "peihuo", null, null, 10, number, this.getRequest(), null);
			return "admin/listpeihuo";
		}
		
		// 显示全部数据
		@RequestMapping("getNetWork.action")
		public String getNetWork(String number) {
			List<Peihuo> peihuoList = this.peihuoService.getAllPeihuo();
			PageHelper.getPage(peihuoList, "peihuo", null, null, 10, number, this.getRequest(), null);
			
			return "users/network";
		}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryPeihuoByCond.action")
	public String queryPeihuoByCond(String cond, String name, String number) {
		Peihuo peihuo = new Peihuo();
		if (cond != null) {
			if ("peihuoname".equals(cond)) {
				peihuo.setPeihuoname(name);
			}
			if ("cityid".equals(cond)) {
				peihuo.setCityname(name);
			}
			if ("address".equals(cond)) {
				peihuo.setAddress(name);
			}
			if ("contact".equals(cond)) {
				peihuo.setContact(name);
			}
			if ("memo".equals(cond)) {
				peihuo.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.peihuoService.getPeihuoByLike(peihuo), "peihuo", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/querypeihuo";
	}

	// 按主键查询数据
	@RequestMapping("getPeihuoById.action")
	public String getPeihuoById(String id) {
		Peihuo peihuo = this.peihuoService.getPeihuoById(id);
		this.getRequest().setAttribute("peihuo", peihuo);
		List<City> cityList = this.cityService.getAllCity();
		this.getRequest().setAttribute("cityList", cityList);
		return "admin/editpeihuo";
	}

	public PeihuoService getPeihuoService() {
		return peihuoService;
	}

	public void setPeihuoService(PeihuoService peihuoService) {
		this.peihuoService = peihuoService;
	}

}
