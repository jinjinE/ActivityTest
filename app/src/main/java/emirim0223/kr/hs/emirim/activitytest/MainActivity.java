package emirim0223.kr.hs.emirim.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editname, edittel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but_main=(Button)findViewById(R.id.but_main);
        but_main.setOnClickListener(butMainHandler);
        Button but_second=(Button)findViewById(R.id.but_second);
        editname = (EditText)findViewById(R.id.edit_name);
        edittel = (EditText)findViewById(R.id.edit_tel);
    }

    View.OnClickListener butMainHandler = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            String name = editname.getText().toString();
            String tel = editname.getText().toString();
            intent.putExtra("name",name);// 첫번째건 이름 두번째건 값
            intent.putExtra("tel",tel);
            startActivity(intent);
        }
    };
}
