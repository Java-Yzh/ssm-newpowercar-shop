package com.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Newcar;

@Repository("newcarDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface NewcarDAO {

	/**
	 * NewcarDAO 接口 可以按名称直接调用newcar.xml配置文件的SQL语句
	 */

	// 插入数据 调用entity包newcar.xml里的insertNewcar配置 返回值0(失败),1(成功)
	public int insertNewcar(Newcar newcar);

	// 更新数据 调用entity包newcar.xml里的updateNewcar配置 返回值0(失败),1(成功)
	public int updateNewcar(Newcar newcar);

	// 删除数据 调用entity包newcar.xml里的deleteNewcar配置 返回值0(失败),1(成功)
	public int deleteNewcar(String newcarid);

	// 查询全部数据 调用entity包newcar.xml里的getAllNewcar配置 返回List类型的数据
	public List<Newcar> getAllNewcar();

	public List<Newcar> getNewcarByHot();

	public List<Newcar> getNewcarByNews();

	public List<Newcar> getNewcarByCate(String cateid);

	// 按照Newcar类里面的值精确查询 调用entity包newcar.xml里的getNewcarByCond配置 返回List类型的数据
	public List<Newcar> getNewcarByCond(Newcar newcar);

	// 按照Newcar类里面的值模糊查询 调用entity包newcar.xml里的getNewcarByLike配置 返回List类型的数据
	public List<Newcar> getNewcarByLike(Newcar newcar);

	// 按主键查询表返回单一的Newcar实例 调用entity包newcar.xml里的getNewcarById配置
	public Newcar getNewcarById(String newcarid);

}
