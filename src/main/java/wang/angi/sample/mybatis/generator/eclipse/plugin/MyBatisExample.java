package wang.angi.sample.mybatis.generator.eclipse.plugin;

import org.apache.ibatis.session.SqlSession;

import com.github.pagehelper.PageHelper;

import wang.angi.sample.mybatis.generator.eclipse.plugin.mapper.CityMapper;
import wang.angi.sample.mybatis.generator.eclipse.plugin.model.City;
import wang.angi.sample.mybatis.generator.eclipse.plugin.model.CityExample;

public class MyBatisExample {
	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();

			CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
			City city = new City();
			city.setName("WuHan");
			city.setState("HuBei");
			city.setCountry("China");
			city.setCreatedBy("Angi");
			cityMapper.insert(city);
			
			City city2 = new City();
			city2.setId(6);
			city2.setName("ShangHai");
			cityMapper.updateByPrimaryKey(city2);

			City city1 = new City();
			city1.setName("EZhou");
			city1.setCreatedBy("水晶");
			cityMapper.insertSelective(city1);
			
			City city3 = new City();
			city3.setId(8);
			city3.setName("ShangHai");
			cityMapper.updateByPrimaryKeySelective(city3);

			CityExample cityExample = new CityExample();
			cityExample.or().andNameLike("Wu%");
			cityExample.or().andCreatedByEqualTo("水晶");
			cityMapper.selectByExample(cityExample);

			System.out.println(cityMapper.selectByPrimaryKey(1));
			PageHelper.startPage(2, 3);
			System.out.println(cityMapper.selectByExample(new CityExample()).size());

			sqlSession.commit();
		} catch (Throwable e) {
			System.out.println(e);
			sqlSession.rollback();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
