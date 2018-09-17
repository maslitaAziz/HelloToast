package my.edu.utem.hellorelative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {

        // What happens when user clicks on the button_count Button goes here.
        mCount++;
        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void showToast(View view) {

        // What happens when user clicks on the button_toast Button goes here
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }
}
