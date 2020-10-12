package atong.springboot.test.extendsClass;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class test {
    public static void main(String[] args) {
        String jsonString ="{\n" +
                " \"code\":1,\n" +
                " \"httpCode\":200,\n" +
                " \"responseEntity\":{\n" +
                "  \"currentPage\":1,\n" +
                "  \"first\":true,\n" +
                "  \"hasNext\":false,\n" +
                "  \"hasPrev\":false,\n" +
                "  \"last\":true,\n" +
                "  \"nextPage\":1,\n" +
                "  \"pageCount\":1,\n" +
                "  \"pageData\":[\n" +
                "   {\n" +
                "    \"id\":13,\n" +
                "    \"isAll\":true,\n" +
                "    \"limitName\":\"s2\",\n" +
                "    \"limitNum\":10.0,\n" +
                "    \"limitUnit\":\"s\"\n" +
                "   },\n" +
                "   {\n" +
                "    \"id\":12,\n" +
                "    \"isAll\":true,\n" +
                "    \"limitName\":\"s1\",\n" +
                "    \"limitNum\":10.0,\n" +
                "    \"limitUnit\":\"s\"\n" +
                "   }]}}";

        JSONObject jsonObject = (JSONObject)JSONObject.parse(jsonString);
        String responseEntity =  jsonObject.getString("responseEntity");
        JSONObject data_obj1= JSON.parseObject(responseEntity);
        String  pageData =  data_obj1.getString("pageData");
        System.out.println(pageData);
        JSONArray arrays = JSON.parseArray(pageData);
        //System.out.println(array.getString(0));
       for (int i=0;i<arrays.size();i++){
             String var = arrays.getString(i);
           JSONObject var1= JSON.parseObject(var);
            if (var1.get("limitName").equals("s2")){
                String result = var1.get("id").toString();
                System.out.println(result);
            }
       }

    }
}
