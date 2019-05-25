package com.burhangok.basitcrm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CompanyAdapter extends BaseAdapter {

    List<CompanyItem> companyItemList;
    LayoutInflater layoutInflater;

    public CompanyAdapter(Activity activity,List<CompanyItem> companyItemList) {
        this.companyItemList = companyItemList;
        this.layoutInflater= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return companyItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return companyItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final View rowView = layoutInflater.inflate(R.layout.row_layout,null);
        TextView nameTV =rowView.findViewById(R.id.name);
        ImageView logoIV =rowView.findViewById(R.id.logo);

        CompanyItem companyItem =companyItemList.get(position);

        final String firmaAdi = companyItem.getcName();
        nameTV.setText(firmaAdi);
        Picasso.get().load(companyItem.getcLogo()).into(logoIV);


        //row view a tiklama olayi
   rowView.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent toDetail = new Intent(rowView.getContext(),DetailActivity.class);
           toDetail.putExtra("firma",firmaAdi);
           rowView.getContext().startActivity(toDetail);
       }
   });

        return rowView;
    }
}
