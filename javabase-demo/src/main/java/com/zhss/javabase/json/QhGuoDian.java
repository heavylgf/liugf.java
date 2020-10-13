package com.zhss.javabase.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @Author: liugf
 * @Date: 2020/9/9 下午8:55
 */
public class QhGuoDian {

    public static void main(String[] args) {

        String json = "{\n" +
                "    \"clusterArea\": \"qh\",\n" +
                "    \"clusterNum\": \"1\",\n" +
                "    \"code\": 200,\n" +
                "    \"data\": {\n" +
                "        \"applicationId\": -1,\n" +
                "        \"content\": [\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1900,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:25:34\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_IMPWEEK_BUSINESSINFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_IMPWEEK_BUSINESSINFO\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 1899,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:25:38\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_INTERFACE_APPLY\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_INTERFACE_APPLY\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 1901,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:25:41\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PER_QUALIF_RPTAPP\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PER_QUALIF_RPTAPP\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1902,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:25:44\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PGRS_MRPT_PROC\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PGRS_MRPT_PROC\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 1904,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:25:48\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MATERIAL_MANAGEWEEK\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MATERIAL_MANAGEWEEK\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1905,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:25:52\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PART_UNITS_USER\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PART_UNITS_USER\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1903,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:25:53\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_JBXX_CZ\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_JBXX_CZ\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1907,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:25:56\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_INVEST_PS_PRJ\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_INVEST_PS_PRJ\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1906,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:25:59\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_OWNER_SUB_PRJ\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_OWNER_SUB_PRJ\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1908,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:01\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_IMPWEEK_FINWORK_DETAIL\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_IMPWEEK_FINWORK_DETAIL\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1911,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:10\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MACHINE_JOIN_MAN\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MACHINE_JOIN_MAN\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 1912,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:15\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MAP_ORG_RELATION\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MAP_ORG_RELATION\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1910,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:13\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MPLAN_RPTAPP\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MPLAN_RPTAPP\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1914,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:12\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PAUSE_APP\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PAUSE_APP\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1913,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:17\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_KAI_AUTHORITY\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_KAI_AUTHORITY\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1915,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:21\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_LOOP_TOWER_EDIT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_LOOP_TOWER_EDIT\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1917,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:28\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_IMPWEEK_STARTWORK_DETAIL\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_IMPWEEK_STARTWORK_DETAIL\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 1916,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:26\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_LJLS_PERSONAL_INOUT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_LJLS_PERSONAL_INOUT\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1918,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:26\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_OWNER_PRJ_BUILD\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_OWNER_PRJ_BUILD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1919,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:27\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MONTH_MATERIALCONS\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MONTH_MATERIALCONS\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 3,\n" +
                "                \"id\": 1920,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:30\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_INVEST_PG_PRJ_HIS\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_INVEST_PG_PRJ_HIS\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 1922,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:37\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MAP_RELA\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MAP_RELA\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1921,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:38\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MANAGE_INSTU\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MANAGE_INSTU\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 8,\n" +
                "                \"id\": 1923,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:42\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MONTH_REPORT_QUERY\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MONTH_REPORT_QUERY\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1924,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:38\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_NEXT_RISK_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_NEXT_RISK_INFO\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1925,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:42\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_OWNER_CURDAY_PRJPROGRESS\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_OWNER_CURDAY_PRJPROGRESS\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 3,\n" +
                "                \"id\": 1927,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:47\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_INSPECT_SAFERISK\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_INSPECT_SAFERISK\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1926,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:51\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_IMPORTANT_WEEK_PRJ_JECT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_IMPORTANT_WEEK_PRJ_JECT\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 3,\n" +
                "                \"id\": 1928,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:48\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MACHINE_MANAGEDAY\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MACHINE_MANAGEDAY\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1931,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:52\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MEET_NOTE_KEYITEM\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MEET_NOTE_KEYITEM\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 1930,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:53\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MONTH_SINGLE_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MONTH_SINGLE_INFO\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 1933,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:26:59\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_INSPECT_PRJMANAGE\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_INSPECT_PRJMANAGE\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1934,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:04\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_NUMBER_CHAR_RELA\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_NUMBER_CHAR_RELA\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1932,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:03\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_IMPWEEK_STARTWORK\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_IMPWEEK_STARTWORK\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1935,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:05\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PGRS_MRPT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PGRS_MRPT\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 1939,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:04\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_NEXT_RISK_INFO_END\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_NEXT_RISK_INFO_END\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 11,\n" +
                "                \"id\": 1940,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:18\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PATH_GRAPH\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PATH_GRAPH\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 1942,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:15\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_INTERFACE_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_INTERFACE_INFO\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1943,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:18\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_IMPWEEK_USER\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_IMPWEEK_USER\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 1944,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:17\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_KEYITEM_EXEC_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_KEYITEM_EXEC_INFO\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1941,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:16\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MEET_NOTE\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MEET_NOTE\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1945,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:28\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_OWNER_LINE_PRJ\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_OWNER_LINE_PRJ\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1947,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:27\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_IMPORTANT_WEEK_PRJ_EVOLVE\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_IMPORTANT_WEEK_PRJ_EVOLVE\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1948,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:28\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MONTH_PRJPROG\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MONTH_PRJPROG\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1949,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:31\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_OUT_PRJ\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_OUT_PRJ\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1951,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:31\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_INVEST_PG_PRJ\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_INVEST_PG_PRJ\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 1952,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:41\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_LABOUR_PKG_SAME\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_LABOUR_PKG_SAME\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 1953,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:41\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MY_HOT_PRJECT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MY_HOT_PRJECT\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 3,\n" +
                "                \"id\": 1955,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:40\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_IMPWEEK_EXTRA_PRJ\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_IMPWEEK_EXTRA_PRJ\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1954,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:41\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_MONTH_RISKWORKLT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_MONTH_RISKWORKLT\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1958,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:48\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PLAN_ITEM_LIBRARY\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PLAN_ITEM_LIBRARY\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1959,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:53\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PROPLAN_FCB_EXT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PROPLAN_FCB_EXT\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1961,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:51\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PLAN_VERSION\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PLAN_VERSION\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 3,\n" +
                "                \"id\": 1960,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:50\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PROJECTMANAGEMENT_WEEK\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PROJECTMANAGEMENT_WEEK\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 8,\n" +
                "                \"id\": 1963,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:27:58\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PLAN_APP\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PLAN_APP\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 1965,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:28:05\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PRJECT_APPROVAL_YDBB\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PRJECT_APPROVAL_YDBB\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1966,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:28:01\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PLAN_COMLETE_NEXT_MONTH\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PLAN_COMLETE_NEXT_MONTH\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1970,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:28:05\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PROFILES_TREE\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PROFILES_TREE\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1969,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:28:03\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PROJECT_GENERAL\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PROJECT_GENERAL\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 7,\n" +
                "                \"id\": 1973,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:28:11\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PRJECT_APPROVAL\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PRJECT_APPROVAL\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 1976,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:28:11\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PRJ_SITE_MACHINE\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PRJ_SITE_MACHINE\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 1979,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:28:15\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_PM_PROGRESS_COLLECT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_PM_PROGRESS_COLLECT\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 11,\n" +
                "                \"id\": 5188,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:11\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_REFUND_EXTE_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 67,\n" +
                "                \"id\": 96,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:52:07\",\n" +
                "                \"name\": \"营销业务应用_上传15\",\n" +
                "                \"nextRunTime\": \"2020-09-09 18:51:00\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"type\": 2\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 5190,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:10\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_SUMMARY_ACCT_ENTRY\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 17,\n" +
                "                \"id\": 5192,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:17\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_SUMMARY_VOUCHER_DET\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 5191,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:09\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_SUMMARY_ACCT_ENTRY_DET\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 11,\n" +
                "                \"id\": 5189,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:11\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_REFUND_FEEDBACK_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 5193,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:19\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_TAXRATE_CFG\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 5194,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:19\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_TAXRATE_VER\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 8,\n" +
                "                \"id\": 5196,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:19\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_TERMIAL_LOG\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 5195,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:20\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_TAX_ORG\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 5197,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:26\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_TOPUP\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 5198,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:28\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_A_VOUCHER_TMPL\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 5200,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:29\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_CMS_POWERON_APP_RETURN\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 5199,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:29\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_BATCH_NO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 8,\n" +
                "                \"id\": 5202,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:28\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_CHK_CYC_DICT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 5203,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:36\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_CHK_CYC_RULE\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 5204,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:38\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_COMM_MODULE\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 5205,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:38\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_CONS_NEWBUSI_LABEL\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 11,\n" +
                "                \"id\": 5207,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:40\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_ELEC_ADDR_DET\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 12,\n" +
                "                \"id\": 5206,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:41\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_CONTACT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 12,\n" +
                "                \"id\": 5209,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:48\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_MONTH_METER_READ\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 5211,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:47\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_RCA_CONS_REMIND\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 5210,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:48\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_MP_SECT\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 5212,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:49\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_REFORM_DET\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 5213,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:50\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_SAVE_EQU_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 5214,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:57\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_SAVE_EQU_UNIT_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 15,\n" +
                "                \"id\": 5216,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:52:03\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_SPECIAL_CONS_TYPE\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 15,\n" +
                "                \"id\": 5215,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:52:03\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_SPECIAL_CONS_PARA\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 8,\n" +
                "                \"id\": 5217,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:51:57\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_SWITCH\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 10,\n" +
                "                \"id\": 5219,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:52:00\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_C_VOLT_MONITOR\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 5220,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:52:06\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_DE_SAMPLING_TEST_DTL\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 9,\n" +
                "                \"id\": 5221,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:52:06\",\n" +
                "                \"name\": \"S_DT_营销业务应用_STD_UEP_UN14_02_CMS_D_ABILITY_VERI_NOTICE\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 5,\n" +
                "                \"id\": 2801,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:56:11\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_TM_DRAWING_INSP\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_TM_DRAWING_INSP\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 2822,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:56:12\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_TM_EQUIP_SETTLEACCO_EQUI\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_TM_EQUIP_SETTLEACCO_EQUI\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 2821,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:56:10\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_TM_EQUIP_LOCATION_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_TM_EQUIP_LOCATION_INFO\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 2828,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:56:12\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_TM_ASSETS_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_TM_ASSETS_INFO\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 4,\n" +
                "                \"id\": 2814,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:56:10\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_TM_EQUIP_REGION_INFO\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_TM_EQUIP_REGION_INFO\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"consumeTime\": 6,\n" +
                "                \"id\": 2794,\n" +
                "                \"lastEndTime\": \"2020-09-08 18:56:12\",\n" +
                "                \"name\": \"T_DT_基建管理_dis_uep_icms_cisd_sgcis_TM_EQUIP_RENTIN_EQUI\",\n" +
                "                \"percent\": 100,\n" +
                "                \"runStatus\": \"1\",\n" +
                "                \"taskTableJson\": {\n" +
                "                    \"dbName\": \"数据中台@PRD\",\n" +
                "                    \"tableName\": \"dis_uep_icms_cisd_sgcis_TM_EQUIP_RENTIN_EQUI\"\n" +
                "                },\n" +
                "                \"type\": 1\n" +
                "            }\n" +
                "        ],\n" +
                "        \"currentPage\": 2,\n" +
                "        \"pageSize\": 100,\n" +
                "        \"resultCount\": 100,\n" +
                "        \"themeId\": -1,\n" +
                "        \"totalCount\": 13997,\n" +
                "        \"totalPage\": 140\n" +
                "    },\n" +
                "    \"message\": \"success\"\n" +
                "}";

        // 解析 json
        JSONObject jsonObject = JSON.parseObject(json);

        String clusterArea = jsonObject.getString("clusterArea");
        String clusterNum = jsonObject.getString("clusterNum");
        System.out.println("clusterArea = " + clusterArea);
        System.out.println("clusterNum = " + clusterNum);
        System.out.println("jsonObject = "+ jsonObject);


        String data = jsonObject.getString("data");
        // 解析 json中的data_json
        JSONObject json_data = JSON.parseObject(data);
        System.out.println("json_data = " + json_data);

        String applicationId = json_data.getString("applicationId");
        System.out.println("applicationId = " + applicationId);

        String content = json_data.getString("content");

        int json_data_content_size = json_data.getJSONArray("content").size();
        System.out.println("json_data_content_size = " + json_data_content_size);
        System.out.println("json_data_content = " + json_data.getJSONArray("content"));

        System.out.println("json_data_content[0] = " + json_data.getJSONArray("content").get(0));

        String json_data_content = json_data.getJSONArray("content").get(0).toString();
        // 解析 data_json中的content列表中的json
        JSONObject json_data_json_content = JSON.parseObject(json_data_content);
        String consumeTime = json_data_json_content.getString("consumeTime");
        System.out.println("consumeTime = " + consumeTime);
        String lastEndTime = json_data_json_content.getString("lastEndTime");
        System.out.println("lastEndTime = " + lastEndTime);
        String taskTableJson = json_data_json_content.getString("taskTableJson");
        System.out.println("taskTableJson = " + taskTableJson);

        // data_json中的content_jaon中的 taskTableJson
        JSONObject json_taskTableJson = JSON.parseObject(taskTableJson);
        System.out.println("json_taskTableJson_dbName = " + json_taskTableJson.getString("dbName"));
        System.out.println("json_taskTableJson_tableName = " + json_taskTableJson.getString("tableName"));


//        for (int i = 0; i < json_data_content_size; i++) {
//            System.out.println("json_data_content[" + i + "] = " + json_data.getJSONArray("content").get(i));
//
//        }



    }

}
