package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;

import static tw.edu.scu.avgexample.framework.model.KWEventModel.KW_EVENT_CHARACTER_POSITION_CENTER;
import static tw.edu.scu.avgexample.framework.model.KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT;
import static tw.edu.scu.avgexample.framework.model.KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT;

public class MyScene2Activity extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_scene2);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        Drawable background = KWResourceUtils.getDrawableByResourceId(this, R.drawable.market1);
        KWCharacterModel character1 = new KWCharacterModel(this, "food1", "橋唬");
        KWCharacterModel character2 = new KWCharacterModel(this, "food2", "橋唬");
        KWThirdPersonEventModel event1 = new KWThirdPersonEventModel(character1, "我只有75元").setBackgroundDrawable(background);
        KWThirdPersonEventModel event2 = new KWThirdPersonEventModel(character2, "而且媽媽說不能吃的不健康").setBackgroundDrawable(background);
        event1.setCharacterPosition(KW_EVENT_CHARACTER_POSITION_LEFT);
        event2.setCharacterPosition(KW_EVENT_CHARACTER_POSITION_RIGHT);
        eventManager.addEvent(event1);
        eventManager.addEvent(event2);

        eventManager.play("我的第二個事件集合");
    }
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        switchSceneActivity(MyScene3Activity.class, true);

    }

}