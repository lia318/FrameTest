package a.frametest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout[] Linears = new LinearLayout[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button[] buts = new Button[3];

        for (int i=0; i<=buts.length; i++){
            buts[i] = (Button)findViewById(R.id.but1+i);
            Linears[i] = (LinearLayout) findViewById(R.id.line1+i);
            buts[i].setOnClickListener();
        }
    }

    // 익명 클래스
    View.OnClickListener butHandler=new View.OnClickListener() { // 상속 받고 싶은 인터페이스 이름 작성
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.but1:
                    Linears[0].setVisibility(View.VISIBLE);
                    Linears[1].setVisibility(View.INVISIBLE);
                    Linears[2].setVisibility(View.INVISIBLE);
                    break;
                case R.id.but2:
                    Linears[0].setVisibility(View.INVISIBLE);
                    Linears[1].setVisibility(View.VISIBLE);
                    Linears[2].setVisibility(View.INVISIBLE);
                    break;
                case R.id.but3:
                    Linears[0].setVisibility(View.INVISIBLE);
                    Linears[1].setVisibility(View.INVISIBLE);
                    Linears[2].setVisibility(View.VISIBLE);
                    break;
            } // end of switch
        }
    };
}
