package com.burhangok.basitcrm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView firmaLV;
    List<CompanyItem> companyItemList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firmaLV = findViewById(R.id.liste);

        ///Item için oluşturduğumuz model sınıfından nesne türetme yöntemleri

        //Yontem 1
        CompanyItem oregon = new CompanyItem("OREGON","http://webtest.oregon.com.tr/wp-content/uploads/2018/02/oregon_logo_light.png");

        //Yontem 2
        CompanyItem kibar = new CompanyItem();
        kibar.setcName("KİBAR HOLDİNG");
        kibar.setcLogo("https://www.kibar.com/-/media/images/widgetband/kibar-45.ashx?h=432&la=tr-TR&w=683&hash=7342AA6EB82019AB7F23F8BF690C821D82B83F6B");

        companyItemList.add(oregon);

        companyItemList.add(kibar);

        //Yontem 2
        companyItemList.add(new CompanyItem("ÇOCUKLU DÜNYA","https://www.cocukludunya.com/assets/images/cocukludunyacom_sm.png"));

        companyItemList.add(new CompanyItem("SAFRANBOLU FIRINI","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNS5ayFH4c1xpyC8yvQPNWZ0lHfEKk1_GaCgrZjIdpy18DMhcL"));



CompanyAdapter companyAdapter = new CompanyAdapter(this,companyItemList);

firmaLV.setAdapter(companyAdapter);


    }
}
