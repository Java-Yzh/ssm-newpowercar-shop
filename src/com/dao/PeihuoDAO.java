package com.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Peihuo;

@Repository("peihuoDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface PeihuoDAO {

	/**
	 * PeihuoDAO 接口 可以按名称直接调用peihuo.xml配置文件的SQL语句
	 */

	// 插入数据 调用entity包peihuo.xml里的insertPeihuo配置 返回值0(失败),1(成功)
	public int insertPeihuo(Peihuo peihuo);

	// 更新数据 调用entity包peihuo.xml里的updatePeihuo配置 返回值0(失败),1(成功)
	public int updatePeihuo(Peihuo peihuo);

	// 删除数据 调用entity包peihuo.xml里的deletePeihuo配置 返回值0(失败),1(成功)
	public int deletePeihuo(String peihuoid);

	// 查询全部数据 调用entity包peihuo.xml里的getAllPeihuo配置 返回List类型的数据
	public List<Peihuo> getAllPeihuo();

	// 按照Peihuo类里面的值精确查询 调用entity包peihuo.xml里的getPeihuoByCond配置 返回List类型的数据
	public List<Peihuo> getPeihuoByCond(Peihuo peihuo);

	// 按照Peihuo类里面的值模糊查询 调用entity包peihuo.xml里的getPeihuoByLike配置 返回List类型的数据
	public List<Peihuo> getPeihuoByLike(Peihuo peihuo);

	// 按主键查询表返回单一的Peihuo实例 调用entity包peihuo.xml里的getPeihuoById配置
	public Peihuo getPeihuoById(String peihuoid);

}
