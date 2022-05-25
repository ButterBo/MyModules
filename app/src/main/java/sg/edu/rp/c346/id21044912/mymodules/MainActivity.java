package sg.edu.rp.c346.id21044912.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.module1);
        tv2 = findViewById(R.id.module2);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module1", "C346");
                intent.putExtra("ModName", "Android Programming");
                intent.putExtra("ModYear", "2020");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCredit", "4");
                intent.putExtra("ModVenue", "W66M");
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module2", "C349");
                intent.putExtra("ModName", "iPad Programming");
                intent.putExtra("ModYear", "2020");
                intent.putExtra("ModSem", "2");
                intent.putExtra("ModCredit", "4");
                intent.putExtra("ModVenue", "W66K");
                startActivity(intent);
            }
        });
    }
}