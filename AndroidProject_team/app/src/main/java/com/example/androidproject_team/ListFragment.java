package com.example.androidproject_team;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;


    RecyclerView.LayoutManager manager;
    ArrayList<Mdata> mdata;


    public ListFragment() {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_list,container,false);

                recyclerView = viewGroup.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mdata = new ArrayList<>();
        adapter = new MyAdapter(mdata);
        recyclerView.setAdapter(adapter);

        // 1 - 강릉       2 - 속초      3 - 인제      4 - 평창      5 - 원주
        // 6 - 송파       7 - 강남      8 - 중구      9 - 종로
        // 10 - 파주      11 - 광명     12 - 포천     13 - 안산
        // 14 - 충남      15 - 세종     16 - 충북

        int code = getArguments().getInt("listCode");
        if(code==1){
            mdata.add(new Mdata("강릉 안반데기",R.drawable.gangneung_anbandegi));
            mdata.add(new Mdata("강릉 도깨비 촬영지",R.drawable.gangneung_goblindrama));
            mdata.add(new Mdata("강릉 하슬라아트월드",R.drawable.gangneung_hasllaartworld));
            mdata.add(new Mdata("강릉 정동진 레일바이크",R.drawable.gangneung_jeongdongjin_rail));
        }
        else if(code == 2) {
            mdata.add(new Mdata("속초 해수욕장", R.drawable.sokcho_beach));
            mdata.add(new Mdata("속초 동명항", R.drawable.sokcho_dongmyeongport));
            mdata.add(new Mdata("속초 엑스포타워", R.drawable.sokcho_expotower));
            mdata.add(new Mdata("속초 영금정", R.drawable.sokcho_yeonggeumjeong));
        }
        else if(code == 3){
            mdata.add(new Mdata("인제 속삭이는 자작나무숲",R.drawable.inje_forest));
            mdata.add(new Mdata("인제 비밀의 정원",R.drawable.inje_secretofgarden));
            mdata.add(new Mdata("인제 X게임 리조트",R.drawable.inje_xgameresort));
            mdata.add(new Mdata("인제 클래식카박물관",R.drawable.inje_classiccar));
        }
        else if(code == 4){
            mdata.add(new Mdata("평창 동물농장",R.drawable.pyeongchang_animalfarm));
            mdata.add(new Mdata("평창 예술박물관",R.drawable.pyeongchang_artmuseum));
            mdata.add(new Mdata("평창 양떼목장",R.drawable.pyeongchang_sheep));
            mdata.add(new Mdata("평창 스카이워크",R.drawable.pyeongchang_skywalk));
        }
        else if(code == 5) {
            mdata.add(new Mdata("원주 출렁다리", R.drawable.wonju_bridge));
            mdata.add(new Mdata("원주 박물관산", R.drawable.wonju_museummountain));
            mdata.add(new Mdata("원주 레일파크", R.drawable.wonju_railpark));
            mdata.add(new Mdata("원주 맛집 '운채'", R.drawable.wonju_restaurant1));
        }
        else if(code == 6) {
            mdata.add(new Mdata("송파구 팔각정", R.drawable.palgakjjong));
            mdata.add(new Mdata("송파구 책보고", R.drawable.bookbogo));
            mdata.add(new Mdata("송파구 롯데월드", R.drawable.lotteworld));
            mdata.add(new Mdata("송파구 나홀로나무", R.drawable.tree));
        }
        else if(code == 7) {
            mdata.add(new Mdata("봉은사", R.drawable.bongeunsa));
            mdata.add(new Mdata("별마당 도서관", R.drawable.byolmadang));
            mdata.add(new Mdata("가로수길", R.drawable.garosukkil));
            mdata.add(new Mdata("피규어뮤지엄", R.drawable.figuremuseum));
        }
        else if(code == 8) {
            mdata.add(new Mdata("덕수궁", R.drawable.deoksugung));
            mdata.add(new Mdata("숭례문", R.drawable.sungnyemun));
            mdata.add(new Mdata("청계광장", R.drawable.gwangjang));
            mdata.add(new Mdata("남산케이블카", R.drawable.namsan));
        }
        else if(code == 9) {
            mdata.add(new Mdata("북촌한옥마을", R.drawable.hanok));
            mdata.add(new Mdata("종묘", R.drawable.jongmyo));
            mdata.add(new Mdata("낙산공원", R.drawable.naksanpark));
            mdata.add(new Mdata("쌈지길", R.drawable.ssamji));
        }
        else if(code == 10) {
            mdata.add(new Mdata("마장호수 흔들다리", R.drawable.paju_majanglake));
            mdata.add(new Mdata("퍼스트가든", R.drawable.firstgarden));
            mdata.add(new Mdata("헤이리 예술마을", R.drawable.heyriartvillage));
            mdata.add(new Mdata("벽초지수목원", R.drawable.sumogwon));
        }
        else if(code == 11) {
            mdata.add(new Mdata("광명동굴", R.drawable.gwangmyeong_cave));
            mdata.add(new Mdata("안터생태공원", R.drawable.gwangmyeong_park));
            mdata.add(new Mdata("구름산", R.drawable.gwangmyeong_cloudmountain));
            mdata.add(new Mdata("소하동 벽화마을", R.drawable.sohawall));
        }
        else if(code == 12) {
            mdata.add(new Mdata("산정호수", R.drawable.pocheon_sanjeonglake));
            mdata.add(new Mdata("평강랜드", R.drawable.pyeonggangland));
            mdata.add(new Mdata("허브아일랜드", R.drawable.hubiland));
            mdata.add(new Mdata("포천아트밸리", R.drawable.artvalley));
        }
        else if(code == 13) {
            mdata.add(new Mdata("구봉도", R.drawable.gubongdo));
            mdata.add(new Mdata("탄도항", R.drawable.tando));
            mdata.add(new Mdata("대부바다향기테마파크", R.drawable.badapark));
            mdata.add(new Mdata("별빛마을포토랜드", R.drawable.starphotoland));
        }
        else if(code == 14) {
            mdata.add(new Mdata("예당호 출렁다리", R.drawable.chungnam_bridge));
            mdata.add(new Mdata("꽃지해수욕장", R.drawable.chungnam_flowerbada));
            mdata.add(new Mdata("코리아플라워파크", R.drawable.chungnam_flowerpark));
            mdata.add(new Mdata("서산유기방가옥", R.drawable.chungnam_seosan_gaok));
        }
        else if(code == 15) {
            mdata.add(new Mdata("베어트리파크", R.drawable.sejong_beartreepark));
            mdata.add(new Mdata("국립세종수목원", R.drawable.sejongsumogwon));
            mdata.add(new Mdata("세종호수공원", R.drawable.sejong_lakepark));
            mdata.add(new Mdata("금강수목원", R.drawable.sejong_geumgang_arboretum));


        }
        else if(code == 16) {
            mdata.add(new Mdata("충주라바랜드", R.drawable.chungbuk_labaland));
            mdata.add(new Mdata("고수동굴", R.drawable.chungbuk_gosucave));
            mdata.add(new Mdata("목계솔밭", R.drawable.mokgyefield));
            mdata.add(new Mdata("도담삼봉", R.drawable.chungbuk_dodam));
            mdata.add(new Mdata("문암생태공원", R.drawable.chungbuk_munampark));
        }
        else if(code == 17) {
            mdata.add(new Mdata("문화공간 기린", R.drawable.jeonju_cultureplace));
            mdata.add(new Mdata("전주한옥마을", R.drawable.jeonju_hanok));
            mdata.add(new Mdata("전동성당 ", R.drawable.jeonju_sungdang));
        }
        else if(code == 18) {
            mdata.add(new Mdata("아쿠아플라넷", R.drawable.yeosu_acouaplanet));
            mdata.add(new Mdata("예술랜드", R.drawable.yeosu_artland));
            mdata.add(new Mdata("여수밤바다 ", R.drawable.yeosu_bambada));
            mdata.add(new Mdata("테이베어 뮤지엄 ", R.drawable.yeosu_teddybear));
        }
        else if(code == 19) {
            mdata.add(new Mdata("동백섬", R.drawable.busan_baekseom));
            mdata.add(new Mdata("감천문화마을", R.drawable.busan_gamcheon));
            mdata.add(new Mdata("해운대 ", R.drawable.busan_haeundae));
            mdata.add(new Mdata("장림포구 ", R.drawable.busan_jangnimpogu));
            mdata.add(new Mdata("남포동 트리 ", R.drawable.busan_nampodong));
            mdata.add(new Mdata("을숙도 생태공원", R.drawable.busan_park));
            mdata.add(new Mdata("더베이 ", R.drawable.busan_thebey));

        }
        else if(code == 20) {
            mdata.add(new Mdata("동성로", R.drawable.daegu_dongseonglo));
            mdata.add(new Mdata("이월드", R.drawable.daegu_eworld));
            mdata.add(new Mdata("서문시장", R.drawable.daegu_seomunsijang));
            mdata.add(new Mdata("스파크랜드 ", R.drawable.daegu_sparkland));
            mdata.add(new Mdata("대구계단성당", R.drawable.daegu_sungdang));

        }
        else if(code == 21) {
            mdata.add(new Mdata("대왕암공원", R.drawable.ulsan_bigpark));
            mdata.add(new Mdata("울산대교", R.drawable.ulsan_bridge));
            mdata.add(new Mdata("자수정 동굴나라 ", R.drawable.ulsan_caveworld));
            mdata.add(new Mdata("은하수길", R.drawable.ulsan_galaxyload));
            mdata.add(new Mdata("양산 통도환타지아 ", R.drawable.ulsan_tongdo));

        }






        return viewGroup;

    }
}
