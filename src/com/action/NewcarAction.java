package com.action;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Newcar;
import com.service.NewcarService;
import com.entity.Cate;
import com.service.CateService;
import com.util.PageHelper;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/newcar", produces = "text/plain;charset=utf-8")
public class NewcarAction extends BaseAction {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	@Resource
	private NewcarService newcarService;
	@Autowired
	@Resource
	private CateService cateService;

	// 准备添加数据
	@RequestMapping("createNewcar.action")
	public String createNewcar() {
		List<Cate> cateList = this.cateService.getAllCate();
		this.getRequest().setAttribute("cateList", cateList);
		return "admin/addnewcar";
	}

	// 添加数据
	@RequestMapping("addNewcar.action")
	public String addNewcar(Newcar newcar) {
		newcar.setHits("0");
		newcar.setSellnum("0");
		this.newcarService.insertNewcar(newcar);
		return "redirect:/newcar/createNewcar.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteNewcar.action")
	public String deleteNewcar(String id) {
		this.newcarService.deleteNewcar(id);
		return "redirect:/newcar/getAllNewcar.action";
	}

	// 批量删除数据
	@RequestMapping("deleteNewcarByIds.action")
	public String deleteNewcarByIds() {
		String[] ids = this.getRequest().getParameterValues("newcarid");
		for (String newcarid : ids) {
			this.newcarService.deleteNewcar(newcarid);
		}
		return "redirect:/newcar/getAllNewcar.action";
	}

	// 更新数据
	@RequestMapping("updateNewcar.action")
	public String updateNewcar(Newcar newcar) {
		this.newcarService.updateNewcar(newcar);
		return "redirect:/newcar/getAllNewcar.action";
	}

	// 显示全部数据
	@RequestMapping("getAllNewcar.action")
	public String getAllNewcar(String number) {
		List<Newcar> newcarList = this.newcarService.getAllNewcar();
		PageHelper.getPage(newcarList, "newcar", null, null, 10, number, this.getRequest(), null);
		return "admin/listnewcar";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryNewcarByCond.action")
	public String queryNewcarByCond(String cond, String name, String number) {
		Newcar newcar = new Newcar();
		if (cond != null) {
			if ("newcarname".equals(cond)) {
				newcar.setNewcarname(name);
			}
			if ("image".equals(cond)) {
				newcar.setImage(name);
			}
			if ("cateid".equals(cond)) {
				newcar.setCatename(name);
			}
			if ("price".equals(cond)) {
				newcar.setPrice(name);
			}
			if ("recommend".equals(cond)) {
				newcar.setRecommend(name);
			}
			if ("thestart".equals(cond)) {
				newcar.setThestart(name);
			}
			if ("theend".equals(cond)) {
				newcar.setTheend(name);
			}
			if ("hits".equals(cond)) {
				newcar.setHits(name);
			}
			if ("sellnum".equals(cond)) {
				newcar.setSellnum(name);
			}
			if ("contents".equals(cond)) {
				newcar.setContents(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.newcarService.getNewcarByLike(newcar), "newcar", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/querynewcar";
	}

	// 按主键查询数据
	@RequestMapping("getNewcarById.action")
	public String getNewcarById(String id) {
		Newcar newcar = this.newcarService.getNewcarById(id);
		this.getRequest().setAttribute("newcar", newcar);
		List<Cate> cateList = this.cateService.getAllCate();
		this.getRequest().setAttribute("cateList", cateList);
		return "admin/editnewcar";
	}

	public NewcarService getNewcarService() {
		return newcarService;
	}

	public void setNewcarService(NewcarService newcarService) {
		this.newcarService = newcarService;
	}

}
