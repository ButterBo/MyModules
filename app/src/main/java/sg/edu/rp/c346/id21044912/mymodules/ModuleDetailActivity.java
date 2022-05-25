package sg.edu.rp.c346.id21044912.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvDisplay;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvDisplay = findViewById(R.id.textView);
        btnReturn = findViewById(R.id.Return);

        Intent intentReceived = getIntent();
        if (intentReceived.hasExtra("Module1")) {
            // module1
            String mod = intentReceived.getStringExtra("Module1");
            String name = intentReceived.getStringExtra("ModName");
            String year = intentReceived.getStringExtra("ModYear");
            String sem = intentReceived.getStringExtra("ModSem");
            String credit = intentReceived.getStringExtra("ModCredit");
            String venue = intentReceived.getStringExtra("ModVenue");
            String display = String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s",mod,name,year,sem,credit,venue);
            tvDisplay.setText(display);
        } else if (intentReceived.hasExtra("Module2")) {
            // module2
            String mod = intentReceived.getStringExtra("Module2");
            String name = intentReceived.getStringExtra("ModName");
            String year = intentReceived.getStringExtra("ModYear");
            String sem = intentReceived.getStringExtra("ModSem");
            String credit = intentReceived.getStringExtra("ModCredit");
            String venue = intentReceived.getStringExtra("ModVenue");
            String display = String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s",mod,name,year,sem,credit,venue);
            tvDisplay.setText(display);
        }

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}