package com.scorpioneal.rulerview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ScorpioNeal on 15/7/29.
 */
public class RulerFragment extends Fragment {

    private TextView mBirthTV, mHeightTV, mWeightTv;
    private RulerView mBirthView, mHeightView, mWeightView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ruler_layout, container, false);
//        mBirthTV = (TextView)view.findViewById(R.id.birth_tv);
//        mHeightTV = (TextView)view.findViewById(R.id.height_tv);
        mWeightTv = (TextView)view.findViewById(R.id.weight_tv);
//        mBirthView = (RulerView)view.findViewById(R.id.birthRulerView);
//        mHeightView = (RulerView)view.findViewById(R.id.heightRulerView);
        mWeightView = (RulerView)view.findViewById(R.id.weightRulerView);

//        mBirthView.setStartValue(0);
//        mBirthView.setEndValue(10000);
//        mBirthView.setOriginValue(2000);
//        mBirthView.setOriginValueSmall(0);
//        mBirthView.setPartitionWidthInDP(106.7f);
//        mBirthView.setPartitionValue(1000);
//        mBirthView.setSmallPartitionCount(1);
//        mBirthView.setmValue(1990);
//        mBirthView.setValueChangeListener(new RulerView.OnValueChangeListener() {
//            @Override
//            public void onValueChange(int intVal, int fltval) {
//                mBirthTV.setText(intVal + " " + fltval);
//            }
//        });

