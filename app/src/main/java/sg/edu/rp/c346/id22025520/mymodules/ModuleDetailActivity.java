package sg.edu.rp.c346.id22025520.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvActivity = findViewById(R.id.textView);
        tvActivity.setText("In Second Activity");
        Intent intentRecieved = getIntent();
        String String = intentRecieved.getStringExtra("");
        tvActivity.setText("Module code: C346");

    }

}