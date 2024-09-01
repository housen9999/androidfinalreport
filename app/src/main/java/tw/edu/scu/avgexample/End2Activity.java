package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;

public class End2Activity extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end2);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();

        Drawable background = KWResourceUtils.getDrawableByResourceId(this, R.drawable.a);
        KWCharacterModel character1 = new KWCharacterModel(this, "clerk", "店員");
        KWCharacterModel character2 = new KWCharacterModel(this, "mother", "媽媽");
        KWCharacterModel character3 = new KWCharacterModel(this, "mother", "橋唬");
        KWThirdPersonEventModel event1 = new KWThirdPersonEventModel(character1, "謝謝你的惠顧").setBackgroundDrawable(background);
        KWThirdPersonEventModel event2 = new KWThirdPersonEventModel(character3, "啊 是媽媽").setBackgroundDrawable(background);
        KWThirdPersonEventModel event3 = new KWThirdPersonEventModel(character2, "橋唬！你怎麼吃布丁、可樂這些不健康的東西啊，處罰你一個禮拜不能吃點心了").setBackgroundDrawable(background);
        KWThirdPersonEventModel event4 = new KWThirdPersonEventModel(character3, "嗚嗚嗚 怎麼會這樣").setBackgroundDrawable(background);

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);
        eventManager.play("我的第五個事件集合");

    }
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        switchSceneActivity(Clik8Activity.class, false);

    }
}