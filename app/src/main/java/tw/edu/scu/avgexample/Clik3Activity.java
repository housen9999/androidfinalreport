package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWOptionEventModel;

public class Clik3Activity extends KWBaseSceneActivity {
    int money=25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clik3);
    }
    protected void initializeEvent () {
        super.initializeEvent();
        ArrayList<String> optionArrayList = new ArrayList<>();
        optionArrayList.add("布丁 25元");
        optionArrayList.add("香蕉 15元");
        KWOptionEventModel event = new KWOptionEventModel("場景2選項", "應該買哪個呢？", optionArrayList);
        eventManager.addEvent(event);
        eventManager.play("我的第n個事件集合");
    }
    @Override
    protected void onOptionSelected (String identifier, int index){
        super.onOptionSelected(identifier, index);
        if ("場景2選項".equals(identifier)) {
            if (index == 0) {
                money=money+25;
                switchSceneActivity(MyScene8Activity.class, false);
            }
            else if (index == 1) {
                money = money + 15;
                switchSceneActivity(MyScene9Activity.class, false);
            }

        }
    }
}