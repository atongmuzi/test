package atong.springboot.test.dto;

import com.github.crab2died.annotation.ExcelField;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class testDTO {
   // @ExcelField(title = "姓名")
    private String name ;

    @Override
    public String toString() {
        return "testDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
