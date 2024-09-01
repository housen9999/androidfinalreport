package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWOptionEventModel;

public class Clik8Activity extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clik8);
    }
    protected void initializeEvent () {
        super.initializeEvent();
        ArrayList<String> optionArrayList = new ArrayList<>();
        optionArrayList.add("再玩一次");
        optionArrayList.add("不用了，下次再玩");
        KWOptionEventModel event = new KWOptionEventModel("場景5選項", "你還要再玩一次嗎", optionArrayList);
        eventManager.addEvent(event);
        eventManager.play("我的第n個事件集合");
    }
    @Override
    protected void onOptionSelected (String identifier, int index){
        super.onOptionSelected(identifier, index);
        if ("場景5選項".equals(identifier)) {
            if (index == 0) {
                switchSceneActivity(MyScene1Activity.class, false);
            }
            else if (index == 1) {
                switchSceneActivity(MainActivity.class, false);
            }

        }
    }
}