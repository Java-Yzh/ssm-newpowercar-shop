package com.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.NewcarDAO;
import com.entity.Newcar;
import com.service.NewcarService;

@Service("newcarService")
public class NewcarServiceImpl implements NewcarService {
	@Autowired
	@Resource
	private NewcarDAO newcarDAO;

	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertNewcar(Newcar newcar) {
		return this.newcarDAO.insertNewcar(newcar);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateNewcar(Newcar newcar) {
		return this.newcarDAO.updateNewcar(newcar);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteNewcar(String newcarid) {
		return this.newcarDAO.deleteNewcar(newcarid);
	}

	@Override // 继承接口的查询全部
	public List<Newcar> getAllNewcar() {
		return this.newcarDAO.getAllNewcar();
	}

	@Override // 继承接口的查询全部
	public List<Newcar> getNewcarByHot() {
		return this.newcarDAO.getNewcarByHot();
	}

	@Override // 继承接口的查询全部
	public List<Newcar> getNewcarByNews() {
		return this.newcarDAO.getAllNewcar();
	}

	@Override // 继承接口的查询全部
	public List<Newcar> getNewcarByCate(String cateid) {
		return this.newcarDAO.getNewcarByCate(cateid);
	}

	@Override // 继承接口的按条件精确查询
	public List<Newcar> getNewcarByCond(Newcar newcar) {
		return this.newcarDAO.getNewcarByCond(newcar);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Newcar> getNewcarByLike(Newcar newcar) {
		return this.newcarDAO.getNewcarByLike(newcar);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Newcar getNewcarById(String newcarid) {
		return this.newcarDAO.getNewcarById(newcarid);
	}

}
