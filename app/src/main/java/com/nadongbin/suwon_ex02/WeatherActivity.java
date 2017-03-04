package com.nadongbin.suwon_ex02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.nadongbin.suwon_ex02.adapters.WeatherAdapter;
import com.nadongbin.suwon_ex02.models.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;
    private WeatherAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        mListView = (ListView) findViewById(R.id.list_view);

        //  날씨 데이터를 만든다 !!!!
        List<Weather> weatherList = new ArrayList<>();


        weatherList.add(new Weather(R.drawable.analytics11, "수원", "25도"));
        weatherList.add(new Weather(R.drawable.analytics11, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics_3, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics11, "서울", "30도"));
        weatherList.add(new Weather(R.drawable.analytics_5, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics11, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics11, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics_6, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics_3, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics_4, "부산", "27도"));
        weatherList.add(new Weather(R.drawable.analytics11, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics_4, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics11, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics_6, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics11, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics_6, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics_4, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics_3, "수원", "27도"));
        weatherList.add(new Weather(R.drawable.analytics11, "수원", "27도"));

        // 어댑터
        mAdapter = new WeatherAdapter(this, weatherList);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        mAdapter.setSelect(i);

        // 데이터가 변경됨(추가, 삭제)을 알려줘야 함
        mAdapter.notifyDataSetChanged();
    }
}
