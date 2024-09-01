package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWOptionEventModel;

public class MyScene3Activity extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_scene3);
    }
    protected void initializeEvent () {
        super.initializeEvent();
        ArrayList<String> optionArrayList = new ArrayList<>();
        optionArrayList.add("飯糰 30元");
        optionArrayList.add("麵包 25元");
        KWOptionEventModel event = new KWOptionEventModel("場景1選項", "應該買哪個呢？", optionArrayList);
        eventManager.addEvent(event);
        eventManager.play("我的第二個事件集合");
    }
    @Override
    protected void onOptionSelected (String identifier, int index){
        super.onOptionSelected(identifier, index);
        if ("場景1選項".equals(identifier)) {
            if (index == 0) {
                switchSceneActivity(MyScene4Activity.class, false);
            }
            else if (index == 1) {
                switchSceneActivity(MyScene5Activity.class, false);
            }

        }
    }


}