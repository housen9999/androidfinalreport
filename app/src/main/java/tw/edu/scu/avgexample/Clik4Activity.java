package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWOptionEventModel;

public class Clik4Activity extends KWBaseSceneActivity {
int money=55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clik4);
    }
    protected void initializeEvent () {
        super.initializeEvent();
        ArrayList<String> optionArrayList = new ArrayList<>();
        optionArrayList.add("可樂 20元");
        optionArrayList.add("牛奶 30元");
        optionArrayList.add("都不買");
        KWOptionEventModel event = new KWOptionEventModel("場景3選項", "應該買哪個呢？", optionArrayList);
        eventManager.addEvent(event);
        eventManager.play("我的第n個事件集合");
    }
    @Override
    protected void onOptionSelected (String identifier, int index){
        super.onOptionSelected(identifier, index);
        if ("場景3選項".equals(identifier)) {
            if (index == 0) {
                switchSceneActivity(End2Activity.class, false);
            }
            else if (index == 1) {
                switchSceneActivity(End1Activity.class, false);
            }
            else if (index == 2) {
                switchSceneActivity(EndActivity3.class, false);
            }
        }
    }
}