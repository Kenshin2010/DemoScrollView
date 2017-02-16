package vn.manroid.demoscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ViewTreeObserver.OnScrollChangedListener {

    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView = (ScrollView)findViewById(R.id.scroll_view);
        scrollView.getViewTreeObserver().addOnScrollChangedListener(this);

    }

    @Override
    public void onScrollChanged() {
        Toast.makeText(this,"ScrollView" , Toast.LENGTH_LONG).show();
    }
}
