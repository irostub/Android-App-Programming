package com.example.trianglecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //activity가 메모리에 생성될 때
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R은 리소스를 가르키고, layout라는 곳에 컴파일 되어 들어있다. 내 원하는 activity와 연결하면된다.
    }
    public void computeArea(View view)
    {
        //밑변, 높이 가져오기
        EditText base, height;
        TextView area;

        base = findViewById(R.id.base); // base 객체 변수가 화면상에 있는 base 위젯을 가르킴
        height = findViewById(R.id.height);
        area = findViewById(R.id.area);

        int a = Integer.parseInt(base.getText().toString());
        int b = Integer.parseInt(height.getText().toString());
        double result = ((double) a * (double)b)/2;

        area.setText("area : " + result);
    }
}