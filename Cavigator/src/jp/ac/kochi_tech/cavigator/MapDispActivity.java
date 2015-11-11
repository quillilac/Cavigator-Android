package jp.ac.kochi_tech.cavigator;import android.app.Activity;import android.content.Intent;import android.os.Bundle;import android.view.Menu;import android.view.MenuItem;import android.view.WindowManager;public class MapDispActivity extends Activity{        @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setTitle("Map");        getActionBar().setDisplayHomeAsUpEnabled(true);        // Keep screen on        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);        setContentView(R.layout.activity_map_disp);            }/*    @Override    public boolean onCreateOptionsMenu(Menu menu) {        // Inflate the menu; this adds items to the action bar if it is present.        getMenuInflater().inflate(R.menu.main, menu);                return true;    }        @Override    public boolean onOptionsItemSelected(MenuItem item) {        // Handle action bar item clicks here. The action bar will        // automatically handle clicks on the Home/Up button, so long        // as you specify a parent activity in AndroidManifest.xml.        int id = item.getItemId();        if (id == R.id.action_settings) {            return true;        }        return super.onOptionsItemSelected(item);    }    */     // オプションメニューの生成    public static final int START_MENU = 0;    public static final int VOICE_GUIDE = 1;    public static final int INFORMATION = 2;    public static final int SELECT_LANGUAGE = 3;    public static final int HOW_TO_USE = 4;            @Override    public boolean onCreateOptionsMenu(Menu menu) {        menu.add(0, START_MENU, 0, "Start Menu");        menu.add(0, VOICE_GUIDE, 0, "Voice Guidance");        menu.add(0, INFORMATION, 0, "Text Guidance");        menu.add(0, SELECT_LANGUAGE, 0, "Select Language");        menu.add(0, HOW_TO_USE, 0, "Help");        return true;    }        @Override    public boolean onOptionsItemSelected(MenuItem item) {        Intent intent;        switch (item.getItemId()) {        case START_MENU:            intent = new Intent(this, StartMenuActivity.class);            startActivity(intent);            return true;                    case VOICE_GUIDE:            intent = new Intent(this, VoiceNavigationActivity.class);            startActivity(intent);            return true;                    case INFORMATION:            intent = new Intent(this, InformationListActivity.class);            startActivity(intent);            return true;                    case SELECT_LANGUAGE:            intent = new Intent(this, LanguageDownloadActivity.class);            startActivity(intent);            return true;                    case HOW_TO_USE:            intent = new Intent(this, HowToListActivity.class);            startActivity(intent);            return true;                case android.R.id.home:            finish();            return true;        }        return super.onOptionsItemSelected(item);    }}