package edu.fjnu.cse.helloworld;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button btnshow1;
    private Button btnshow2;
    private Button btnshow3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //监听三个按钮
        btnshow1 = (Button) findViewById(R.id.btn1);
        btnshow2 = (Button) findViewById(R.id.btn2);
        btnshow3 = (Button) findViewById(R.id.btn3);

        //处理三个按钮的点击事件
        btnshow1.setOnClickListener(new OnClickListener() {
            //重写点击事件的处理方法onClick()
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LineActivity.class);
                startActivity(intent);

            }
        });
        btnshow2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
            }
        });
        btnshow3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent);

            }
        });
    }
}