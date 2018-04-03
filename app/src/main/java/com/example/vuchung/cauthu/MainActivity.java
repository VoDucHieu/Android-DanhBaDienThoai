package com.example.vuchung.cauthu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvtraicay;
    ArrayList<CauThu> arraytraicay;
    TraiCayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();

        adapter = new TraiCayAdapter(this,R.layout.dong_trai_cay, arraytraicay);
        lvtraicay.setAdapter(adapter);
        lvtraicay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        String ghichu[] = new String[] {"Công Vinh - Tiền Đạo","Bùi Tến Dũng - Thủ môn","Messi - Tiền đạo","Degea - Thủ môn","Quang Hải - Tiền Vệ"};
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,ghichu[i],Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void Anhxa() {
        lvtraicay = (ListView) findViewById(R.id.listviewtraicay);
        arraytraicay = new ArrayList<>();

        arraytraicay.add(new CauThu("Công Vinh","Công Vinh là cầu tiền đạo Becamex Bình Dương, Quê ở Nghệ An, Từng tham gia đội tuyển quốc gia",R.drawable.congvinh));
        arraytraicay.add(new CauThu("Bùi Tiến Dũng","Thủ môn đội tuyển u23 Việt Nam, tham gia giải bóng đá U23 Châu Á",R.drawable.tiendung));
        arraytraicay.add(new CauThu("Messi","Messi - tiền đạo mang áo số 10 của Barca. Từng là bộ ba Messi-Suarez-Neymar giành nhiều chức vô địch",R.drawable.mes));
        arraytraicay.add(new CauThu("De Gea","Thủ môn chính của MU, biệt danh người nhện, cao 193",R.drawable.degea));
        arraytraicay.add(new CauThu("Quang Hải","Thủ môn số 1 đội tuyển U23 Việt Nam hiện tại",R.drawable.quanghai));







    }
}
