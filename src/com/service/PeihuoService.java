package com.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Peihuo;

@Service("peihuoService")
public interface PeihuoService {
	// 插入数据 调用peihuoDAO里的insertPeihuo配置
	public int insertPeihuo(Peihuo peihuo);

	// 更新数据 调用peihuoDAO里的updatePeihuo配置
	public int updatePeihuo(Peihuo peihuo);

	// 删除数据 调用peihuoDAO里的deletePeihuo配置
	public int deletePeihuo(String peihuoid);

	// 查询全部数据 调用peihuoDAO里的getAllPeihuo配置
	public List<Peihuo> getAllPeihuo();

	// 按照Peihuo类里面的字段名称精确查询 调用peihuoDAO里的getPeihuoByCond配置
	public List<Peihuo> getPeihuoByCond(Peihuo peihuo);

	// 按照Peihuo类里面的字段名称模糊查询 调用peihuoDAO里的getPeihuoByLike配置
	public List<Peihuo> getPeihuoByLike(Peihuo peihuo);

	// 按主键查询表返回单一的Peihuo实例 调用peihuoDAO里的getPeihuoById配置
	public Peihuo getPeihuoById(String peihuoid);

}
