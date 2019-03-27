package examples.aaronhoskins.com.customviewandviewgroups;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CompoundView extends LinearLayout implements View.OnClickListener {
    TextView tvCounterOne;
    TextView tvCounterTwo;
    int counterOneValue = 0;
    int counterTwoValue = 0;
    public CompoundView(Context context) {
        this(context, null);
    }

    public CompoundView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CompoundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    private void init() {
        inflate(getContext(), R.layout.compound_layout, this);
        tvCounterOne = findViewById(R.id.tvCounterOne);
        tvCounterTwo = findViewById(R.id.tvCounterTwo);
        tvCounterOne.setOnClickListener(this);
        tvCounterTwo.setOnClickListener(this);
    }

    public void setCounterOne(int counter) {
        tvCounterOne.setText(String.valueOf(counter));
        counterOneValue = counter;
    }

    public void setCounterTwo(int counter) {
        tvCounterTwo.setText(String.valueOf(counter));
        counterTwoValue = counter;
    }

    public void addOneCounterOne() {
        tvCounterOne.setText(String.valueOf(counterOneValue++));
    }

    public void addOneCounterTwo() {
        tvCounterTwo.setText(String.valueOf(counterTwoValue++));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvCounterOne:
                addOneCounterOne();
                break;
            case R.id.tvCounterTwo:
                addOneCounterTwo();
                break;
        }
    }
}
