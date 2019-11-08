package tw.org.HelloWorld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.lottery);
        btn1 = findViewById(R.id.click);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Log.v("jiahuei", "OK");
                showLottery();
            }
        });
    }

    private void showLottery() {
        //int temp = (int)(Math.random()*49+1);
        TreeSet<Integer> set = new TreeSet<>();
        while (set.size() < 6) {
            set.add((int)(Math.random()*49+1));
        }
        tv1.setText(set.toString());
    }
}
