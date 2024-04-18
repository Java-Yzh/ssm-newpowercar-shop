package com.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.PeihuoDAO;
import com.entity.Peihuo;
import com.service.PeihuoService;

@Service("peihuoService")
public class PeihuoServiceImpl implements PeihuoService {
	@Autowired
	@Resource
	private PeihuoDAO peihuoDAO;

	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertPeihuo(Peihuo peihuo) {
		return this.peihuoDAO.insertPeihuo(peihuo);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updatePeihuo(Peihuo peihuo) {
		return this.peihuoDAO.updatePeihuo(peihuo);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deletePeihuo(String peihuoid) {
		return this.peihuoDAO.deletePeihuo(peihuoid);
	}

	@Override // 继承接口的查询全部
	public List<Peihuo> getAllPeihuo() {
		return this.peihuoDAO.getAllPeihuo();
	}

	@Override // 继承接口的按条件精确查询
	public List<Peihuo> getPeihuoByCond(Peihuo peihuo) {
		return this.peihuoDAO.getPeihuoByCond(peihuo);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Peihuo> getPeihuoByLike(Peihuo peihuo) {
		return this.peihuoDAO.getPeihuoByLike(peihuo);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Peihuo getPeihuoById(String peihuoid) {
		return this.peihuoDAO.getPeihuoById(peihuoid);
	}

}
