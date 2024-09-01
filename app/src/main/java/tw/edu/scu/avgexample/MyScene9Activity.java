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

public class MyScene9Activity extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_scene9);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        Drawable background = KWResourceUtils.getDrawableByResourceId(this, R.drawable.market3);
        KWCharacterModel character1 = new KWCharacterModel(this, "drink1", "橋唬");
        KWCharacterModel character2 = new KWCharacterModel(this, "drink2", "橋唬");
        KWThirdPersonEventModel event1 = new KWThirdPersonEventModel(character1, "咦？這裡還有飲料").setBackgroundDrawable(background);
        KWThirdPersonEventModel event2 = new KWThirdPersonEventModel(character2, "還剩35元，買一下好了").setBackgroundDrawable(background);
        event1.setCharacterPosition(KW_EVENT_CHARACTER_POSITION_LEFT);
        event2.setCharacterPosition(KW_EVENT_CHARACTER_POSITION_RIGHT);

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);

        eventManager.play("我的第四個事件集合");
    }
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        switchSceneActivity(Clik7Activity.class, false);

    }
}