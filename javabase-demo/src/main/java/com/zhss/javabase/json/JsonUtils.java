package com.zhss.javabase.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * json工具类
 * @Author: liugf
 * @Date: 2020/8/13 下午4:15
 */
public class JsonUtils {

    /**
     * 获取json中的值
     * @param json
     * @param key
     * @return
     */
    public String getJsonValue (String json, String key) {
        JSONObject jsonObject = JSON.parseObject(json);
        String value = jsonObject.getString(key);
        return value;
    }

    public static void main(String[] args) {
//        String json = "{\n" +
//                "    \"sequence_num\" : \"1\", \n" +
//                "    \"time_stamp\" : \"2020-08-11 15:35:42\", \n" +
//                "    \"record_data\" : {\n" +
//                "\t\"DATA_DATE\" : \"20200811000000\",\n" +
//                "\t\"U89\" : \"\",\n" +
//                "\t\"ID\" : \"6297524\",\n" +
//                "\t\"DATA_POINT_FLAG\" : \"1\",\n" +
//                "\t\"U11\" : \"239.800000000000000000\",\n" +
//                "\t\"U10\" : \"239.100000000000000000\",\n" +
//                "\t\"U13\" : \"238.100000000000000000\",\n" +
//                "\t\"U12\" : \"241.300000000000000000\",\n" +
//                "\t\"extend_field_1\" : \"050120200811204190003417127190129746 + 1\"\n" +
//                "    }, \n" +
//                "    \"op_type\" : \"I\", \n" +
//                "    \"crc_code\" : \"52 b4b8d5\", \n" +
//                "    \"table_name\" : \"E_MP_DAY_READ_HIGH\"\n" +
//                "}";
//
//        JSONObject jsonObject = JSON.parseObject(json);
//        //通过key 获取值
//        String sequence_num = jsonObject.getString("sequence_num");
//        System.out.println("sequence_num: " + sequence_num);
//
//        // 获取嵌套中的 json 对象
//        JSONObject json_record_data = JSON.parseObject(jsonObject.getString("record_data"));
//        String DATA_DATE = json_record_data.getString("DATA_DATE");
//        System.out.println("DATA_DATE: " + DATA_DATE);

        // 复杂json的解析
//        String json = "{\n" +
//                " \"SimNum\": \"123456789012\",\n" +
//                " \"GPSTime\": \"2019-12-03 10:00:00\",\n" +
//                " \"Longitude\": 104.123456,\n" +
//                " \"Latitude\": 30.123456,\n" +
//                " \"Speed\": 100,\n" +
//                " \"Direction\": 90,\n" +
//                " \"Mileage\": 123456,\n" +
//                " \"Altitude\": 500,\n" +
//                " \"MsgType\": \"一般数据\",\n" +
//                " \"NomalStatus\": [\"ACC开\",\n" +
//                "  \"ACC关\",\n" +
//                "  \"GPS定位\",\n" +
//                "  \"北斗定位\"\n" +
//                " ],\n" +
//                " \"AlarmStatus\": [\"紧急报警\", \"超速报警\"],\n" +
//                " \"AddStatus\": \n" +
//                "    [\n" +
//                "        {\n" +
//                "   \"DataType\": \"ADAS\",\n" +
//                "   \"Data\": {\n" +
//                "    \"AlrmType\": \"接打电话报警\",\n" +
//                "    \"AlrmID\": 12345, \n" +
//                "    \"AlrmOn\": 1,\n" +
//                "    \"AlrmClass\": 2,\n" +
//                "    \"AlrmCode\": \"12345678901234567892123456789312\" \n" +
//                "   }\n" +
//                "  },\n" +
//                "  {\n" +
//                "   \"DataType\": \"OBD\",\n" +
//                "   \"Data\": {\n" +
//                "    \"DataType\": 4102,\n" +
//                "    \"Data\": {\n" +
//                "     \"TotalMile\": 3356798,\n" +
//                "     \"TotalOil\": 8359,\n" +
//                "     \"InstantFuel\": 10,\n" +
//                "     \"Voltage\": 14100,\n" +
//                "     \"Rpm\": 1179,\n" +
//                "     \"Speed\": 0,\n" +
//                "     \"IntakeAir\": 7,\n" +
//                "     \"IntakePressur\": 255,\n" +
//                "     \"CoolantTemp\": 31,\n" +
//                "     \"IntakeAirTemp\": 7,\n" +
//                "     \"EngineLoad\": 48,\n" +
//                "     \"ThrottlePos\": 18,\n" +
//                "     \"FuelQuant\": 0\n" +
//                "    }\n" +
//                "   }\n" +
//                "  },\n" +
//                "  {\n" +
//                "   \"DataType\": \"OBD\",\n" +
//                "   \"Data\": {\n" +
//                "    \"DataType\": 4108,\n" +
//                "    \"Data\": {\n" +
//                "     \"TotalMile\": 6889,\n" +
//                "     \"TotalOil\": 12,\n" +
//                "     \"TotalTimes\": 1383,\n" +
//                "     \"IdlingTime\": 260,\n" +
//                "     \"MaxRpm\": 5522,\n" +
//                "     \"MaxSpeed\": 50,\n" +
//                "     \"SpeedUpCounts\": 0,\n" +
//                "     \"SpeedDownCounts\": 0\n" +
//                "    }\n" +
//                "   }\n" +
//                "  }\n" +
//                " ]\n" +
//                "}";
//
//        // 解析 json
//        JSONObject jsonObject = JSON.parseObject(json);
//
//        String action = jsonObject.getString("action");
//        String id = jsonObject.getString("id");
//        System.out.println("action = " + action);//add
//        System.out.println("id = " + id);//1
//        System.out.println("jsonObject = "+ jsonObject);
//        System.out.println("jsonObject_AddStatus_size = " + jsonObject.getJSONArray("AddStatus").size());
//        System.out.println("jsonObject_AddStatus[2] = " + jsonObject.getJSONArray("AddStatus").get(2));
//        System.out.println("jsonObject_AddStatus[2]_data = " + JSON.parseObject(jsonObject
//                .getJSONArray("AddStatus").get(2).toString()).get("Data"));
//
//        JSONObject json_data_data =  JSON.parseObject((jsonObject.getJSONArray("AddStatus").get(2)
//                .toString())).getJSONObject("Data").getJSONObject("Data");
//
//        System.out.println("jsonObject_AddStatus[2]_data_data = " + json_data_data);
//        System.out.println("MaxRpm: " + json_data_data.getString("MaxRpm"));


    }

}
