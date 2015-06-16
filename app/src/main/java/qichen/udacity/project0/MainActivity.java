package qichen.udacity.project0;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerButtonListeners();
    }

    private void registerButtonListeners() {
        clickListenerFor((Button) findViewById(R.id.btnSpotifyStreamer));
        clickListenerFor((Button) findViewById(R.id.btnScoresApp));
        clickListenerFor((Button) findViewById(R.id.btnLibraryApp));
        clickListenerFor((Button) findViewById(R.id.btnBuildItBigger));
        clickListenerFor((Button) findViewById(R.id.btnBaconReader));
        clickListenerFor((Button) findViewById(R.id.btnMyOwnApp));
    }

    private void clickListenerFor(final Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_layout,
                        (ViewGroup) findViewById(R.id.toast_layout_root));

                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText("This button will launch " + button.getText().toString());
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}