package atong.springboot.test.dto;

import com.github.crab2died.annotation.ExcelField;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * banner表
 */
@Data
public class Banner {

    @ExcelField(title = "banner名称")
    private String  bannerName;
    /**
     * banner名称
     */
    @ExcelField(title = "描述")
    private String name;
    /**
     * 描述
     */
    @ExcelField(title = "banner图片")
    private String description;
    /**
     * banner图片
     */
    @ExcelField(title = "位置")
    private Integer position;
    /**
     * 位置
     */
    @ExcelField(title = "跳转链接")
    private String imgUrl;
    /**
     * 跳转链接
     */
    @ExcelField(title = "创建时间")
    private String create_time ;
    /**
     * 创建时间
     **/
    @ExcelField(title = "是否删除")
    private int deleted;
    /**
     * @是否删除
     **/
    @Override
    public String toString() {
        return "Banner{" +
                "bannerName='" + bannerName + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", position=" + position +
                ", imgUrl='" + imgUrl + '\'' +
                ", create_time=" + create_time +
                ", deleted=" + deleted +
                '}';
    }
}