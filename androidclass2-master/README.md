# Androidclass
Android development experiment  

一、进入Main界面，如图所示：  

![主界面](https://github.com/xinchanghao/androidclass2/blob/master/app/src/main/res/images/main.png)  

二、点击线性布局按钮，跳转至线性布局界面  

![线性布局界面](https://github.com/xinchanghao/androidclass2/blob/master/app/src/main/res/images/line.png)  

三、返回至主界面，点击相对布局按钮，跳转至相对布局界面  

![相对布局界面](https://github.com/xinchanghao/androidclass2/blob/master/app/src/main/res/images/relative.png)  

四、返回至主界面，点击表格布局按钮，跳转至表格布局界面  

![表格布局界面](https://github.com/xinchanghao/androidclass2/blob/master/app/src/main/res/images/table.png)  


MainActivity.java源代码如下：


public class MainActivity extends AppCompatActivity {  

    private Button btnshow1;  
    private Button btnshow2;  
    private Button btnshow3;  
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
