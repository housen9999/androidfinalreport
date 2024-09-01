package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.KWEventManager;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWEventModel;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWLog;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.framework.KWEventManager;
import tw.edu.scu.avgexample.sample.SampleScene_4_Activity;

public class MyScene1Activity<event> extends KWBaseSceneActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_scene1);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();

        Drawable background = KWResourceUtils.getDrawableByResourceId(this, R.drawable.a);
        KWCharacterModel character1 = new KWCharacterModel(this, "b", "橋唬");
        KWThirdPersonEventModel event1 = new KWThirdPersonEventModel(character1, "哈囉！我是橋唬").setBackgroundDrawable(background);
        KWThirdPersonEventModel event2 = new KWThirdPersonEventModel(character1, "肚子好餓喔，請大家來幫我挑選今天的午餐吧").setBackgroundDrawable(background);
        KWThirdPersonEventModel event3 = new KWThirdPersonEventModel(character1, "GoGoGo！").setBackgroundDrawable(background);
        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.play("我的第一個事件集合");

    }
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        switchSceneActivity(MyScene2Activity.class, true);

    }

}