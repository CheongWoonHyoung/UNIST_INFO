package com.example.owner.myunist_info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.LayoutInflater.from;

/**
 * Created by cheongwh on 2015. 7. 13..
 */
public class Intro_Subpager_Fragment2 extends Fragment {
    private int department_id;
    private int order_of_page;
    private View intro_View = null;
    private Context intro_context;
    private TextView lec_btn_1;
    private TextView lec_btn_2;
    private TextView lec_btn_3;
    private TextView lec_btn_4;
    private TextView lec_btn_5;
    private TextView lec_btn_6;
    private TextView lec_btn_7;
    private TextView lec_btn_8;
    private TextView lec_btn_9;
    private TextView lec_btn_10;
    private TextView lec_btn_11;
    private TextView lec_btn_12;
    private TextView lec_btn_13;

    private Intent go_to_lec_explanation;
    public static Intro_Subpager_Fragment2 newProduction(int Number_of_page, int id) {
        Intro_Subpager_Fragment2 mpage = new Intro_Subpager_Fragment2();
        mpage.department_id =  id;
        mpage.order_of_page = Number_of_page;

        return mpage;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        intro_context = container.getContext();

        switch(order_of_page){
            case 0:
                intro_View = (View) from(intro_context).inflate(R.layout.new_intropage, container, false);
                TextView depart_name_ko = (TextView) intro_View.findViewById(R.id.depart_name_ko);
                RelativeLayout main_backG1 = (RelativeLayout) intro_View.findViewById(R.id.main_img);
                TextView title = (TextView) intro_View.findViewById(R.id.title);
                TextView contents = (TextView) intro_View.findViewById(R.id.contents);
                switch(department_id){
                    case 8:
                        depart_name_ko.setText("자연과학부");
                        main_backG1.setBackgroundResource(R.drawable.snsbg);
                        title.setText(R.string.SNS_txt_0);
                        contents.setText("  자연과학은 자연계에 존재하는 보편적인 법칙을 찾아내고 이해함으로써 인류의 발전에 공헌하는 것을 목표로 하는 학문입니다. \n \n  역사적으로 이러한 자연과학적인 결과를 공학과 융합하는 방법으로 시대를 선도하는 새로운 테크놀로지가 개발되어 왔고, UNIST는 그런 융합을 학교 발전의 주요 전략의 하나로 채택하여 수행하고 있습니다. \n \n  UNIST의 자연과학부는 기초과학 교육을 담당하고, 창의적인 학제간 연구를 수행하는 것을 목표로 2010년에 창설되어 운영되어 왔습니다. \n \n  최고수준의 자연과학 연구를 수행하기 위해 국내외의 세계적인 석학 유치와 국제과학비즈니스벨트 캠퍼스 연구단 선정 등으로 국내는 물론 세계에서도 인정받는 학부로 성장하고 있습니다.\n \n ");
                        break;
                    case 9:
                        depart_name_ko.setText("도시환경공학부");
                        main_backG1.setBackgroundResource(R.drawable.ueebg);
                        title.setText(R.string.UEE_txt_0);
                        contents.setText("  도시환경공학부에서는 급격한 산업화로부터 기인한 환경오염과 기후변화 및 각종 자연재해로 인해 도시와 시민들의 안전에 심각한 문제가 대두됨에 따라, 이를 해결하기 위한 환경보호, 지속가능한 발전, 재해관리, 인류 복지 증진 등을 아우르는 융합학문을 연구하고 있습니다. \n \n  도시환경 공학 분야에서 혁신적 신기술을 개발하고 미래 글로벌 리더 양성을 목표로 하고 있습니다." );
                        break;
                    default:
                        break;

                }
                break;
            case 1:
                intro_View = (View) from(intro_context).inflate(R.layout.new_intropage_2, container, false);
                TextView intro_track = (TextView) intro_View.findViewById(R.id.intro_track);
                TextView track_name = (TextView) intro_View.findViewById(R.id.name_track);
                TextView content = (TextView) intro_View.findViewById(R.id.contents);
                RelativeLayout main_backG2 = (RelativeLayout) intro_View.findViewById(R.id.main_img2);
                switch(department_id){
                    case 8:
                        intro_track.setText("트랙 소개");
                        track_name.setText("물리학");
                        content.setText("  물리학 트랙에서는 현대 물리학의 관점에서 자연의 기본현상에 대한 깊이 있는 탐구를 수행하고, 이를 바탕으로 인류의 삶에 기여하는 미래 첨단 기술 개발의 토대를 마련하는 연구를 수행하고 있습니다. \n \n  구체적으로는 입자물리 및 우주론, 천체물리, 고체물리, 연성물질물리, 생물물리, 플라즈마 및 빔 물리, 원자 및 분자 물리, 광학 분야에서 선도적인 기초 및 응용연구를 진행하고 있습니다. \n \n ");
                        main_backG2.setBackgroundResource(R.drawable.snsbg);
                        break;
                    case 9:
                        intro_track.setText("트랙 소개");
                        track_name.setText("환경과학공학");
                        content.setText("  환경오염과 기후변화를 포함한 전 지구적 및 지역적 환경문제를 포괄적으로 다루고 있습니다. \n \n  환경오염 모니터링 및 처리, 기후모델, 환경거동 모델, 원격탐사, 수문학 등을 포함한 다양한 환경 분야 주제를 학습할 수 있는 교과과정을 제공함으로써, 인류가 직면한 환경문제 해결에 기여할 수 있는 전문 인력 양성을 추구합니다.\n \n ");
                        main_backG2.setBackgroundResource(R.drawable.ueebg);
                        break;
                }
                break;
            case 2:
                intro_View = (View) from(intro_context).inflate(R.layout.new_intropage_2, container, false);
                TextView intro_track2 = (TextView) intro_View.findViewById(R.id.intro_track);
                TextView track_name2 = (TextView) intro_View.findViewById(R.id.name_track);
                TextView content2 = (TextView) intro_View.findViewById(R.id.contents);
                RelativeLayout main_backG3 = (RelativeLayout) intro_View.findViewById(R.id.main_img2);
                switch(department_id){
                    case 8:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("화학");
                        content2.setText("  화학과는 학부 학생들에게 화학의 전 분야 및 나노과학에 대하여 근본적이고 철저한 이해를 할 수 있는 기회를 제공합니다. \n \n  트랙에서 제공되는 강의는 유기화학, 물리화학, 분석화학, 생화학, 재료 및 고분자화학, 나노화학 등 모든 분야를 다루고 있습니다.\n \n   학생들은 또한 화학과의 교육과정을 통해 동료들과 함께 공부하고 연구하는 즐거움을 누리게 될 것입니다. \n \n  학생들은 강의와 연구를 통해 다른 동료들과 협동하는 방법, 이를 통한 문제의 해결과 창의적인 연구의 진행을 경험하게 될 것입니다. \n \n  화학과는 강의뿐만 아니라 학생들이 실제 연구현장에 참여하여 연구경험을 쌓는 것을 중요한 교육의 방법으로 삼고 있습니다. \n \n  저희 트랙의 최종목표는 교육과 연구를 통해 학생들이 미래의 세계를 이끌어 갈 세계적인 화학자, 과학자로서의 자질을 습득하도록 하는 것이며, 인류의 진보를 위해 일하는 최고수준의 연구인력을 양성하는 것입니다.\n \n ");
                        main_backG3.setBackgroundResource(R.drawable.snsbg);
                        break;
                    case 9:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("도시건설공학");
                        content2.setText("  본 트랙은 지속가능하며 재난에 안전한 도시건설을 위해, 교량, 도로, 원자력발전소, 건축구조물 등의 주요 도시기반시설물의 설계, 건설, 유지관리 및 도시계획, 설계에 관한 문제를 중점적으로 다룹니다.\n \n  이를 위해, 도시계획, 구조설계 및 역학, 건설재료와 관련된 기초/응용 교과목을 제공하고 있으며, 현대 도시의 문제를 도시계획 및 공학적 관점에서 포괄적으로 볼 수 있는 시각을 가진 인력양성을 목표로 합니다.\n \n ");
                        main_backG3.setBackgroundResource(R.drawable.ueebg);
                        break;
                }
                break;
            case 3:
                intro_View = (View) from(intro_context).inflate(R.layout.new_intropage_2, container, false);
                TextView intro_track3 = (TextView) intro_View.findViewById(R.id.intro_track);
                TextView track_name3 = (TextView) intro_View.findViewById(R.id.name_track);
                TextView content3 = (TextView) intro_View.findViewById(R.id.contents);
                RelativeLayout main_backG4 = (RelativeLayout) intro_View.findViewById(R.id.main_img2);
                switch(department_id){
                    case 8:
                        intro_track3.setText("트랙 소개");
                        track_name3.setText("수학");
                        content3.setText("  수학은 자연의 명확한 이해를 위해 필수적인 과학의 보편적인 언어입니다. \n \n  수리과학 트랙 학생들은 수학에 대한 기본적인 지식과 수학 및 과학 문제를 해겨하는데 필요한 체계적인 능력을 습득할 것입니다. \n \n  이 트랙은 수학적 사고를 위한 기본적인 과목뿐만 아니라, 물리학, 수리 생물학, 공학, 의료 과학 및 금융수학 연구에 필수적인 다양한 응용 수학 과목을 학생들에게 제공하여 체계적인 수학적 전문가를 양성합니다. \n \n  ");
                        main_backG4.setBackgroundResource(R.drawable.snsbg);
                        break;
                    case 9:
                        intro_track3.setText("트랙 소개");
                        track_name3.setText("재난관리공학");
                        content3.setText("  다양한 자연 및 인적재난의 원인을 분석하고 도시 사회 및 경제적 영향을 절감하고 효율적 대응 및 복구를 위한 통합적 재난관리 연구 및 교육프로그램을 제공하고 있습니다. \n \n  지구과학/기후변화, 환경공학, 도시/토목공학의 융복합적 기술을 이용하여 자연재난 예측 및 분석, 인적재난 위험성 분석 및 절감기술, 재난관리 시스템, 도시기반시설의 재난대비 및 복구기술과 같은 피해절감에 기여할 수 있는 연구 및 전문 인력 양성을 추구합니다. \n \n ");
                        main_backG4.setBackgroundResource(R.drawable.ueebg);
                        break;
                }
                break;
            case 4:
                intro_View = (View) from(intro_context).inflate(R.layout.new_listview, container, false);
                TextView department = (TextView) intro_View.findViewById(R.id.department);
                ListView sub_list = (ListView) intro_View.findViewById(R.id.sub_list);
                sub_list.setDivider(null);
                ArrayList<SubjectListItem> item = new ArrayList<>();
                SubjectListAdapter adapter = new SubjectListAdapter(intro_context,R.id.sub_list,item);
                switch(department_id){
                    case 8:
                        department.setText("자연과학부");
                        item.add(new SubjectListItem("전자기학", "전기 및 자기장에 관한 기초이론을 다룬다. 주요 내용으로는 벡터이론, 쿨롱의 법칙, 가우스의 법칙, 다이버전스(발산) 이론, 에너지 및 전위차, 도체 및 유전체의 전기장에서의 특성, 라플라스 방정식 등을 포함합니다.", "물리학"));
                        item.add(new SubjectListItem("양자물리학","원자 및 분자, 그리고 그보다 더 작은 미시 세계를 물리학적으로 이해하기 위해서 기본적으로 배워야 할 내용입니다. 실제 전자와 원자, 다체계 등을 구체적으로 이해하는 것을 목적으로 하는 과목입니다. ","물리학"));
                        item.add(new SubjectListItem("수리물리학","물리학을 위해 필요한 수학을 강의합니다. 벡터해석, 선형대수, 변분법, 복소변수 등을 공부합니다.","물리학"));
                        item.add(new SubjectListItem("현대물리학","19세기 말부터 20세기 초에 발견된 빛과 물질의 상호작용에 의한 물리 현상들 중에서 고전적인 물리 이론으로 설명할 수 없는 것들을 이해하기 위하여 새로운 이론들이 나올 수 밖에 없었습니다. 특수 상대론과 양자역학의 기본 개념과 그러한 이론들이 나오게 만든 중요한 발견들에 대해서 학습합니다. ","물리학"));
                        item.add(new SubjectListItem("현대대수학","군, 순환군, 치환군, 부분군, 정규부분군, 잉여군, 준동형사상, 동형사상, 집합에서의 군작용, 환, 정역 등의 정의 와 기본성질과 개념을 이해하고 고급현대대수학에서 다룰 체 이론의 기본이 되게 합니다.","수리과학"));
                        item.add(new SubjectListItem("수치해석","군, 순환군, 치환군, 부분군, 정규부분군, 잉여군, 준동형사상, 동형사상, 집합에서의 군작용, 환, 정역 등의 정의 와 기본성질과 개념을 이해하고 고급현대대수학에서 다룰 체 이론의 기본이 되게 합니다.","수리과학"));
                        item.add(new SubjectListItem("위상수학","위상수학의 기본개념들에 대하여 알아봅니다. 특히, 위상공간, 거리공간, 연속사상, 옹공간, 연결공간 등, 집합적 위상수학의 기초내용을, 기하학적 의미를 강조하며 학습합니다. ","수리과학"));
                        item.add(new SubjectListItem("미분기하","미분기하학은 미적분을 이용하여 기하학적 도형을 연구하는 학문입니다. 3차원 유클리드공간에서의 곡선과 곡면에 대한 내용을 다룹니다. ","수리과학"));
                        item.add(new SubjectListItem("유기화학","생명의 화학인 유기화학은 생물학적인 현상을 이해하는 분야입니다. 기본적인 유기화학에 사용되는 용어와 유기화학 반응의 메카니즘을 익힙니다.","화학"));
                        item.add(new SubjectListItem("물리화학","기본 원리를 이해하는 것과 실제 화학 현상의 설명에 응용하는 능력을 배양합니다. 물리화학은 크게 평형 (열역학), 구조 (양자역학), 변화(속도론 및 동력학)으로 구성됩니다.","화학"));
                        item.add(new SubjectListItem("분석화학","물질의 조성 및 특정성분의 함량을 알아내는 원리 및 기법을 배우는 과목입니다. 크게 네 분야로 나누어져 있으며 (습식분석, 전기분석, 분광분석, 크로마토그래피) 각 분야에 대한 개론을 소개합니다. ","화학"));
                        item.add(new SubjectListItem("무기화학","원자구조, 화학결합이론, 대칭 및 그룹이론, 분자 오비탈, 주족원소 산-염기 개념과 그와 관련된 화학, 결정성 고체화학, 그리고 배위화학을 주제로 이들을 설명하기 위한 이론적 배경과 화학적, 물리적 특성 등에 대해 학습합니다. ","화학"));
                        item.add(new SubjectListItem("나노화학공정입문","나노공정에 대하여 전반적으로 학습하고 신개발 나노물질 및 나노화학기반 소자의 특성을 이해합니다.","화학"));

                        sub_list.setAdapter(adapter);
                        break;
                    case 9:
                        department.setText("도시환경공학부");
                        item.add(new SubjectListItem("지구환경",getString(R.string.uee_1),"환경공학"));
                        item.add(new SubjectListItem("수처리공학",getString(R.string.uee_2),"환경공학"));
                        item.add(new SubjectListItem("기후변화공학",getString(R.string.uee_3),"환경공학"));
                        item.add(new SubjectListItem("환경공학개론",getString(R.string.uee_4),"환경공학"));
                        item.add(new SubjectListItem("도시계획개론",getString(R.string.uee_5),"도시건설공학"));
                        item.add(new SubjectListItem("건설공학개론",getString(R.string.uee_6),"도시건설공학"));
                        item.add(new SubjectListItem("지리정보시스템",getString(R.string.uee_7),"도시건설공학"));
                        item.add(new SubjectListItem("재난관리공학",getString(R.string.uee_8),"재난관리공학"));
                        item.add(new SubjectListItem("자연재해개론",getString(R.string.uee_9),"재난관리공학"));
                        item.add(new SubjectListItem("재난관리",getString(R.string.uee_10),"재난관리공학"));
                        item.add(new SubjectListItem("재해분석과 시스템의 안정성",getString(R.string.uee_11),"재난관리공학"));

                        sub_list.setAdapter(adapter);
                        break;
                }
                break;
            default:
                break;
        }

        return intro_View;
    }
}