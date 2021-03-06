package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.SupplyInformationActivity;
import com.example.administrator.myapplication.activity.Supply_Inf_Sell_DetailActivity;
import com.example.administrator.myapplication.adapter.Home_Search_SupplyAdapter;
import com.example.administrator.myapplication.moduels.Home_Search_Supply;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SupplyInfSellFragment extends Fragment {
    private List<Home_Search_Supply> lists;
    private ListView listView;
    private Home_Search_SupplyAdapter adapter;
    private FloatingActionButton tab;


    public SupplyInfSellFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_supply_inf_sell, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        com.melnykov.fab.FloatingActionButton fab = (com.melnykov.fab.FloatingActionButton)view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),SupplyInformationActivity.class);
                startActivity(intent);
            }
        });

        listView = (ListView) view.findViewById(R.id.search_supply_lv);
        lists = new ArrayList<>();
        Home_Search_Supply h1 = new Home_Search_Supply(R.mipmap.home_lv_iv1,"镇麦168","涨的特别好","  2.26元/亩  ","江苏省扬州市广陵区海沃路","2018-05-18  07：05：10");
        Home_Search_Supply h2 = new Home_Search_Supply(R.mipmap.home_lv_iv2, "三花鹅","科学喂养  散养","  8.50元/斤  ","江苏省淮安市洪泽区民兵路","2018-05-17  19：54：29");
        Home_Search_Supply h3 = new Home_Search_Supply(R.mipmap.home_lv_iv3,"三花鹅","专业养殖","  已售完  ","江苏省扬州市广陵区海沃路","2018-05-18  07：05：10");
        Home_Search_Supply h4 = new Home_Search_Supply(R.mipmap.home_lv_iv1, "圣稻19","最迟半个月","  已售完  ","江苏省淮安市洪泽区民兵路","2018-05-17  19：54：29");
        Home_Search_Supply h5 = new Home_Search_Supply(R.mipmap.home_lv_iv3,"水稻育秧无纺布","水稻育秧无纺布，厂家直销，13665273399","  3.00元/亩  ","江苏省扬州市广陵区海沃路","2018-05-18  07：05：10");
        Home_Search_Supply h6 = new Home_Search_Supply(R.mipmap.home_lv_iv2, "圣稻19","最迟半个月","  已过期  ","江苏省淮安市洪泽区民兵路","2018-05-17  19：54：29");
        Home_Search_Supply h7 = new Home_Search_Supply(R.mipmap.home_lv_iv1,"水稻育秧无纺布","防老化水稻育秧专用无纺布，李如山13665273399","  已过期  ","江苏省扬州市广陵区海沃路","2018-05-18  07：05：10");
        Home_Search_Supply h8 = new Home_Search_Supply(R.mipmap.home_lv_iv3, "圣稻19","最迟半个月","  已过期  ","江苏省淮安市洪泽区民兵路","2018-05-17  19：54：29");
        Home_Search_Supply h9 = new Home_Search_Supply(R.mipmap.home_lv_iv1,"水稻育秧无纺布","水稻育秧无纺布，厂家直销，13665273399","  3.00元/亩  ","江苏省扬州市广陵区海沃路","2018-05-18  07：05：10");
        Home_Search_Supply h10 = new Home_Search_Supply(R.mipmap.home_lv_iv2, "圣稻19","最迟半个月","  已过期  ","江苏省淮安市洪泽区民兵路","2018-05-17  19：54：29");
        Home_Search_Supply h11 = new Home_Search_Supply(R.mipmap.home_lv_iv1,"水稻育秧无纺布","防老化水稻育秧专用无纺布，李如山13665273399","  已过期  ","江苏省扬州市广陵区海沃路","2018-05-18  07：05：10");

        lists.add(h1);
        lists.add(h2);
        lists.add(h3);
        lists.add(h4);
        lists.add(h5);
        lists.add(h6);
        lists.add(h7);
        lists.add(h8);
        lists.add(h9);
        lists.add(h10);
        lists.add(h11);


        adapter = new Home_Search_SupplyAdapter(lists, getActivity());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), Supply_Inf_Sell_DetailActivity.class);
                startActivity(intent);
            }
        });

    }


}
