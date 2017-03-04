package com.nadongbin.suwon_ex02.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nadongbin.suwon_ex02.R;
import com.nadongbin.suwon_ex02.models.Weather;

import java.util.List;

/**
 * Created by decur on 2017-03-02.
 */

public class WeatherAdapter extends BaseAdapter {

    private Context mContext;
    private List<Weather> mData;


    public WeatherAdapter(Context context, List<Weather> data) {
        mData = data;
        mContext = context;
    }

    // 아이템 갯수
    @Override
    public int getCount() {
        return mData.size();
    }

    // postion번째 아이템
    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    // position 번째의 레이아웃 정의
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        // view : 재사용되는 view
        if (view == null) {

            viewHolder = new ViewHolder();

            // 뷰를 새로 만들 때
            view = LayoutInflater.from(mContext)
                    .inflate(R.layout.item_weather, viewGroup, false);


            // 레이아웃 들고오기
            ImageView imageView = (ImageView) view.findViewById(R.id.weather_image);
            TextView locationText = (TextView) view.findViewById(R.id.location_text);
            TextView temperatureText = (TextView) view.findViewById(R.id.temperature_text);

            // 뷰 홀더에 넣는다
            viewHolder.imageView = imageView;
            viewHolder.locationText = locationText;
            viewHolder.temperatureText = temperatureText;

            view.setTag(viewHolder);

        } else {    // 재사용 할 때
            viewHolder = (ViewHolder) view.getTag();
        }

        // 데이터
        Weather weather = mData.get(position);

        // 화면에 뿌리기
        viewHolder.imageView.setImageResource(weather.getImageRes());
        viewHolder.locationText.setText(weather.getLocation());
        viewHolder.temperatureText.setText(weather.getTemperature());

        if (position % 2 == 1) {
            view.setBackgroundColor(Color.parseColor("#ff12aa34"));
        } else {
            view.setBackgroundColor(Color.WHITE);
        }


        // 선택된 아이템이면 노란색
        if (mSelectedPosition == position) {
            view.setBackgroundColor(Color.YELLOW);
        }

        return view;
    }

    // -1 이면 선택된게 없다다
    private int mSelectedPosition = -1;

    public void setSelect(int position) {
        mSelectedPosition = position;

    }

    // findViewById로 가져온 View들을 보관
    private static class ViewHolder {
        ImageView imageView;
        TextView locationText;
        TextView temperatureText;
    }

}
