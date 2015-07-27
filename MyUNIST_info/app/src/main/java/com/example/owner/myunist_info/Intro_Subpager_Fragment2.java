package com.example.owner.myunist_info;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import static android.view.LayoutInflater.from;

/**
 * Created by cheongwh on 2015. 7. 13..
 */
public class Intro_Subpager_Fragment2 extends Fragment {
    private int department_id;
    private int order_of_page;
    private View intro_View = null;
    private Context intro_context;
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
                intro_View = (View) from(intro_context).inflate(R.layout.intropage1, container, false);
                TextView depart_name_ko = (TextView) intro_View.findViewById(R.id.depart_name_ko);
                TextView depart_name_eng = (TextView) intro_View.findViewById(R.id.depat_name_eng);
                TextView title = (TextView) intro_View.findViewById(R.id.title);
                TextView contents = (TextView) intro_View.findViewById(R.id.contents);
                ScrollView scroll1 = (ScrollView) intro_View.findViewById(R.id.scr1);
                switch(department_id){
                    case 8:
                        depart_name_ko.setText("자연과학부");
                        depart_name_eng.setText("Natural Science");
                        title.setText(R.string.SNS_txt_0);
                        contents.setText("자연과학은 자연계에 존재하는 보편적인 법칙을 찾아내고 이해함으로써 인류의 발전에 공헌하는 것을 목표로 하는 학문입니다. \n 역사적으로 이러한 자연과학적인 결과를 공학과 융합하는 방법으로 시대를 선도하는 새로운 테크놀로지가 개발되어 왔고, UNIST는 그런 융합을 학교 발전의 주요 전략의 하나로 채택하여 수행하고 있습니다. \n UNIST의 자연과학부는 기초과학 교육을 담당하고, 창의적인 학제간 연구를 수행하는 것을 목표로 2010년에 창설되어 운영되어 왔습니다. \n 최고수준의 자연과학 연구를 수행하기 위해 국내외의 세계적인 석학 유치와 국제과학비즈니스벨트 캠퍼스 연구단 선정 등으로 국내는 물론 세계에서도 인정받는 학부로 성장하고 있습니다.\n");
                        break;
                    case 9:
                        depart_name_ko.setText("도시환경공학부");
                        depart_name_eng.setText("Urban Infrastructure Engineering");
                        title.setText(R.string.UEE_txt_0);
                        contents.setText("도시환경공학부에서는 급격한 산업화로부터 기인한 환경오염과 기후변화 및 각종 자연재해로 인해 도시와 시민들의 안전에 심각한 문제가 대두됨에 따라, 이를 해결하기 위한 환경보호, 지속가능한 발전, 재해관리, 인류 복지 증진 등을 아우르는 융합학문을 연구하고 있습니다. \n 도시환경 공학 분야에서 혁신적 신기술을 개발하고 미래 글로벌 리더 양성을 목표로 하고 있습니다." );
                        break;
                    default:
                        break;

                }
                break;
            case 1:
                intro_View = (View) from(intro_context).inflate(R.layout.intropage2, container, false);
                TextView intro_track = (TextView) intro_View.findViewById(R.id.intro_track);
                TextView track_name = (TextView) intro_View.findViewById(R.id.name_track);
                TextView content = (TextView) intro_View.findViewById(R.id.contents);
                switch(department_id){
                    case 8:
                        intro_track.setText("트랙 소개");
                        track_name.setText("물리학");
                        content.setText("물리학 트랙에서는 현대 물리학의 관점에서 자연의 기본현상에 대한 깊이 있는 탐구를 수행하고, 이를 바탕으로 인류의 삶에 기여하는 미래 첨단 기술 개발의 토대를 마련하는 연구를 수행하고 있습니다. \n 구체적으로는 입자물리 및 우주론, 천체물리, 고체물리, 연성물질물리, 생물물리, 플라즈마 및 빔 물리, 원자 및 분자 물리, 광학 분야에서 선도적인 기초 및 응용연구를 진행하고 있습니다. \n");
                        break;
                    case 9:
                        intro_track.setText("트랙 소개");
                        track_name.setText("환경과학공학");
                        content.setText("환경오염과 기후변화를 포함한 전 지구적 및 지역적 환경문제를 포괄적으로 다루고 있습니다. \n 환경오염 모니터링 및 처리, 기후모델, 환경거동 모델, 원격탐사, 수문학 등을 포함한 다양한 환경 분야 주제를 학습할 수 있는 교과과정을 제공함으로써, 인류가 직면한 환경문제 해결에 기여할 수 있는 전문 인력 양성을 추구합니다.\n");
                        break;
                }
                break;
            case 2:
                intro_View = (View) from(intro_context).inflate(R.layout.intropage2, container, false);
                TextView intro_track2 = (TextView) intro_View.findViewById(R.id.intro_track);
                TextView track_name2 = (TextView) intro_View.findViewById(R.id.name_track);
                TextView content2 = (TextView) intro_View.findViewById(R.id.contents);
                switch(department_id){
                    case 8:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("화학");
                        content2.setText("화학과는 학부 학생들에게 화학의 전 분야 및 나노과학에 대하여 근본적이고 철저한 이해를 할 수 있는 기회를 제공합니다. \n 트랙에서 제공되는 강의는 유기화학, 물리화학, 분석화학, 생화학, 재료 및 고분자화학, 나노화학 등 모든 분야를 다루고 있습니다.\n  학생들은 또한 화학과의 교육과정을 통해 동료들과 함께 공부하고 연구하는 즐거움을 누리게 될 것입니다. \n 학생들은 강의와 연구를 통해 다른 동료들과 협동하는 방법, 이를 통한 문제의 해결과 창의적인 연구의 진행을 경험하게 될 것입니다. \n 화학과는 강의뿐만 아니라 학생들이 실제 연구현장에 참여하여 연구경험을 쌓는 것을 중요한 교육의 방법으로 삼고 있습니다. \n 저희 트랙의 최종목표는 교육과 연구를 통해 학생들이 미래의 세계를 이끌어 갈 세계적인 화학자, 과학자로서의 자질을 습득하도록 하는 것이며, 인류의 진보를 위해 일하는 최고수준의 연구인력을 양성하는 것입니다.\n");
                        break;
                    case 9:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("도시건설공학");
                        content2.setText("본 트랙은 지속가능하며 재난에 안전한 도시건설을 위해, 교량, 도로, 원자력발전소, 건축구조물 등의 주요 도시기반시설물의 설계, 건설, 유지관리 및 도시계획, 설계에 관한 문제를 중점적으로 다룹니다.\n 이를 위해, 도시계획, 구조설계 및 역학, 건설재료와 관련된 기초/응용 교과목을 제공하고 있으며, 현대 도시의 문제를 도시계획 및 공학적 관점에서 포괄적으로 볼 수 있는 시각을 가진 인력양성을 목표로 합니다.\n");
                        break;
                }
                break;
            case 3:
                intro_View = (View) from(intro_context).inflate(R.layout.intropage2, container, false);
                TextView intro_track3 = (TextView) intro_View.findViewById(R.id.intro_track);
                TextView track_name3 = (TextView) intro_View.findViewById(R.id.name_track);
                TextView content3 = (TextView) intro_View.findViewById(R.id.contents);
                switch(department_id){
                    case 8:
                        intro_track3.setText("트랙 소개");
                        track_name3.setText("수학");
                        content3.setText("수학은 자연의 명확한 이해를 위해 필수적인 과학의 보편적인 언어입니다. \n 수리과학 트랙 학생들은 수학에 대한 기본적인 지식과 수학 및 과학 문제를 해겨하는데 필요한 체계적인 능력을 습득할 것입니다. \n 이 트랙은 수학적 사고를 위한 기본적인 과목뿐만 아니라, 물리학, 수리 생물학, 공학, 의료 과학 및 금융수학 연구에 필수적인 다양한 응용 수학 과목을 학생들에게 제공하여 체계적인 수학적 전문가를 양성합니다. \n ");
                        break;
                    case 9:
                        intro_track3.setText("트랙 소개");
                        track_name3.setText("재난관리공학");
                        content3.setText("다양한 자연 및 인적재난의 원인을 분석하고 도시 사회 및 경제적 영향을 절감하고 효율적 대응 및 복구를 위한 통합적 재난관리 연구 및 교육프로그램을 제공하고 있습니다. \n 지구과학/기후변화, 환경공학, 도시/토목공학의 융복합적 기술을 이용하여 자연재난 예측 및 분석, 인적재난 위험성 분석 및 절감기술, 재난관리 시스템, 도시기반시설의 재난대비 및 복구기술과 같은 피해절감에 기여할 수 있는 연구 및 전문 인력 양성을 추구합니다. \n");
                        break;

                }
                break;
            case 4:
                intro_View = (View) from(intro_context).inflate(R.layout.intropage_dhe, container, false);
                switch(department_id){
                    case 8:
                    case 9:

                }
                break;
            case 5:
                intro_View = (View) from(intro_context).inflate(R.layout.intropage5, container, false);
                switch(department_id){
                    case 8:
                    case 9:

                }
                break;
            default:
                break;

        }



        return intro_View;
    }
}