package examples.aaronhoskins.com.customviewandviewgroups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity{
    Circle circle;
    CompoundView compoundView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circle = findViewById(R.id.circle);
        compoundView = findViewById(R.id.cmpCompoundView);

        Animation circleAnimation = AnimationUtils.loadAnimation(this, R.anim.pivot);
        circle.startAnimation(circleAnimation);

        compoundView.setCounterOne(0);
        compoundView.setCounterTwo(0);


    }


    public void onClick(View v) {
        startActivity(new Intent(this, SomeActivity.class));
        overridePendingTransition(R.anim.slide_right, R.anim.slide_left);
    }

    @Override
    protected void onStop() {
        super.onStop();

    }
}
