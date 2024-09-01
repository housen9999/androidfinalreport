package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;

public class End1Activity extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end1);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();

        Drawable background = KWResourceUtils.getDrawableByResourceId(this, R.drawable.a);
        KWCharacterModel character1 = new KWCharacterModel(this, "clerk", "店員");
        KWCharacterModel character2 = new KWCharacterModel(this, "clerk", "橋唬");
        KWThirdPersonEventModel event1 = new KWThirdPersonEventModel(character1, "小朋友，你的錢不夠喔").setBackgroundDrawable(background);
        KWThirdPersonEventModel event2 = new KWThirdPersonEventModel(character2, "啊 我把價錢算錯了").setBackgroundDrawable(background);
        eventManager.addEvent(event1);
        eventManager.addEvent(event2);

        eventManager.play("我的第五個事件集合");

    }
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        switchSceneActivity(Clik8Activity.class, false);

    }
}