package atong.springboot.test.mapper;

import atong.springboot.test.dto.testDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface BannerMapper {
    @Select("select id from atong where phone = 13656199001 limit 1")
    Integer findId();
    @Insert("insert into atong(phone) values (#{phone})")
    int insert(testDTO t);
}