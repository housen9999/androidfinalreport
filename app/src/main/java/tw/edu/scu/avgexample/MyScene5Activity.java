package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;

import static tw.edu.scu.avgexample.framework.model.KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT;
import static tw.edu.scu.avgexample.framework.model.KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT;

public class MyScene5Activity extends KWBaseSceneActivity {
    int money=25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_scene5);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        Drawable background = KWResourceUtils.getDrawableByResourceId(this, R.drawable.market2);
        KWCharacterModel character1 = new KWCharacterModel(this, "after2", "橋唬");
        KWCharacterModel character2 = new KWCharacterModel(this, "after1", "橋唬");
        KWThirdPersonEventModel event1 = new KWThirdPersonEventModel(character1, "還剩50元，吃完配個甜甜的東西吃好了").setBackgroundDrawable(background);
        KWThirdPersonEventModel event2 = new KWThirdPersonEventModel(character2, "該吃甚麼好呢").setBackgroundDrawable(background);
        event1.setCharacterPosition(KW_EVENT_CHARACTER_POSITION_LEFT);
        event2.setCharacterPosition(KW_EVENT_CHARACTER_POSITION_RIGHT);

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);

        eventManager.play("我的第三個事件集合");
    }
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        switchSceneActivity(Clik3Activity.class, false);

    }
}