package com.action;

import java.util.List;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Peihuo;
import com.service.PeihuoService;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/ajax", produces = "text/plain;charset=utf-8")
public class AjaxAction extends BaseAction {

	@Autowired
	@Resource
	private PeihuoService peihuoService;

	// 准备添加数据
	@RequestMapping("getPeihuo.action")
	@ResponseBody
	public String getPeihuo() throws JSONException {
		String cityid = this.getRequest().getParameter("cityid");
		Peihuo peihuo = new Peihuo();
		peihuo.setCityid(cityid);
		List<Peihuo> peihuoList = this.peihuoService.getPeihuoByCond(peihuo);
		JSONArray peihuoid = new JSONArray(); // 存放ID
		JSONArray peihuoname = new JSONArray(); // 存放名称
		for (Peihuo c : peihuoList) {
			peihuoid.put(c.getPeihuoid());
			peihuoname.put(c.getPeihuoname());
		}
		JSONObject json = new JSONObject();
		json.put("peihuoid", peihuoid.toString().replaceAll("\"", ""));
		json.put("peihuoname", peihuoname.toString().replaceAll("\"", ""));
		System.out.println(json.toString());
		return json.toString();
	}

}
