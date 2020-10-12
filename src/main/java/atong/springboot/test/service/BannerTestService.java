package atong.springboot.test.service;

import atong.springboot.test.dto.Banner;
import atong.springboot.test.dto.testDTO;
import atong.springboot.test.mapper.BannerMapper;
import com.github.crab2died.ExcelUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;
import java.util.Random;

@Service
public class BannerTestService {

    @Resource
    BannerMapper bannerMapper;

    public  void testcase(){

        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "bannerDTO.xls";
        String path2 =  System.getProperty("user.dir") + File.separator + "data" + File.separator + "testDTO.xls";

        List<Banner> bannerList;
        List<testDTO> testDTOList;

        {
            try {
                testDTOList = ExcelUtils.getInstance().readExcel2Objects(path2,testDTO.class);
                System.out.println(testDTOList.toString());
                for (testDTO t:testDTOList){
                    bannerMapper.insert(t);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public  int bannerGet(){
        int id =  bannerMapper.findId();
        return id;
    }

    public static void main(String[] args) {
         int i = 0;
//        BannerTestService bannerTestService;
////        BannerTestService bannerTestService = new BannerTestService();
////        bannerTestService.testcase();
//        Random random = new Random();
//        Random random1 = new Random(30);
//        for (i=0;i<10;i++){
//            System.out.println(random.nextInt(20));
//           // System.out.println(random1.nextInt(20));
//        }
        BannerTestService bannerTestService = new BannerTestService();
        System.out.println(bannerTestService.bannerGet());

    }

}
