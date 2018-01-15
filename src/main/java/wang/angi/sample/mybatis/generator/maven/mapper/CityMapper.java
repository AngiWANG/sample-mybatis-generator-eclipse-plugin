package wang.angi.sample.mybatis.generator.maven.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wang.angi.sample.mybatis.generator.maven.model.City;
import wang.angi.sample.mybatis.generator.maven.model.CityExample;

public interface CityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	long countByExample(CityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	int deleteByExample(CityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	int insert(City record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	int insertSelective(City record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	List<City> selectByExample(CityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	City selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") City record, @Param("example") CityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(City record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated
	 */
	int updateByPrimaryKey(City record);
}