package com.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Newcar;

@Service("newcarService")
public interface NewcarService {
	// 插入数据 调用newcarDAO里的insertNewcar配置
	public int insertNewcar(Newcar newcar);

	// 更新数据 调用newcarDAO里的updateNewcar配置
	public int updateNewcar(Newcar newcar);

	// 删除数据 调用newcarDAO里的deleteNewcar配置
	public int deleteNewcar(String newcarid);

	// 查询全部数据 调用newcarDAO里的getAllNewcar配置
	public List<Newcar> getAllNewcar();

	public List<Newcar> getNewcarByHot();

	public List<Newcar> getNewcarByNews();

	public List<Newcar> getNewcarByCate(String cateid);

	// 按照Newcar类里面的字段名称精确查询 调用newcarDAO里的getNewcarByCond配置
	public List<Newcar> getNewcarByCond(Newcar newcar);

	// 按照Newcar类里面的字段名称模糊查询 调用newcarDAO里的getNewcarByLike配置
	public List<Newcar> getNewcarByLike(Newcar newcar);

	// 按主键查询表返回单一的Newcar实例 调用newcarDAO里的getNewcarById配置
	public Newcar getNewcarById(String newcarid);

}
