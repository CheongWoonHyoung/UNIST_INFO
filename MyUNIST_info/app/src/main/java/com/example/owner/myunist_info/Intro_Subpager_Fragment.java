package com.example.owner.myunist_info;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.ArrayList;

import static android.view.LayoutInflater.from;

/**
 * Created by cheongwh on 2015. 7. 13..
 */
public class Intro_Subpager_Fragment extends Fragment{
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


    public static Intro_Subpager_Fragment newProduction(int Number_of_page, int id) {
        Intro_Subpager_Fragment mpage = new Intro_Subpager_Fragment();

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
                    case 1:
                        depart_name_ko.setText("디자인 및 인간공학부");
//                        main_backG1.setBackground(R.drawable);
                        title.setText("제품 개발 과정의 디자인들");
                        contents.setText("  디자인 및 인간공학부는 인간중심 제품 및 시스템의 기획, 설계, 제조, 상업하의 전 과정에 필요한 기본 및 응용기술을 연구하고 있습니다.   \n \n  산업 디자인 트랙과 인간 및 시스템공학 트랙으로 구성되어 있으며, ‘혁신적인 Engineering Design 인재 양성과 연구를 통해 인류 삶의 질 향상에 기여’라는 비전을 이루기 위하여 노력하고 있습니다.");
                        break;
                    case 2:
                       depart_name_ko.setText("에너지 및 화학공학부");
//                        main_backG1.setBackground(R.drawable);
                        title.setText(R.string.ECHE_txt_0);
                        contents.setText("  에너지 및 화학공학부에서는 화학공학을 근간으로 에너지 변환 및 저장에 관련된 응용 학문에 필요한 첨단 융합 교육을 제공하며, 학생들은 촉매, 나노소재 및 소자, 정밀화학, 고분자, 응용분자화학 및 이차전지, 연료전지, 태양전지 등 에너지 관련 학문들에 대한 기본적인 이해와 실제적인 응용분야를 배우게 됩니다.   \n \n  이를 통해 학생들은 에너지 및 화학공학 분야에 있어 국제적이며 실용적인 감각을 익히고, 창의적이고 도전적인 자세를 가진 공학자로 거듭나게 될 것입니다.");
                        break;
                    case 3:
                        depart_name_ko.setText("전기전자컴퓨터공학부");
//                        main_backG1.setBackground(R.drawable);
                        title.setText(R.string.ECE_txt_0);
                        contents.setText("  전기전자컴퓨터공학부는 전기, 전자, 컴퓨터 공학과 다양한 학문의 융합을 통하여 미래 사회가 요구하는 과학기술을 선도할 인재를 양성하고자 합니다.   \n \n  이와 함께, 인간편의정보통신연구부는 학제적 융합을 통해 자동차, 조선, 에너지플랜트 등의 자동화 및 지능화를 추구합니다.   \n \n  또한, 바이오, 나노, 환경, 디자인 등의 타 학문과 IT 기술을 융합하여 우리 삶의 방식을 바꾸는 새로운 모습의 기술로 탄생하는데 도움을 주고자 합니다." );
                        break;
                    case 4:
                        depart_name_ko.setText("생명과학부");
//                        main_backG1.setBackground(R.drawable);
                        title.setText(R.string.LS_txt_0);
                        contents.setText("  생명과학부는 생명 현상에 대한 이해와 생물의 다양한 기능을 연구하는 생명 과학을 기초로 나노과학 및 공학기술을 융합하여 질병의 원인 규명을 위한 기초 연구 및 질병의 진단 및 치료 기술 개발을 통하여 인류의 건강 증진에 기여하기 위한 학문입니다.   \n \n  미래 핵심 과학 기술 분야로 주목받고 있는 생명과학 및 첨단 의료 기술 분야를 선도할 창의적 글로벌 인재 양성과 새로운 미래기술 개발을 위한 다양한 연구프로그램을 제공합니다.");
                        break;
                    case 5:
                        depart_name_ko.setText("기계 및 원자력공학부");
//                        main_backG1.setBackground(R.drawable);
                        title.setText(R.string.MNE_txt_0);
                        contents.setText("  기계 및 원자력공학부는 최신 연구 인프라를 바탕으로 첨단공학기술 및 다학제간 융합기술 개발을 통하여, 다양한 기계시스템 설계, 해석, 생산 및 관리, 그리고 인류 에너지 안보를 위한 원자력 기술개발 연구를 수행하고 있습니다.   \n \n  첨단 산업분야에 크게 기여할 수 있는 창의적인 전문가를 양성하고 있으며, 국가의 경쟁력 향상에 기여할 최첨단 연구를 수행하고 있습니다.");
                        break;
                    case 6:
                        depart_name_ko.setText("신소재공학부");
//                        main_backG1.setBackground(R.drawable);
                        title.setText(R.string.MSE_txt_0);
                        contents.setText("  신소재공학부는 최첨단재료의 공정-구조-물성의 상호 관계를 체계적으로 학습하는 학부로서 다양한 현대 학문들과 밀접한 연관성을 갖고 있습니다.   \n \n  기간산업에 사용되는 금속, 세라믹, 반도체, 광학재료는 물론, 나노재료를 포함한 최첨단 신재료를 교육하고 연구하여, 현대사회가 요구하는 재료 연구자, 신소재 전문가 및 고급 기술 인력을 양성하고 있습니다.");
                        break;
                    case 7:
                        depart_name_ko.setText("경영학부");
//                        main_backG1.setBackground(R.drawable);
                        title.setText(R.string.BA_txt_0);
                        contents.setText("  경영학부는 과학기술과 경영마인드의 결합이라는 모토 아래 글로벌 시대를 선도해 나갈 수 있는 기술경영의 핵심 인재 양성을 목표로 하고 있습니다.   \n \n  경영학부에서는 이공계과학기술대학의 특성에 맞는 기술·경영의 융합적 사고 함양과 함께 경제이론 및 기술경영, 재무/회계, 경영정보시스템 마케팅, 인사/조직행동 분야의 교육과정을 운영하여 경영자의 기본 소양을 갖출 수 있도록 교육을 실시하고 있습니다.   \n \n  또한 Entrepreneurship 과정을 마련하여 첨단 기술을 사업화할 수 있는 능력을 갖출 수 있도록 하였습니다.   \n \n  학부 교육과정을 통하여 학생들은 경영자의 기본 소양을 함양시키며 경영의 여러 분야를 전공할 수 있습니다.   \n \n ");
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
                    case 1:
                        intro_track.setText("트랙 소개");
                        track_name.setText("산업디자인");
                        content.setText("  산업 디자인 트랙은 제품의 혁신적인 디자인과 제품-서비스 시스템을 주도할 수 있는 창의적인 디자이너를 양성하기 위한 트랙입니다.   \n \n  산업디자인 트랙은 문제의 정의, 사용자와 시장 분석, 요구 파악, 창의적인 아이디어 생성, 형태와 기능 개발, 설계, 프로토타이핑, 사업의 시작을 포함하는 디자인 지식 및 전체적인 제품 개발 과정과 관련된 방법과 기술에 대한 통합 교육적인 수업을 제공합니다.   \n \n  산업 디자인 트랙을 전공하는 학생들은 우리 사회에서 인간 중심적, 과학적 방법을 통해 긍정적이고 혁신적인 변화를 주도하면서, 통합적인 디자이너 및 전문가로써 매우 중요한 역할을 담당할 것입니다.  \n \n  ");
//                        main_backG2.setBackground(R.drawable);
                        break;
                    case 2:
                        intro_track.setText("트랙 소개");
                        track_name.setText("에너지공학");
                        content.setText("  에너지 공학 트랙은 에너지 변환(연료전지, 태양전지 등) 및 에너지 저장(이차전지, 수소저장 등)의 원리와 응용을 배우게 되며, 전기화학, 새로운 에너지 소재 합성, 에너지 변환 및 저장 소자의 이해를 통한 광범위한 응용연구를 수행하는 학제간 연구를 근간으로 합니다.   \n \n  또한 학생들에게 재료화학, 전기화학, 재료공학, 에너지 변환 및 저장 시스템의 원리에 대한 이해를 통해 창조적인 과학 사고를 함양시키는 데 목표를 두고 있습니다.   \n \n ");
                        //                        main_backG2.setBackground(R.drawable);
                        break;
                    case 3:
                        intro_track.setText("트랙 소개");
                        track_name.setText("전기 및 전자공학");
                        content.setText("  반도체 소자 및 집적회로(IC) 설계에서부터 정보, 통신 및 제어 시스템 구축에 이르기까지 전기 및 전자 공학의 다양한 분야를 포괄하는 분야로써, 미래 인류 생활의 편의를 도모하고 안전한 정보 사회 구축에 필수적인 IT 융합 시스템의 연구 및 개발에 초점을 맞추고 있습니다.   \n \n  전자공학트랙은 다양한 IT 기반 기술 분야들 간의 적극적인 융합을 통해 디지털 컨버전스로 대표되는 유비쿼터스 정보 사회를 이룩하는데 이바지하고자 하며, 관련 연구 반야는 무선 통신 및 네트워크, 지능 제어 및 인간-친화형 로봇 시스템, 멀티미디어 신호 처리, 디지털/아날로그 회로 설계, VLSI 디자인, 고속 Mixed-Signal IC, RF 및 Wireless IC 디자인 등을 포함하고 있습니다.   \n \n  전자공학 트랙에서는 실험, 디자인, 모델링, 시뮬레이션 및 분석 등에 이르는 다양한 교육 과정을 통해 전자제품의 기획단계에서부터 시제품 완성에 이르는 전 과정을 경험할 기회를 제공함으로써 실용과 학문을 겸비한 유능한 공학인을 양성하는 것을 목표로 합니다.   \n \n  또한 학생들이 기초과학적 지식을 공학적 응용에 적응하는능력을 함양하도록 교육함으로써 미래 혁신 기술 개발에 선도자가 되도록 하며 학생들은 핵심 물리 교과목과 함께 반도체 공학, 광전자 소자, 플라즈마 등을 배우게 됩니다.   \n \n  ");
//                        main_backG2.setBackground(R.drawable);
                        break;
                    case 4:
                        intro_track.setText("트랙 소개");
                        track_name.setText("생명공학");
                        content.setText("  첨단융합학문의 대표적인 예로 각광받고 있는 생명공학은 생명현상에 대한 이해를 바탕으로 첨단 나노과학 및 공학기술을 융합하여 각종 질병 진단 및 치료 기술 개발과 질병의 원인 규명을 추구하는 학문입니다.   \n \n  인류의 건강 증진을 위한 첨단 의료 기술 분야를 선도하기 위하여 바이오칩, 의료진단기기, 생체모사공학, 생체소재, 분자영상, 조직공학, 약물전달, 의료용 로봇 및 의공소재 개발 등 첨단 융합 분야를 세계적으로 선도할 창의적 융합형 인재 앙성을 위한 최고수준의 연구 및 교육 프로그램을 제공합니다.   \n \n ");
                        //                        main_backG2.setBackground(R.drawable);
                        break;
                    case 5:
                        intro_track.setText("트랙 소개");
                        track_name.setText("기계공학");
                        content.setText("  세계경제 발전 및 인류의 삶에 큰 기여를 하고 있는 자동차, 항공기, 조선, 가전, 전자기기, 발전소에 이르기까지 수많은 시스템과 응용분야를 다루는 기초 학문입니다.   \n \n  기계공학트랙에서는 학생들에게 기계공학의 기초학문을 가르치고 이를 산업현장에 바로 응용할 수 있도록 교육하고 있으며, 열역학, 유체역학, 고체역학, 동역학, 기계설계, 재료역학 및 가공, 레이저 이용 생산, 마이크로/나노 장치 가공 및 생산, 멤스, 의료용 제품, 제어 및 메카트로닉스, 음향학, 로봇공학 등과 같은 다양한 학문 분야를 다룹니다.   \n \n  ");
                        //                        main_backG2.setBackground(R.drawable);
                        break;
                    case 6:
                        intro_track.setText("트랙 소개");
                        track_name.setText("신소재 과학");
                        content.setText("  신소재 과학 트랙의 학생들은 재료의 화학적, 열적, 기계적, 전기적인 물성 및 공정과 미세구저변화 등에 관해 학습하게 됩니다.   \n \n  금속, 세라믹, 반도체, 폴리머, 융복합재료 등 다양한 신소재들을 미세크기 영역에서부터 조대 크기 영역까지 이해할 수 있도록 교육을 제공하고 있습니다.   \n \n  이러한 최첨단 소재들은 자동차, 항공, 조선 등 기계재료산업, 반도체, 디스플레이 등 반도체 및 전자재료산업, 태양전지, 연료전지 등 에너지재료산업 등에 적용됩니다.   \n \n  신소재가학 트랙을 이수한 학생들은 향후 학습한 재료과학과 재료공학 지식에 바탕으로 하여 현대 재료과학 연구 및 첨단재료기술 분야에 크게 기여하는 중추적인 약할을 할 것으로 기대됩니다.   \n \n ");
//                        main_backG2.setBackground(R.drawable);
                        break;
                    case 7:
                        intro_track.setText("트랙 소개");
                        track_name.setText("경영학");
                        content.setText("  매너지먼트 분야에서는 과학기술과 경영마인드를 접목하여 글로벌 경제시대를 선도해 나갈 수 있는 테크노 경영의 인재양성을 목표로 합니다.   \n \n  매니지먼트 분야에서는 기업의 경영자, 창업기업가, 경영컨설턴트 또는 자본시장의 이해관계자가 당면하는 경영의 다양한 이슈들에 대한 이해를 높이는 최상의 경영교육을 제공하고자 합니다.   \n \n  교과목은 조직행동론, 국제경영학, 마케팅, 재무회계, 관리회계, 재무관리, 경영 정책, 생산관리, 경제이론, 통계와 데이터분석 등을 포함합니다.   \n \n ");
//                        main_backG2.setBackground(R.drawable);
                        break;
                    default:
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
                    case 1:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("인간및시스템공학");
                        content2.setText("  인간 및 시스템공학 트랙에서는, 인간중심 공학설계 (human-centered engineering design) 분야의 인재를 양성하기 위해, 인간공학 (human factors and ergonomics)과 시스템공학 (systems engineering)의 융합교육을 하고 있습니다.   \n \n   이를 위해, 학부과정에서는 인간의 신체적 및 인지적 특성에 대한 이해를 바탕으로 최적의 제품, 프로세스 및 시스템을 설계하기 위한 기본 지식과 응용방법을 배웁니다.   \n \n  ");
//                        main_backG3.setBackground(R.drawable);
                        break;
                    case 2:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("화학공학");
                        content2.setText("  화학공학의 근간인 열역학, 반응공학, 전달현상을 포괄하는 공정 개발 및 설계의 기초 지식을 교육하고, 화학 관련 산업의 원천기술로부터 실용화 단계에 필요한 첨단 지식을 제공합니다.   \n \n   학생들은 첨단 융합 교육 프로그램을 통해 분자 단위 수준의 원리와 현상을 이해하고, 이를 바탕으로 화학 공학의 지식을 접목하여, 새로운 화학 재료 및 제품, 공정 및 시스템을 창의적으로 개발 할 수 있는 능력을 기르게 됩니다.   \n \n   우리 UNIST 화학공학은 사회적인 책임의식을 가지고, 엔지니어로서의 필요한 자질을 갖추며, 의사를 효과적인 전달과 함께 창의적이고 효율적인 문제해결 능력을 가진 미래의 지도자의 양성하는 데 목표를 두고 있습니다.  \n \n ");
//                        main_backG3.setBackground(R.drawable);
                        break;
                    case 3:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("컴퓨터공학");
                        content2.setText("  컴퓨터공학 트랙은 우리 삶 곳곳에 편재해 있는 컴퓨터 및 정보 시스템들을 연구 및 개발함으로써 삶의 질을 향상 시키는 것을 목표로 하고 있습니다.   \n \n    학생들은 컴퓨터 시스템을 제작하는데 필수적인 운영체제, 컴파일러, 네트워크 기술에서부터 컴퓨터의 실용적인 이용에 핵심적인 컴퓨터 그래픽스, 인공지능, 알고리즘 그리고 정보보안까지 배우게 되며, 이러한 교육과정을 통해 본 트랙은 임베디드 시스템, 고성능 규모 컴퓨팅 시스템, 유무선 네트워크 시스템 및 서비스 다가오는 미래에 매우 큰 중요성을 가질 컴퓨터 활용 기술들을 연구 및 개발할 수 있는 최고수준의 엔지니어를 육성하는 것을 목표로 하고 있습니다.   \n \n ");
//                        main_backG3.setBackground(R.drawable);
                        break;
                    case 4:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("생명과학");
                        content2.setText("  최근 생명과학의 눈부신 발전은 여러 분야에서 혁신적인 연구 결과를 창출하고 있습니다.   \n \n  그 중에서도 특히 인간의 유전체분석, 줄기세포, 항암연구 및 노화에 관련된 연구는 인류의 건강과 복지 증진을 위한 핵심적인 연구 분야로 자리매김 하고 있습니다.   \n \n  UNIST의 생명과학 Track은 생명과학 분야의 최신지식과 과학기술에 기반을 둔 창의적이고 혁신적인 인재의 양성을 목표로 하고 있습니다.   \n \n  UNIST 생명과학 Track의 핵심 연구 분야는 노화 관련 질환, 신경질환, 줄기세포 및 재생의과학입니다.   \n \n ");
                        //                        main_backG3.setBackground(R.drawable);
                        break;
                    case 5:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("원자력공학");
                        content2.setText("  원자력공학과에서는 핵분열 및 핵융합의 운동에너지를 에너지원으로 하는 거대 열기관인 원자력발전 및 핵 추진 동력로와 방사선 응용에 관한 과학 및 공학 원리들을 교육하고 있습니다.   \n \n  교육 및 연구 주제로 경수로, 중수로, 차세대 원자로 종류로는 액체금속냉각로, 용융염 냉각로, 액체연료 용융염 냉각로, 수소생산용 고온기체냉각로 등에 관한 설계 원리와 해석 원리를 제공하고 있습니다.   \n \n  다양한 전공기초과목으로, 원자로이론, 핵연료 및 주기공학, 원자력 재료, 원자력 열수력학, 원자로 안전 및 사고해석, 방사선 응용 및 자기수력학 등을 교육하고 있습니다.   \n \n  ");
                        //                        main_backG3.setBackground(R.drawable);
                        break;
                    case 6:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("나노재료공학");
                        content2.setText("  나노재료공학 트랙은 나노재료의 과학적, 공학 지식을 교육하고 연구합니다.   \n \n  다양한 나노재료의 도입, 나노구조, 또한 나노크기를 다양한 응용분야를 공부합니다.   \n \n  특히 나노재료의 설계, 나노재료 합성, 나노 공정 및 나노소자 제작 및 나노 물성 등이 특화되어 학습하게 됩니다.   \n \n  나노재료공학 트랙을 이수한 학생들은 나노재료지식에 기반하여 나노재료를 혁신적으로 실생활에 적용하는 과정을 통하여 현대 나노 과학과 기술분야에 기여하게 될 것입니다.   \n \n ");
                        //                        main_backG3.setBackground(R.drawable);
                        break;
                    case 7:
                        intro_track2.setText("트랙 소개");
                        track_name2.setText("재무/회계");
                        content2.setText("  재무/회계 분야에서는 수리/과학과 경제/경영 마인드를 접목하여 재무/회계와 관련된 복합적 문제 해결능력을 갖출 수 있도록 하는데 초점을 두고 글로벌 경제시대로 선도해 나갈 수 있는 창의적 인재 양성을 목표로 하고 있습니다.   \n \n  재무 분야에서는 자본시장에서 개인과 기업 그리고 여러 조직들이 자본을 조달하고 운영하여 재무 또는 금융 의사결정을 효율적으로 하는 방법과 이론을 학습하고 있습니다.   \n \n 교과목은 이론과 실제 기법들을 배울 수 있는 재무관리, 투자분석, 자본시장이론, 금융공학 등의 과목들이 제공합니다.   \n \n  회계분야에서는 경영자가 재무회계 자료를 외부 투자자와 자본시장의 이해관계자들에게 효과적으로 전달하고, 관리회계 자료를 적용하여 내부적인 재무 또는 경제의사결정을 효율적으로 하도록 도와주고 있습니다.   \n \n  " );
//                        main_backG3.setBackground(R.drawable);
                       break;
                    default:
                        break;

                }
                break;
            case 3:
                intro_View = (View) from(intro_context).inflate(R.layout.new_listview, container, false);
                TextView department = (TextView) intro_View.findViewById(R.id.department);
                ListView sub_list = (ListView) intro_View.findViewById(R.id.sub_list);
                sub_list.setDivider(null);
                ArrayList<SubjectListItem> item = new ArrayList<>();
                SubjectListAdapter adapter = new SubjectListAdapter(intro_context,R.id.sub_list,item);
                switch(department_id){
                    case 1:
                        department.setText("디자인 및 인간공학부");
                        item.add(new SubjectListItem("디자인적 사고",getString(R.string.dhe_1),"산업디자인"));
                        item.add(new SubjectListItem("디자인 요소와 원리",getString(R.string.dhe_2),"산업디자인"));
                        item.add(new SubjectListItem("제품디자인",getString(R.string.dhe_3),"산업디자인"));
                        item.add(new SubjectListItem("창의디자인",getString(R.string.dhe_4),"산업디자인"));
                        item.add(new SubjectListItem("인지 및 심리 인간공학",getString(R.string.dhe_5),"인간및시스템 공학"));
                        item.add(new SubjectListItem("인체 인간공학",getString(R.string.dhe_6),"인간및시스템공학"));
                        item.add(new SubjectListItem("생산시스템설계 및 시뮬레이션",getString(R.string.dhe_7),"인간및시스템공학"));
                        item.add(new SubjectListItem("공학디자인 기법",getString(R.string.dhe_8),"인간및시스템공학"));
                        sub_list.setAdapter(adapter);
                        break;
                    case 2:
                        department.setText("에너지 및 화공학부");
                        item.add(new SubjectListItem("학무기화학",getString(R.string.eche_1),"에너지 공학"));
                        item.add(new SubjectListItem("전기화학",getString(R.string.eche_2),"에너지 공학"));
                        item.add(new SubjectListItem("고체화학",getString(R.string.eche_3),"에너지 공학"));
                        item.add(new SubjectListItem("에너지 변환 및 저장실",getString(R.string.eche_4),"에너지 공학"));
                        item.add(new SubjectListItem("고분자재료과학",getString(R.string.eche_5),"에너지 공학"));
                        item.add(new SubjectListItem("태양전지실험",getString(R.string.eche_7),"에너지 공학"));
                        item.add(new SubjectListItem("유기화학",getString(R.string.eche_8),"화학 공학"));
                        item.add(new SubjectListItem("물리화학",getString(R.string.eche_9),"화학 공학"));
                        item.add(new SubjectListItem("전달현상",getString(R.string.eche_10),"화학 공학"));
                        item.add(new SubjectListItem("화학공정개론",getString(R.string.eche_11),"화학 공학"));
                        item.add(new SubjectListItem("화공열역학",getString(R.string.eche_12),"화학 공학"));
                        sub_list.setAdapter(adapter);
                        break;
                    case 3:
                        department.setText("전기전자컴퓨터공학부");
                        item.add(new SubjectListItem("전자회로",getString(R.string.ece_1),"전기전자공학"));
                        item.add(new SubjectListItem("전자소자개론",getString(R.string.ece_2),"전기전자공학"));
                        item.add(new SubjectListItem("신호및시스템",getString(R.string.ece_3),"전기전자공학"));
                        item.add(new SubjectListItem("디지털신호처리",getString(R.string.ece_4),"전기전자공학"));
                        item.add(new SubjectListItem("운영체제",getString(R.string.ece_5),"컴퓨터공학"));
                        item.add(new SubjectListItem("알고리즘",getString(R.string.ece_6),"컴퓨터공학"));
                        item.add(new SubjectListItem("컴퓨터 그래픽스",getString(R.string.ece_7),"컴퓨터공학"));
                        item.add(new SubjectListItem("컴퓨터 네트워크",getString(R.string.ece_8),"컴퓨터공학"));
                        sub_list.setAdapter(adapter);
                        break;
                    case 4:
                        department.setText("생명과학부");
                        item.add(new SubjectListItem("생명공학개론","","생명공학"));
                        item.add(new SubjectListItem("바이오기기분석","","생명공학"));
                        item.add(new SubjectListItem("생체유기역학","","생명공학"));
                        item.add(new SubjectListItem("바이오재료 및 조직공학","","생명공학"));
                        item.add(new SubjectListItem("생화학","","생명과학"));
                        item.add(new SubjectListItem("발생학","","생명과학"));
                        item.add(new SubjectListItem("세포생물학","","생명과학"));
                        item.add(new SubjectListItem("해부 및 생리학","","생명과학"));
                        sub_list.setAdapter(adapter);
                        break;
                    case 5:
                        department.setText("기계 및 원자공학부");
                        item.add(new SubjectListItem("열역학", getString(R.string.mne_1), "기계공학"));
                        item.add(new SubjectListItem("유체역학",getString(R.string.mne_2),"기계공학"));
                        item.add(new SubjectListItem("고체역학",getString(R.string.mne_3),"기계공학"));
                        item.add(new SubjectListItem("열전달",getString(R.string.mne_4),"기계공학"));
                        item.add(new SubjectListItem("기계요소설계",getString(R.string.mne_5),"기계공학"));
                        item.add(new SubjectListItem("원자력공학개론",getString(R.string.mne_6) + "\n","원자력공학"));
                        item.add(new SubjectListItem("원자력방사선공학및실험",getString(R.string.mne_7),"원자력공학"));
                        item.add(new SubjectListItem("원자력재료공학및실험",getString(R.string.mne_8),"원자력공학"));
                

                        sub_list.setAdapter(adapter);
                        break;
                    case 6:
                        department.setText("신소재공학부");
                        item.add(new SubjectListItem("재료과학및공학입문",getString(R.string.mse_1),"신소재과학"));
                        item.add(new SubjectListItem("결정구조의결함",getString(R.string.mse_2),"신소재과학"));
                        item.add(new SubjectListItem("결정기하입문",getString(R.string.mse_3),"신소재과학"));
                        item.add(new SubjectListItem("재료의상변화",getString(R.string.mse_4),"신소재과학"));
                        item.add(new SubjectListItem("재료의기계적거동",getString(R.string.mse_5),"신소재과학"));
                        item.add(new SubjectListItem("전산재료과학개론",getString(R.string.mse_6),"신소재과학"));
                        item.add(new SubjectListItem("재료열역학",getString(R.string.mse_7),"나노재료공학"));
                        item.add(new SubjectListItem("고분자재료개론",getString(R.string.mse_8),"나노재료공학"));
                        item.add(new SubjectListItem("재료현대물리",getString(R.string.mse_9),"나노재료공학"));
                        item.add(new SubjectListItem("나노전자세라믹",getString(R.string.mse_10),"나노재료공학"));
                        sub_list.setAdapter(adapter);
                        break;
                    case 7:
                        department.setText("경영학부");
                        item.add(new SubjectListItem("조직행동론",getString(R.string.ba_1),"경영학"));
                        item.add(new SubjectListItem("마케팅관리",getString(R.string.ba_2),"경영학"));
                        item.add(new SubjectListItem("재무회계",getString(R.string.ba_3),"경영학"));
                        item.add(new SubjectListItem("재무관리",getString(R.string.ba_4),"경영학"));
                        item.add(new SubjectListItem("생산관리",getString(R.string.ba_5),"경영학"));
                        item.add(new SubjectListItem("경영전략",getString(R.string.ba_6),"경영학"));
                        item.add(new SubjectListItem("재무회계",getString(R.string.ba_7),"재무/회계학"));
                        item.add(new SubjectListItem("관리회계",getString(R.string.ba_8),"재무/회계학"));
                        item.add(new SubjectListItem("재무관리",getString(R.string.ba_9),"재무/회계학"));
                        item.add(new SubjectListItem("경영통계분석",getString(R.string.ba_10),"재무/회계학"));
                        item.add(new SubjectListItem("미시경제학",getString(R.string.ba_11),"재무/회계학"));
                        item.add(new SubjectListItem("투자론",getString(R.string.ba_12),"재무/회계학"));

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