//        mHeightView.setStartValue(50);
//        mHeightView.setEndValue(250);
//        mHeightView.setPartitionWidthInDP(40);
//        mHeightView.setPartitionValue(1);
//        mHeightView.setSmallPartitionCount(1);
//        mHeightView.setmValue(170);
//        mHeightView.setValueChangeListener(new RulerView.OnValueChangeListener() {
//            @Override
//            public void onValueChange(int intVal, int fltval) {
//                mHeightTV.setText(intVal + " " + fltval);
//            }
//        });

        mWeightView.setStartValue(0);
        mWeightView.setEndValue(10);
        mWeightView.setPartitionWidthInDP(232f);
        mWeightView.setPartitionValue(1);
        mWeightView.setSmallPartitionCount(10);
        mWeightView.setOriginValue(7);
        mWeightView.setOriginValueSmall(8);
        mWeightView.setValueChangeListener(new RulerView.OnValueChangeListener() {
            @Override
            public void onValueChange(int intVal, int fltval) {
                mWeightTv.setText(intVal + " " + (fltval));
            }
        });

        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gson();
            }
        });
        return view;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void gson() {
        String json = "[\n" +
                "{\n" +
                "code: \"10001\",\n" +
                "level: 1,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"\",\n" +
                "content: \"办园方向\",\n" +
                "parentId: \"0\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 1,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"A-1\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100010001\",\n" +
                "level: 2,\n" +
                "weight: 0.4,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"\",\n" +
                "content: \"办园宗旨\",\n" +
                "parentId: \"10001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 2,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-1\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100010002\",\n" +
                "level: 2,\n" +
                "weight: 0.6,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"\",\n" +
                "content: \"双重任务\",\n" +
                "parentId: \"10001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 3,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-2\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000100010001\",\n" +
                "level: 3,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"办园资质 查阅幼儿园登记注册证书。 法律、法规 1.对照员工花名册，查看各岗人员劳动合同，了解员工五险缴纳情况。 2.查看幼儿园对外公示栏中收退费制度。 3.通过教师问卷了解教师权益的保障情况。 4.通过家长问卷了解收费情况。 5.查看园所对依法办园相关法律法规的学习记录及园所针对法律法规学习的调查问卷。\",\n" +
                "content: \"依法办园\",\n" +
                "parentId: \"100010001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 4,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-1\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000100010002\",\n" +
                "level: 3,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"办园目标 1.查看园所三年发展规划、年度工作计划是否体现办园目标等内容。 2.查看园所的橱窗、楼道、办公室等公共校园环境中体现办园目标等宣传内容。 三年发展规划 1.查看三年发展规划的内容，包括：前言（园所概况）、现状分析（优势与不足）、指导思想、发展总目标、分方向发展总目标（包括管理、保教、保健、总务四方面的发展总目标）及主要任务、逐年分解目标及主要措施、监督和保障机制等内容。 2.查看三年发展规划制定的过程性材料：教职工、家长、社区调研材料、征求意见建议的记录、园务委员会、教代会审议通过的记录等相关档案材料。 3.查看上一个三年发展规划与当前三年发展规划的连续性。\",\n" +
                "content: \"办园目标\",\n" +
                "parentId: \"100010001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 5,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-2\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000100020001\",\n" +
                "level: 3,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"1.查阅园所的发展规划、办园理念、办园宗旨和管理制度等文字材料；听取园长汇报，通过与管理者的交流、介绍过程中获取有效信息。 2.观察教师的教育实践和师幼互动情况。\",\n" +
                "content: \"明确教育任务\",\n" +
                "parentId: \"100010002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 6,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-3\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000100020002\",\n" +
                "level: 3,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"家长工作制度 1.查阅全园工作计划是否体现本学期家长工作的重点内容。 2.查看向家长宣传科学育儿的知识活动的相关记录（活动计划、过程性文字资料、照片和小结）。 3．查看园所的宣传栏、家园联系册、家园共育栏、动态网站等。 家园联系保障机制 1.查看园所家长委员会制度，家长委员会会议记录。 2.查看家长会记录及相关过程性资料（包括全园家长会及班级家长会。） 3.查阅园所吸纳家长参与园所管理的方式，吸纳家长提出的意见和建议的相关过程性材料。 家长满意率 查看家长问卷及统计分析报告：班级分析、园所汇总分析。通过分析报告，了解幼儿园对家长反馈意见及满意率。\",\n" +
                "content: \"为家长服务\",\n" +
                "parentId: \"100010002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 7,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-4\"\n" +
                "},\n" +
                "{\n" +
                "code: \"10002\",\n" +
                "level: 1,\n" +
                "weight: 0.3,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"\",\n" +
                "content: \"物质条件\",\n" +
                "parentId: \"0\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 8,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"A-2\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100020001\",\n" +
                "level: 2,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"\",\n" +
                "content: \"环境条件\",\n" +
                "parentId: \"10002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 9,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-3\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200010001\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 3,\n" +
                "assessMethod: \"幼儿园环境 查看幼儿园整体环境（包括功能教师、办公室、楼道、操场、成人卫生间、班级活动室、盥洗室、幼儿园伙房及库房等）。 幼儿园安全 查看整体环境是否存在安全隐患。\",\n" +
                "content: \"环境要求 \",\n" +
                "parentId: \"100020001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 10,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-5\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200010002\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 4,\n" +
                "assessMethod: \"1.实地查看幼儿园环境条件。 2.查阅幼儿园统计报表和幼儿园占地面积的数据（或建筑图纸）。 3.计算人均面积。 计算方法： 占地面积/全园在册幼儿总数。\",\n" +
                "content: \"占地面积\",\n" +
                "parentId: \"100020001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 11,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-6\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200010003\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 5,\n" +
                "assessMethod: \"1.实地查看幼儿园环境条件。 2.查看幼儿园统计报表和幼儿园绿化面积的数据（或相关数据资料）。 3.计算人均面积 计算方法： 绿化面积/全园在册幼儿总数。\",\n" +
                "content: \"绿化面积\",\n" +
                "parentId: \"100020001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 12,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-7\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200010004\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 6,\n" +
                "assessMethod: \"实地查看园所整体绿化、美化情况。\",\n" +
                "content: \"美化绿化\",\n" +
                "parentId: \"100020001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 13,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-8\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200010005\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 7,\n" +
                "assessMethod: \"活动场地面积 1.实地查看幼儿园环境条件。 2.查阅幼儿园统计报表和幼儿园活动场地面积的数据（或建筑图纸）。 3.计算人均面积 计算方法： 活动场地面积/全园在册幼儿总数活动场地安排 实地查看园所户外场地安全及使用情况。\",\n" +
                "content: \"活动场地\",\n" +
                "parentId: \"100020001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 14,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-9\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200010006\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 8,\n" +
                "assessMethod: \"1.实地查看幼儿园环境条件。 2.查阅幼儿园统计报表和幼儿园房舍建筑面积的数据（或建筑图纸） 3.查看班级教室安全、通风、采光情况。 4.计算人均面积 计算方法： 建筑面积/全园在册幼儿数。\",\n" +
                "content: \"房舍建筑\",\n" +
                "parentId: \"100020001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 15,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-10\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200010007\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 9,\n" +
                "assessMethod: \"活动用房 1.实地查看幼儿园活动用房环境。 2.查阅幼儿园活动及辅助用房的面积数据（或图纸）：包括活动室、卧室、盥洗室、厕所、衣帽间或玩教具储蓄室、音体活动室面积等。 活动用房安排 查看活动用房的实际安排及使用情况。 幼儿人均使用面积 计算人均面积 计算方法： 幼儿活动及辅助用房面积/全园在册幼儿总数。 \",\n" +
                "content: \"活动用房\",\n" +
                "parentId: \"100020001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 16,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-11\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200010008\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 10,\n" +
                "assessMethod: \"办公及生活用房1.实地查看幼儿园活动用房环境。 2.查阅幼儿园办公及生活用房面积数据（或图纸）：包括办公室、备课室、资料室、保健室、隔离室、贮藏室、厨房、成人厕所等。 幼儿人均使用面积 计算人均面积 计算方法： 幼儿活动及辅助用房面积/全园在册幼儿总数。\",\n" +
                "content: \"办公及生活用房\",\n" +
                "parentId: \"100020001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 17,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-12\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100020002\",\n" +
                "level: 2,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"\",\n" +
                "content: \"设备条件\",\n" +
                "parentId: \"10002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 18,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-4\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200020001\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"学习生活设备 实地查看幼儿活动室、睡眠室、盥洗室等环境及设备配备。 保健室、隔离室设备 实地查看保健室、隔离室的设备配备情况。 其他设备 实地查看园所冰箱（冰柜）、洗衣机和消毒设备。\",\n" +
                "content: \"室内设备 \",\n" +
                "parentId: \"100020002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 19,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-13\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200020002\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"大型器械 对照《北京市幼儿园、托儿所办园、所条件标准（试行）》中有关幼儿园玩教具配备的标准，实地查看幼儿体育器材库器材的数量、种类。 大型器械安置 器械设置的位置、安全防护措施、使用情况等。 大型器械卫生 查看器械的卫生情况。\",\n" +
                "content: \"大型器械\",\n" +
                "parentId: \"100020002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 20,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-14\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200020003\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 3,\n" +
                "assessMethod: \"玩教具更新 了解园所每学期增加玩教具的计划，实地查看玩教具的更新情况。 玩教具配备 对照《北京市幼儿园、托儿所办园、所条件标准（试行）》中玩教具配备内容标准要求实，地查看班级玩教具配备情况。 自制玩教具 实地查看自制玩教具的配备情况。 玩教具放置 实地查看玩教具的配备位置。 玩教具材料要求 现场查看玩教具的安全和卫生情况。\",\n" +
                "content: \"玩教具\",\n" +
                "parentId: \"100020002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 21,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-15\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200020004\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 4,\n" +
                "assessMethod: \"儿童图书 实地查看班级图书配备的数量、种类和更新情况。 成人图书 1.实地查看成人图书的配备情况。 2.通过登记记录查看图书每学期要更新、补充情况。\",\n" +
                "content: \"图书资料 \",\n" +
                "parentId: \"100020002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 22,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-16\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000200020005\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 5,\n" +
                "assessMethod: \"1.查看一日生活中幼儿大型器械、玩教具、图书材料使用情况。 2.查看玩教具、图书使用情况登记记录、功能教室的使用情况记录。\",\n" +
                "content: \"使用情况\",\n" +
                "parentId: \"100020002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 23,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-17\"\n" +
                "},\n" +
                "{\n" +
                "code: \"10003\",\n" +
                "level: 1,\n" +
                "weight: 0.3,\n" +
                "label: \"级类\",\n" +
                "sort: 3,\n" +
                "assessMethod: \"\",\n" +
                "content: \"人员条件\",\n" +
                "parentId: \"0\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 24,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"A-3\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100030001\",\n" +
                "level: 2,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"\",\n" +
                "content: \"人员编制\",\n" +
                "parentId: \"10003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 25,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-5\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100030002\",\n" +
                "level: 2,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"\",\n" +
                "content: \"任职资格\",\n" +
                "parentId: \"10003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 26,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-6\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300010001\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"查看园所各岗人员花名册。\",\n" +
                "content: \"园长\",\n" +
                "parentId: \"100030001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 27,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-18\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300010002\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"查看园所各岗人员花名册和班级教师实际配置情况。\",\n" +
                "content: \"教师\",\n" +
                "parentId: \"100030001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 28,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-19\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300010003\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 3,\n" +
                "assessMethod: \"查看园所各岗人员花名册和班级保育员实际配置情况。\",\n" +
                "content: \"保育员\",\n" +
                "parentId: \"100030001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 29,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-20\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300010004\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 4,\n" +
                "assessMethod: \"查看园所各岗人员花名册和保健医实际配置比例。\",\n" +
                "content: \"保健医\",\n" +
                "parentId: \"100030001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 30,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-21\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300010005\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 5,\n" +
                "assessMethod: \"查看园所各岗人员花名册和炊事员实际配置。\",\n" +
                "content: \"炊事员\",\n" +
                "parentId: \"100030001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 31,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-22\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300010006\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 6,\n" +
                "assessMethod: \"查看园所各岗人员花名册和财务人员配置。\",\n" +
                "content: \"财会人员\",\n" +
                "parentId: \"100030001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 32,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-23\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300010007\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 7,\n" +
                "assessMethod: \"1.查看园所各岗人员花名册。 2.计算教职工与幼儿比 计算方法： 全园教职工人数/全园幼儿人数。\",\n" +
                "content: \"教职工与幼儿比例\",\n" +
                "parentId: \"100030001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 33,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-24\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300010008\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 8,\n" +
                "assessMethod: \"1.查看全园各班幼儿在册统计数据。 2.查看班级交接班本，了解班级实际幼儿数。\",\n" +
                "content: \"班平均幼儿数\",\n" +
                "parentId: \"100030001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 34,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-25\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300020001\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"1.查看园所各岗人员花名册。 2.查看园长培训合格证书、学历证书、职称证书、工作履历等。\",\n" +
                "content: \"园长及业务园长\",\n" +
                "parentId: \"100030002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 35,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-26\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300020002\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"1.查看园所各岗人员花名册。 2.查看教师学历证书、教师资格证书、教师职称证书、市、区级骨干教师证书。\",\n" +
                "content: \"教师\",\n" +
                "parentId: \"100030002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 36,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-27\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300020003\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 3,\n" +
                "assessMethod: \"1.查阅保育员花名册。 2.查看保育员学历证书、培训合格证书。\",\n" +
                "content: \"保育员\",\n" +
                "parentId: \"100030002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 37,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-28\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300020004\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 4,\n" +
                "assessMethod: \"1.查看保健员花名册。 2.查看保健员的学历证书、职称证书、保健医上岗证书等。\",\n" +
                "content: \"保健医\",\n" +
                "parentId: \"100030002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 38,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-29\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300020005\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 5,\n" +
                "assessMethod: \"1.查看园所炊事员花名册。 2.查看园所炊事员健康证、培训合格证。\",\n" +
                "content: \"炊事员\",\n" +
                "parentId: \"100030002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 39,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-30\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000300020006\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 6,\n" +
                "assessMethod: \"1.查看园所财务人员花名册。 2.查看财务人员会计证书。\",\n" +
                "content: \"财会人员\",\n" +
                "parentId: \"100030002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 40,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-31\"\n" +
                "},\n" +
                "{\n" +
                "code: \"10004\",\n" +
                "level: 1,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 4,\n" +
                "assessMethod: \"\",\n" +
                "content: \"管理工作\",\n" +
                "parentId: \"0\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 41,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"A-4\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100040001\",\n" +
                "level: 2,\n" +
                "weight: 0.3,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"\",\n" +
                "content: \"组织、制度、队伍建设\",\n" +
                "parentId: \"10004\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 42,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-7\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100040002\",\n" +
                "level: 2,\n" +
                "weight: 0.7,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"\",\n" +
                "content: \"管理过程与效果\",\n" +
                "parentId: \"10004\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 43,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-8\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000400010001\",\n" +
                "level: 3,\n" +
                "weight: 0.3,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"组织机构设置 1.通过教职工访谈，了解园所组织机构。 2.查阅组织结构图、各项会议制度，了解组织机构设置情况。 组织机构职能 查阅园所会议记录。\",\n" +
                "content: \"组织建设\",\n" +
                "parentId: \"100040001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 44,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-32\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000400010002\",\n" +
                "level: 3,\n" +
                "weight: 0.3,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"制度建立 1.查看园所各项制度，包括17项制度及园本制度。 2.查看园所各岗工作常规。实地查看各岗人员工作情况。 3.结合园所实际工作、各项工作记录、会议记录，检验制度是否符合园所实际。 制度修订 查看各项制度制定、修订的过程性材料。\",\n" +
                "content: \"制度建设\",\n" +
                "parentId: \"100040001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 45,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-33\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000400010003\",\n" +
                "level: 3,\n" +
                "weight: 0.4,\n" +
                "label: \"级类\",\n" +
                "sort: 3,\n" +
                "assessMethod: \"师德教育 1查阅师德主题教育的记录。 2.观察教职工工作状态和工作实践水平。 队伍培养 1.查看园所教师学习、进修的相关材料。 2.查看园所的队伍三年规划是否有关于落实两支队伍建设的具体举措。 3.查阅教师个人三年发展规划、成长档案、培训记录等材料。 4.通过听园长汇报，与园长进行沟通了解相关的经费投入情况。\",\n" +
                "content: \"队伍建设\",\n" +
                "parentId: \"100040001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 46,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-34\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000400020001\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 1,\n" +
                "assessMethod: \"计划 1.查看各项计划内容，包括：分析、指导思想、内容与目标、具体措施、分月安排等。 2.查看园所工作计划是否体现园所三年发展规划的重点内容。 总结 对照计划查看各项总结。\",\n" +
                "content: \"计划总结 \",\n" +
                "parentId: \"100040002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 47,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-35\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000400020002\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 2,\n" +
                "assessMethod: \"1.查阅园长下班指导工作制度、园长检查工作记录、看课记录、园长参与各部门学习或会议的记录，园长批阅中层管理人员的工作笔记或记录。 2.园长检查记录内容基本包括： 时间、地点、部门、实录、分析及指导反馈等信息。 指导时间 计算园长下班检查工作时间。 \",\n" +
                "content: \"指导工作\",\n" +
                "parentId: \"100040002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 48,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-36\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000400020003\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 3,\n" +
                "assessMethod: \"1.实地查看园所教职工制度的执行情况。 2.通过教师访谈，了解园所制度落实情况。 3.查看园所资料归档情况。\",\n" +
                "content: \"制度落实\",\n" +
                "parentId: \"100040002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 49,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-37\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000400020004\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 4,\n" +
                "assessMethod: \"观察教职工工作状态、精神面貌。\",\n" +
                "content: \"工作氛围\",\n" +
                "parentId: \"100040002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 50,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-38\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000400020005\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 5,\n" +
                "assessMethod: \"1.查看园务会记录中体现重大支出的讨论与决议、财务收支报表材料。 2.查看全年用于购置玩教具、图书总支出凭证和全园年经费总支出凭证。 3.查看园所环境改善情况。\",\n" +
                "content: \"办园效益\",\n" +
                "parentId: \"100040002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 51,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-39\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000400020006\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 6,\n" +
                "assessMethod: \"安全措施 1.实地查看幼儿园的安全措施。 2.实地查看安全设备设施，包括：监控、报警、防护栏、灭火器、安全标识、应急灯等。 3.查看消毒液、洗涤用品及儿童药品的管理措施。 安全管理 1.查看园所安全管理网络图、安全小组成员、分工及安全责任书。 *2.查阅各项安全制度、安全预案。 3.查阅安全检查记录。 4.查阅安全会议记录。 5.实地查看幼儿园材料、用品、玩教具的安全性和环保性。 安全培训 1.通过教师访谈了解教职工的安全意识，查看教职工安全培训过程性材料（记录、照片和小结等）。 2.查看园所幼儿安全教育活动的相关性材料。 3.查看园所安全演习相关材料（安全预案、当日流程、照片及总结等）。 安全事故 查看儿童伤害与事故登记册。\",\n" +
                "content: \"安全\",\n" +
                "parentId: \"100040002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"1\",\n" +
                "id: 52,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-40\"\n" +
                "},\n" +
                "{\n" +
                "code: \"10005\",\n" +
                "level: 1,\n" +
                "weight: 0.4,\n" +
                "label: \"级类\",\n" +
                "sort: 53,\n" +
                "assessMethod: \"\",\n" +
                "content: \"保教工作\",\n" +
                "parentId: \"0\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 53,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"A-1\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100050001\",\n" +
                "level: 2,\n" +
                "weight: 0.3,\n" +
                "label: \"级类\",\n" +
                "sort: 54,\n" +
                "assessMethod: \"\",\n" +
                "content: \"保教工作管理\",\n" +
                "parentId: \"10005\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 54,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-1\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100050002\",\n" +
                "level: 2,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 55,\n" +
                "assessMethod: \"\",\n" +
                "content: \"教育环境的创设与利用\",\n" +
                "parentId: \"10005\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 55,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-2\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100050003\",\n" +
                "level: 2,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 56,\n" +
                "assessMethod: \"\",\n" +
                "content: \"保教工作实践\",\n" +
                "parentId: \"10005\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 56,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-3\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000500010001\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 57,\n" +
                "assessMethod: \"\",\n" +
                "content: \"教育观念\",\n" +
                "parentId: \"100050001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 57,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-1\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000500010002\",\n" +
                "level: 3,\n" +
                "weight: 0.3,\n" +
                "label: \"级类\",\n" +
                "sort: 58,\n" +
                "assessMethod: \"\",\n" +
                "content: \"常规管理\",\n" +
                "parentId: \"100050001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 58,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-2\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000500010003\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 59,\n" +
                "assessMethod: \"\",\n" +
                "content: \"保教工作评价\",\n" +
                "parentId: \"100050001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 59,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-3\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000500010004\",\n" +
                "level: 3,\n" +
                "weight: 0.3,\n" +
                "label: \"级类\",\n" +
                "sort: 60,\n" +
                "assessMethod: \"\",\n" +
                "content: \"教研工作\",\n" +
                "parentId: \"100050001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 60,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-4\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000500020001\",\n" +
                "level: 3,\n" +
                "weight: 0.6,\n" +
                "label: \"级类\",\n" +
                "sort: 61,\n" +
                "assessMethod: \"\",\n" +
                "content: \"精神环境\",\n" +
                "parentId: \"100050002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 61,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-5\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000500020002\",\n" +
                "level: 3,\n" +
                "weight: 0.4,\n" +
                "label: \"级类\",\n" +
                "sort: 62,\n" +
                "assessMethod: \"\",\n" +
                "content: \"物质环境\",\n" +
                "parentId: \"100050002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 62,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-6\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000500030001\",\n" +
                "level: 3,\n" +
                "weight: 0.3,\n" +
                "label: \"级类\",\n" +
                "sort: 63,\n" +
                "assessMethod: \"\",\n" +
                "content: \"观察儿童\",\n" +
                "parentId: \"100050003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 63,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-7\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000500030002\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 64,\n" +
                "assessMethod: \"\",\n" +
                "content: \"教育计划\",\n" +
                "parentId: \"100050003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 64,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-8\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000500030003\",\n" +
                "level: 3,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 65,\n" +
                "assessMethod: \"\",\n" +
                "content: \"一日生活\",\n" +
                "parentId: \"100050003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 65,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-9\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000500030004\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 66,\n" +
                "assessMethod: \"\",\n" +
                "content: \"家园共育\",\n" +
                "parentId: \"100050003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 66,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-10\"\n" +
                "},\n" +
                "{\n" +
                "code: \"10006\",\n" +
                "level: 1,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 67,\n" +
                "assessMethod: \"\",\n" +
                "content: \"儿童身心发展\",\n" +
                "parentId: \"0\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 67,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"A-3\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100060001\",\n" +
                "level: 2,\n" +
                "weight: 1,\n" +
                "label: \"级类\",\n" +
                "sort: 68,\n" +
                "assessMethod: \"\",\n" +
                "content: \"儿童身心发展\",\n" +
                "parentId: \"10006\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 68,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-8\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000600010001\",\n" +
                "level: 3,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 69,\n" +
                "assessMethod: \"\",\n" +
                "content: \"儿童身心发展\",\n" +
                "parentId: \"100060001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 69,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-41\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000600010002\",\n" +
                "level: 3,\n" +
                "weight: 0.5,\n" +
                "label: \"级类\",\n" +
                "sort: 70,\n" +
                "assessMethod: \"\",\n" +
                "content: \"儿童身心发展\",\n" +
                "parentId: \"100060001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"2\",\n" +
                "id: 70,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-42\"\n" +
                "},\n" +
                "{\n" +
                "code: \"10007\",\n" +
                "level: 1,\n" +
                "weight: 0.4,\n" +
                "label: \"级类\",\n" +
                "sort: 71,\n" +
                "assessMethod: \"\",\n" +
                "content: \"卫生保健\",\n" +
                "parentId: \"0\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 71,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"A-1\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100070001\",\n" +
                "level: 2,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 72,\n" +
                "assessMethod: \"\",\n" +
                "content: \"卫生保健管理\",\n" +
                "parentId: \"10007\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 72,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-4\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100070002\",\n" +
                "level: 2,\n" +
                "weight: 0.35,\n" +
                "label: \"级类\",\n" +
                "sort: 73,\n" +
                "assessMethod: \"\",\n" +
                "content: \"常规工作\",\n" +
                "parentId: \"10007\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 73,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-5\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100070003\",\n" +
                "level: 2,\n" +
                "weight: 0.25,\n" +
                "label: \"级类\",\n" +
                "sort: 74,\n" +
                "assessMethod: \"\",\n" +
                "content: \"食品卫生\",\n" +
                "parentId: \"10007\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 74,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-6\"\n" +
                "},\n" +
                "{\n" +
                "code: \"100070004\",\n" +
                "level: 2,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 75,\n" +
                "assessMethod: \"\",\n" +
                "content: \"儿童健康指标\",\n" +
                "parentId: \"10007\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 75,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"B-7\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700010001\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 76,\n" +
                "assessMethod: \"\",\n" +
                "content: \"园所长\",\n" +
                "parentId: \"100070001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 76,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-11\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700010002\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 77,\n" +
                "assessMethod: \"\",\n" +
                "content: \"保健人员\",\n" +
                "parentId: \"100070001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 77,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-12\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700010003\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 78,\n" +
                "assessMethod: \"\",\n" +
                "content: \"保健制度\",\n" +
                "parentId: \"100070001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 78,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-13\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700010004\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 79,\n" +
                "assessMethod: \"\",\n" +
                "content: \"计划总结\",\n" +
                "parentId: \"100070001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 79,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-14\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700010005\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 80,\n" +
                "assessMethod: \"\",\n" +
                "content: \"卫生保健资料与分析\",\n" +
                "parentId: \"100070001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 80,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-15\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700010006\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 81,\n" +
                "assessMethod: \"\",\n" +
                "content: \"资料与保存\",\n" +
                "parentId: \"100070001\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 81,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-16\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020001\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 82,\n" +
                "assessMethod: \"\",\n" +
                "content: \"健康检查\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 82,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-17\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020002\",\n" +
                "level: 3,\n" +
                "weight: 0.05,\n" +
                "label: \"级类\",\n" +
                "sort: 83,\n" +
                "assessMethod: \"\",\n" +
                "content: \"健康教育\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 83,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-18\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020003\",\n" +
                "level: 3,\n" +
                "weight: 0.05,\n" +
                "label: \"级类\",\n" +
                "sort: 84,\n" +
                "assessMethod: \"\",\n" +
                "content: \"疾病预防\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 84,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-19\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020004\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 85,\n" +
                "assessMethod: \"\",\n" +
                "content: \"五官保健\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 85,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-20\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020005\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 86,\n" +
                "assessMethod: \"\",\n" +
                "content: \"体弱儿管理\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 86,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-21\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020006\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 87,\n" +
                "assessMethod: \"\",\n" +
                "content: \"体格锻炼\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"\",\n" +
                "aspect: \"3\",\n" +
                "id: 87,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-22\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020007\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 88,\n" +
                "assessMethod: \"\",\n" +
                "content: \"个人卫生\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 88,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-23\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020008\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 89,\n" +
                "assessMethod: \"\",\n" +
                "content: \"生活护理\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 89,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-24\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020009\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 90,\n" +
                "assessMethod: \"\",\n" +
                "content: \"卫生消毒工作\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 90,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-25\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020010\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 91,\n" +
                "assessMethod: \"\",\n" +
                "content: \"膳食管理\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 91,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-26\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700020011\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 92,\n" +
                "assessMethod: \"\",\n" +
                "content: \"伙食等级\",\n" +
                "parentId: \"100070002\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 92,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-27\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700030001\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 93,\n" +
                "assessMethod: \"\",\n" +
                "content: \"许可证\",\n" +
                "parentId: \"100070003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 93,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-28\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700030002\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 94,\n" +
                "assessMethod: \"\",\n" +
                "content: \"伙房\",\n" +
                "parentId: \"100070003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 94,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-29\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700030003\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 95,\n" +
                "assessMethod: \"\",\n" +
                "content: \"库房\",\n" +
                "parentId: \"100070003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 95,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-30\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700030004\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 96,\n" +
                "assessMethod: \"\",\n" +
                "content: \"消毒设施\",\n" +
                "parentId: \"100070003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 96,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-31\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700030005\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 97,\n" +
                "assessMethod: \"\",\n" +
                "content: \"消毒质量\",\n" +
                "parentId: \"100070003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 97,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-32\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700030006\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 98,\n" +
                "assessMethod: \"\",\n" +
                "content: \"食品卫生质量\",\n" +
                "parentId: \"100070003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 98,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-33\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700030007\",\n" +
                "level: 3,\n" +
                "weight: 0.1,\n" +
                "label: \"级类\",\n" +
                "sort: 99,\n" +
                "assessMethod: \"\",\n" +
                "content: \"食品从业人员\",\n" +
                "parentId: \"100070003\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 99,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-34\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700040001\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 100,\n" +
                "assessMethod: \"\",\n" +
                "content: \"体格发育\",\n" +
                "parentId: \"100070004\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 100,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-35\"\n" +
                "},\n" +
                "{\n" +
                "code: \"1000700040002\",\n" +
                "level: 3,\n" +
                "weight: 0.2,\n" +
                "label: \"级类\",\n" +
                "sort: 101,\n" +
                "assessMethod: \"\",\n" +
                "content: \"营养不良性疾病\",\n" +
                "parentId: \"100070004\",\n" +
                "versionId: \"1\",\n" +
                "aspect: \"3\",\n" +
                "id: 101,\n" +
                "category: 0,\n" +
                "questionType: \"\",\n" +
                "mark: \"C-36\"\n" +
                "}\n" +
                "]";
        Gson gson =new Gson();
        List<TestAssess> rs=new ArrayList<TestAssess>();

        Type type = new TypeToken<ArrayList<TestAssess>>() {}.getType();

        rs = gson.fromJson(json, type);
    }
}
