package wang.angi.sample.mybatis.generator.eclipse.plugin;

import org.apache.ibatis.session.SqlSession;

import wang.angi.sample.mybatis.generator.eclipse.plugin.mapper.CityMapper;

public class MyBatisExample {
	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();

			CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
			System.out.println(cityMapper.selectByPrimaryKey(1));
		} finally {
			sqlSession.close();
		}
	}
}
